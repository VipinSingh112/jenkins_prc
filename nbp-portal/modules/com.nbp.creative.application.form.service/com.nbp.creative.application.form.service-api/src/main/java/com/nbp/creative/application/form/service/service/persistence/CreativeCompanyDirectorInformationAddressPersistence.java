/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.creative.application.form.service.exception.NoSuchCreativeCompanyDirectorInformationAddressException;
import com.nbp.creative.application.form.service.model.CreativeCompanyDirectorInformationAddress;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the creative company director information address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyDirectorInformationAddressUtil
 * @generated
 */
@ProviderType
public interface CreativeCompanyDirectorInformationAddressPersistence
	extends BasePersistence<CreativeCompanyDirectorInformationAddress> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CreativeCompanyDirectorInformationAddressUtil} to access the creative company director information address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the creative company director information address where CreativeApplicationId = &#63; or throws a <code>NoSuchCreativeCompanyDirectorInformationAddressException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative company director information address
	 * @throws NoSuchCreativeCompanyDirectorInformationAddressException if a matching creative company director information address could not be found
	 */
	public CreativeCompanyDirectorInformationAddress findBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeCompanyDirectorInformationAddressException;

	/**
	 * Returns the creative company director information address where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative company director information address, or <code>null</code> if a matching creative company director information address could not be found
	 */
	public CreativeCompanyDirectorInformationAddress fetchBygetCreativeById(
		long CreativeApplicationId);

	/**
	 * Returns the creative company director information address where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative company director information address, or <code>null</code> if a matching creative company director information address could not be found
	 */
	public CreativeCompanyDirectorInformationAddress fetchBygetCreativeById(
		long CreativeApplicationId, boolean useFinderCache);

	/**
	 * Removes the creative company director information address where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the creative company director information address that was removed
	 */
	public CreativeCompanyDirectorInformationAddress removeBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeCompanyDirectorInformationAddressException;

	/**
	 * Returns the number of creative company director information addresses where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative company director information addresses
	 */
	public int countBygetCreativeById(long CreativeApplicationId);

	/**
	 * Caches the creative company director information address in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyDirectorInformationAddress the creative company director information address
	 */
	public void cacheResult(
		CreativeCompanyDirectorInformationAddress
			creativeCompanyDirectorInformationAddress);

	/**
	 * Caches the creative company director information addresses in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyDirectorInformationAddresses the creative company director information addresses
	 */
	public void cacheResult(
		java.util.List<CreativeCompanyDirectorInformationAddress>
			creativeCompanyDirectorInformationAddresses);

	/**
	 * Creates a new creative company director information address with the primary key. Does not add the creative company director information address to the database.
	 *
	 * @param creativeComDirectorAddressId the primary key for the new creative company director information address
	 * @return the new creative company director information address
	 */
	public CreativeCompanyDirectorInformationAddress create(
		long creativeComDirectorAddressId);

	/**
	 * Removes the creative company director information address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeComDirectorAddressId the primary key of the creative company director information address
	 * @return the creative company director information address that was removed
	 * @throws NoSuchCreativeCompanyDirectorInformationAddressException if a creative company director information address with the primary key could not be found
	 */
	public CreativeCompanyDirectorInformationAddress remove(
			long creativeComDirectorAddressId)
		throws NoSuchCreativeCompanyDirectorInformationAddressException;

	public CreativeCompanyDirectorInformationAddress updateImpl(
		CreativeCompanyDirectorInformationAddress
			creativeCompanyDirectorInformationAddress);

	/**
	 * Returns the creative company director information address with the primary key or throws a <code>NoSuchCreativeCompanyDirectorInformationAddressException</code> if it could not be found.
	 *
	 * @param creativeComDirectorAddressId the primary key of the creative company director information address
	 * @return the creative company director information address
	 * @throws NoSuchCreativeCompanyDirectorInformationAddressException if a creative company director information address with the primary key could not be found
	 */
	public CreativeCompanyDirectorInformationAddress findByPrimaryKey(
			long creativeComDirectorAddressId)
		throws NoSuchCreativeCompanyDirectorInformationAddressException;

	/**
	 * Returns the creative company director information address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeComDirectorAddressId the primary key of the creative company director information address
	 * @return the creative company director information address, or <code>null</code> if a creative company director information address with the primary key could not be found
	 */
	public CreativeCompanyDirectorInformationAddress fetchByPrimaryKey(
		long creativeComDirectorAddressId);

	/**
	 * Returns all the creative company director information addresses.
	 *
	 * @return the creative company director information addresses
	 */
	public java.util.List<CreativeCompanyDirectorInformationAddress> findAll();

	/**
	 * Returns a range of all the creative company director information addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyDirectorInformationAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company director information addresses
	 * @param end the upper bound of the range of creative company director information addresses (not inclusive)
	 * @return the range of creative company director information addresses
	 */
	public java.util.List<CreativeCompanyDirectorInformationAddress> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the creative company director information addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyDirectorInformationAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company director information addresses
	 * @param end the upper bound of the range of creative company director information addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative company director information addresses
	 */
	public java.util.List<CreativeCompanyDirectorInformationAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeCompanyDirectorInformationAddress> orderByComparator);

	/**
	 * Returns an ordered range of all the creative company director information addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyDirectorInformationAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company director information addresses
	 * @param end the upper bound of the range of creative company director information addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative company director information addresses
	 */
	public java.util.List<CreativeCompanyDirectorInformationAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeCompanyDirectorInformationAddress> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the creative company director information addresses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of creative company director information addresses.
	 *
	 * @return the number of creative company director information addresses
	 */
	public int countAll();

}