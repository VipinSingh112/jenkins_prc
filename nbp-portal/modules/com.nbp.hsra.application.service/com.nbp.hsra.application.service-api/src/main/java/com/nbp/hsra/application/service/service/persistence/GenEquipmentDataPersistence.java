/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchGenEquipmentDataException;
import com.nbp.hsra.application.service.model.GenEquipmentData;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the gen equipment data service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GenEquipmentDataUtil
 * @generated
 */
@ProviderType
public interface GenEquipmentDataPersistence
	extends BasePersistence<GenEquipmentData> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link GenEquipmentDataUtil} to access the gen equipment data persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the gen equipment datas where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching gen equipment datas
	 */
	public java.util.List<GenEquipmentData> findBygetHsraById(
		long hsraApplicationId);

	/**
	 * Returns a range of all the gen equipment datas where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenEquipmentDataModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of gen equipment datas
	 * @param end the upper bound of the range of gen equipment datas (not inclusive)
	 * @return the range of matching gen equipment datas
	 */
	public java.util.List<GenEquipmentData> findBygetHsraById(
		long hsraApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the gen equipment datas where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenEquipmentDataModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of gen equipment datas
	 * @param end the upper bound of the range of gen equipment datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching gen equipment datas
	 */
	public java.util.List<GenEquipmentData> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GenEquipmentData>
			orderByComparator);

	/**
	 * Returns an ordered range of all the gen equipment datas where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenEquipmentDataModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of gen equipment datas
	 * @param end the upper bound of the range of gen equipment datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching gen equipment datas
	 */
	public java.util.List<GenEquipmentData> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GenEquipmentData>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first gen equipment data in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching gen equipment data
	 * @throws NoSuchGenEquipmentDataException if a matching gen equipment data could not be found
	 */
	public GenEquipmentData findBygetHsraById_First(
			long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<GenEquipmentData>
				orderByComparator)
		throws NoSuchGenEquipmentDataException;

	/**
	 * Returns the first gen equipment data in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching gen equipment data, or <code>null</code> if a matching gen equipment data could not be found
	 */
	public GenEquipmentData fetchBygetHsraById_First(
		long hsraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<GenEquipmentData>
			orderByComparator);

	/**
	 * Returns the last gen equipment data in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching gen equipment data
	 * @throws NoSuchGenEquipmentDataException if a matching gen equipment data could not be found
	 */
	public GenEquipmentData findBygetHsraById_Last(
			long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<GenEquipmentData>
				orderByComparator)
		throws NoSuchGenEquipmentDataException;

	/**
	 * Returns the last gen equipment data in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching gen equipment data, or <code>null</code> if a matching gen equipment data could not be found
	 */
	public GenEquipmentData fetchBygetHsraById_Last(
		long hsraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<GenEquipmentData>
			orderByComparator);

	/**
	 * Returns the gen equipment datas before and after the current gen equipment data in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param genEquipmentDataId the primary key of the current gen equipment data
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next gen equipment data
	 * @throws NoSuchGenEquipmentDataException if a gen equipment data with the primary key could not be found
	 */
	public GenEquipmentData[] findBygetHsraById_PrevAndNext(
			long genEquipmentDataId, long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<GenEquipmentData>
				orderByComparator)
		throws NoSuchGenEquipmentDataException;

	/**
	 * Removes all the gen equipment datas where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	public void removeBygetHsraById(long hsraApplicationId);

	/**
	 * Returns the number of gen equipment datas where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching gen equipment datas
	 */
	public int countBygetHsraById(long hsraApplicationId);

	/**
	 * Caches the gen equipment data in the entity cache if it is enabled.
	 *
	 * @param genEquipmentData the gen equipment data
	 */
	public void cacheResult(GenEquipmentData genEquipmentData);

	/**
	 * Caches the gen equipment datas in the entity cache if it is enabled.
	 *
	 * @param genEquipmentDatas the gen equipment datas
	 */
	public void cacheResult(java.util.List<GenEquipmentData> genEquipmentDatas);

	/**
	 * Creates a new gen equipment data with the primary key. Does not add the gen equipment data to the database.
	 *
	 * @param genEquipmentDataId the primary key for the new gen equipment data
	 * @return the new gen equipment data
	 */
	public GenEquipmentData create(long genEquipmentDataId);

	/**
	 * Removes the gen equipment data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param genEquipmentDataId the primary key of the gen equipment data
	 * @return the gen equipment data that was removed
	 * @throws NoSuchGenEquipmentDataException if a gen equipment data with the primary key could not be found
	 */
	public GenEquipmentData remove(long genEquipmentDataId)
		throws NoSuchGenEquipmentDataException;

	public GenEquipmentData updateImpl(GenEquipmentData genEquipmentData);

	/**
	 * Returns the gen equipment data with the primary key or throws a <code>NoSuchGenEquipmentDataException</code> if it could not be found.
	 *
	 * @param genEquipmentDataId the primary key of the gen equipment data
	 * @return the gen equipment data
	 * @throws NoSuchGenEquipmentDataException if a gen equipment data with the primary key could not be found
	 */
	public GenEquipmentData findByPrimaryKey(long genEquipmentDataId)
		throws NoSuchGenEquipmentDataException;

	/**
	 * Returns the gen equipment data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param genEquipmentDataId the primary key of the gen equipment data
	 * @return the gen equipment data, or <code>null</code> if a gen equipment data with the primary key could not be found
	 */
	public GenEquipmentData fetchByPrimaryKey(long genEquipmentDataId);

	/**
	 * Returns all the gen equipment datas.
	 *
	 * @return the gen equipment datas
	 */
	public java.util.List<GenEquipmentData> findAll();

	/**
	 * Returns a range of all the gen equipment datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenEquipmentDataModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gen equipment datas
	 * @param end the upper bound of the range of gen equipment datas (not inclusive)
	 * @return the range of gen equipment datas
	 */
	public java.util.List<GenEquipmentData> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the gen equipment datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenEquipmentDataModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gen equipment datas
	 * @param end the upper bound of the range of gen equipment datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of gen equipment datas
	 */
	public java.util.List<GenEquipmentData> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GenEquipmentData>
			orderByComparator);

	/**
	 * Returns an ordered range of all the gen equipment datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenEquipmentDataModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gen equipment datas
	 * @param end the upper bound of the range of gen equipment datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of gen equipment datas
	 */
	public java.util.List<GenEquipmentData> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GenEquipmentData>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the gen equipment datas from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of gen equipment datas.
	 *
	 * @return the number of gen equipment datas
	 */
	public int countAll();

}