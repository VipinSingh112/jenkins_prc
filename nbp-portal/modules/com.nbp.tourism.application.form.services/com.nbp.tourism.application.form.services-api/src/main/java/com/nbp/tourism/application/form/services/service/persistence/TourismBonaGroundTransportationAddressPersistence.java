/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaGroundTransportationAddressException;
import com.nbp.tourism.application.form.services.model.TourismBonaGroundTransportationAddress;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism bona ground transportation address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransportationAddressUtil
 * @generated
 */
@ProviderType
public interface TourismBonaGroundTransportationAddressPersistence
	extends BasePersistence<TourismBonaGroundTransportationAddress> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismBonaGroundTransportationAddressUtil} to access the tourism bona ground transportation address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism bona ground transportation address where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaGroundTransportationAddressException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground transportation address
	 * @throws NoSuchTourismBonaGroundTransportationAddressException if a matching tourism bona ground transportation address could not be found
	 */
	public TourismBonaGroundTransportationAddress findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaGroundTransportationAddressException;

	/**
	 * Returns the tourism bona ground transportation address where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground transportation address, or <code>null</code> if a matching tourism bona ground transportation address could not be found
	 */
	public TourismBonaGroundTransportationAddress fetchBygetTourismById(
		long tourismApplicationId);

	/**
	 * Returns the tourism bona ground transportation address where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona ground transportation address, or <code>null</code> if a matching tourism bona ground transportation address could not be found
	 */
	public TourismBonaGroundTransportationAddress fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism bona ground transportation address where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona ground transportation address that was removed
	 */
	public TourismBonaGroundTransportationAddress removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaGroundTransportationAddressException;

	/**
	 * Returns the number of tourism bona ground transportation addresses where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona ground transportation addresses
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Returns the tourism bona ground transportation address where addressType = &#63; and tourismBonaGroundTransportId = &#63; or throws a <code>NoSuchTourismBonaGroundTransportationAddressException</code> if it could not be found.
	 *
	 * @param addressType the address type
	 * @param tourismBonaGroundTransportId the tourism bona ground transport ID
	 * @return the matching tourism bona ground transportation address
	 * @throws NoSuchTourismBonaGroundTransportationAddressException if a matching tourism bona ground transportation address could not be found
	 */
	public TourismBonaGroundTransportationAddress findBygetTB_Ground_AT(
			String addressType, long tourismBonaGroundTransportId)
		throws NoSuchTourismBonaGroundTransportationAddressException;

	/**
	 * Returns the tourism bona ground transportation address where addressType = &#63; and tourismBonaGroundTransportId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param addressType the address type
	 * @param tourismBonaGroundTransportId the tourism bona ground transport ID
	 * @return the matching tourism bona ground transportation address, or <code>null</code> if a matching tourism bona ground transportation address could not be found
	 */
	public TourismBonaGroundTransportationAddress fetchBygetTB_Ground_AT(
		String addressType, long tourismBonaGroundTransportId);

	/**
	 * Returns the tourism bona ground transportation address where addressType = &#63; and tourismBonaGroundTransportId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param addressType the address type
	 * @param tourismBonaGroundTransportId the tourism bona ground transport ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona ground transportation address, or <code>null</code> if a matching tourism bona ground transportation address could not be found
	 */
	public TourismBonaGroundTransportationAddress fetchBygetTB_Ground_AT(
		String addressType, long tourismBonaGroundTransportId,
		boolean useFinderCache);

	/**
	 * Removes the tourism bona ground transportation address where addressType = &#63; and tourismBonaGroundTransportId = &#63; from the database.
	 *
	 * @param addressType the address type
	 * @param tourismBonaGroundTransportId the tourism bona ground transport ID
	 * @return the tourism bona ground transportation address that was removed
	 */
	public TourismBonaGroundTransportationAddress removeBygetTB_Ground_AT(
			String addressType, long tourismBonaGroundTransportId)
		throws NoSuchTourismBonaGroundTransportationAddressException;

	/**
	 * Returns the number of tourism bona ground transportation addresses where addressType = &#63; and tourismBonaGroundTransportId = &#63;.
	 *
	 * @param addressType the address type
	 * @param tourismBonaGroundTransportId the tourism bona ground transport ID
	 * @return the number of matching tourism bona ground transportation addresses
	 */
	public int countBygetTB_Ground_AT(
		String addressType, long tourismBonaGroundTransportId);

	/**
	 * Caches the tourism bona ground transportation address in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundTransportationAddress the tourism bona ground transportation address
	 */
	public void cacheResult(
		TourismBonaGroundTransportationAddress
			tourismBonaGroundTransportationAddress);

	/**
	 * Caches the tourism bona ground transportation addresses in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundTransportationAddresses the tourism bona ground transportation addresses
	 */
	public void cacheResult(
		java.util.List<TourismBonaGroundTransportationAddress>
			tourismBonaGroundTransportationAddresses);

	/**
	 * Creates a new tourism bona ground transportation address with the primary key. Does not add the tourism bona ground transportation address to the database.
	 *
	 * @param tourismBonaGroundTransAddresId the primary key for the new tourism bona ground transportation address
	 * @return the new tourism bona ground transportation address
	 */
	public TourismBonaGroundTransportationAddress create(
		long tourismBonaGroundTransAddresId);

	/**
	 * Removes the tourism bona ground transportation address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaGroundTransAddresId the primary key of the tourism bona ground transportation address
	 * @return the tourism bona ground transportation address that was removed
	 * @throws NoSuchTourismBonaGroundTransportationAddressException if a tourism bona ground transportation address with the primary key could not be found
	 */
	public TourismBonaGroundTransportationAddress remove(
			long tourismBonaGroundTransAddresId)
		throws NoSuchTourismBonaGroundTransportationAddressException;

	public TourismBonaGroundTransportationAddress updateImpl(
		TourismBonaGroundTransportationAddress
			tourismBonaGroundTransportationAddress);

	/**
	 * Returns the tourism bona ground transportation address with the primary key or throws a <code>NoSuchTourismBonaGroundTransportationAddressException</code> if it could not be found.
	 *
	 * @param tourismBonaGroundTransAddresId the primary key of the tourism bona ground transportation address
	 * @return the tourism bona ground transportation address
	 * @throws NoSuchTourismBonaGroundTransportationAddressException if a tourism bona ground transportation address with the primary key could not be found
	 */
	public TourismBonaGroundTransportationAddress findByPrimaryKey(
			long tourismBonaGroundTransAddresId)
		throws NoSuchTourismBonaGroundTransportationAddressException;

	/**
	 * Returns the tourism bona ground transportation address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaGroundTransAddresId the primary key of the tourism bona ground transportation address
	 * @return the tourism bona ground transportation address, or <code>null</code> if a tourism bona ground transportation address with the primary key could not be found
	 */
	public TourismBonaGroundTransportationAddress fetchByPrimaryKey(
		long tourismBonaGroundTransAddresId);

	/**
	 * Returns all the tourism bona ground transportation addresses.
	 *
	 * @return the tourism bona ground transportation addresses
	 */
	public java.util.List<TourismBonaGroundTransportationAddress> findAll();

	/**
	 * Returns a range of all the tourism bona ground transportation addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransportationAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground transportation addresses
	 * @param end the upper bound of the range of tourism bona ground transportation addresses (not inclusive)
	 * @return the range of tourism bona ground transportation addresses
	 */
	public java.util.List<TourismBonaGroundTransportationAddress> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the tourism bona ground transportation addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransportationAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground transportation addresses
	 * @param end the upper bound of the range of tourism bona ground transportation addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona ground transportation addresses
	 */
	public java.util.List<TourismBonaGroundTransportationAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaGroundTransportationAddress> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism bona ground transportation addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransportationAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground transportation addresses
	 * @param end the upper bound of the range of tourism bona ground transportation addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona ground transportation addresses
	 */
	public java.util.List<TourismBonaGroundTransportationAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaGroundTransportationAddress> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism bona ground transportation addresses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism bona ground transportation addresses.
	 *
	 * @return the number of tourism bona ground transportation addresses
	 */
	public int countAll();

}