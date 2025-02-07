/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchRadiationDevicesDetailAddException;
import com.nbp.hsra.application.service.model.RadiationDevicesDetailAdd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the radiation devices detail add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RadiationDevicesDetailAddUtil
 * @generated
 */
@ProviderType
public interface RadiationDevicesDetailAddPersistence
	extends BasePersistence<RadiationDevicesDetailAdd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RadiationDevicesDetailAddUtil} to access the radiation devices detail add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the radiation devices detail adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radiation devices detail adds
	 */
	public java.util.List<RadiationDevicesDetailAdd> findBygetHsraById(
		long hsraApplicationId);

	/**
	 * Returns a range of all the radiation devices detail adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of radiation devices detail adds
	 * @param end the upper bound of the range of radiation devices detail adds (not inclusive)
	 * @return the range of matching radiation devices detail adds
	 */
	public java.util.List<RadiationDevicesDetailAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the radiation devices detail adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of radiation devices detail adds
	 * @param end the upper bound of the range of radiation devices detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching radiation devices detail adds
	 */
	public java.util.List<RadiationDevicesDetailAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<RadiationDevicesDetailAdd> orderByComparator);

	/**
	 * Returns an ordered range of all the radiation devices detail adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of radiation devices detail adds
	 * @param end the upper bound of the range of radiation devices detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching radiation devices detail adds
	 */
	public java.util.List<RadiationDevicesDetailAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<RadiationDevicesDetailAdd> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first radiation devices detail add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching radiation devices detail add
	 * @throws NoSuchRadiationDevicesDetailAddException if a matching radiation devices detail add could not be found
	 */
	public RadiationDevicesDetailAdd findBygetHsraById_First(
			long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<RadiationDevicesDetailAdd> orderByComparator)
		throws NoSuchRadiationDevicesDetailAddException;

	/**
	 * Returns the first radiation devices detail add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching radiation devices detail add, or <code>null</code> if a matching radiation devices detail add could not be found
	 */
	public RadiationDevicesDetailAdd fetchBygetHsraById_First(
		long hsraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<RadiationDevicesDetailAdd> orderByComparator);

	/**
	 * Returns the last radiation devices detail add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching radiation devices detail add
	 * @throws NoSuchRadiationDevicesDetailAddException if a matching radiation devices detail add could not be found
	 */
	public RadiationDevicesDetailAdd findBygetHsraById_Last(
			long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<RadiationDevicesDetailAdd> orderByComparator)
		throws NoSuchRadiationDevicesDetailAddException;

	/**
	 * Returns the last radiation devices detail add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching radiation devices detail add, or <code>null</code> if a matching radiation devices detail add could not be found
	 */
	public RadiationDevicesDetailAdd fetchBygetHsraById_Last(
		long hsraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<RadiationDevicesDetailAdd> orderByComparator);

	/**
	 * Returns the radiation devices detail adds before and after the current radiation devices detail add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param radiationDevicesDetailAddId the primary key of the current radiation devices detail add
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next radiation devices detail add
	 * @throws NoSuchRadiationDevicesDetailAddException if a radiation devices detail add with the primary key could not be found
	 */
	public RadiationDevicesDetailAdd[] findBygetHsraById_PrevAndNext(
			long radiationDevicesDetailAddId, long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<RadiationDevicesDetailAdd> orderByComparator)
		throws NoSuchRadiationDevicesDetailAddException;

	/**
	 * Removes all the radiation devices detail adds where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	public void removeBygetHsraById(long hsraApplicationId);

	/**
	 * Returns the number of radiation devices detail adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching radiation devices detail adds
	 */
	public int countBygetHsraById(long hsraApplicationId);

	/**
	 * Caches the radiation devices detail add in the entity cache if it is enabled.
	 *
	 * @param radiationDevicesDetailAdd the radiation devices detail add
	 */
	public void cacheResult(
		RadiationDevicesDetailAdd radiationDevicesDetailAdd);

	/**
	 * Caches the radiation devices detail adds in the entity cache if it is enabled.
	 *
	 * @param radiationDevicesDetailAdds the radiation devices detail adds
	 */
	public void cacheResult(
		java.util.List<RadiationDevicesDetailAdd> radiationDevicesDetailAdds);

	/**
	 * Creates a new radiation devices detail add with the primary key. Does not add the radiation devices detail add to the database.
	 *
	 * @param radiationDevicesDetailAddId the primary key for the new radiation devices detail add
	 * @return the new radiation devices detail add
	 */
	public RadiationDevicesDetailAdd create(long radiationDevicesDetailAddId);

	/**
	 * Removes the radiation devices detail add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param radiationDevicesDetailAddId the primary key of the radiation devices detail add
	 * @return the radiation devices detail add that was removed
	 * @throws NoSuchRadiationDevicesDetailAddException if a radiation devices detail add with the primary key could not be found
	 */
	public RadiationDevicesDetailAdd remove(long radiationDevicesDetailAddId)
		throws NoSuchRadiationDevicesDetailAddException;

	public RadiationDevicesDetailAdd updateImpl(
		RadiationDevicesDetailAdd radiationDevicesDetailAdd);

	/**
	 * Returns the radiation devices detail add with the primary key or throws a <code>NoSuchRadiationDevicesDetailAddException</code> if it could not be found.
	 *
	 * @param radiationDevicesDetailAddId the primary key of the radiation devices detail add
	 * @return the radiation devices detail add
	 * @throws NoSuchRadiationDevicesDetailAddException if a radiation devices detail add with the primary key could not be found
	 */
	public RadiationDevicesDetailAdd findByPrimaryKey(
			long radiationDevicesDetailAddId)
		throws NoSuchRadiationDevicesDetailAddException;

	/**
	 * Returns the radiation devices detail add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param radiationDevicesDetailAddId the primary key of the radiation devices detail add
	 * @return the radiation devices detail add, or <code>null</code> if a radiation devices detail add with the primary key could not be found
	 */
	public RadiationDevicesDetailAdd fetchByPrimaryKey(
		long radiationDevicesDetailAddId);

	/**
	 * Returns all the radiation devices detail adds.
	 *
	 * @return the radiation devices detail adds
	 */
	public java.util.List<RadiationDevicesDetailAdd> findAll();

	/**
	 * Returns a range of all the radiation devices detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation devices detail adds
	 * @param end the upper bound of the range of radiation devices detail adds (not inclusive)
	 * @return the range of radiation devices detail adds
	 */
	public java.util.List<RadiationDevicesDetailAdd> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the radiation devices detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation devices detail adds
	 * @param end the upper bound of the range of radiation devices detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of radiation devices detail adds
	 */
	public java.util.List<RadiationDevicesDetailAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<RadiationDevicesDetailAdd> orderByComparator);

	/**
	 * Returns an ordered range of all the radiation devices detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation devices detail adds
	 * @param end the upper bound of the range of radiation devices detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of radiation devices detail adds
	 */
	public java.util.List<RadiationDevicesDetailAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<RadiationDevicesDetailAdd> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the radiation devices detail adds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of radiation devices detail adds.
	 *
	 * @return the number of radiation devices detail adds
	 */
	public int countAll();

}