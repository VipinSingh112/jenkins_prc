/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjPremisesLocationException;
import com.nbp.ncbj.application.form.service.model.NcbjPremisesLocation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncbj premises location service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjPremisesLocationUtil
 * @generated
 */
@ProviderType
public interface NcbjPremisesLocationPersistence
	extends BasePersistence<NcbjPremisesLocation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcbjPremisesLocationUtil} to access the ncbj premises location persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the ncbj premises location where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjPremisesLocationException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj premises location
	 * @throws NoSuchNcbjPremisesLocationException if a matching ncbj premises location could not be found
	 */
	public NcbjPremisesLocation findBygetNCBJ_ById(long ncbjApplicationId)
		throws NoSuchNcbjPremisesLocationException;

	/**
	 * Returns the ncbj premises location where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj premises location, or <code>null</code> if a matching ncbj premises location could not be found
	 */
	public NcbjPremisesLocation fetchBygetNCBJ_ById(long ncbjApplicationId);

	/**
	 * Returns the ncbj premises location where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj premises location, or <code>null</code> if a matching ncbj premises location could not be found
	 */
	public NcbjPremisesLocation fetchBygetNCBJ_ById(
		long ncbjApplicationId, boolean useFinderCache);

	/**
	 * Removes the ncbj premises location where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj premises location that was removed
	 */
	public NcbjPremisesLocation removeBygetNCBJ_ById(long ncbjApplicationId)
		throws NoSuchNcbjPremisesLocationException;

	/**
	 * Returns the number of ncbj premises locations where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj premises locations
	 */
	public int countBygetNCBJ_ById(long ncbjApplicationId);

	/**
	 * Caches the ncbj premises location in the entity cache if it is enabled.
	 *
	 * @param ncbjPremisesLocation the ncbj premises location
	 */
	public void cacheResult(NcbjPremisesLocation ncbjPremisesLocation);

	/**
	 * Caches the ncbj premises locations in the entity cache if it is enabled.
	 *
	 * @param ncbjPremisesLocations the ncbj premises locations
	 */
	public void cacheResult(
		java.util.List<NcbjPremisesLocation> ncbjPremisesLocations);

	/**
	 * Creates a new ncbj premises location with the primary key. Does not add the ncbj premises location to the database.
	 *
	 * @param ncbjPremisesLocationId the primary key for the new ncbj premises location
	 * @return the new ncbj premises location
	 */
	public NcbjPremisesLocation create(long ncbjPremisesLocationId);

	/**
	 * Removes the ncbj premises location with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjPremisesLocationId the primary key of the ncbj premises location
	 * @return the ncbj premises location that was removed
	 * @throws NoSuchNcbjPremisesLocationException if a ncbj premises location with the primary key could not be found
	 */
	public NcbjPremisesLocation remove(long ncbjPremisesLocationId)
		throws NoSuchNcbjPremisesLocationException;

	public NcbjPremisesLocation updateImpl(
		NcbjPremisesLocation ncbjPremisesLocation);

	/**
	 * Returns the ncbj premises location with the primary key or throws a <code>NoSuchNcbjPremisesLocationException</code> if it could not be found.
	 *
	 * @param ncbjPremisesLocationId the primary key of the ncbj premises location
	 * @return the ncbj premises location
	 * @throws NoSuchNcbjPremisesLocationException if a ncbj premises location with the primary key could not be found
	 */
	public NcbjPremisesLocation findByPrimaryKey(long ncbjPremisesLocationId)
		throws NoSuchNcbjPremisesLocationException;

	/**
	 * Returns the ncbj premises location with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjPremisesLocationId the primary key of the ncbj premises location
	 * @return the ncbj premises location, or <code>null</code> if a ncbj premises location with the primary key could not be found
	 */
	public NcbjPremisesLocation fetchByPrimaryKey(long ncbjPremisesLocationId);

	/**
	 * Returns all the ncbj premises locations.
	 *
	 * @return the ncbj premises locations
	 */
	public java.util.List<NcbjPremisesLocation> findAll();

	/**
	 * Returns a range of all the ncbj premises locations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjPremisesLocationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj premises locations
	 * @param end the upper bound of the range of ncbj premises locations (not inclusive)
	 * @return the range of ncbj premises locations
	 */
	public java.util.List<NcbjPremisesLocation> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ncbj premises locations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjPremisesLocationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj premises locations
	 * @param end the upper bound of the range of ncbj premises locations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj premises locations
	 */
	public java.util.List<NcbjPremisesLocation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjPremisesLocation>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj premises locations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjPremisesLocationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj premises locations
	 * @param end the upper bound of the range of ncbj premises locations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj premises locations
	 */
	public java.util.List<NcbjPremisesLocation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjPremisesLocation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncbj premises locations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncbj premises locations.
	 *
	 * @return the number of ncbj premises locations
	 */
	public int countAll();

}