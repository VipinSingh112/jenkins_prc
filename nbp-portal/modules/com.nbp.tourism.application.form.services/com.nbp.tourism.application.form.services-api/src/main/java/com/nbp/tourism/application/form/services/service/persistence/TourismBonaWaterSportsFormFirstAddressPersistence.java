/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaWaterSportsFormFirstAddressException;
import com.nbp.tourism.application.form.services.model.TourismBonaWaterSportsFormFirstAddress;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism bona water sports form first address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaWaterSportsFormFirstAddressUtil
 * @generated
 */
@ProviderType
public interface TourismBonaWaterSportsFormFirstAddressPersistence
	extends BasePersistence<TourismBonaWaterSportsFormFirstAddress> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismBonaWaterSportsFormFirstAddressUtil} to access the tourism bona water sports form first address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism bona water sports form first address where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaWaterSportsFormFirstAddressException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona water sports form first address
	 * @throws NoSuchTourismBonaWaterSportsFormFirstAddressException if a matching tourism bona water sports form first address could not be found
	 */
	public TourismBonaWaterSportsFormFirstAddress findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaWaterSportsFormFirstAddressException;

	/**
	 * Returns the tourism bona water sports form first address where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona water sports form first address, or <code>null</code> if a matching tourism bona water sports form first address could not be found
	 */
	public TourismBonaWaterSportsFormFirstAddress fetchBygetTourismById(
		long tourismApplicationId);

	/**
	 * Returns the tourism bona water sports form first address where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona water sports form first address, or <code>null</code> if a matching tourism bona water sports form first address could not be found
	 */
	public TourismBonaWaterSportsFormFirstAddress fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism bona water sports form first address where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona water sports form first address that was removed
	 */
	public TourismBonaWaterSportsFormFirstAddress removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaWaterSportsFormFirstAddressException;

	/**
	 * Returns the number of tourism bona water sports form first addresses where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona water sports form first addresses
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Returns the tourism bona water sports form first address where addressType = &#63; and tourismBonaWaterSFFirstId = &#63; or throws a <code>NoSuchTourismBonaWaterSportsFormFirstAddressException</code> if it could not be found.
	 *
	 * @param addressType the address type
	 * @param tourismBonaWaterSFFirstId the tourism bona water sf first ID
	 * @return the matching tourism bona water sports form first address
	 * @throws NoSuchTourismBonaWaterSportsFormFirstAddressException if a matching tourism bona water sports form first address could not be found
	 */
	public TourismBonaWaterSportsFormFirstAddress findBygetTB_Water_AT(
			String addressType, long tourismBonaWaterSFFirstId)
		throws NoSuchTourismBonaWaterSportsFormFirstAddressException;

	/**
	 * Returns the tourism bona water sports form first address where addressType = &#63; and tourismBonaWaterSFFirstId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param addressType the address type
	 * @param tourismBonaWaterSFFirstId the tourism bona water sf first ID
	 * @return the matching tourism bona water sports form first address, or <code>null</code> if a matching tourism bona water sports form first address could not be found
	 */
	public TourismBonaWaterSportsFormFirstAddress fetchBygetTB_Water_AT(
		String addressType, long tourismBonaWaterSFFirstId);

	/**
	 * Returns the tourism bona water sports form first address where addressType = &#63; and tourismBonaWaterSFFirstId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param addressType the address type
	 * @param tourismBonaWaterSFFirstId the tourism bona water sf first ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona water sports form first address, or <code>null</code> if a matching tourism bona water sports form first address could not be found
	 */
	public TourismBonaWaterSportsFormFirstAddress fetchBygetTB_Water_AT(
		String addressType, long tourismBonaWaterSFFirstId,
		boolean useFinderCache);

	/**
	 * Removes the tourism bona water sports form first address where addressType = &#63; and tourismBonaWaterSFFirstId = &#63; from the database.
	 *
	 * @param addressType the address type
	 * @param tourismBonaWaterSFFirstId the tourism bona water sf first ID
	 * @return the tourism bona water sports form first address that was removed
	 */
	public TourismBonaWaterSportsFormFirstAddress removeBygetTB_Water_AT(
			String addressType, long tourismBonaWaterSFFirstId)
		throws NoSuchTourismBonaWaterSportsFormFirstAddressException;

	/**
	 * Returns the number of tourism bona water sports form first addresses where addressType = &#63; and tourismBonaWaterSFFirstId = &#63;.
	 *
	 * @param addressType the address type
	 * @param tourismBonaWaterSFFirstId the tourism bona water sf first ID
	 * @return the number of matching tourism bona water sports form first addresses
	 */
	public int countBygetTB_Water_AT(
		String addressType, long tourismBonaWaterSFFirstId);

	/**
	 * Caches the tourism bona water sports form first address in the entity cache if it is enabled.
	 *
	 * @param tourismBonaWaterSportsFormFirstAddress the tourism bona water sports form first address
	 */
	public void cacheResult(
		TourismBonaWaterSportsFormFirstAddress
			tourismBonaWaterSportsFormFirstAddress);

	/**
	 * Caches the tourism bona water sports form first addresses in the entity cache if it is enabled.
	 *
	 * @param tourismBonaWaterSportsFormFirstAddresses the tourism bona water sports form first addresses
	 */
	public void cacheResult(
		java.util.List<TourismBonaWaterSportsFormFirstAddress>
			tourismBonaWaterSportsFormFirstAddresses);

	/**
	 * Creates a new tourism bona water sports form first address with the primary key. Does not add the tourism bona water sports form first address to the database.
	 *
	 * @param tourismBonaWaterSportsFFAId the primary key for the new tourism bona water sports form first address
	 * @return the new tourism bona water sports form first address
	 */
	public TourismBonaWaterSportsFormFirstAddress create(
		long tourismBonaWaterSportsFFAId);

	/**
	 * Removes the tourism bona water sports form first address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaWaterSportsFFAId the primary key of the tourism bona water sports form first address
	 * @return the tourism bona water sports form first address that was removed
	 * @throws NoSuchTourismBonaWaterSportsFormFirstAddressException if a tourism bona water sports form first address with the primary key could not be found
	 */
	public TourismBonaWaterSportsFormFirstAddress remove(
			long tourismBonaWaterSportsFFAId)
		throws NoSuchTourismBonaWaterSportsFormFirstAddressException;

	public TourismBonaWaterSportsFormFirstAddress updateImpl(
		TourismBonaWaterSportsFormFirstAddress
			tourismBonaWaterSportsFormFirstAddress);

	/**
	 * Returns the tourism bona water sports form first address with the primary key or throws a <code>NoSuchTourismBonaWaterSportsFormFirstAddressException</code> if it could not be found.
	 *
	 * @param tourismBonaWaterSportsFFAId the primary key of the tourism bona water sports form first address
	 * @return the tourism bona water sports form first address
	 * @throws NoSuchTourismBonaWaterSportsFormFirstAddressException if a tourism bona water sports form first address with the primary key could not be found
	 */
	public TourismBonaWaterSportsFormFirstAddress findByPrimaryKey(
			long tourismBonaWaterSportsFFAId)
		throws NoSuchTourismBonaWaterSportsFormFirstAddressException;

	/**
	 * Returns the tourism bona water sports form first address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaWaterSportsFFAId the primary key of the tourism bona water sports form first address
	 * @return the tourism bona water sports form first address, or <code>null</code> if a tourism bona water sports form first address with the primary key could not be found
	 */
	public TourismBonaWaterSportsFormFirstAddress fetchByPrimaryKey(
		long tourismBonaWaterSportsFFAId);

	/**
	 * Returns all the tourism bona water sports form first addresses.
	 *
	 * @return the tourism bona water sports form first addresses
	 */
	public java.util.List<TourismBonaWaterSportsFormFirstAddress> findAll();

	/**
	 * Returns a range of all the tourism bona water sports form first addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaWaterSportsFormFirstAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona water sports form first addresses
	 * @param end the upper bound of the range of tourism bona water sports form first addresses (not inclusive)
	 * @return the range of tourism bona water sports form first addresses
	 */
	public java.util.List<TourismBonaWaterSportsFormFirstAddress> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the tourism bona water sports form first addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaWaterSportsFormFirstAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona water sports form first addresses
	 * @param end the upper bound of the range of tourism bona water sports form first addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona water sports form first addresses
	 */
	public java.util.List<TourismBonaWaterSportsFormFirstAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaWaterSportsFormFirstAddress> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism bona water sports form first addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaWaterSportsFormFirstAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona water sports form first addresses
	 * @param end the upper bound of the range of tourism bona water sports form first addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona water sports form first addresses
	 */
	public java.util.List<TourismBonaWaterSportsFormFirstAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaWaterSportsFormFirstAddress> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism bona water sports form first addresses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism bona water sports form first addresses.
	 *
	 * @return the number of tourism bona water sports form first addresses
	 */
	public int countAll();

}