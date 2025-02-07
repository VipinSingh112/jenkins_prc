/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.creative.application.form.service.exception.NoSuchCreativeIndividualDetailsAddressException;
import com.nbp.creative.application.form.service.model.CreativeIndividualDetailsAddress;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the creative individual details address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeIndividualDetailsAddressUtil
 * @generated
 */
@ProviderType
public interface CreativeIndividualDetailsAddressPersistence
	extends BasePersistence<CreativeIndividualDetailsAddress> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CreativeIndividualDetailsAddressUtil} to access the creative individual details address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the creative individual details address where CreativeApplicationId = &#63; or throws a <code>NoSuchCreativeIndividualDetailsAddressException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative individual details address
	 * @throws NoSuchCreativeIndividualDetailsAddressException if a matching creative individual details address could not be found
	 */
	public CreativeIndividualDetailsAddress findBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeIndividualDetailsAddressException;

	/**
	 * Returns the creative individual details address where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative individual details address, or <code>null</code> if a matching creative individual details address could not be found
	 */
	public CreativeIndividualDetailsAddress fetchBygetCreativeById(
		long CreativeApplicationId);

	/**
	 * Returns the creative individual details address where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative individual details address, or <code>null</code> if a matching creative individual details address could not be found
	 */
	public CreativeIndividualDetailsAddress fetchBygetCreativeById(
		long CreativeApplicationId, boolean useFinderCache);

	/**
	 * Removes the creative individual details address where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the creative individual details address that was removed
	 */
	public CreativeIndividualDetailsAddress removeBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeIndividualDetailsAddressException;

	/**
	 * Returns the number of creative individual details addresses where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative individual details addresses
	 */
	public int countBygetCreativeById(long CreativeApplicationId);

	/**
	 * Caches the creative individual details address in the entity cache if it is enabled.
	 *
	 * @param creativeIndividualDetailsAddress the creative individual details address
	 */
	public void cacheResult(
		CreativeIndividualDetailsAddress creativeIndividualDetailsAddress);

	/**
	 * Caches the creative individual details addresses in the entity cache if it is enabled.
	 *
	 * @param creativeIndividualDetailsAddresses the creative individual details addresses
	 */
	public void cacheResult(
		java.util.List<CreativeIndividualDetailsAddress>
			creativeIndividualDetailsAddresses);

	/**
	 * Creates a new creative individual details address with the primary key. Does not add the creative individual details address to the database.
	 *
	 * @param creativeIndiDetailsAddressId the primary key for the new creative individual details address
	 * @return the new creative individual details address
	 */
	public CreativeIndividualDetailsAddress create(
		long creativeIndiDetailsAddressId);

	/**
	 * Removes the creative individual details address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeIndiDetailsAddressId the primary key of the creative individual details address
	 * @return the creative individual details address that was removed
	 * @throws NoSuchCreativeIndividualDetailsAddressException if a creative individual details address with the primary key could not be found
	 */
	public CreativeIndividualDetailsAddress remove(
			long creativeIndiDetailsAddressId)
		throws NoSuchCreativeIndividualDetailsAddressException;

	public CreativeIndividualDetailsAddress updateImpl(
		CreativeIndividualDetailsAddress creativeIndividualDetailsAddress);

	/**
	 * Returns the creative individual details address with the primary key or throws a <code>NoSuchCreativeIndividualDetailsAddressException</code> if it could not be found.
	 *
	 * @param creativeIndiDetailsAddressId the primary key of the creative individual details address
	 * @return the creative individual details address
	 * @throws NoSuchCreativeIndividualDetailsAddressException if a creative individual details address with the primary key could not be found
	 */
	public CreativeIndividualDetailsAddress findByPrimaryKey(
			long creativeIndiDetailsAddressId)
		throws NoSuchCreativeIndividualDetailsAddressException;

	/**
	 * Returns the creative individual details address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeIndiDetailsAddressId the primary key of the creative individual details address
	 * @return the creative individual details address, or <code>null</code> if a creative individual details address with the primary key could not be found
	 */
	public CreativeIndividualDetailsAddress fetchByPrimaryKey(
		long creativeIndiDetailsAddressId);

	/**
	 * Returns all the creative individual details addresses.
	 *
	 * @return the creative individual details addresses
	 */
	public java.util.List<CreativeIndividualDetailsAddress> findAll();

	/**
	 * Returns a range of all the creative individual details addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeIndividualDetailsAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative individual details addresses
	 * @param end the upper bound of the range of creative individual details addresses (not inclusive)
	 * @return the range of creative individual details addresses
	 */
	public java.util.List<CreativeIndividualDetailsAddress> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the creative individual details addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeIndividualDetailsAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative individual details addresses
	 * @param end the upper bound of the range of creative individual details addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative individual details addresses
	 */
	public java.util.List<CreativeIndividualDetailsAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeIndividualDetailsAddress> orderByComparator);

	/**
	 * Returns an ordered range of all the creative individual details addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeIndividualDetailsAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative individual details addresses
	 * @param end the upper bound of the range of creative individual details addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative individual details addresses
	 */
	public java.util.List<CreativeIndividualDetailsAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeIndividualDetailsAddress> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the creative individual details addresses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of creative individual details addresses.
	 *
	 * @return the number of creative individual details addresses
	 */
	public int countAll();

}