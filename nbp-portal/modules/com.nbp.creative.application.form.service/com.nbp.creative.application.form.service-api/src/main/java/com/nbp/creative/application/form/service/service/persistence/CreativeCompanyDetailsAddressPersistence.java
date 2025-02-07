/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.creative.application.form.service.exception.NoSuchCreativeCompanyDetailsAddressException;
import com.nbp.creative.application.form.service.model.CreativeCompanyDetailsAddress;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the creative company details address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyDetailsAddressUtil
 * @generated
 */
@ProviderType
public interface CreativeCompanyDetailsAddressPersistence
	extends BasePersistence<CreativeCompanyDetailsAddress> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CreativeCompanyDetailsAddressUtil} to access the creative company details address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the creative company details address where addressType = &#63; and creativeCompanyDetailsId = &#63; or throws a <code>NoSuchCreativeCompanyDetailsAddressException</code> if it could not be found.
	 *
	 * @param addressType the address type
	 * @param creativeCompanyDetailsId the creative company details ID
	 * @return the matching creative company details address
	 * @throws NoSuchCreativeCompanyDetailsAddressException if a matching creative company details address could not be found
	 */
	public CreativeCompanyDetailsAddress findBygetCreative_Com_Detail_AT(
			String addressType, long creativeCompanyDetailsId)
		throws NoSuchCreativeCompanyDetailsAddressException;

	/**
	 * Returns the creative company details address where addressType = &#63; and creativeCompanyDetailsId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param addressType the address type
	 * @param creativeCompanyDetailsId the creative company details ID
	 * @return the matching creative company details address, or <code>null</code> if a matching creative company details address could not be found
	 */
	public CreativeCompanyDetailsAddress fetchBygetCreative_Com_Detail_AT(
		String addressType, long creativeCompanyDetailsId);

	/**
	 * Returns the creative company details address where addressType = &#63; and creativeCompanyDetailsId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param addressType the address type
	 * @param creativeCompanyDetailsId the creative company details ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative company details address, or <code>null</code> if a matching creative company details address could not be found
	 */
	public CreativeCompanyDetailsAddress fetchBygetCreative_Com_Detail_AT(
		String addressType, long creativeCompanyDetailsId,
		boolean useFinderCache);

	/**
	 * Removes the creative company details address where addressType = &#63; and creativeCompanyDetailsId = &#63; from the database.
	 *
	 * @param addressType the address type
	 * @param creativeCompanyDetailsId the creative company details ID
	 * @return the creative company details address that was removed
	 */
	public CreativeCompanyDetailsAddress removeBygetCreative_Com_Detail_AT(
			String addressType, long creativeCompanyDetailsId)
		throws NoSuchCreativeCompanyDetailsAddressException;

	/**
	 * Returns the number of creative company details addresses where addressType = &#63; and creativeCompanyDetailsId = &#63;.
	 *
	 * @param addressType the address type
	 * @param creativeCompanyDetailsId the creative company details ID
	 * @return the number of matching creative company details addresses
	 */
	public int countBygetCreative_Com_Detail_AT(
		String addressType, long creativeCompanyDetailsId);

	/**
	 * Caches the creative company details address in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyDetailsAddress the creative company details address
	 */
	public void cacheResult(
		CreativeCompanyDetailsAddress creativeCompanyDetailsAddress);

	/**
	 * Caches the creative company details addresses in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyDetailsAddresses the creative company details addresses
	 */
	public void cacheResult(
		java.util.List<CreativeCompanyDetailsAddress>
			creativeCompanyDetailsAddresses);

	/**
	 * Creates a new creative company details address with the primary key. Does not add the creative company details address to the database.
	 *
	 * @param creativeComDetailsAddressId the primary key for the new creative company details address
	 * @return the new creative company details address
	 */
	public CreativeCompanyDetailsAddress create(
		long creativeComDetailsAddressId);

	/**
	 * Removes the creative company details address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeComDetailsAddressId the primary key of the creative company details address
	 * @return the creative company details address that was removed
	 * @throws NoSuchCreativeCompanyDetailsAddressException if a creative company details address with the primary key could not be found
	 */
	public CreativeCompanyDetailsAddress remove(
			long creativeComDetailsAddressId)
		throws NoSuchCreativeCompanyDetailsAddressException;

	public CreativeCompanyDetailsAddress updateImpl(
		CreativeCompanyDetailsAddress creativeCompanyDetailsAddress);

	/**
	 * Returns the creative company details address with the primary key or throws a <code>NoSuchCreativeCompanyDetailsAddressException</code> if it could not be found.
	 *
	 * @param creativeComDetailsAddressId the primary key of the creative company details address
	 * @return the creative company details address
	 * @throws NoSuchCreativeCompanyDetailsAddressException if a creative company details address with the primary key could not be found
	 */
	public CreativeCompanyDetailsAddress findByPrimaryKey(
			long creativeComDetailsAddressId)
		throws NoSuchCreativeCompanyDetailsAddressException;

	/**
	 * Returns the creative company details address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeComDetailsAddressId the primary key of the creative company details address
	 * @return the creative company details address, or <code>null</code> if a creative company details address with the primary key could not be found
	 */
	public CreativeCompanyDetailsAddress fetchByPrimaryKey(
		long creativeComDetailsAddressId);

	/**
	 * Returns all the creative company details addresses.
	 *
	 * @return the creative company details addresses
	 */
	public java.util.List<CreativeCompanyDetailsAddress> findAll();

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
	public java.util.List<CreativeCompanyDetailsAddress> findAll(
		int start, int end);

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
	public java.util.List<CreativeCompanyDetailsAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeCompanyDetailsAddress> orderByComparator);

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
	public java.util.List<CreativeCompanyDetailsAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeCompanyDetailsAddress> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the creative company details addresses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of creative company details addresses.
	 *
	 * @return the number of creative company details addresses
	 */
	public int countAll();

}