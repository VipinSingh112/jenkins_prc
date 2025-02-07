/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismNewAttractionFormFirstException;
import com.nbp.tourism.application.form.services.model.TourismNewAttractionFormFirst;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism new attraction form first service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAttractionFormFirstUtil
 * @generated
 */
@ProviderType
public interface TourismNewAttractionFormFirstPersistence
	extends BasePersistence<TourismNewAttractionFormFirst> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismNewAttractionFormFirstUtil} to access the tourism new attraction form first persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism new attraction form first where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewAttractionFormFirstException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new attraction form first
	 * @throws NoSuchTourismNewAttractionFormFirstException if a matching tourism new attraction form first could not be found
	 */
	public TourismNewAttractionFormFirst findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAttractionFormFirstException;

	/**
	 * Returns the tourism new attraction form first where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new attraction form first, or <code>null</code> if a matching tourism new attraction form first could not be found
	 */
	public TourismNewAttractionFormFirst fetchBygetTourismById(
		long tourismApplicationId);

	/**
	 * Returns the tourism new attraction form first where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new attraction form first, or <code>null</code> if a matching tourism new attraction form first could not be found
	 */
	public TourismNewAttractionFormFirst fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism new attraction form first where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new attraction form first that was removed
	 */
	public TourismNewAttractionFormFirst removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAttractionFormFirstException;

	/**
	 * Returns the number of tourism new attraction form firsts where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new attraction form firsts
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Caches the tourism new attraction form first in the entity cache if it is enabled.
	 *
	 * @param tourismNewAttractionFormFirst the tourism new attraction form first
	 */
	public void cacheResult(
		TourismNewAttractionFormFirst tourismNewAttractionFormFirst);

	/**
	 * Caches the tourism new attraction form firsts in the entity cache if it is enabled.
	 *
	 * @param tourismNewAttractionFormFirsts the tourism new attraction form firsts
	 */
	public void cacheResult(
		java.util.List<TourismNewAttractionFormFirst>
			tourismNewAttractionFormFirsts);

	/**
	 * Creates a new tourism new attraction form first with the primary key. Does not add the tourism new attraction form first to the database.
	 *
	 * @param tourismNewAttractFormFirstId the primary key for the new tourism new attraction form first
	 * @return the new tourism new attraction form first
	 */
	public TourismNewAttractionFormFirst create(
		long tourismNewAttractFormFirstId);

	/**
	 * Removes the tourism new attraction form first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismNewAttractFormFirstId the primary key of the tourism new attraction form first
	 * @return the tourism new attraction form first that was removed
	 * @throws NoSuchTourismNewAttractionFormFirstException if a tourism new attraction form first with the primary key could not be found
	 */
	public TourismNewAttractionFormFirst remove(
			long tourismNewAttractFormFirstId)
		throws NoSuchTourismNewAttractionFormFirstException;

	public TourismNewAttractionFormFirst updateImpl(
		TourismNewAttractionFormFirst tourismNewAttractionFormFirst);

	/**
	 * Returns the tourism new attraction form first with the primary key or throws a <code>NoSuchTourismNewAttractionFormFirstException</code> if it could not be found.
	 *
	 * @param tourismNewAttractFormFirstId the primary key of the tourism new attraction form first
	 * @return the tourism new attraction form first
	 * @throws NoSuchTourismNewAttractionFormFirstException if a tourism new attraction form first with the primary key could not be found
	 */
	public TourismNewAttractionFormFirst findByPrimaryKey(
			long tourismNewAttractFormFirstId)
		throws NoSuchTourismNewAttractionFormFirstException;

	/**
	 * Returns the tourism new attraction form first with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismNewAttractFormFirstId the primary key of the tourism new attraction form first
	 * @return the tourism new attraction form first, or <code>null</code> if a tourism new attraction form first with the primary key could not be found
	 */
	public TourismNewAttractionFormFirst fetchByPrimaryKey(
		long tourismNewAttractFormFirstId);

	/**
	 * Returns all the tourism new attraction form firsts.
	 *
	 * @return the tourism new attraction form firsts
	 */
	public java.util.List<TourismNewAttractionFormFirst> findAll();

	/**
	 * Returns a range of all the tourism new attraction form firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionFormFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction form firsts
	 * @param end the upper bound of the range of tourism new attraction form firsts (not inclusive)
	 * @return the range of tourism new attraction form firsts
	 */
	public java.util.List<TourismNewAttractionFormFirst> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the tourism new attraction form firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionFormFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction form firsts
	 * @param end the upper bound of the range of tourism new attraction form firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new attraction form firsts
	 */
	public java.util.List<TourismNewAttractionFormFirst> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewAttractionFormFirst> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism new attraction form firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionFormFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction form firsts
	 * @param end the upper bound of the range of tourism new attraction form firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new attraction form firsts
	 */
	public java.util.List<TourismNewAttractionFormFirst> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewAttractionFormFirst> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism new attraction form firsts from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism new attraction form firsts.
	 *
	 * @return the number of tourism new attraction form firsts
	 */
	public int countAll();

}