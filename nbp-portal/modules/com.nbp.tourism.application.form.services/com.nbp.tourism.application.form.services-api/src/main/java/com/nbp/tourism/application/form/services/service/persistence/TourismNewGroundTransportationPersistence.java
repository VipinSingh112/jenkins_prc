/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismNewGroundTransportationException;
import com.nbp.tourism.application.form.services.model.TourismNewGroundTransportation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism new ground transportation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewGroundTransportationUtil
 * @generated
 */
@ProviderType
public interface TourismNewGroundTransportationPersistence
	extends BasePersistence<TourismNewGroundTransportation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismNewGroundTransportationUtil} to access the tourism new ground transportation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism new ground transportation where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewGroundTransportationException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new ground transportation
	 * @throws NoSuchTourismNewGroundTransportationException if a matching tourism new ground transportation could not be found
	 */
	public TourismNewGroundTransportation findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewGroundTransportationException;

	/**
	 * Returns the tourism new ground transportation where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new ground transportation, or <code>null</code> if a matching tourism new ground transportation could not be found
	 */
	public TourismNewGroundTransportation fetchBygetTourismById(
		long tourismApplicationId);

	/**
	 * Returns the tourism new ground transportation where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new ground transportation, or <code>null</code> if a matching tourism new ground transportation could not be found
	 */
	public TourismNewGroundTransportation fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism new ground transportation where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new ground transportation that was removed
	 */
	public TourismNewGroundTransportation removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewGroundTransportationException;

	/**
	 * Returns the number of tourism new ground transportations where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new ground transportations
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Caches the tourism new ground transportation in the entity cache if it is enabled.
	 *
	 * @param tourismNewGroundTransportation the tourism new ground transportation
	 */
	public void cacheResult(
		TourismNewGroundTransportation tourismNewGroundTransportation);

	/**
	 * Caches the tourism new ground transportations in the entity cache if it is enabled.
	 *
	 * @param tourismNewGroundTransportations the tourism new ground transportations
	 */
	public void cacheResult(
		java.util.List<TourismNewGroundTransportation>
			tourismNewGroundTransportations);

	/**
	 * Creates a new tourism new ground transportation with the primary key. Does not add the tourism new ground transportation to the database.
	 *
	 * @param TourismNewGroundTransId the primary key for the new tourism new ground transportation
	 * @return the new tourism new ground transportation
	 */
	public TourismNewGroundTransportation create(long TourismNewGroundTransId);

	/**
	 * Removes the tourism new ground transportation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param TourismNewGroundTransId the primary key of the tourism new ground transportation
	 * @return the tourism new ground transportation that was removed
	 * @throws NoSuchTourismNewGroundTransportationException if a tourism new ground transportation with the primary key could not be found
	 */
	public TourismNewGroundTransportation remove(long TourismNewGroundTransId)
		throws NoSuchTourismNewGroundTransportationException;

	public TourismNewGroundTransportation updateImpl(
		TourismNewGroundTransportation tourismNewGroundTransportation);

	/**
	 * Returns the tourism new ground transportation with the primary key or throws a <code>NoSuchTourismNewGroundTransportationException</code> if it could not be found.
	 *
	 * @param TourismNewGroundTransId the primary key of the tourism new ground transportation
	 * @return the tourism new ground transportation
	 * @throws NoSuchTourismNewGroundTransportationException if a tourism new ground transportation with the primary key could not be found
	 */
	public TourismNewGroundTransportation findByPrimaryKey(
			long TourismNewGroundTransId)
		throws NoSuchTourismNewGroundTransportationException;

	/**
	 * Returns the tourism new ground transportation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param TourismNewGroundTransId the primary key of the tourism new ground transportation
	 * @return the tourism new ground transportation, or <code>null</code> if a tourism new ground transportation with the primary key could not be found
	 */
	public TourismNewGroundTransportation fetchByPrimaryKey(
		long TourismNewGroundTransId);

	/**
	 * Returns all the tourism new ground transportations.
	 *
	 * @return the tourism new ground transportations
	 */
	public java.util.List<TourismNewGroundTransportation> findAll();

	/**
	 * Returns a range of all the tourism new ground transportations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewGroundTransportationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new ground transportations
	 * @param end the upper bound of the range of tourism new ground transportations (not inclusive)
	 * @return the range of tourism new ground transportations
	 */
	public java.util.List<TourismNewGroundTransportation> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the tourism new ground transportations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewGroundTransportationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new ground transportations
	 * @param end the upper bound of the range of tourism new ground transportations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new ground transportations
	 */
	public java.util.List<TourismNewGroundTransportation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewGroundTransportation> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism new ground transportations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewGroundTransportationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new ground transportations
	 * @param end the upper bound of the range of tourism new ground transportations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new ground transportations
	 */
	public java.util.List<TourismNewGroundTransportation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewGroundTransportation> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism new ground transportations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism new ground transportations.
	 *
	 * @return the number of tourism new ground transportations
	 */
	public int countAll();

}