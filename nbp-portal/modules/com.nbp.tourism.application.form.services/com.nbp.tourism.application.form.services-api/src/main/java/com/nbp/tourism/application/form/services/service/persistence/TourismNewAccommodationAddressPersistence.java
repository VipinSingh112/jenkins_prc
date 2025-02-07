/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismNewAccommodationAddressException;
import com.nbp.tourism.application.form.services.model.TourismNewAccommodationAddress;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism new accommodation address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccommodationAddressUtil
 * @generated
 */
@ProviderType
public interface TourismNewAccommodationAddressPersistence
	extends BasePersistence<TourismNewAccommodationAddress> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismNewAccommodationAddressUtil} to access the tourism new accommodation address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism new accommodation address where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewAccommodationAddressException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new accommodation address
	 * @throws NoSuchTourismNewAccommodationAddressException if a matching tourism new accommodation address could not be found
	 */
	public TourismNewAccommodationAddress findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAccommodationAddressException;

	/**
	 * Returns the tourism new accommodation address where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new accommodation address, or <code>null</code> if a matching tourism new accommodation address could not be found
	 */
	public TourismNewAccommodationAddress fetchBygetTourismById(
		long tourismApplicationId);

	/**
	 * Returns the tourism new accommodation address where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new accommodation address, or <code>null</code> if a matching tourism new accommodation address could not be found
	 */
	public TourismNewAccommodationAddress fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism new accommodation address where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new accommodation address that was removed
	 */
	public TourismNewAccommodationAddress removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAccommodationAddressException;

	/**
	 * Returns the number of tourism new accommodation addresses where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new accommodation addresses
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Returns the tourism new accommodation address where addressType = &#63; and tourismNewAccoFormId = &#63; or throws a <code>NoSuchTourismNewAccommodationAddressException</code> if it could not be found.
	 *
	 * @param addressType the address type
	 * @param tourismNewAccoFormId the tourism new acco form ID
	 * @return the matching tourism new accommodation address
	 * @throws NoSuchTourismNewAccommodationAddressException if a matching tourism new accommodation address could not be found
	 */
	public TourismNewAccommodationAddress findBygetTN_A_AT(
			String addressType, long tourismNewAccoFormId)
		throws NoSuchTourismNewAccommodationAddressException;

	/**
	 * Returns the tourism new accommodation address where addressType = &#63; and tourismNewAccoFormId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param addressType the address type
	 * @param tourismNewAccoFormId the tourism new acco form ID
	 * @return the matching tourism new accommodation address, or <code>null</code> if a matching tourism new accommodation address could not be found
	 */
	public TourismNewAccommodationAddress fetchBygetTN_A_AT(
		String addressType, long tourismNewAccoFormId);

	/**
	 * Returns the tourism new accommodation address where addressType = &#63; and tourismNewAccoFormId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param addressType the address type
	 * @param tourismNewAccoFormId the tourism new acco form ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new accommodation address, or <code>null</code> if a matching tourism new accommodation address could not be found
	 */
	public TourismNewAccommodationAddress fetchBygetTN_A_AT(
		String addressType, long tourismNewAccoFormId, boolean useFinderCache);

	/**
	 * Removes the tourism new accommodation address where addressType = &#63; and tourismNewAccoFormId = &#63; from the database.
	 *
	 * @param addressType the address type
	 * @param tourismNewAccoFormId the tourism new acco form ID
	 * @return the tourism new accommodation address that was removed
	 */
	public TourismNewAccommodationAddress removeBygetTN_A_AT(
			String addressType, long tourismNewAccoFormId)
		throws NoSuchTourismNewAccommodationAddressException;

	/**
	 * Returns the number of tourism new accommodation addresses where addressType = &#63; and tourismNewAccoFormId = &#63;.
	 *
	 * @param addressType the address type
	 * @param tourismNewAccoFormId the tourism new acco form ID
	 * @return the number of matching tourism new accommodation addresses
	 */
	public int countBygetTN_A_AT(String addressType, long tourismNewAccoFormId);

	/**
	 * Caches the tourism new accommodation address in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccommodationAddress the tourism new accommodation address
	 */
	public void cacheResult(
		TourismNewAccommodationAddress tourismNewAccommodationAddress);

	/**
	 * Caches the tourism new accommodation addresses in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccommodationAddresses the tourism new accommodation addresses
	 */
	public void cacheResult(
		java.util.List<TourismNewAccommodationAddress>
			tourismNewAccommodationAddresses);

	/**
	 * Creates a new tourism new accommodation address with the primary key. Does not add the tourism new accommodation address to the database.
	 *
	 * @param tourismNewAccommodationAOOId the primary key for the new tourism new accommodation address
	 * @return the new tourism new accommodation address
	 */
	public TourismNewAccommodationAddress create(
		long tourismNewAccommodationAOOId);

	/**
	 * Removes the tourism new accommodation address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismNewAccommodationAOOId the primary key of the tourism new accommodation address
	 * @return the tourism new accommodation address that was removed
	 * @throws NoSuchTourismNewAccommodationAddressException if a tourism new accommodation address with the primary key could not be found
	 */
	public TourismNewAccommodationAddress remove(
			long tourismNewAccommodationAOOId)
		throws NoSuchTourismNewAccommodationAddressException;

	public TourismNewAccommodationAddress updateImpl(
		TourismNewAccommodationAddress tourismNewAccommodationAddress);

	/**
	 * Returns the tourism new accommodation address with the primary key or throws a <code>NoSuchTourismNewAccommodationAddressException</code> if it could not be found.
	 *
	 * @param tourismNewAccommodationAOOId the primary key of the tourism new accommodation address
	 * @return the tourism new accommodation address
	 * @throws NoSuchTourismNewAccommodationAddressException if a tourism new accommodation address with the primary key could not be found
	 */
	public TourismNewAccommodationAddress findByPrimaryKey(
			long tourismNewAccommodationAOOId)
		throws NoSuchTourismNewAccommodationAddressException;

	/**
	 * Returns the tourism new accommodation address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismNewAccommodationAOOId the primary key of the tourism new accommodation address
	 * @return the tourism new accommodation address, or <code>null</code> if a tourism new accommodation address with the primary key could not be found
	 */
	public TourismNewAccommodationAddress fetchByPrimaryKey(
		long tourismNewAccommodationAOOId);

	/**
	 * Returns all the tourism new accommodation addresses.
	 *
	 * @return the tourism new accommodation addresses
	 */
	public java.util.List<TourismNewAccommodationAddress> findAll();

	/**
	 * Returns a range of all the tourism new accommodation addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccommodationAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new accommodation addresses
	 * @param end the upper bound of the range of tourism new accommodation addresses (not inclusive)
	 * @return the range of tourism new accommodation addresses
	 */
	public java.util.List<TourismNewAccommodationAddress> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the tourism new accommodation addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccommodationAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new accommodation addresses
	 * @param end the upper bound of the range of tourism new accommodation addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new accommodation addresses
	 */
	public java.util.List<TourismNewAccommodationAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewAccommodationAddress> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism new accommodation addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccommodationAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new accommodation addresses
	 * @param end the upper bound of the range of tourism new accommodation addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new accommodation addresses
	 */
	public java.util.List<TourismNewAccommodationAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewAccommodationAddress> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism new accommodation addresses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism new accommodation addresses.
	 *
	 * @return the number of tourism new accommodation addresses
	 */
	public int countAll();

}