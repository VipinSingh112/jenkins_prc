/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.form.service.exception.NoSuchAttractionDomesticTourException;
import com.nbp.jtb.application.form.service.model.AttractionDomesticTour;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the attraction domestic tour service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionDomesticTourUtil
 * @generated
 */
@ProviderType
public interface AttractionDomesticTourPersistence
	extends BasePersistence<AttractionDomesticTour> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AttractionDomesticTourUtil} to access the attraction domestic tour persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the attraction domestic tour where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionDomesticTourException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction domestic tour
	 * @throws NoSuchAttractionDomesticTourException if a matching attraction domestic tour could not be found
	 */
	public AttractionDomesticTour findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionDomesticTourException;

	/**
	 * Returns the attraction domestic tour where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction domestic tour, or <code>null</code> if a matching attraction domestic tour could not be found
	 */
	public AttractionDomesticTour fetchBygetJTB_ByApplicationId(
		long jtbApplicationId);

	/**
	 * Returns the attraction domestic tour where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction domestic tour, or <code>null</code> if a matching attraction domestic tour could not be found
	 */
	public AttractionDomesticTour fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache);

	/**
	 * Removes the attraction domestic tour where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction domestic tour that was removed
	 */
	public AttractionDomesticTour removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionDomesticTourException;

	/**
	 * Returns the number of attraction domestic tours where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction domestic tours
	 */
	public int countBygetJTB_ByApplicationId(long jtbApplicationId);

	/**
	 * Caches the attraction domestic tour in the entity cache if it is enabled.
	 *
	 * @param attractionDomesticTour the attraction domestic tour
	 */
	public void cacheResult(AttractionDomesticTour attractionDomesticTour);

	/**
	 * Caches the attraction domestic tours in the entity cache if it is enabled.
	 *
	 * @param attractionDomesticTours the attraction domestic tours
	 */
	public void cacheResult(
		java.util.List<AttractionDomesticTour> attractionDomesticTours);

	/**
	 * Creates a new attraction domestic tour with the primary key. Does not add the attraction domestic tour to the database.
	 *
	 * @param attractionDomesticTourId the primary key for the new attraction domestic tour
	 * @return the new attraction domestic tour
	 */
	public AttractionDomesticTour create(long attractionDomesticTourId);

	/**
	 * Removes the attraction domestic tour with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionDomesticTourId the primary key of the attraction domestic tour
	 * @return the attraction domestic tour that was removed
	 * @throws NoSuchAttractionDomesticTourException if a attraction domestic tour with the primary key could not be found
	 */
	public AttractionDomesticTour remove(long attractionDomesticTourId)
		throws NoSuchAttractionDomesticTourException;

	public AttractionDomesticTour updateImpl(
		AttractionDomesticTour attractionDomesticTour);

	/**
	 * Returns the attraction domestic tour with the primary key or throws a <code>NoSuchAttractionDomesticTourException</code> if it could not be found.
	 *
	 * @param attractionDomesticTourId the primary key of the attraction domestic tour
	 * @return the attraction domestic tour
	 * @throws NoSuchAttractionDomesticTourException if a attraction domestic tour with the primary key could not be found
	 */
	public AttractionDomesticTour findByPrimaryKey(
			long attractionDomesticTourId)
		throws NoSuchAttractionDomesticTourException;

	/**
	 * Returns the attraction domestic tour with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionDomesticTourId the primary key of the attraction domestic tour
	 * @return the attraction domestic tour, or <code>null</code> if a attraction domestic tour with the primary key could not be found
	 */
	public AttractionDomesticTour fetchByPrimaryKey(
		long attractionDomesticTourId);

	/**
	 * Returns all the attraction domestic tours.
	 *
	 * @return the attraction domestic tours
	 */
	public java.util.List<AttractionDomesticTour> findAll();

	/**
	 * Returns a range of all the attraction domestic tours.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionDomesticTourModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction domestic tours
	 * @param end the upper bound of the range of attraction domestic tours (not inclusive)
	 * @return the range of attraction domestic tours
	 */
	public java.util.List<AttractionDomesticTour> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the attraction domestic tours.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionDomesticTourModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction domestic tours
	 * @param end the upper bound of the range of attraction domestic tours (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction domestic tours
	 */
	public java.util.List<AttractionDomesticTour> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AttractionDomesticTour>
			orderByComparator);

	/**
	 * Returns an ordered range of all the attraction domestic tours.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionDomesticTourModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction domestic tours
	 * @param end the upper bound of the range of attraction domestic tours (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction domestic tours
	 */
	public java.util.List<AttractionDomesticTour> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AttractionDomesticTour>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the attraction domestic tours from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of attraction domestic tours.
	 *
	 * @return the number of attraction domestic tours
	 */
	public int countAll();

}