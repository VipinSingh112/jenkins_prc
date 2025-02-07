/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismNewAttractionFormFirstAddressException;
import com.nbp.tourism.application.form.services.model.TourismNewAttractionFormFirstAddress;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism new attraction form first address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAttractionFormFirstAddressUtil
 * @generated
 */
@ProviderType
public interface TourismNewAttractionFormFirstAddressPersistence
	extends BasePersistence<TourismNewAttractionFormFirstAddress> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismNewAttractionFormFirstAddressUtil} to access the tourism new attraction form first address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism new attraction form first address where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewAttractionFormFirstAddressException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new attraction form first address
	 * @throws NoSuchTourismNewAttractionFormFirstAddressException if a matching tourism new attraction form first address could not be found
	 */
	public TourismNewAttractionFormFirstAddress findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAttractionFormFirstAddressException;

	/**
	 * Returns the tourism new attraction form first address where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new attraction form first address, or <code>null</code> if a matching tourism new attraction form first address could not be found
	 */
	public TourismNewAttractionFormFirstAddress fetchBygetTourismById(
		long tourismApplicationId);

	/**
	 * Returns the tourism new attraction form first address where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new attraction form first address, or <code>null</code> if a matching tourism new attraction form first address could not be found
	 */
	public TourismNewAttractionFormFirstAddress fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism new attraction form first address where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new attraction form first address that was removed
	 */
	public TourismNewAttractionFormFirstAddress removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAttractionFormFirstAddressException;

	/**
	 * Returns the number of tourism new attraction form first addresses where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new attraction form first addresses
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Returns the tourism new attraction form first address where addressType = &#63; and tourismNewAttractFormFirstId = &#63; or throws a <code>NoSuchTourismNewAttractionFormFirstAddressException</code> if it could not be found.
	 *
	 * @param addressType the address type
	 * @param tourismNewAttractFormFirstId the tourism new attract form first ID
	 * @return the matching tourism new attraction form first address
	 * @throws NoSuchTourismNewAttractionFormFirstAddressException if a matching tourism new attraction form first address could not be found
	 */
	public TourismNewAttractionFormFirstAddress findBygetTN_Attract_AT(
			String addressType, long tourismNewAttractFormFirstId)
		throws NoSuchTourismNewAttractionFormFirstAddressException;

	/**
	 * Returns the tourism new attraction form first address where addressType = &#63; and tourismNewAttractFormFirstId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param addressType the address type
	 * @param tourismNewAttractFormFirstId the tourism new attract form first ID
	 * @return the matching tourism new attraction form first address, or <code>null</code> if a matching tourism new attraction form first address could not be found
	 */
	public TourismNewAttractionFormFirstAddress fetchBygetTN_Attract_AT(
		String addressType, long tourismNewAttractFormFirstId);

	/**
	 * Returns the tourism new attraction form first address where addressType = &#63; and tourismNewAttractFormFirstId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param addressType the address type
	 * @param tourismNewAttractFormFirstId the tourism new attract form first ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new attraction form first address, or <code>null</code> if a matching tourism new attraction form first address could not be found
	 */
	public TourismNewAttractionFormFirstAddress fetchBygetTN_Attract_AT(
		String addressType, long tourismNewAttractFormFirstId,
		boolean useFinderCache);

	/**
	 * Removes the tourism new attraction form first address where addressType = &#63; and tourismNewAttractFormFirstId = &#63; from the database.
	 *
	 * @param addressType the address type
	 * @param tourismNewAttractFormFirstId the tourism new attract form first ID
	 * @return the tourism new attraction form first address that was removed
	 */
	public TourismNewAttractionFormFirstAddress removeBygetTN_Attract_AT(
			String addressType, long tourismNewAttractFormFirstId)
		throws NoSuchTourismNewAttractionFormFirstAddressException;

	/**
	 * Returns the number of tourism new attraction form first addresses where addressType = &#63; and tourismNewAttractFormFirstId = &#63;.
	 *
	 * @param addressType the address type
	 * @param tourismNewAttractFormFirstId the tourism new attract form first ID
	 * @return the number of matching tourism new attraction form first addresses
	 */
	public int countBygetTN_Attract_AT(
		String addressType, long tourismNewAttractFormFirstId);

	/**
	 * Caches the tourism new attraction form first address in the entity cache if it is enabled.
	 *
	 * @param tourismNewAttractionFormFirstAddress the tourism new attraction form first address
	 */
	public void cacheResult(
		TourismNewAttractionFormFirstAddress
			tourismNewAttractionFormFirstAddress);

	/**
	 * Caches the tourism new attraction form first addresses in the entity cache if it is enabled.
	 *
	 * @param tourismNewAttractionFormFirstAddresses the tourism new attraction form first addresses
	 */
	public void cacheResult(
		java.util.List<TourismNewAttractionFormFirstAddress>
			tourismNewAttractionFormFirstAddresses);

	/**
	 * Creates a new tourism new attraction form first address with the primary key. Does not add the tourism new attraction form first address to the database.
	 *
	 * @param tourismNewAttractionFormFAOOId the primary key for the new tourism new attraction form first address
	 * @return the new tourism new attraction form first address
	 */
	public TourismNewAttractionFormFirstAddress create(
		long tourismNewAttractionFormFAOOId);

	/**
	 * Removes the tourism new attraction form first address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismNewAttractionFormFAOOId the primary key of the tourism new attraction form first address
	 * @return the tourism new attraction form first address that was removed
	 * @throws NoSuchTourismNewAttractionFormFirstAddressException if a tourism new attraction form first address with the primary key could not be found
	 */
	public TourismNewAttractionFormFirstAddress remove(
			long tourismNewAttractionFormFAOOId)
		throws NoSuchTourismNewAttractionFormFirstAddressException;

	public TourismNewAttractionFormFirstAddress updateImpl(
		TourismNewAttractionFormFirstAddress
			tourismNewAttractionFormFirstAddress);

	/**
	 * Returns the tourism new attraction form first address with the primary key or throws a <code>NoSuchTourismNewAttractionFormFirstAddressException</code> if it could not be found.
	 *
	 * @param tourismNewAttractionFormFAOOId the primary key of the tourism new attraction form first address
	 * @return the tourism new attraction form first address
	 * @throws NoSuchTourismNewAttractionFormFirstAddressException if a tourism new attraction form first address with the primary key could not be found
	 */
	public TourismNewAttractionFormFirstAddress findByPrimaryKey(
			long tourismNewAttractionFormFAOOId)
		throws NoSuchTourismNewAttractionFormFirstAddressException;

	/**
	 * Returns the tourism new attraction form first address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismNewAttractionFormFAOOId the primary key of the tourism new attraction form first address
	 * @return the tourism new attraction form first address, or <code>null</code> if a tourism new attraction form first address with the primary key could not be found
	 */
	public TourismNewAttractionFormFirstAddress fetchByPrimaryKey(
		long tourismNewAttractionFormFAOOId);

	/**
	 * Returns all the tourism new attraction form first addresses.
	 *
	 * @return the tourism new attraction form first addresses
	 */
	public java.util.List<TourismNewAttractionFormFirstAddress> findAll();

	/**
	 * Returns a range of all the tourism new attraction form first addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionFormFirstAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction form first addresses
	 * @param end the upper bound of the range of tourism new attraction form first addresses (not inclusive)
	 * @return the range of tourism new attraction form first addresses
	 */
	public java.util.List<TourismNewAttractionFormFirstAddress> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the tourism new attraction form first addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionFormFirstAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction form first addresses
	 * @param end the upper bound of the range of tourism new attraction form first addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new attraction form first addresses
	 */
	public java.util.List<TourismNewAttractionFormFirstAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewAttractionFormFirstAddress> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism new attraction form first addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionFormFirstAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction form first addresses
	 * @param end the upper bound of the range of tourism new attraction form first addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new attraction form first addresses
	 */
	public java.util.List<TourismNewAttractionFormFirstAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewAttractionFormFirstAddress> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism new attraction form first addresses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism new attraction form first addresses.
	 *
	 * @return the number of tourism new attraction form first addresses
	 */
	public int countAll();

}