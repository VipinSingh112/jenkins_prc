/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchDetailOfBusinessSecThreeException;
import com.nbp.hsra.application.service.model.DetailOfBusinessSecThree;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the detail of business sec three service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DetailOfBusinessSecThreeUtil
 * @generated
 */
@ProviderType
public interface DetailOfBusinessSecThreePersistence
	extends BasePersistence<DetailOfBusinessSecThree> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DetailOfBusinessSecThreeUtil} to access the detail of business sec three persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the detail of business sec three where hsraApplicationId = &#63; or throws a <code>NoSuchDetailOfBusinessSecThreeException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching detail of business sec three
	 * @throws NoSuchDetailOfBusinessSecThreeException if a matching detail of business sec three could not be found
	 */
	public DetailOfBusinessSecThree findBygetHsraById(long hsraApplicationId)
		throws NoSuchDetailOfBusinessSecThreeException;

	/**
	 * Returns the detail of business sec three where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching detail of business sec three, or <code>null</code> if a matching detail of business sec three could not be found
	 */
	public DetailOfBusinessSecThree fetchBygetHsraById(long hsraApplicationId);

	/**
	 * Returns the detail of business sec three where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching detail of business sec three, or <code>null</code> if a matching detail of business sec three could not be found
	 */
	public DetailOfBusinessSecThree fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache);

	/**
	 * Removes the detail of business sec three where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the detail of business sec three that was removed
	 */
	public DetailOfBusinessSecThree removeBygetHsraById(long hsraApplicationId)
		throws NoSuchDetailOfBusinessSecThreeException;

	/**
	 * Returns the number of detail of business sec threes where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching detail of business sec threes
	 */
	public int countBygetHsraById(long hsraApplicationId);

	/**
	 * Caches the detail of business sec three in the entity cache if it is enabled.
	 *
	 * @param detailOfBusinessSecThree the detail of business sec three
	 */
	public void cacheResult(DetailOfBusinessSecThree detailOfBusinessSecThree);

	/**
	 * Caches the detail of business sec threes in the entity cache if it is enabled.
	 *
	 * @param detailOfBusinessSecThrees the detail of business sec threes
	 */
	public void cacheResult(
		java.util.List<DetailOfBusinessSecThree> detailOfBusinessSecThrees);

	/**
	 * Creates a new detail of business sec three with the primary key. Does not add the detail of business sec three to the database.
	 *
	 * @param detailOfBusinessSecThreeId the primary key for the new detail of business sec three
	 * @return the new detail of business sec three
	 */
	public DetailOfBusinessSecThree create(long detailOfBusinessSecThreeId);

	/**
	 * Removes the detail of business sec three with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param detailOfBusinessSecThreeId the primary key of the detail of business sec three
	 * @return the detail of business sec three that was removed
	 * @throws NoSuchDetailOfBusinessSecThreeException if a detail of business sec three with the primary key could not be found
	 */
	public DetailOfBusinessSecThree remove(long detailOfBusinessSecThreeId)
		throws NoSuchDetailOfBusinessSecThreeException;

	public DetailOfBusinessSecThree updateImpl(
		DetailOfBusinessSecThree detailOfBusinessSecThree);

	/**
	 * Returns the detail of business sec three with the primary key or throws a <code>NoSuchDetailOfBusinessSecThreeException</code> if it could not be found.
	 *
	 * @param detailOfBusinessSecThreeId the primary key of the detail of business sec three
	 * @return the detail of business sec three
	 * @throws NoSuchDetailOfBusinessSecThreeException if a detail of business sec three with the primary key could not be found
	 */
	public DetailOfBusinessSecThree findByPrimaryKey(
			long detailOfBusinessSecThreeId)
		throws NoSuchDetailOfBusinessSecThreeException;

	/**
	 * Returns the detail of business sec three with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param detailOfBusinessSecThreeId the primary key of the detail of business sec three
	 * @return the detail of business sec three, or <code>null</code> if a detail of business sec three with the primary key could not be found
	 */
	public DetailOfBusinessSecThree fetchByPrimaryKey(
		long detailOfBusinessSecThreeId);

	/**
	 * Returns all the detail of business sec threes.
	 *
	 * @return the detail of business sec threes
	 */
	public java.util.List<DetailOfBusinessSecThree> findAll();

	/**
	 * Returns a range of all the detail of business sec threes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfBusinessSecThreeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of business sec threes
	 * @param end the upper bound of the range of detail of business sec threes (not inclusive)
	 * @return the range of detail of business sec threes
	 */
	public java.util.List<DetailOfBusinessSecThree> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the detail of business sec threes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfBusinessSecThreeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of business sec threes
	 * @param end the upper bound of the range of detail of business sec threes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of detail of business sec threes
	 */
	public java.util.List<DetailOfBusinessSecThree> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<DetailOfBusinessSecThree> orderByComparator);

	/**
	 * Returns an ordered range of all the detail of business sec threes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfBusinessSecThreeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of business sec threes
	 * @param end the upper bound of the range of detail of business sec threes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of detail of business sec threes
	 */
	public java.util.List<DetailOfBusinessSecThree> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<DetailOfBusinessSecThree> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the detail of business sec threes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of detail of business sec threes.
	 *
	 * @return the number of detail of business sec threes
	 */
	public int countAll();

}