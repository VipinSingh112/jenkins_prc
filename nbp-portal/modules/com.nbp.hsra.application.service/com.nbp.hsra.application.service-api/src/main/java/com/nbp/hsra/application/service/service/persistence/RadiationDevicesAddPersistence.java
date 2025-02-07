/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchRadiationDevicesAddException;
import com.nbp.hsra.application.service.model.RadiationDevicesAdd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the radiation devices add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RadiationDevicesAddUtil
 * @generated
 */
@ProviderType
public interface RadiationDevicesAddPersistence
	extends BasePersistence<RadiationDevicesAdd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RadiationDevicesAddUtil} to access the radiation devices add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the radiation devices adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radiation devices adds
	 */
	public java.util.List<RadiationDevicesAdd> findBygetHsraById(
		long hsraApplicationId);

	/**
	 * Returns a range of all the radiation devices adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of radiation devices adds
	 * @param end the upper bound of the range of radiation devices adds (not inclusive)
	 * @return the range of matching radiation devices adds
	 */
	public java.util.List<RadiationDevicesAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the radiation devices adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of radiation devices adds
	 * @param end the upper bound of the range of radiation devices adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching radiation devices adds
	 */
	public java.util.List<RadiationDevicesAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RadiationDevicesAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the radiation devices adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of radiation devices adds
	 * @param end the upper bound of the range of radiation devices adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching radiation devices adds
	 */
	public java.util.List<RadiationDevicesAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RadiationDevicesAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first radiation devices add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching radiation devices add
	 * @throws NoSuchRadiationDevicesAddException if a matching radiation devices add could not be found
	 */
	public RadiationDevicesAdd findBygetHsraById_First(
			long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<RadiationDevicesAdd> orderByComparator)
		throws NoSuchRadiationDevicesAddException;

	/**
	 * Returns the first radiation devices add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching radiation devices add, or <code>null</code> if a matching radiation devices add could not be found
	 */
	public RadiationDevicesAdd fetchBygetHsraById_First(
		long hsraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<RadiationDevicesAdd>
			orderByComparator);

	/**
	 * Returns the last radiation devices add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching radiation devices add
	 * @throws NoSuchRadiationDevicesAddException if a matching radiation devices add could not be found
	 */
	public RadiationDevicesAdd findBygetHsraById_Last(
			long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<RadiationDevicesAdd> orderByComparator)
		throws NoSuchRadiationDevicesAddException;

	/**
	 * Returns the last radiation devices add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching radiation devices add, or <code>null</code> if a matching radiation devices add could not be found
	 */
	public RadiationDevicesAdd fetchBygetHsraById_Last(
		long hsraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<RadiationDevicesAdd>
			orderByComparator);

	/**
	 * Returns the radiation devices adds before and after the current radiation devices add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param radiationDevicesAddId the primary key of the current radiation devices add
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next radiation devices add
	 * @throws NoSuchRadiationDevicesAddException if a radiation devices add with the primary key could not be found
	 */
	public RadiationDevicesAdd[] findBygetHsraById_PrevAndNext(
			long radiationDevicesAddId, long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<RadiationDevicesAdd> orderByComparator)
		throws NoSuchRadiationDevicesAddException;

	/**
	 * Removes all the radiation devices adds where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	public void removeBygetHsraById(long hsraApplicationId);

	/**
	 * Returns the number of radiation devices adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching radiation devices adds
	 */
	public int countBygetHsraById(long hsraApplicationId);

	/**
	 * Caches the radiation devices add in the entity cache if it is enabled.
	 *
	 * @param radiationDevicesAdd the radiation devices add
	 */
	public void cacheResult(RadiationDevicesAdd radiationDevicesAdd);

	/**
	 * Caches the radiation devices adds in the entity cache if it is enabled.
	 *
	 * @param radiationDevicesAdds the radiation devices adds
	 */
	public void cacheResult(
		java.util.List<RadiationDevicesAdd> radiationDevicesAdds);

	/**
	 * Creates a new radiation devices add with the primary key. Does not add the radiation devices add to the database.
	 *
	 * @param radiationDevicesAddId the primary key for the new radiation devices add
	 * @return the new radiation devices add
	 */
	public RadiationDevicesAdd create(long radiationDevicesAddId);

	/**
	 * Removes the radiation devices add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param radiationDevicesAddId the primary key of the radiation devices add
	 * @return the radiation devices add that was removed
	 * @throws NoSuchRadiationDevicesAddException if a radiation devices add with the primary key could not be found
	 */
	public RadiationDevicesAdd remove(long radiationDevicesAddId)
		throws NoSuchRadiationDevicesAddException;

	public RadiationDevicesAdd updateImpl(
		RadiationDevicesAdd radiationDevicesAdd);

	/**
	 * Returns the radiation devices add with the primary key or throws a <code>NoSuchRadiationDevicesAddException</code> if it could not be found.
	 *
	 * @param radiationDevicesAddId the primary key of the radiation devices add
	 * @return the radiation devices add
	 * @throws NoSuchRadiationDevicesAddException if a radiation devices add with the primary key could not be found
	 */
	public RadiationDevicesAdd findByPrimaryKey(long radiationDevicesAddId)
		throws NoSuchRadiationDevicesAddException;

	/**
	 * Returns the radiation devices add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param radiationDevicesAddId the primary key of the radiation devices add
	 * @return the radiation devices add, or <code>null</code> if a radiation devices add with the primary key could not be found
	 */
	public RadiationDevicesAdd fetchByPrimaryKey(long radiationDevicesAddId);

	/**
	 * Returns all the radiation devices adds.
	 *
	 * @return the radiation devices adds
	 */
	public java.util.List<RadiationDevicesAdd> findAll();

	/**
	 * Returns a range of all the radiation devices adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation devices adds
	 * @param end the upper bound of the range of radiation devices adds (not inclusive)
	 * @return the range of radiation devices adds
	 */
	public java.util.List<RadiationDevicesAdd> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the radiation devices adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation devices adds
	 * @param end the upper bound of the range of radiation devices adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of radiation devices adds
	 */
	public java.util.List<RadiationDevicesAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RadiationDevicesAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the radiation devices adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation devices adds
	 * @param end the upper bound of the range of radiation devices adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of radiation devices adds
	 */
	public java.util.List<RadiationDevicesAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RadiationDevicesAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the radiation devices adds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of radiation devices adds.
	 *
	 * @return the number of radiation devices adds
	 */
	public int countAll();

}