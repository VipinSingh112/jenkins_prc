/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchDetailOfSourcesException;
import com.nbp.hsra.application.service.model.DetailOfSources;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the detail of sources service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DetailOfSourcesUtil
 * @generated
 */
@ProviderType
public interface DetailOfSourcesPersistence
	extends BasePersistence<DetailOfSources> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DetailOfSourcesUtil} to access the detail of sources persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the detail of sources where hsraApplicationId = &#63; or throws a <code>NoSuchDetailOfSourcesException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching detail of sources
	 * @throws NoSuchDetailOfSourcesException if a matching detail of sources could not be found
	 */
	public DetailOfSources findBygetHsraById(long hsraApplicationId)
		throws NoSuchDetailOfSourcesException;

	/**
	 * Returns the detail of sources where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching detail of sources, or <code>null</code> if a matching detail of sources could not be found
	 */
	public DetailOfSources fetchBygetHsraById(long hsraApplicationId);

	/**
	 * Returns the detail of sources where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching detail of sources, or <code>null</code> if a matching detail of sources could not be found
	 */
	public DetailOfSources fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache);

	/**
	 * Removes the detail of sources where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the detail of sources that was removed
	 */
	public DetailOfSources removeBygetHsraById(long hsraApplicationId)
		throws NoSuchDetailOfSourcesException;

	/**
	 * Returns the number of detail of sourceses where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching detail of sourceses
	 */
	public int countBygetHsraById(long hsraApplicationId);

	/**
	 * Caches the detail of sources in the entity cache if it is enabled.
	 *
	 * @param detailOfSources the detail of sources
	 */
	public void cacheResult(DetailOfSources detailOfSources);

	/**
	 * Caches the detail of sourceses in the entity cache if it is enabled.
	 *
	 * @param detailOfSourceses the detail of sourceses
	 */
	public void cacheResult(java.util.List<DetailOfSources> detailOfSourceses);

	/**
	 * Creates a new detail of sources with the primary key. Does not add the detail of sources to the database.
	 *
	 * @param detailOfSourcesId the primary key for the new detail of sources
	 * @return the new detail of sources
	 */
	public DetailOfSources create(long detailOfSourcesId);

	/**
	 * Removes the detail of sources with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param detailOfSourcesId the primary key of the detail of sources
	 * @return the detail of sources that was removed
	 * @throws NoSuchDetailOfSourcesException if a detail of sources with the primary key could not be found
	 */
	public DetailOfSources remove(long detailOfSourcesId)
		throws NoSuchDetailOfSourcesException;

	public DetailOfSources updateImpl(DetailOfSources detailOfSources);

	/**
	 * Returns the detail of sources with the primary key or throws a <code>NoSuchDetailOfSourcesException</code> if it could not be found.
	 *
	 * @param detailOfSourcesId the primary key of the detail of sources
	 * @return the detail of sources
	 * @throws NoSuchDetailOfSourcesException if a detail of sources with the primary key could not be found
	 */
	public DetailOfSources findByPrimaryKey(long detailOfSourcesId)
		throws NoSuchDetailOfSourcesException;

	/**
	 * Returns the detail of sources with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param detailOfSourcesId the primary key of the detail of sources
	 * @return the detail of sources, or <code>null</code> if a detail of sources with the primary key could not be found
	 */
	public DetailOfSources fetchByPrimaryKey(long detailOfSourcesId);

	/**
	 * Returns all the detail of sourceses.
	 *
	 * @return the detail of sourceses
	 */
	public java.util.List<DetailOfSources> findAll();

	/**
	 * Returns a range of all the detail of sourceses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfSourcesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of sourceses
	 * @param end the upper bound of the range of detail of sourceses (not inclusive)
	 * @return the range of detail of sourceses
	 */
	public java.util.List<DetailOfSources> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the detail of sourceses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfSourcesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of sourceses
	 * @param end the upper bound of the range of detail of sourceses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of detail of sourceses
	 */
	public java.util.List<DetailOfSources> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DetailOfSources>
			orderByComparator);

	/**
	 * Returns an ordered range of all the detail of sourceses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfSourcesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of sourceses
	 * @param end the upper bound of the range of detail of sourceses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of detail of sourceses
	 */
	public java.util.List<DetailOfSources> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DetailOfSources>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the detail of sourceses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of detail of sourceses.
	 *
	 * @return the number of detail of sourceses
	 */
	public int countAll();

}