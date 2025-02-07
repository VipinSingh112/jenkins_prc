/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence;

import com.agriculture.application.form.service.exception.NoSuchAgricultureFarmException;
import com.agriculture.application.form.service.model.AgricultureFarm;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the agriculture farm service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureFarmUtil
 * @generated
 */
@ProviderType
public interface AgricultureFarmPersistence
	extends BasePersistence<AgricultureFarm> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AgricultureFarmUtil} to access the agriculture farm persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the agriculture farm where agricultureApplicationId = &#63; or throws a <code>NoSuchAgricultureFarmException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture farm
	 * @throws NoSuchAgricultureFarmException if a matching agriculture farm could not be found
	 */
	public AgricultureFarm findBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultureFarmException;

	/**
	 * Returns the agriculture farm where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture farm, or <code>null</code> if a matching agriculture farm could not be found
	 */
	public AgricultureFarm fetchBygetAgricultureById(
		long agricultureApplicationId);

	/**
	 * Returns the agriculture farm where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture farm, or <code>null</code> if a matching agriculture farm could not be found
	 */
	public AgricultureFarm fetchBygetAgricultureById(
		long agricultureApplicationId, boolean useFinderCache);

	/**
	 * Removes the agriculture farm where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agriculture farm that was removed
	 */
	public AgricultureFarm removeBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultureFarmException;

	/**
	 * Returns the number of agriculture farms where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture farms
	 */
	public int countBygetAgricultureById(long agricultureApplicationId);

	/**
	 * Returns all the agriculture farms where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture farms
	 */
	public java.util.List<AgricultureFarm> findBygetAFa_by_AAI(
		long agricultureApplicationId);

	/**
	 * Returns a range of all the agriculture farms where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureFarmModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture farms
	 * @param end the upper bound of the range of agriculture farms (not inclusive)
	 * @return the range of matching agriculture farms
	 */
	public java.util.List<AgricultureFarm> findBygetAFa_by_AAI(
		long agricultureApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the agriculture farms where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureFarmModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture farms
	 * @param end the upper bound of the range of agriculture farms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture farms
	 */
	public java.util.List<AgricultureFarm> findBygetAFa_by_AAI(
		long agricultureApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureFarm>
			orderByComparator);

	/**
	 * Returns an ordered range of all the agriculture farms where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureFarmModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture farms
	 * @param end the upper bound of the range of agriculture farms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture farms
	 */
	public java.util.List<AgricultureFarm> findBygetAFa_by_AAI(
		long agricultureApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureFarm>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first agriculture farm in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture farm
	 * @throws NoSuchAgricultureFarmException if a matching agriculture farm could not be found
	 */
	public AgricultureFarm findBygetAFa_by_AAI_First(
			long agricultureApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AgricultureFarm>
				orderByComparator)
		throws NoSuchAgricultureFarmException;

	/**
	 * Returns the first agriculture farm in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture farm, or <code>null</code> if a matching agriculture farm could not be found
	 */
	public AgricultureFarm fetchBygetAFa_by_AAI_First(
		long agricultureApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureFarm>
			orderByComparator);

	/**
	 * Returns the last agriculture farm in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture farm
	 * @throws NoSuchAgricultureFarmException if a matching agriculture farm could not be found
	 */
	public AgricultureFarm findBygetAFa_by_AAI_Last(
			long agricultureApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AgricultureFarm>
				orderByComparator)
		throws NoSuchAgricultureFarmException;

	/**
	 * Returns the last agriculture farm in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture farm, or <code>null</code> if a matching agriculture farm could not be found
	 */
	public AgricultureFarm fetchBygetAFa_by_AAI_Last(
		long agricultureApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureFarm>
			orderByComparator);

	/**
	 * Returns the agriculture farms before and after the current agriculture farm in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureFarmId the primary key of the current agriculture farm
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture farm
	 * @throws NoSuchAgricultureFarmException if a agriculture farm with the primary key could not be found
	 */
	public AgricultureFarm[] findBygetAFa_by_AAI_PrevAndNext(
			long agricultureFarmId, long agricultureApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AgricultureFarm>
				orderByComparator)
		throws NoSuchAgricultureFarmException;

	/**
	 * Removes all the agriculture farms where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 */
	public void removeBygetAFa_by_AAI(long agricultureApplicationId);

	/**
	 * Returns the number of agriculture farms where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture farms
	 */
	public int countBygetAFa_by_AAI(long agricultureApplicationId);

	/**
	 * Caches the agriculture farm in the entity cache if it is enabled.
	 *
	 * @param agricultureFarm the agriculture farm
	 */
	public void cacheResult(AgricultureFarm agricultureFarm);

	/**
	 * Caches the agriculture farms in the entity cache if it is enabled.
	 *
	 * @param agricultureFarms the agriculture farms
	 */
	public void cacheResult(java.util.List<AgricultureFarm> agricultureFarms);

	/**
	 * Creates a new agriculture farm with the primary key. Does not add the agriculture farm to the database.
	 *
	 * @param agricultureFarmId the primary key for the new agriculture farm
	 * @return the new agriculture farm
	 */
	public AgricultureFarm create(long agricultureFarmId);

	/**
	 * Removes the agriculture farm with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agricultureFarmId the primary key of the agriculture farm
	 * @return the agriculture farm that was removed
	 * @throws NoSuchAgricultureFarmException if a agriculture farm with the primary key could not be found
	 */
	public AgricultureFarm remove(long agricultureFarmId)
		throws NoSuchAgricultureFarmException;

	public AgricultureFarm updateImpl(AgricultureFarm agricultureFarm);

	/**
	 * Returns the agriculture farm with the primary key or throws a <code>NoSuchAgricultureFarmException</code> if it could not be found.
	 *
	 * @param agricultureFarmId the primary key of the agriculture farm
	 * @return the agriculture farm
	 * @throws NoSuchAgricultureFarmException if a agriculture farm with the primary key could not be found
	 */
	public AgricultureFarm findByPrimaryKey(long agricultureFarmId)
		throws NoSuchAgricultureFarmException;

	/**
	 * Returns the agriculture farm with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agricultureFarmId the primary key of the agriculture farm
	 * @return the agriculture farm, or <code>null</code> if a agriculture farm with the primary key could not be found
	 */
	public AgricultureFarm fetchByPrimaryKey(long agricultureFarmId);

	/**
	 * Returns all the agriculture farms.
	 *
	 * @return the agriculture farms
	 */
	public java.util.List<AgricultureFarm> findAll();

	/**
	 * Returns a range of all the agriculture farms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureFarmModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture farms
	 * @param end the upper bound of the range of agriculture farms (not inclusive)
	 * @return the range of agriculture farms
	 */
	public java.util.List<AgricultureFarm> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the agriculture farms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureFarmModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture farms
	 * @param end the upper bound of the range of agriculture farms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriculture farms
	 */
	public java.util.List<AgricultureFarm> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureFarm>
			orderByComparator);

	/**
	 * Returns an ordered range of all the agriculture farms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureFarmModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture farms
	 * @param end the upper bound of the range of agriculture farms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriculture farms
	 */
	public java.util.List<AgricultureFarm> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureFarm>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the agriculture farms from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of agriculture farms.
	 *
	 * @return the number of agriculture farms
	 */
	public int countAll();

}