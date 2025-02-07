/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence;

import com.agriculture.application.form.service.exception.NoSuchAgricultureCropException;
import com.agriculture.application.form.service.model.AgricultureCrop;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the agriculture crop service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureCropUtil
 * @generated
 */
@ProviderType
public interface AgricultureCropPersistence
	extends BasePersistence<AgricultureCrop> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AgricultureCropUtil} to access the agriculture crop persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the agriculture crop where agricultureApplicationId = &#63; or throws a <code>NoSuchAgricultureCropException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture crop
	 * @throws NoSuchAgricultureCropException if a matching agriculture crop could not be found
	 */
	public AgricultureCrop findBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultureCropException;

	/**
	 * Returns the agriculture crop where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture crop, or <code>null</code> if a matching agriculture crop could not be found
	 */
	public AgricultureCrop fetchBygetAgricultureById(
		long agricultureApplicationId);

	/**
	 * Returns the agriculture crop where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture crop, or <code>null</code> if a matching agriculture crop could not be found
	 */
	public AgricultureCrop fetchBygetAgricultureById(
		long agricultureApplicationId, boolean useFinderCache);

	/**
	 * Removes the agriculture crop where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agriculture crop that was removed
	 */
	public AgricultureCrop removeBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultureCropException;

	/**
	 * Returns the number of agriculture crops where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture crops
	 */
	public int countBygetAgricultureById(long agricultureApplicationId);

	/**
	 * Returns all the agriculture crops where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture crops
	 */
	public java.util.List<AgricultureCrop> findBygetAC_by_AAI(
		long agricultureApplicationId);

	/**
	 * Returns a range of all the agriculture crops where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureCropModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture crops
	 * @param end the upper bound of the range of agriculture crops (not inclusive)
	 * @return the range of matching agriculture crops
	 */
	public java.util.List<AgricultureCrop> findBygetAC_by_AAI(
		long agricultureApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the agriculture crops where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureCropModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture crops
	 * @param end the upper bound of the range of agriculture crops (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture crops
	 */
	public java.util.List<AgricultureCrop> findBygetAC_by_AAI(
		long agricultureApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureCrop>
			orderByComparator);

	/**
	 * Returns an ordered range of all the agriculture crops where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureCropModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture crops
	 * @param end the upper bound of the range of agriculture crops (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture crops
	 */
	public java.util.List<AgricultureCrop> findBygetAC_by_AAI(
		long agricultureApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureCrop>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first agriculture crop in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture crop
	 * @throws NoSuchAgricultureCropException if a matching agriculture crop could not be found
	 */
	public AgricultureCrop findBygetAC_by_AAI_First(
			long agricultureApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AgricultureCrop>
				orderByComparator)
		throws NoSuchAgricultureCropException;

	/**
	 * Returns the first agriculture crop in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture crop, or <code>null</code> if a matching agriculture crop could not be found
	 */
	public AgricultureCrop fetchBygetAC_by_AAI_First(
		long agricultureApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureCrop>
			orderByComparator);

	/**
	 * Returns the last agriculture crop in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture crop
	 * @throws NoSuchAgricultureCropException if a matching agriculture crop could not be found
	 */
	public AgricultureCrop findBygetAC_by_AAI_Last(
			long agricultureApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AgricultureCrop>
				orderByComparator)
		throws NoSuchAgricultureCropException;

	/**
	 * Returns the last agriculture crop in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture crop, or <code>null</code> if a matching agriculture crop could not be found
	 */
	public AgricultureCrop fetchBygetAC_by_AAI_Last(
		long agricultureApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureCrop>
			orderByComparator);

	/**
	 * Returns the agriculture crops before and after the current agriculture crop in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureCropId the primary key of the current agriculture crop
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture crop
	 * @throws NoSuchAgricultureCropException if a agriculture crop with the primary key could not be found
	 */
	public AgricultureCrop[] findBygetAC_by_AAI_PrevAndNext(
			long agricultureCropId, long agricultureApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AgricultureCrop>
				orderByComparator)
		throws NoSuchAgricultureCropException;

	/**
	 * Removes all the agriculture crops where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 */
	public void removeBygetAC_by_AAI(long agricultureApplicationId);

	/**
	 * Returns the number of agriculture crops where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture crops
	 */
	public int countBygetAC_by_AAI(long agricultureApplicationId);

	/**
	 * Caches the agriculture crop in the entity cache if it is enabled.
	 *
	 * @param agricultureCrop the agriculture crop
	 */
	public void cacheResult(AgricultureCrop agricultureCrop);

	/**
	 * Caches the agriculture crops in the entity cache if it is enabled.
	 *
	 * @param agricultureCrops the agriculture crops
	 */
	public void cacheResult(java.util.List<AgricultureCrop> agricultureCrops);

	/**
	 * Creates a new agriculture crop with the primary key. Does not add the agriculture crop to the database.
	 *
	 * @param agricultureCropId the primary key for the new agriculture crop
	 * @return the new agriculture crop
	 */
	public AgricultureCrop create(long agricultureCropId);

	/**
	 * Removes the agriculture crop with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agricultureCropId the primary key of the agriculture crop
	 * @return the agriculture crop that was removed
	 * @throws NoSuchAgricultureCropException if a agriculture crop with the primary key could not be found
	 */
	public AgricultureCrop remove(long agricultureCropId)
		throws NoSuchAgricultureCropException;

	public AgricultureCrop updateImpl(AgricultureCrop agricultureCrop);

	/**
	 * Returns the agriculture crop with the primary key or throws a <code>NoSuchAgricultureCropException</code> if it could not be found.
	 *
	 * @param agricultureCropId the primary key of the agriculture crop
	 * @return the agriculture crop
	 * @throws NoSuchAgricultureCropException if a agriculture crop with the primary key could not be found
	 */
	public AgricultureCrop findByPrimaryKey(long agricultureCropId)
		throws NoSuchAgricultureCropException;

	/**
	 * Returns the agriculture crop with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agricultureCropId the primary key of the agriculture crop
	 * @return the agriculture crop, or <code>null</code> if a agriculture crop with the primary key could not be found
	 */
	public AgricultureCrop fetchByPrimaryKey(long agricultureCropId);

	/**
	 * Returns all the agriculture crops.
	 *
	 * @return the agriculture crops
	 */
	public java.util.List<AgricultureCrop> findAll();

	/**
	 * Returns a range of all the agriculture crops.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureCropModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture crops
	 * @param end the upper bound of the range of agriculture crops (not inclusive)
	 * @return the range of agriculture crops
	 */
	public java.util.List<AgricultureCrop> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the agriculture crops.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureCropModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture crops
	 * @param end the upper bound of the range of agriculture crops (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriculture crops
	 */
	public java.util.List<AgricultureCrop> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureCrop>
			orderByComparator);

	/**
	 * Returns an ordered range of all the agriculture crops.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureCropModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture crops
	 * @param end the upper bound of the range of agriculture crops (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriculture crops
	 */
	public java.util.List<AgricultureCrop> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureCrop>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the agriculture crops from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of agriculture crops.
	 *
	 * @return the number of agriculture crops
	 */
	public int countAll();

}