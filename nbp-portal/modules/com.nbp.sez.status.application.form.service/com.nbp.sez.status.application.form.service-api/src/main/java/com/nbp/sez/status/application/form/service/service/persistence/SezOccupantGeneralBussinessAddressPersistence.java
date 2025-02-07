/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezOccupantGeneralBussinessAddressException;
import com.nbp.sez.status.application.form.service.model.SezOccupantGeneralBussinessAddress;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez occupant general bussiness address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantGeneralBussinessAddressUtil
 * @generated
 */
@ProviderType
public interface SezOccupantGeneralBussinessAddressPersistence
	extends BasePersistence<SezOccupantGeneralBussinessAddress> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezOccupantGeneralBussinessAddressUtil} to access the sez occupant general bussiness address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the sez occupant general bussiness address where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezOccupantGeneralBussinessAddressException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant general bussiness address
	 * @throws NoSuchSezOccupantGeneralBussinessAddressException if a matching sez occupant general bussiness address could not be found
	 */
	public SezOccupantGeneralBussinessAddress findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezOccupantGeneralBussinessAddressException;

	/**
	 * Returns the sez occupant general bussiness address where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant general bussiness address, or <code>null</code> if a matching sez occupant general bussiness address could not be found
	 */
	public SezOccupantGeneralBussinessAddress fetchBygetSezStatusByAppId(
		long sezStatusApplicationId);

	/**
	 * Returns the sez occupant general bussiness address where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez occupant general bussiness address, or <code>null</code> if a matching sez occupant general bussiness address could not be found
	 */
	public SezOccupantGeneralBussinessAddress fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache);

	/**
	 * Removes the sez occupant general bussiness address where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez occupant general bussiness address that was removed
	 */
	public SezOccupantGeneralBussinessAddress removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezOccupantGeneralBussinessAddressException;

	/**
	 * Returns the number of sez occupant general bussiness addresses where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant general bussiness addresses
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Returns the sez occupant general bussiness address where sezStatusApplicationId = &#63; and addresstype = &#63; or throws a <code>NoSuchSezOccupantGeneralBussinessAddressException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param addresstype the addresstype
	 * @return the matching sez occupant general bussiness address
	 * @throws NoSuchSezOccupantGeneralBussinessAddressException if a matching sez occupant general bussiness address could not be found
	 */
	public SezOccupantGeneralBussinessAddress
			findBygetSezStatusByAddressType_SAI(
				long sezStatusApplicationId, String addresstype)
		throws NoSuchSezOccupantGeneralBussinessAddressException;

	/**
	 * Returns the sez occupant general bussiness address where sezStatusApplicationId = &#63; and addresstype = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param addresstype the addresstype
	 * @return the matching sez occupant general bussiness address, or <code>null</code> if a matching sez occupant general bussiness address could not be found
	 */
	public SezOccupantGeneralBussinessAddress
		fetchBygetSezStatusByAddressType_SAI(
			long sezStatusApplicationId, String addresstype);

	/**
	 * Returns the sez occupant general bussiness address where sezStatusApplicationId = &#63; and addresstype = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param addresstype the addresstype
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez occupant general bussiness address, or <code>null</code> if a matching sez occupant general bussiness address could not be found
	 */
	public SezOccupantGeneralBussinessAddress
		fetchBygetSezStatusByAddressType_SAI(
			long sezStatusApplicationId, String addresstype,
			boolean useFinderCache);

	/**
	 * Removes the sez occupant general bussiness address where sezStatusApplicationId = &#63; and addresstype = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param addresstype the addresstype
	 * @return the sez occupant general bussiness address that was removed
	 */
	public SezOccupantGeneralBussinessAddress
			removeBygetSezStatusByAddressType_SAI(
				long sezStatusApplicationId, String addresstype)
		throws NoSuchSezOccupantGeneralBussinessAddressException;

	/**
	 * Returns the number of sez occupant general bussiness addresses where sezStatusApplicationId = &#63; and addresstype = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param addresstype the addresstype
	 * @return the number of matching sez occupant general bussiness addresses
	 */
	public int countBygetSezStatusByAddressType_SAI(
		long sezStatusApplicationId, String addresstype);

	/**
	 * Returns the sez occupant general bussiness address where sezOccGenBussId = &#63; and addresstype = &#63; or throws a <code>NoSuchSezOccupantGeneralBussinessAddressException</code> if it could not be found.
	 *
	 * @param sezOccGenBussId the sez occ gen buss ID
	 * @param addresstype the addresstype
	 * @return the matching sez occupant general bussiness address
	 * @throws NoSuchSezOccupantGeneralBussinessAddressException if a matching sez occupant general bussiness address could not be found
	 */
	public SezOccupantGeneralBussinessAddress
			findBygetSezStatusByAddressType_GBI(
				long sezOccGenBussId, String addresstype)
		throws NoSuchSezOccupantGeneralBussinessAddressException;

	/**
	 * Returns the sez occupant general bussiness address where sezOccGenBussId = &#63; and addresstype = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezOccGenBussId the sez occ gen buss ID
	 * @param addresstype the addresstype
	 * @return the matching sez occupant general bussiness address, or <code>null</code> if a matching sez occupant general bussiness address could not be found
	 */
	public SezOccupantGeneralBussinessAddress
		fetchBygetSezStatusByAddressType_GBI(
			long sezOccGenBussId, String addresstype);

	/**
	 * Returns the sez occupant general bussiness address where sezOccGenBussId = &#63; and addresstype = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezOccGenBussId the sez occ gen buss ID
	 * @param addresstype the addresstype
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez occupant general bussiness address, or <code>null</code> if a matching sez occupant general bussiness address could not be found
	 */
	public SezOccupantGeneralBussinessAddress
		fetchBygetSezStatusByAddressType_GBI(
			long sezOccGenBussId, String addresstype, boolean useFinderCache);

	/**
	 * Removes the sez occupant general bussiness address where sezOccGenBussId = &#63; and addresstype = &#63; from the database.
	 *
	 * @param sezOccGenBussId the sez occ gen buss ID
	 * @param addresstype the addresstype
	 * @return the sez occupant general bussiness address that was removed
	 */
	public SezOccupantGeneralBussinessAddress
			removeBygetSezStatusByAddressType_GBI(
				long sezOccGenBussId, String addresstype)
		throws NoSuchSezOccupantGeneralBussinessAddressException;

	/**
	 * Returns the number of sez occupant general bussiness addresses where sezOccGenBussId = &#63; and addresstype = &#63;.
	 *
	 * @param sezOccGenBussId the sez occ gen buss ID
	 * @param addresstype the addresstype
	 * @return the number of matching sez occupant general bussiness addresses
	 */
	public int countBygetSezStatusByAddressType_GBI(
		long sezOccGenBussId, String addresstype);

	/**
	 * Caches the sez occupant general bussiness address in the entity cache if it is enabled.
	 *
	 * @param sezOccupantGeneralBussinessAddress the sez occupant general bussiness address
	 */
	public void cacheResult(
		SezOccupantGeneralBussinessAddress sezOccupantGeneralBussinessAddress);

	/**
	 * Caches the sez occupant general bussiness addresses in the entity cache if it is enabled.
	 *
	 * @param sezOccupantGeneralBussinessAddresses the sez occupant general bussiness addresses
	 */
	public void cacheResult(
		java.util.List<SezOccupantGeneralBussinessAddress>
			sezOccupantGeneralBussinessAddresses);

	/**
	 * Creates a new sez occupant general bussiness address with the primary key. Does not add the sez occupant general bussiness address to the database.
	 *
	 * @param sezOccGenBussAddressId the primary key for the new sez occupant general bussiness address
	 * @return the new sez occupant general bussiness address
	 */
	public SezOccupantGeneralBussinessAddress create(
		long sezOccGenBussAddressId);

	/**
	 * Removes the sez occupant general bussiness address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccGenBussAddressId the primary key of the sez occupant general bussiness address
	 * @return the sez occupant general bussiness address that was removed
	 * @throws NoSuchSezOccupantGeneralBussinessAddressException if a sez occupant general bussiness address with the primary key could not be found
	 */
	public SezOccupantGeneralBussinessAddress remove(
			long sezOccGenBussAddressId)
		throws NoSuchSezOccupantGeneralBussinessAddressException;

	public SezOccupantGeneralBussinessAddress updateImpl(
		SezOccupantGeneralBussinessAddress sezOccupantGeneralBussinessAddress);

	/**
	 * Returns the sez occupant general bussiness address with the primary key or throws a <code>NoSuchSezOccupantGeneralBussinessAddressException</code> if it could not be found.
	 *
	 * @param sezOccGenBussAddressId the primary key of the sez occupant general bussiness address
	 * @return the sez occupant general bussiness address
	 * @throws NoSuchSezOccupantGeneralBussinessAddressException if a sez occupant general bussiness address with the primary key could not be found
	 */
	public SezOccupantGeneralBussinessAddress findByPrimaryKey(
			long sezOccGenBussAddressId)
		throws NoSuchSezOccupantGeneralBussinessAddressException;

	/**
	 * Returns the sez occupant general bussiness address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccGenBussAddressId the primary key of the sez occupant general bussiness address
	 * @return the sez occupant general bussiness address, or <code>null</code> if a sez occupant general bussiness address with the primary key could not be found
	 */
	public SezOccupantGeneralBussinessAddress fetchByPrimaryKey(
		long sezOccGenBussAddressId);

	/**
	 * Returns all the sez occupant general bussiness addresses.
	 *
	 * @return the sez occupant general bussiness addresses
	 */
	public java.util.List<SezOccupantGeneralBussinessAddress> findAll();

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
	public java.util.List<SezOccupantGeneralBussinessAddress> findAll(
		int start, int end);

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
	public java.util.List<SezOccupantGeneralBussinessAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezOccupantGeneralBussinessAddress> orderByComparator);

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
	public java.util.List<SezOccupantGeneralBussinessAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezOccupantGeneralBussinessAddress> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez occupant general bussiness addresses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez occupant general bussiness addresses.
	 *
	 * @return the number of sez occupant general bussiness addresses
	 */
	public int countAll();

}