/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismNewAttractionFormSecondException;
import com.nbp.tourism.application.form.services.model.TourismNewAttractionFormSecond;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism new attraction form second service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAttractionFormSecondUtil
 * @generated
 */
@ProviderType
public interface TourismNewAttractionFormSecondPersistence
	extends BasePersistence<TourismNewAttractionFormSecond> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismNewAttractionFormSecondUtil} to access the tourism new attraction form second persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism new attraction form second where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewAttractionFormSecondException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new attraction form second
	 * @throws NoSuchTourismNewAttractionFormSecondException if a matching tourism new attraction form second could not be found
	 */
	public TourismNewAttractionFormSecond findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAttractionFormSecondException;

	/**
	 * Returns the tourism new attraction form second where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new attraction form second, or <code>null</code> if a matching tourism new attraction form second could not be found
	 */
	public TourismNewAttractionFormSecond fetchBygetTourismById(
		long tourismApplicationId);

	/**
	 * Returns the tourism new attraction form second where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new attraction form second, or <code>null</code> if a matching tourism new attraction form second could not be found
	 */
	public TourismNewAttractionFormSecond fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism new attraction form second where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new attraction form second that was removed
	 */
	public TourismNewAttractionFormSecond removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAttractionFormSecondException;

	/**
	 * Returns the number of tourism new attraction form seconds where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new attraction form seconds
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Caches the tourism new attraction form second in the entity cache if it is enabled.
	 *
	 * @param tourismNewAttractionFormSecond the tourism new attraction form second
	 */
	public void cacheResult(
		TourismNewAttractionFormSecond tourismNewAttractionFormSecond);

	/**
	 * Caches the tourism new attraction form seconds in the entity cache if it is enabled.
	 *
	 * @param tourismNewAttractionFormSeconds the tourism new attraction form seconds
	 */
	public void cacheResult(
		java.util.List<TourismNewAttractionFormSecond>
			tourismNewAttractionFormSeconds);

	/**
	 * Creates a new tourism new attraction form second with the primary key. Does not add the tourism new attraction form second to the database.
	 *
	 * @param tourismNewAttractionFormSecId the primary key for the new tourism new attraction form second
	 * @return the new tourism new attraction form second
	 */
	public TourismNewAttractionFormSecond create(
		long tourismNewAttractionFormSecId);

	/**
	 * Removes the tourism new attraction form second with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismNewAttractionFormSecId the primary key of the tourism new attraction form second
	 * @return the tourism new attraction form second that was removed
	 * @throws NoSuchTourismNewAttractionFormSecondException if a tourism new attraction form second with the primary key could not be found
	 */
	public TourismNewAttractionFormSecond remove(
			long tourismNewAttractionFormSecId)
		throws NoSuchTourismNewAttractionFormSecondException;

	public TourismNewAttractionFormSecond updateImpl(
		TourismNewAttractionFormSecond tourismNewAttractionFormSecond);

	/**
	 * Returns the tourism new attraction form second with the primary key or throws a <code>NoSuchTourismNewAttractionFormSecondException</code> if it could not be found.
	 *
	 * @param tourismNewAttractionFormSecId the primary key of the tourism new attraction form second
	 * @return the tourism new attraction form second
	 * @throws NoSuchTourismNewAttractionFormSecondException if a tourism new attraction form second with the primary key could not be found
	 */
	public TourismNewAttractionFormSecond findByPrimaryKey(
			long tourismNewAttractionFormSecId)
		throws NoSuchTourismNewAttractionFormSecondException;

	/**
	 * Returns the tourism new attraction form second with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismNewAttractionFormSecId the primary key of the tourism new attraction form second
	 * @return the tourism new attraction form second, or <code>null</code> if a tourism new attraction form second with the primary key could not be found
	 */
	public TourismNewAttractionFormSecond fetchByPrimaryKey(
		long tourismNewAttractionFormSecId);

	/**
	 * Returns all the tourism new attraction form seconds.
	 *
	 * @return the tourism new attraction form seconds
	 */
	public java.util.List<TourismNewAttractionFormSecond> findAll();

	/**
	 * Returns a range of all the tourism new attraction form seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionFormSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction form seconds
	 * @param end the upper bound of the range of tourism new attraction form seconds (not inclusive)
	 * @return the range of tourism new attraction form seconds
	 */
	public java.util.List<TourismNewAttractionFormSecond> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the tourism new attraction form seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionFormSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction form seconds
	 * @param end the upper bound of the range of tourism new attraction form seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new attraction form seconds
	 */
	public java.util.List<TourismNewAttractionFormSecond> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewAttractionFormSecond> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism new attraction form seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionFormSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction form seconds
	 * @param end the upper bound of the range of tourism new attraction form seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new attraction form seconds
	 */
	public java.util.List<TourismNewAttractionFormSecond> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewAttractionFormSecond> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism new attraction form seconds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism new attraction form seconds.
	 *
	 * @return the number of tourism new attraction form seconds
	 */
	public int countAll();

}