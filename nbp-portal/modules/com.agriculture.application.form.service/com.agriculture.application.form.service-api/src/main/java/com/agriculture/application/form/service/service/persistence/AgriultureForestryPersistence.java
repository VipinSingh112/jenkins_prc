/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence;

import com.agriculture.application.form.service.exception.NoSuchAgriultureForestryException;
import com.agriculture.application.form.service.model.AgriultureForestry;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the agriulture forestry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgriultureForestryUtil
 * @generated
 */
@ProviderType
public interface AgriultureForestryPersistence
	extends BasePersistence<AgriultureForestry> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AgriultureForestryUtil} to access the agriulture forestry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the agriulture forestry where agricultureApplicationId = &#63; or throws a <code>NoSuchAgriultureForestryException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriulture forestry
	 * @throws NoSuchAgriultureForestryException if a matching agriulture forestry could not be found
	 */
	public AgriultureForestry findBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgriultureForestryException;

	/**
	 * Returns the agriulture forestry where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriulture forestry, or <code>null</code> if a matching agriulture forestry could not be found
	 */
	public AgriultureForestry fetchBygetAgricultureById(
		long agricultureApplicationId);

	/**
	 * Returns the agriulture forestry where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriulture forestry, or <code>null</code> if a matching agriulture forestry could not be found
	 */
	public AgriultureForestry fetchBygetAgricultureById(
		long agricultureApplicationId, boolean useFinderCache);

	/**
	 * Removes the agriulture forestry where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agriulture forestry that was removed
	 */
	public AgriultureForestry removeBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgriultureForestryException;

	/**
	 * Returns the number of agriulture forestries where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriulture forestries
	 */
	public int countBygetAgricultureById(long agricultureApplicationId);

	/**
	 * Returns all the agriulture forestries where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriulture forestries
	 */
	public java.util.List<AgriultureForestry> findBygetAForest_by_AAI(
		long agricultureApplicationId);

	/**
	 * Returns a range of all the agriulture forestries where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriultureForestryModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriulture forestries
	 * @param end the upper bound of the range of agriulture forestries (not inclusive)
	 * @return the range of matching agriulture forestries
	 */
	public java.util.List<AgriultureForestry> findBygetAForest_by_AAI(
		long agricultureApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the agriulture forestries where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriultureForestryModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriulture forestries
	 * @param end the upper bound of the range of agriulture forestries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriulture forestries
	 */
	public java.util.List<AgriultureForestry> findBygetAForest_by_AAI(
		long agricultureApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgriultureForestry>
			orderByComparator);

	/**
	 * Returns an ordered range of all the agriulture forestries where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriultureForestryModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriulture forestries
	 * @param end the upper bound of the range of agriulture forestries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriulture forestries
	 */
	public java.util.List<AgriultureForestry> findBygetAForest_by_AAI(
		long agricultureApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgriultureForestry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first agriulture forestry in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriulture forestry
	 * @throws NoSuchAgriultureForestryException if a matching agriulture forestry could not be found
	 */
	public AgriultureForestry findBygetAForest_by_AAI_First(
			long agricultureApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AgriultureForestry>
				orderByComparator)
		throws NoSuchAgriultureForestryException;

	/**
	 * Returns the first agriulture forestry in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriulture forestry, or <code>null</code> if a matching agriulture forestry could not be found
	 */
	public AgriultureForestry fetchBygetAForest_by_AAI_First(
		long agricultureApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AgriultureForestry>
			orderByComparator);

	/**
	 * Returns the last agriulture forestry in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriulture forestry
	 * @throws NoSuchAgriultureForestryException if a matching agriulture forestry could not be found
	 */
	public AgriultureForestry findBygetAForest_by_AAI_Last(
			long agricultureApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AgriultureForestry>
				orderByComparator)
		throws NoSuchAgriultureForestryException;

	/**
	 * Returns the last agriulture forestry in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriulture forestry, or <code>null</code> if a matching agriulture forestry could not be found
	 */
	public AgriultureForestry fetchBygetAForest_by_AAI_Last(
		long agricultureApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AgriultureForestry>
			orderByComparator);

	/**
	 * Returns the agriulture forestries before and after the current agriulture forestry in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agriultureForestryId the primary key of the current agriulture forestry
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriulture forestry
	 * @throws NoSuchAgriultureForestryException if a agriulture forestry with the primary key could not be found
	 */
	public AgriultureForestry[] findBygetAForest_by_AAI_PrevAndNext(
			long agriultureForestryId, long agricultureApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AgriultureForestry>
				orderByComparator)
		throws NoSuchAgriultureForestryException;

	/**
	 * Removes all the agriulture forestries where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 */
	public void removeBygetAForest_by_AAI(long agricultureApplicationId);

	/**
	 * Returns the number of agriulture forestries where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriulture forestries
	 */
	public int countBygetAForest_by_AAI(long agricultureApplicationId);

	/**
	 * Caches the agriulture forestry in the entity cache if it is enabled.
	 *
	 * @param agriultureForestry the agriulture forestry
	 */
	public void cacheResult(AgriultureForestry agriultureForestry);

	/**
	 * Caches the agriulture forestries in the entity cache if it is enabled.
	 *
	 * @param agriultureForestries the agriulture forestries
	 */
	public void cacheResult(
		java.util.List<AgriultureForestry> agriultureForestries);

	/**
	 * Creates a new agriulture forestry with the primary key. Does not add the agriulture forestry to the database.
	 *
	 * @param agriultureForestryId the primary key for the new agriulture forestry
	 * @return the new agriulture forestry
	 */
	public AgriultureForestry create(long agriultureForestryId);

	/**
	 * Removes the agriulture forestry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agriultureForestryId the primary key of the agriulture forestry
	 * @return the agriulture forestry that was removed
	 * @throws NoSuchAgriultureForestryException if a agriulture forestry with the primary key could not be found
	 */
	public AgriultureForestry remove(long agriultureForestryId)
		throws NoSuchAgriultureForestryException;

	public AgriultureForestry updateImpl(AgriultureForestry agriultureForestry);

	/**
	 * Returns the agriulture forestry with the primary key or throws a <code>NoSuchAgriultureForestryException</code> if it could not be found.
	 *
	 * @param agriultureForestryId the primary key of the agriulture forestry
	 * @return the agriulture forestry
	 * @throws NoSuchAgriultureForestryException if a agriulture forestry with the primary key could not be found
	 */
	public AgriultureForestry findByPrimaryKey(long agriultureForestryId)
		throws NoSuchAgriultureForestryException;

	/**
	 * Returns the agriulture forestry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agriultureForestryId the primary key of the agriulture forestry
	 * @return the agriulture forestry, or <code>null</code> if a agriulture forestry with the primary key could not be found
	 */
	public AgriultureForestry fetchByPrimaryKey(long agriultureForestryId);

	/**
	 * Returns all the agriulture forestries.
	 *
	 * @return the agriulture forestries
	 */
	public java.util.List<AgriultureForestry> findAll();

	/**
	 * Returns a range of all the agriulture forestries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriultureForestryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriulture forestries
	 * @param end the upper bound of the range of agriulture forestries (not inclusive)
	 * @return the range of agriulture forestries
	 */
	public java.util.List<AgriultureForestry> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the agriulture forestries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriultureForestryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriulture forestries
	 * @param end the upper bound of the range of agriulture forestries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriulture forestries
	 */
	public java.util.List<AgriultureForestry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgriultureForestry>
			orderByComparator);

	/**
	 * Returns an ordered range of all the agriulture forestries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriultureForestryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriulture forestries
	 * @param end the upper bound of the range of agriulture forestries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriulture forestries
	 */
	public java.util.List<AgriultureForestry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgriultureForestry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the agriulture forestries from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of agriulture forestries.
	 *
	 * @return the number of agriulture forestries
	 */
	public int countAll();

}