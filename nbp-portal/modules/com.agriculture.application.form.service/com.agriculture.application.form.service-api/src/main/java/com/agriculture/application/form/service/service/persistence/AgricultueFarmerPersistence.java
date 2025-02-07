/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence;

import com.agriculture.application.form.service.exception.NoSuchAgricultueFarmerException;
import com.agriculture.application.form.service.model.AgricultueFarmer;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the agricultue farmer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultueFarmerUtil
 * @generated
 */
@ProviderType
public interface AgricultueFarmerPersistence
	extends BasePersistence<AgricultueFarmer> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AgricultueFarmerUtil} to access the agricultue farmer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the agricultue farmer where agricultureApplicationId = &#63; or throws a <code>NoSuchAgricultueFarmerException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agricultue farmer
	 * @throws NoSuchAgricultueFarmerException if a matching agricultue farmer could not be found
	 */
	public AgricultueFarmer findBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultueFarmerException;

	/**
	 * Returns the agricultue farmer where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agricultue farmer, or <code>null</code> if a matching agricultue farmer could not be found
	 */
	public AgricultueFarmer fetchBygetAgricultureById(
		long agricultureApplicationId);

	/**
	 * Returns the agricultue farmer where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agricultue farmer, or <code>null</code> if a matching agricultue farmer could not be found
	 */
	public AgricultueFarmer fetchBygetAgricultureById(
		long agricultureApplicationId, boolean useFinderCache);

	/**
	 * Removes the agricultue farmer where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agricultue farmer that was removed
	 */
	public AgricultueFarmer removeBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultueFarmerException;

	/**
	 * Returns the number of agricultue farmers where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agricultue farmers
	 */
	public int countBygetAgricultureById(long agricultureApplicationId);

	/**
	 * Returns all the agricultue farmers where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agricultue farmers
	 */
	public java.util.List<AgricultueFarmer> findBygetAF_by_AAI(
		long agricultureApplicationId);

	/**
	 * Returns a range of all the agricultue farmers where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultueFarmerModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agricultue farmers
	 * @param end the upper bound of the range of agricultue farmers (not inclusive)
	 * @return the range of matching agricultue farmers
	 */
	public java.util.List<AgricultueFarmer> findBygetAF_by_AAI(
		long agricultureApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the agricultue farmers where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultueFarmerModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agricultue farmers
	 * @param end the upper bound of the range of agricultue farmers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agricultue farmers
	 */
	public java.util.List<AgricultueFarmer> findBygetAF_by_AAI(
		long agricultureApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultueFarmer>
			orderByComparator);

	/**
	 * Returns an ordered range of all the agricultue farmers where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultueFarmerModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agricultue farmers
	 * @param end the upper bound of the range of agricultue farmers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agricultue farmers
	 */
	public java.util.List<AgricultueFarmer> findBygetAF_by_AAI(
		long agricultureApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultueFarmer>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first agricultue farmer in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agricultue farmer
	 * @throws NoSuchAgricultueFarmerException if a matching agricultue farmer could not be found
	 */
	public AgricultueFarmer findBygetAF_by_AAI_First(
			long agricultureApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AgricultueFarmer>
				orderByComparator)
		throws NoSuchAgricultueFarmerException;

	/**
	 * Returns the first agricultue farmer in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agricultue farmer, or <code>null</code> if a matching agricultue farmer could not be found
	 */
	public AgricultueFarmer fetchBygetAF_by_AAI_First(
		long agricultureApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultueFarmer>
			orderByComparator);

	/**
	 * Returns the last agricultue farmer in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agricultue farmer
	 * @throws NoSuchAgricultueFarmerException if a matching agricultue farmer could not be found
	 */
	public AgricultueFarmer findBygetAF_by_AAI_Last(
			long agricultureApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AgricultueFarmer>
				orderByComparator)
		throws NoSuchAgricultueFarmerException;

	/**
	 * Returns the last agricultue farmer in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agricultue farmer, or <code>null</code> if a matching agricultue farmer could not be found
	 */
	public AgricultueFarmer fetchBygetAF_by_AAI_Last(
		long agricultureApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultueFarmer>
			orderByComparator);

	/**
	 * Returns the agricultue farmers before and after the current agricultue farmer in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultueFarmerId the primary key of the current agricultue farmer
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agricultue farmer
	 * @throws NoSuchAgricultueFarmerException if a agricultue farmer with the primary key could not be found
	 */
	public AgricultueFarmer[] findBygetAF_by_AAI_PrevAndNext(
			long agricultueFarmerId, long agricultureApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AgricultueFarmer>
				orderByComparator)
		throws NoSuchAgricultueFarmerException;

	/**
	 * Removes all the agricultue farmers where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 */
	public void removeBygetAF_by_AAI(long agricultureApplicationId);

	/**
	 * Returns the number of agricultue farmers where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agricultue farmers
	 */
	public int countBygetAF_by_AAI(long agricultureApplicationId);

	/**
	 * Caches the agricultue farmer in the entity cache if it is enabled.
	 *
	 * @param agricultueFarmer the agricultue farmer
	 */
	public void cacheResult(AgricultueFarmer agricultueFarmer);

	/**
	 * Caches the agricultue farmers in the entity cache if it is enabled.
	 *
	 * @param agricultueFarmers the agricultue farmers
	 */
	public void cacheResult(java.util.List<AgricultueFarmer> agricultueFarmers);

	/**
	 * Creates a new agricultue farmer with the primary key. Does not add the agricultue farmer to the database.
	 *
	 * @param agricultueFarmerId the primary key for the new agricultue farmer
	 * @return the new agricultue farmer
	 */
	public AgricultueFarmer create(long agricultueFarmerId);

	/**
	 * Removes the agricultue farmer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agricultueFarmerId the primary key of the agricultue farmer
	 * @return the agricultue farmer that was removed
	 * @throws NoSuchAgricultueFarmerException if a agricultue farmer with the primary key could not be found
	 */
	public AgricultueFarmer remove(long agricultueFarmerId)
		throws NoSuchAgricultueFarmerException;

	public AgricultueFarmer updateImpl(AgricultueFarmer agricultueFarmer);

	/**
	 * Returns the agricultue farmer with the primary key or throws a <code>NoSuchAgricultueFarmerException</code> if it could not be found.
	 *
	 * @param agricultueFarmerId the primary key of the agricultue farmer
	 * @return the agricultue farmer
	 * @throws NoSuchAgricultueFarmerException if a agricultue farmer with the primary key could not be found
	 */
	public AgricultueFarmer findByPrimaryKey(long agricultueFarmerId)
		throws NoSuchAgricultueFarmerException;

	/**
	 * Returns the agricultue farmer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agricultueFarmerId the primary key of the agricultue farmer
	 * @return the agricultue farmer, or <code>null</code> if a agricultue farmer with the primary key could not be found
	 */
	public AgricultueFarmer fetchByPrimaryKey(long agricultueFarmerId);

	/**
	 * Returns all the agricultue farmers.
	 *
	 * @return the agricultue farmers
	 */
	public java.util.List<AgricultueFarmer> findAll();

	/**
	 * Returns a range of all the agricultue farmers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultueFarmerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agricultue farmers
	 * @param end the upper bound of the range of agricultue farmers (not inclusive)
	 * @return the range of agricultue farmers
	 */
	public java.util.List<AgricultueFarmer> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the agricultue farmers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultueFarmerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agricultue farmers
	 * @param end the upper bound of the range of agricultue farmers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agricultue farmers
	 */
	public java.util.List<AgricultueFarmer> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultueFarmer>
			orderByComparator);

	/**
	 * Returns an ordered range of all the agricultue farmers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultueFarmerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agricultue farmers
	 * @param end the upper bound of the range of agricultue farmers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agricultue farmers
	 */
	public java.util.List<AgricultueFarmer> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultueFarmer>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the agricultue farmers from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of agricultue farmers.
	 *
	 * @return the number of agricultue farmers
	 */
	public int countAll();

}