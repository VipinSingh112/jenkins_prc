/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaAccommodationFormAddressException;
import com.nbp.tourism.application.form.services.model.TourismBonaAccommodationFormAddress;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism bona accommodation form address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAccommodationFormAddressUtil
 * @generated
 */
@ProviderType
public interface TourismBonaAccommodationFormAddressPersistence
	extends BasePersistence<TourismBonaAccommodationFormAddress> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismBonaAccommodationFormAddressUtil} to access the tourism bona accommodation form address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism bona accommodation form address where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaAccommodationFormAddressException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona accommodation form address
	 * @throws NoSuchTourismBonaAccommodationFormAddressException if a matching tourism bona accommodation form address could not be found
	 */
	public TourismBonaAccommodationFormAddress findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaAccommodationFormAddressException;

	/**
	 * Returns the tourism bona accommodation form address where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona accommodation form address, or <code>null</code> if a matching tourism bona accommodation form address could not be found
	 */
	public TourismBonaAccommodationFormAddress fetchBygetTourismById(
		long tourismApplicationId);

	/**
	 * Returns the tourism bona accommodation form address where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona accommodation form address, or <code>null</code> if a matching tourism bona accommodation form address could not be found
	 */
	public TourismBonaAccommodationFormAddress fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism bona accommodation form address where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona accommodation form address that was removed
	 */
	public TourismBonaAccommodationFormAddress removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaAccommodationFormAddressException;

	/**
	 * Returns the number of tourism bona accommodation form addresses where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona accommodation form addresses
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Returns the tourism bona accommodation form address where addressType = &#63; and tourismBonaAFId = &#63; or throws a <code>NoSuchTourismBonaAccommodationFormAddressException</code> if it could not be found.
	 *
	 * @param addressType the address type
	 * @param tourismBonaAFId the tourism bona af ID
	 * @return the matching tourism bona accommodation form address
	 * @throws NoSuchTourismBonaAccommodationFormAddressException if a matching tourism bona accommodation form address could not be found
	 */
	public TourismBonaAccommodationFormAddress findBygetTB_Acco_AT(
			String addressType, long tourismBonaAFId)
		throws NoSuchTourismBonaAccommodationFormAddressException;

	/**
	 * Returns the tourism bona accommodation form address where addressType = &#63; and tourismBonaAFId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param addressType the address type
	 * @param tourismBonaAFId the tourism bona af ID
	 * @return the matching tourism bona accommodation form address, or <code>null</code> if a matching tourism bona accommodation form address could not be found
	 */
	public TourismBonaAccommodationFormAddress fetchBygetTB_Acco_AT(
		String addressType, long tourismBonaAFId);

	/**
	 * Returns the tourism bona accommodation form address where addressType = &#63; and tourismBonaAFId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param addressType the address type
	 * @param tourismBonaAFId the tourism bona af ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona accommodation form address, or <code>null</code> if a matching tourism bona accommodation form address could not be found
	 */
	public TourismBonaAccommodationFormAddress fetchBygetTB_Acco_AT(
		String addressType, long tourismBonaAFId, boolean useFinderCache);

	/**
	 * Removes the tourism bona accommodation form address where addressType = &#63; and tourismBonaAFId = &#63; from the database.
	 *
	 * @param addressType the address type
	 * @param tourismBonaAFId the tourism bona af ID
	 * @return the tourism bona accommodation form address that was removed
	 */
	public TourismBonaAccommodationFormAddress removeBygetTB_Acco_AT(
			String addressType, long tourismBonaAFId)
		throws NoSuchTourismBonaAccommodationFormAddressException;

	/**
	 * Returns the number of tourism bona accommodation form addresses where addressType = &#63; and tourismBonaAFId = &#63;.
	 *
	 * @param addressType the address type
	 * @param tourismBonaAFId the tourism bona af ID
	 * @return the number of matching tourism bona accommodation form addresses
	 */
	public int countBygetTB_Acco_AT(String addressType, long tourismBonaAFId);

	/**
	 * Caches the tourism bona accommodation form address in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAccommodationFormAddress the tourism bona accommodation form address
	 */
	public void cacheResult(
		TourismBonaAccommodationFormAddress
			tourismBonaAccommodationFormAddress);

	/**
	 * Caches the tourism bona accommodation form addresses in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAccommodationFormAddresses the tourism bona accommodation form addresses
	 */
	public void cacheResult(
		java.util.List<TourismBonaAccommodationFormAddress>
			tourismBonaAccommodationFormAddresses);

	/**
	 * Creates a new tourism bona accommodation form address with the primary key. Does not add the tourism bona accommodation form address to the database.
	 *
	 * @param tourismBonaAccommodationFAOOId the primary key for the new tourism bona accommodation form address
	 * @return the new tourism bona accommodation form address
	 */
	public TourismBonaAccommodationFormAddress create(
		long tourismBonaAccommodationFAOOId);

	/**
	 * Removes the tourism bona accommodation form address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaAccommodationFAOOId the primary key of the tourism bona accommodation form address
	 * @return the tourism bona accommodation form address that was removed
	 * @throws NoSuchTourismBonaAccommodationFormAddressException if a tourism bona accommodation form address with the primary key could not be found
	 */
	public TourismBonaAccommodationFormAddress remove(
			long tourismBonaAccommodationFAOOId)
		throws NoSuchTourismBonaAccommodationFormAddressException;

	public TourismBonaAccommodationFormAddress updateImpl(
		TourismBonaAccommodationFormAddress
			tourismBonaAccommodationFormAddress);

	/**
	 * Returns the tourism bona accommodation form address with the primary key or throws a <code>NoSuchTourismBonaAccommodationFormAddressException</code> if it could not be found.
	 *
	 * @param tourismBonaAccommodationFAOOId the primary key of the tourism bona accommodation form address
	 * @return the tourism bona accommodation form address
	 * @throws NoSuchTourismBonaAccommodationFormAddressException if a tourism bona accommodation form address with the primary key could not be found
	 */
	public TourismBonaAccommodationFormAddress findByPrimaryKey(
			long tourismBonaAccommodationFAOOId)
		throws NoSuchTourismBonaAccommodationFormAddressException;

	/**
	 * Returns the tourism bona accommodation form address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaAccommodationFAOOId the primary key of the tourism bona accommodation form address
	 * @return the tourism bona accommodation form address, or <code>null</code> if a tourism bona accommodation form address with the primary key could not be found
	 */
	public TourismBonaAccommodationFormAddress fetchByPrimaryKey(
		long tourismBonaAccommodationFAOOId);

	/**
	 * Returns all the tourism bona accommodation form addresses.
	 *
	 * @return the tourism bona accommodation form addresses
	 */
	public java.util.List<TourismBonaAccommodationFormAddress> findAll();

	/**
	 * Returns a range of all the tourism bona accommodation form addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccommodationFormAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona accommodation form addresses
	 * @param end the upper bound of the range of tourism bona accommodation form addresses (not inclusive)
	 * @return the range of tourism bona accommodation form addresses
	 */
	public java.util.List<TourismBonaAccommodationFormAddress> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the tourism bona accommodation form addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccommodationFormAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona accommodation form addresses
	 * @param end the upper bound of the range of tourism bona accommodation form addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona accommodation form addresses
	 */
	public java.util.List<TourismBonaAccommodationFormAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaAccommodationFormAddress> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism bona accommodation form addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccommodationFormAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona accommodation form addresses
	 * @param end the upper bound of the range of tourism bona accommodation form addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona accommodation form addresses
	 */
	public java.util.List<TourismBonaAccommodationFormAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaAccommodationFormAddress> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism bona accommodation form addresses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism bona accommodation form addresses.
	 *
	 * @return the number of tourism bona accommodation form addresses
	 */
	public int countAll();

}