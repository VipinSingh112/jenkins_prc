/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaAttractionFormFirstAddressException;
import com.nbp.tourism.application.form.services.model.TourismBonaAttractionFormFirstAddress;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism bona attraction form first address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAttractionFormFirstAddressUtil
 * @generated
 */
@ProviderType
public interface TourismBonaAttractionFormFirstAddressPersistence
	extends BasePersistence<TourismBonaAttractionFormFirstAddress> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismBonaAttractionFormFirstAddressUtil} to access the tourism bona attraction form first address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism bona attraction form first address where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaAttractionFormFirstAddressException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona attraction form first address
	 * @throws NoSuchTourismBonaAttractionFormFirstAddressException if a matching tourism bona attraction form first address could not be found
	 */
	public TourismBonaAttractionFormFirstAddress findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaAttractionFormFirstAddressException;

	/**
	 * Returns the tourism bona attraction form first address where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona attraction form first address, or <code>null</code> if a matching tourism bona attraction form first address could not be found
	 */
	public TourismBonaAttractionFormFirstAddress fetchBygetTourismById(
		long tourismApplicationId);

	/**
	 * Returns the tourism bona attraction form first address where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona attraction form first address, or <code>null</code> if a matching tourism bona attraction form first address could not be found
	 */
	public TourismBonaAttractionFormFirstAddress fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism bona attraction form first address where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona attraction form first address that was removed
	 */
	public TourismBonaAttractionFormFirstAddress removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaAttractionFormFirstAddressException;

	/**
	 * Returns the number of tourism bona attraction form first addresses where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona attraction form first addresses
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Returns the tourism bona attraction form first address where addressType = &#63; and tourismBonaAttractFormFirstId = &#63; or throws a <code>NoSuchTourismBonaAttractionFormFirstAddressException</code> if it could not be found.
	 *
	 * @param addressType the address type
	 * @param tourismBonaAttractFormFirstId the tourism bona attract form first ID
	 * @return the matching tourism bona attraction form first address
	 * @throws NoSuchTourismBonaAttractionFormFirstAddressException if a matching tourism bona attraction form first address could not be found
	 */
	public TourismBonaAttractionFormFirstAddress findBygetTB_Attract_AT(
			String addressType, long tourismBonaAttractFormFirstId)
		throws NoSuchTourismBonaAttractionFormFirstAddressException;

	/**
	 * Returns the tourism bona attraction form first address where addressType = &#63; and tourismBonaAttractFormFirstId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param addressType the address type
	 * @param tourismBonaAttractFormFirstId the tourism bona attract form first ID
	 * @return the matching tourism bona attraction form first address, or <code>null</code> if a matching tourism bona attraction form first address could not be found
	 */
	public TourismBonaAttractionFormFirstAddress fetchBygetTB_Attract_AT(
		String addressType, long tourismBonaAttractFormFirstId);

	/**
	 * Returns the tourism bona attraction form first address where addressType = &#63; and tourismBonaAttractFormFirstId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param addressType the address type
	 * @param tourismBonaAttractFormFirstId the tourism bona attract form first ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona attraction form first address, or <code>null</code> if a matching tourism bona attraction form first address could not be found
	 */
	public TourismBonaAttractionFormFirstAddress fetchBygetTB_Attract_AT(
		String addressType, long tourismBonaAttractFormFirstId,
		boolean useFinderCache);

	/**
	 * Removes the tourism bona attraction form first address where addressType = &#63; and tourismBonaAttractFormFirstId = &#63; from the database.
	 *
	 * @param addressType the address type
	 * @param tourismBonaAttractFormFirstId the tourism bona attract form first ID
	 * @return the tourism bona attraction form first address that was removed
	 */
	public TourismBonaAttractionFormFirstAddress removeBygetTB_Attract_AT(
			String addressType, long tourismBonaAttractFormFirstId)
		throws NoSuchTourismBonaAttractionFormFirstAddressException;

	/**
	 * Returns the number of tourism bona attraction form first addresses where addressType = &#63; and tourismBonaAttractFormFirstId = &#63;.
	 *
	 * @param addressType the address type
	 * @param tourismBonaAttractFormFirstId the tourism bona attract form first ID
	 * @return the number of matching tourism bona attraction form first addresses
	 */
	public int countBygetTB_Attract_AT(
		String addressType, long tourismBonaAttractFormFirstId);

	/**
	 * Caches the tourism bona attraction form first address in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAttractionFormFirstAddress the tourism bona attraction form first address
	 */
	public void cacheResult(
		TourismBonaAttractionFormFirstAddress
			tourismBonaAttractionFormFirstAddress);

	/**
	 * Caches the tourism bona attraction form first addresses in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAttractionFormFirstAddresses the tourism bona attraction form first addresses
	 */
	public void cacheResult(
		java.util.List<TourismBonaAttractionFormFirstAddress>
			tourismBonaAttractionFormFirstAddresses);

	/**
	 * Creates a new tourism bona attraction form first address with the primary key. Does not add the tourism bona attraction form first address to the database.
	 *
	 * @param tourismBonaAttractionFFAOOId the primary key for the new tourism bona attraction form first address
	 * @return the new tourism bona attraction form first address
	 */
	public TourismBonaAttractionFormFirstAddress create(
		long tourismBonaAttractionFFAOOId);

	/**
	 * Removes the tourism bona attraction form first address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaAttractionFFAOOId the primary key of the tourism bona attraction form first address
	 * @return the tourism bona attraction form first address that was removed
	 * @throws NoSuchTourismBonaAttractionFormFirstAddressException if a tourism bona attraction form first address with the primary key could not be found
	 */
	public TourismBonaAttractionFormFirstAddress remove(
			long tourismBonaAttractionFFAOOId)
		throws NoSuchTourismBonaAttractionFormFirstAddressException;

	public TourismBonaAttractionFormFirstAddress updateImpl(
		TourismBonaAttractionFormFirstAddress
			tourismBonaAttractionFormFirstAddress);

	/**
	 * Returns the tourism bona attraction form first address with the primary key or throws a <code>NoSuchTourismBonaAttractionFormFirstAddressException</code> if it could not be found.
	 *
	 * @param tourismBonaAttractionFFAOOId the primary key of the tourism bona attraction form first address
	 * @return the tourism bona attraction form first address
	 * @throws NoSuchTourismBonaAttractionFormFirstAddressException if a tourism bona attraction form first address with the primary key could not be found
	 */
	public TourismBonaAttractionFormFirstAddress findByPrimaryKey(
			long tourismBonaAttractionFFAOOId)
		throws NoSuchTourismBonaAttractionFormFirstAddressException;

	/**
	 * Returns the tourism bona attraction form first address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaAttractionFFAOOId the primary key of the tourism bona attraction form first address
	 * @return the tourism bona attraction form first address, or <code>null</code> if a tourism bona attraction form first address with the primary key could not be found
	 */
	public TourismBonaAttractionFormFirstAddress fetchByPrimaryKey(
		long tourismBonaAttractionFFAOOId);

	/**
	 * Returns all the tourism bona attraction form first addresses.
	 *
	 * @return the tourism bona attraction form first addresses
	 */
	public java.util.List<TourismBonaAttractionFormFirstAddress> findAll();

	/**
	 * Returns a range of all the tourism bona attraction form first addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAttractionFormFirstAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction form first addresses
	 * @param end the upper bound of the range of tourism bona attraction form first addresses (not inclusive)
	 * @return the range of tourism bona attraction form first addresses
	 */
	public java.util.List<TourismBonaAttractionFormFirstAddress> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the tourism bona attraction form first addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAttractionFormFirstAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction form first addresses
	 * @param end the upper bound of the range of tourism bona attraction form first addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona attraction form first addresses
	 */
	public java.util.List<TourismBonaAttractionFormFirstAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaAttractionFormFirstAddress> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism bona attraction form first addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAttractionFormFirstAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction form first addresses
	 * @param end the upper bound of the range of tourism bona attraction form first addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona attraction form first addresses
	 */
	public java.util.List<TourismBonaAttractionFormFirstAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaAttractionFormFirstAddress> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism bona attraction form first addresses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism bona attraction form first addresses.
	 *
	 * @return the number of tourism bona attraction form first addresses
	 */
	public int countAll();

}