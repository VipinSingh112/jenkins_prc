/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaGroundTransportatioCarRentalException;
import com.nbp.tourism.application.form.services.model.TourismBonaGroundTransportatioCarRental;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism bona ground transportatio car rental service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransportatioCarRentalUtil
 * @generated
 */
@ProviderType
public interface TourismBonaGroundTransportatioCarRentalPersistence
	extends BasePersistence<TourismBonaGroundTransportatioCarRental> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismBonaGroundTransportatioCarRentalUtil} to access the tourism bona ground transportatio car rental persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism bona ground transportatio car rental where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaGroundTransportatioCarRentalException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground transportatio car rental
	 * @throws NoSuchTourismBonaGroundTransportatioCarRentalException if a matching tourism bona ground transportatio car rental could not be found
	 */
	public TourismBonaGroundTransportatioCarRental findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaGroundTransportatioCarRentalException;

	/**
	 * Returns the tourism bona ground transportatio car rental where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground transportatio car rental, or <code>null</code> if a matching tourism bona ground transportatio car rental could not be found
	 */
	public TourismBonaGroundTransportatioCarRental fetchBygetTourismById(
		long tourismApplicationId);

	/**
	 * Returns the tourism bona ground transportatio car rental where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona ground transportatio car rental, or <code>null</code> if a matching tourism bona ground transportatio car rental could not be found
	 */
	public TourismBonaGroundTransportatioCarRental fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism bona ground transportatio car rental where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona ground transportatio car rental that was removed
	 */
	public TourismBonaGroundTransportatioCarRental removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaGroundTransportatioCarRentalException;

	/**
	 * Returns the number of tourism bona ground transportatio car rentals where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona ground transportatio car rentals
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Caches the tourism bona ground transportatio car rental in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundTransportatioCarRental the tourism bona ground transportatio car rental
	 */
	public void cacheResult(
		TourismBonaGroundTransportatioCarRental
			tourismBonaGroundTransportatioCarRental);

	/**
	 * Caches the tourism bona ground transportatio car rentals in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundTransportatioCarRentals the tourism bona ground transportatio car rentals
	 */
	public void cacheResult(
		java.util.List<TourismBonaGroundTransportatioCarRental>
			tourismBonaGroundTransportatioCarRentals);

	/**
	 * Creates a new tourism bona ground transportatio car rental with the primary key. Does not add the tourism bona ground transportatio car rental to the database.
	 *
	 * @param tourismBonaGroundTransportCRId the primary key for the new tourism bona ground transportatio car rental
	 * @return the new tourism bona ground transportatio car rental
	 */
	public TourismBonaGroundTransportatioCarRental create(
		long tourismBonaGroundTransportCRId);

	/**
	 * Removes the tourism bona ground transportatio car rental with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaGroundTransportCRId the primary key of the tourism bona ground transportatio car rental
	 * @return the tourism bona ground transportatio car rental that was removed
	 * @throws NoSuchTourismBonaGroundTransportatioCarRentalException if a tourism bona ground transportatio car rental with the primary key could not be found
	 */
	public TourismBonaGroundTransportatioCarRental remove(
			long tourismBonaGroundTransportCRId)
		throws NoSuchTourismBonaGroundTransportatioCarRentalException;

	public TourismBonaGroundTransportatioCarRental updateImpl(
		TourismBonaGroundTransportatioCarRental
			tourismBonaGroundTransportatioCarRental);

	/**
	 * Returns the tourism bona ground transportatio car rental with the primary key or throws a <code>NoSuchTourismBonaGroundTransportatioCarRentalException</code> if it could not be found.
	 *
	 * @param tourismBonaGroundTransportCRId the primary key of the tourism bona ground transportatio car rental
	 * @return the tourism bona ground transportatio car rental
	 * @throws NoSuchTourismBonaGroundTransportatioCarRentalException if a tourism bona ground transportatio car rental with the primary key could not be found
	 */
	public TourismBonaGroundTransportatioCarRental findByPrimaryKey(
			long tourismBonaGroundTransportCRId)
		throws NoSuchTourismBonaGroundTransportatioCarRentalException;

	/**
	 * Returns the tourism bona ground transportatio car rental with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaGroundTransportCRId the primary key of the tourism bona ground transportatio car rental
	 * @return the tourism bona ground transportatio car rental, or <code>null</code> if a tourism bona ground transportatio car rental with the primary key could not be found
	 */
	public TourismBonaGroundTransportatioCarRental fetchByPrimaryKey(
		long tourismBonaGroundTransportCRId);

	/**
	 * Returns all the tourism bona ground transportatio car rentals.
	 *
	 * @return the tourism bona ground transportatio car rentals
	 */
	public java.util.List<TourismBonaGroundTransportatioCarRental> findAll();

	/**
	 * Returns a range of all the tourism bona ground transportatio car rentals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransportatioCarRentalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground transportatio car rentals
	 * @param end the upper bound of the range of tourism bona ground transportatio car rentals (not inclusive)
	 * @return the range of tourism bona ground transportatio car rentals
	 */
	public java.util.List<TourismBonaGroundTransportatioCarRental> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the tourism bona ground transportatio car rentals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransportatioCarRentalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground transportatio car rentals
	 * @param end the upper bound of the range of tourism bona ground transportatio car rentals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona ground transportatio car rentals
	 */
	public java.util.List<TourismBonaGroundTransportatioCarRental> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaGroundTransportatioCarRental> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism bona ground transportatio car rentals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransportatioCarRentalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground transportatio car rentals
	 * @param end the upper bound of the range of tourism bona ground transportatio car rentals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona ground transportatio car rentals
	 */
	public java.util.List<TourismBonaGroundTransportatioCarRental> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaGroundTransportatioCarRental> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism bona ground transportatio car rentals from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism bona ground transportatio car rentals.
	 *
	 * @return the number of tourism bona ground transportatio car rentals
	 */
	public int countAll();

}