/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismNewAnnualEarningsException;
import com.nbp.tourism.application.form.services.model.TourismNewAnnualEarnings;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism new annual earnings service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAnnualEarningsUtil
 * @generated
 */
@ProviderType
public interface TourismNewAnnualEarningsPersistence
	extends BasePersistence<TourismNewAnnualEarnings> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismNewAnnualEarningsUtil} to access the tourism new annual earnings persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism new annual earnings where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewAnnualEarningsException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new annual earnings
	 * @throws NoSuchTourismNewAnnualEarningsException if a matching tourism new annual earnings could not be found
	 */
	public TourismNewAnnualEarnings findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAnnualEarningsException;

	/**
	 * Returns the tourism new annual earnings where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new annual earnings, or <code>null</code> if a matching tourism new annual earnings could not be found
	 */
	public TourismNewAnnualEarnings fetchBygetTourismById(
		long tourismApplicationId);

	/**
	 * Returns the tourism new annual earnings where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new annual earnings, or <code>null</code> if a matching tourism new annual earnings could not be found
	 */
	public TourismNewAnnualEarnings fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism new annual earnings where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new annual earnings that was removed
	 */
	public TourismNewAnnualEarnings removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAnnualEarningsException;

	/**
	 * Returns the number of tourism new annual earningses where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new annual earningses
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Caches the tourism new annual earnings in the entity cache if it is enabled.
	 *
	 * @param tourismNewAnnualEarnings the tourism new annual earnings
	 */
	public void cacheResult(TourismNewAnnualEarnings tourismNewAnnualEarnings);

	/**
	 * Caches the tourism new annual earningses in the entity cache if it is enabled.
	 *
	 * @param tourismNewAnnualEarningses the tourism new annual earningses
	 */
	public void cacheResult(
		java.util.List<TourismNewAnnualEarnings> tourismNewAnnualEarningses);

	/**
	 * Creates a new tourism new annual earnings with the primary key. Does not add the tourism new annual earnings to the database.
	 *
	 * @param tourismNewAnnualEarningsId the primary key for the new tourism new annual earnings
	 * @return the new tourism new annual earnings
	 */
	public TourismNewAnnualEarnings create(long tourismNewAnnualEarningsId);

	/**
	 * Removes the tourism new annual earnings with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismNewAnnualEarningsId the primary key of the tourism new annual earnings
	 * @return the tourism new annual earnings that was removed
	 * @throws NoSuchTourismNewAnnualEarningsException if a tourism new annual earnings with the primary key could not be found
	 */
	public TourismNewAnnualEarnings remove(long tourismNewAnnualEarningsId)
		throws NoSuchTourismNewAnnualEarningsException;

	public TourismNewAnnualEarnings updateImpl(
		TourismNewAnnualEarnings tourismNewAnnualEarnings);

	/**
	 * Returns the tourism new annual earnings with the primary key or throws a <code>NoSuchTourismNewAnnualEarningsException</code> if it could not be found.
	 *
	 * @param tourismNewAnnualEarningsId the primary key of the tourism new annual earnings
	 * @return the tourism new annual earnings
	 * @throws NoSuchTourismNewAnnualEarningsException if a tourism new annual earnings with the primary key could not be found
	 */
	public TourismNewAnnualEarnings findByPrimaryKey(
			long tourismNewAnnualEarningsId)
		throws NoSuchTourismNewAnnualEarningsException;

	/**
	 * Returns the tourism new annual earnings with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismNewAnnualEarningsId the primary key of the tourism new annual earnings
	 * @return the tourism new annual earnings, or <code>null</code> if a tourism new annual earnings with the primary key could not be found
	 */
	public TourismNewAnnualEarnings fetchByPrimaryKey(
		long tourismNewAnnualEarningsId);

	/**
	 * Returns all the tourism new annual earningses.
	 *
	 * @return the tourism new annual earningses
	 */
	public java.util.List<TourismNewAnnualEarnings> findAll();

	/**
	 * Returns a range of all the tourism new annual earningses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAnnualEarningsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new annual earningses
	 * @param end the upper bound of the range of tourism new annual earningses (not inclusive)
	 * @return the range of tourism new annual earningses
	 */
	public java.util.List<TourismNewAnnualEarnings> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the tourism new annual earningses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAnnualEarningsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new annual earningses
	 * @param end the upper bound of the range of tourism new annual earningses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new annual earningses
	 */
	public java.util.List<TourismNewAnnualEarnings> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewAnnualEarnings> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism new annual earningses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAnnualEarningsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new annual earningses
	 * @param end the upper bound of the range of tourism new annual earningses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new annual earningses
	 */
	public java.util.List<TourismNewAnnualEarnings> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewAnnualEarnings> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism new annual earningses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism new annual earningses.
	 *
	 * @return the number of tourism new annual earningses
	 */
	public int countAll();

}