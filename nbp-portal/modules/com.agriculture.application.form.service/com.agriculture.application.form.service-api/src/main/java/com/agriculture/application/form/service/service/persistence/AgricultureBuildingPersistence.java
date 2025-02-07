/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence;

import com.agriculture.application.form.service.exception.NoSuchAgricultureBuildingException;
import com.agriculture.application.form.service.model.AgricultureBuilding;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the agriculture building service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureBuildingUtil
 * @generated
 */
@ProviderType
public interface AgricultureBuildingPersistence
	extends BasePersistence<AgricultureBuilding> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AgricultureBuildingUtil} to access the agriculture building persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the agriculture building where agricultureApplicationId = &#63; or throws a <code>NoSuchAgricultureBuildingException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture building
	 * @throws NoSuchAgricultureBuildingException if a matching agriculture building could not be found
	 */
	public AgricultureBuilding findBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultureBuildingException;

	/**
	 * Returns the agriculture building where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture building, or <code>null</code> if a matching agriculture building could not be found
	 */
	public AgricultureBuilding fetchBygetAgricultureById(
		long agricultureApplicationId);

	/**
	 * Returns the agriculture building where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture building, or <code>null</code> if a matching agriculture building could not be found
	 */
	public AgricultureBuilding fetchBygetAgricultureById(
		long agricultureApplicationId, boolean useFinderCache);

	/**
	 * Removes the agriculture building where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agriculture building that was removed
	 */
	public AgricultureBuilding removeBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultureBuildingException;

	/**
	 * Returns the number of agriculture buildings where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture buildings
	 */
	public int countBygetAgricultureById(long agricultureApplicationId);

	/**
	 * Returns all the agriculture buildings where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture buildings
	 */
	public java.util.List<AgricultureBuilding> findBygetAB_by_AAI(
		long agricultureApplicationId);

	/**
	 * Returns a range of all the agriculture buildings where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureBuildingModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture buildings
	 * @param end the upper bound of the range of agriculture buildings (not inclusive)
	 * @return the range of matching agriculture buildings
	 */
	public java.util.List<AgricultureBuilding> findBygetAB_by_AAI(
		long agricultureApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the agriculture buildings where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureBuildingModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture buildings
	 * @param end the upper bound of the range of agriculture buildings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture buildings
	 */
	public java.util.List<AgricultureBuilding> findBygetAB_by_AAI(
		long agricultureApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureBuilding>
			orderByComparator);

	/**
	 * Returns an ordered range of all the agriculture buildings where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureBuildingModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture buildings
	 * @param end the upper bound of the range of agriculture buildings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture buildings
	 */
	public java.util.List<AgricultureBuilding> findBygetAB_by_AAI(
		long agricultureApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureBuilding>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first agriculture building in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture building
	 * @throws NoSuchAgricultureBuildingException if a matching agriculture building could not be found
	 */
	public AgricultureBuilding findBygetAB_by_AAI_First(
			long agricultureApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureBuilding> orderByComparator)
		throws NoSuchAgricultureBuildingException;

	/**
	 * Returns the first agriculture building in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture building, or <code>null</code> if a matching agriculture building could not be found
	 */
	public AgricultureBuilding fetchBygetAB_by_AAI_First(
		long agricultureApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureBuilding>
			orderByComparator);

	/**
	 * Returns the last agriculture building in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture building
	 * @throws NoSuchAgricultureBuildingException if a matching agriculture building could not be found
	 */
	public AgricultureBuilding findBygetAB_by_AAI_Last(
			long agricultureApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureBuilding> orderByComparator)
		throws NoSuchAgricultureBuildingException;

	/**
	 * Returns the last agriculture building in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture building, or <code>null</code> if a matching agriculture building could not be found
	 */
	public AgricultureBuilding fetchBygetAB_by_AAI_Last(
		long agricultureApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureBuilding>
			orderByComparator);

	/**
	 * Returns the agriculture buildings before and after the current agriculture building in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureBuildingId the primary key of the current agriculture building
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture building
	 * @throws NoSuchAgricultureBuildingException if a agriculture building with the primary key could not be found
	 */
	public AgricultureBuilding[] findBygetAB_by_AAI_PrevAndNext(
			long agricultureBuildingId, long agricultureApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureBuilding> orderByComparator)
		throws NoSuchAgricultureBuildingException;

	/**
	 * Removes all the agriculture buildings where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 */
	public void removeBygetAB_by_AAI(long agricultureApplicationId);

	/**
	 * Returns the number of agriculture buildings where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture buildings
	 */
	public int countBygetAB_by_AAI(long agricultureApplicationId);

	/**
	 * Caches the agriculture building in the entity cache if it is enabled.
	 *
	 * @param agricultureBuilding the agriculture building
	 */
	public void cacheResult(AgricultureBuilding agricultureBuilding);

	/**
	 * Caches the agriculture buildings in the entity cache if it is enabled.
	 *
	 * @param agricultureBuildings the agriculture buildings
	 */
	public void cacheResult(
		java.util.List<AgricultureBuilding> agricultureBuildings);

	/**
	 * Creates a new agriculture building with the primary key. Does not add the agriculture building to the database.
	 *
	 * @param agricultureBuildingId the primary key for the new agriculture building
	 * @return the new agriculture building
	 */
	public AgricultureBuilding create(long agricultureBuildingId);

	/**
	 * Removes the agriculture building with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agricultureBuildingId the primary key of the agriculture building
	 * @return the agriculture building that was removed
	 * @throws NoSuchAgricultureBuildingException if a agriculture building with the primary key could not be found
	 */
	public AgricultureBuilding remove(long agricultureBuildingId)
		throws NoSuchAgricultureBuildingException;

	public AgricultureBuilding updateImpl(
		AgricultureBuilding agricultureBuilding);

	/**
	 * Returns the agriculture building with the primary key or throws a <code>NoSuchAgricultureBuildingException</code> if it could not be found.
	 *
	 * @param agricultureBuildingId the primary key of the agriculture building
	 * @return the agriculture building
	 * @throws NoSuchAgricultureBuildingException if a agriculture building with the primary key could not be found
	 */
	public AgricultureBuilding findByPrimaryKey(long agricultureBuildingId)
		throws NoSuchAgricultureBuildingException;

	/**
	 * Returns the agriculture building with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agricultureBuildingId the primary key of the agriculture building
	 * @return the agriculture building, or <code>null</code> if a agriculture building with the primary key could not be found
	 */
	public AgricultureBuilding fetchByPrimaryKey(long agricultureBuildingId);

	/**
	 * Returns all the agriculture buildings.
	 *
	 * @return the agriculture buildings
	 */
	public java.util.List<AgricultureBuilding> findAll();

	/**
	 * Returns a range of all the agriculture buildings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureBuildingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture buildings
	 * @param end the upper bound of the range of agriculture buildings (not inclusive)
	 * @return the range of agriculture buildings
	 */
	public java.util.List<AgricultureBuilding> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the agriculture buildings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureBuildingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture buildings
	 * @param end the upper bound of the range of agriculture buildings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriculture buildings
	 */
	public java.util.List<AgricultureBuilding> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureBuilding>
			orderByComparator);

	/**
	 * Returns an ordered range of all the agriculture buildings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureBuildingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture buildings
	 * @param end the upper bound of the range of agriculture buildings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriculture buildings
	 */
	public java.util.List<AgricultureBuilding> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureBuilding>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the agriculture buildings from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of agriculture buildings.
	 *
	 * @return the number of agriculture buildings
	 */
	public int countAll();

}