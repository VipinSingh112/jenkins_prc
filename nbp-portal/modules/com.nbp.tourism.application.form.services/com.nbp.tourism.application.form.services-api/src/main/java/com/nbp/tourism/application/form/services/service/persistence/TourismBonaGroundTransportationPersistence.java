/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaGroundTransportationException;
import com.nbp.tourism.application.form.services.model.TourismBonaGroundTransportation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism bona ground transportation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransportationUtil
 * @generated
 */
@ProviderType
public interface TourismBonaGroundTransportationPersistence
	extends BasePersistence<TourismBonaGroundTransportation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismBonaGroundTransportationUtil} to access the tourism bona ground transportation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism bona ground transportation where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaGroundTransportationException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground transportation
	 * @throws NoSuchTourismBonaGroundTransportationException if a matching tourism bona ground transportation could not be found
	 */
	public TourismBonaGroundTransportation findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaGroundTransportationException;

	/**
	 * Returns the tourism bona ground transportation where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground transportation, or <code>null</code> if a matching tourism bona ground transportation could not be found
	 */
	public TourismBonaGroundTransportation fetchBygetTourismById(
		long tourismApplicationId);

	/**
	 * Returns the tourism bona ground transportation where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona ground transportation, or <code>null</code> if a matching tourism bona ground transportation could not be found
	 */
	public TourismBonaGroundTransportation fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism bona ground transportation where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona ground transportation that was removed
	 */
	public TourismBonaGroundTransportation removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaGroundTransportationException;

	/**
	 * Returns the number of tourism bona ground transportations where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona ground transportations
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Caches the tourism bona ground transportation in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundTransportation the tourism bona ground transportation
	 */
	public void cacheResult(
		TourismBonaGroundTransportation tourismBonaGroundTransportation);

	/**
	 * Caches the tourism bona ground transportations in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundTransportations the tourism bona ground transportations
	 */
	public void cacheResult(
		java.util.List<TourismBonaGroundTransportation>
			tourismBonaGroundTransportations);

	/**
	 * Creates a new tourism bona ground transportation with the primary key. Does not add the tourism bona ground transportation to the database.
	 *
	 * @param tourismBonaGroundTransportId the primary key for the new tourism bona ground transportation
	 * @return the new tourism bona ground transportation
	 */
	public TourismBonaGroundTransportation create(
		long tourismBonaGroundTransportId);

	/**
	 * Removes the tourism bona ground transportation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaGroundTransportId the primary key of the tourism bona ground transportation
	 * @return the tourism bona ground transportation that was removed
	 * @throws NoSuchTourismBonaGroundTransportationException if a tourism bona ground transportation with the primary key could not be found
	 */
	public TourismBonaGroundTransportation remove(
			long tourismBonaGroundTransportId)
		throws NoSuchTourismBonaGroundTransportationException;

	public TourismBonaGroundTransportation updateImpl(
		TourismBonaGroundTransportation tourismBonaGroundTransportation);

	/**
	 * Returns the tourism bona ground transportation with the primary key or throws a <code>NoSuchTourismBonaGroundTransportationException</code> if it could not be found.
	 *
	 * @param tourismBonaGroundTransportId the primary key of the tourism bona ground transportation
	 * @return the tourism bona ground transportation
	 * @throws NoSuchTourismBonaGroundTransportationException if a tourism bona ground transportation with the primary key could not be found
	 */
	public TourismBonaGroundTransportation findByPrimaryKey(
			long tourismBonaGroundTransportId)
		throws NoSuchTourismBonaGroundTransportationException;

	/**
	 * Returns the tourism bona ground transportation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaGroundTransportId the primary key of the tourism bona ground transportation
	 * @return the tourism bona ground transportation, or <code>null</code> if a tourism bona ground transportation with the primary key could not be found
	 */
	public TourismBonaGroundTransportation fetchByPrimaryKey(
		long tourismBonaGroundTransportId);

	/**
	 * Returns all the tourism bona ground transportations.
	 *
	 * @return the tourism bona ground transportations
	 */
	public java.util.List<TourismBonaGroundTransportation> findAll();

	/**
	 * Returns a range of all the tourism bona ground transportations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransportationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground transportations
	 * @param end the upper bound of the range of tourism bona ground transportations (not inclusive)
	 * @return the range of tourism bona ground transportations
	 */
	public java.util.List<TourismBonaGroundTransportation> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the tourism bona ground transportations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransportationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground transportations
	 * @param end the upper bound of the range of tourism bona ground transportations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona ground transportations
	 */
	public java.util.List<TourismBonaGroundTransportation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaGroundTransportation> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism bona ground transportations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransportationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground transportations
	 * @param end the upper bound of the range of tourism bona ground transportations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona ground transportations
	 */
	public java.util.List<TourismBonaGroundTransportation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaGroundTransportation> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism bona ground transportations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism bona ground transportations.
	 *
	 * @return the number of tourism bona ground transportations
	 */
	public int countAll();

}