/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence;

import com.agriculture.application.form.service.exception.NoSuchAgricultureLivestockException;
import com.agriculture.application.form.service.model.AgricultureLivestock;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the agriculture livestock service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureLivestockUtil
 * @generated
 */
@ProviderType
public interface AgricultureLivestockPersistence
	extends BasePersistence<AgricultureLivestock> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AgricultureLivestockUtil} to access the agriculture livestock persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the agriculture livestock where agricultureApplicationId = &#63; or throws a <code>NoSuchAgricultureLivestockException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture livestock
	 * @throws NoSuchAgricultureLivestockException if a matching agriculture livestock could not be found
	 */
	public AgricultureLivestock findBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultureLivestockException;

	/**
	 * Returns the agriculture livestock where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture livestock, or <code>null</code> if a matching agriculture livestock could not be found
	 */
	public AgricultureLivestock fetchBygetAgricultureById(
		long agricultureApplicationId);

	/**
	 * Returns the agriculture livestock where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture livestock, or <code>null</code> if a matching agriculture livestock could not be found
	 */
	public AgricultureLivestock fetchBygetAgricultureById(
		long agricultureApplicationId, boolean useFinderCache);

	/**
	 * Removes the agriculture livestock where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agriculture livestock that was removed
	 */
	public AgricultureLivestock removeBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultureLivestockException;

	/**
	 * Returns the number of agriculture livestocks where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture livestocks
	 */
	public int countBygetAgricultureById(long agricultureApplicationId);

	/**
	 * Returns all the agriculture livestocks where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture livestocks
	 */
	public java.util.List<AgricultureLivestock> findBygetAL_by_AAI(
		long agricultureApplicationId);

	/**
	 * Returns a range of all the agriculture livestocks where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture livestocks
	 * @param end the upper bound of the range of agriculture livestocks (not inclusive)
	 * @return the range of matching agriculture livestocks
	 */
	public java.util.List<AgricultureLivestock> findBygetAL_by_AAI(
		long agricultureApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the agriculture livestocks where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture livestocks
	 * @param end the upper bound of the range of agriculture livestocks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture livestocks
	 */
	public java.util.List<AgricultureLivestock> findBygetAL_by_AAI(
		long agricultureApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureLivestock>
			orderByComparator);

	/**
	 * Returns an ordered range of all the agriculture livestocks where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture livestocks
	 * @param end the upper bound of the range of agriculture livestocks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture livestocks
	 */
	public java.util.List<AgricultureLivestock> findBygetAL_by_AAI(
		long agricultureApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureLivestock>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first agriculture livestock in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture livestock
	 * @throws NoSuchAgricultureLivestockException if a matching agriculture livestock could not be found
	 */
	public AgricultureLivestock findBygetAL_by_AAI_First(
			long agricultureApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureLivestock> orderByComparator)
		throws NoSuchAgricultureLivestockException;

	/**
	 * Returns the first agriculture livestock in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture livestock, or <code>null</code> if a matching agriculture livestock could not be found
	 */
	public AgricultureLivestock fetchBygetAL_by_AAI_First(
		long agricultureApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureLivestock>
			orderByComparator);

	/**
	 * Returns the last agriculture livestock in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture livestock
	 * @throws NoSuchAgricultureLivestockException if a matching agriculture livestock could not be found
	 */
	public AgricultureLivestock findBygetAL_by_AAI_Last(
			long agricultureApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureLivestock> orderByComparator)
		throws NoSuchAgricultureLivestockException;

	/**
	 * Returns the last agriculture livestock in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture livestock, or <code>null</code> if a matching agriculture livestock could not be found
	 */
	public AgricultureLivestock fetchBygetAL_by_AAI_Last(
		long agricultureApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureLivestock>
			orderByComparator);

	/**
	 * Returns the agriculture livestocks before and after the current agriculture livestock in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureLivestockId the primary key of the current agriculture livestock
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture livestock
	 * @throws NoSuchAgricultureLivestockException if a agriculture livestock with the primary key could not be found
	 */
	public AgricultureLivestock[] findBygetAL_by_AAI_PrevAndNext(
			long agricultureLivestockId, long agricultureApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureLivestock> orderByComparator)
		throws NoSuchAgricultureLivestockException;

	/**
	 * Removes all the agriculture livestocks where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 */
	public void removeBygetAL_by_AAI(long agricultureApplicationId);

	/**
	 * Returns the number of agriculture livestocks where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture livestocks
	 */
	public int countBygetAL_by_AAI(long agricultureApplicationId);

	/**
	 * Caches the agriculture livestock in the entity cache if it is enabled.
	 *
	 * @param agricultureLivestock the agriculture livestock
	 */
	public void cacheResult(AgricultureLivestock agricultureLivestock);

	/**
	 * Caches the agriculture livestocks in the entity cache if it is enabled.
	 *
	 * @param agricultureLivestocks the agriculture livestocks
	 */
	public void cacheResult(
		java.util.List<AgricultureLivestock> agricultureLivestocks);

	/**
	 * Creates a new agriculture livestock with the primary key. Does not add the agriculture livestock to the database.
	 *
	 * @param agricultureLivestockId the primary key for the new agriculture livestock
	 * @return the new agriculture livestock
	 */
	public AgricultureLivestock create(long agricultureLivestockId);

	/**
	 * Removes the agriculture livestock with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agricultureLivestockId the primary key of the agriculture livestock
	 * @return the agriculture livestock that was removed
	 * @throws NoSuchAgricultureLivestockException if a agriculture livestock with the primary key could not be found
	 */
	public AgricultureLivestock remove(long agricultureLivestockId)
		throws NoSuchAgricultureLivestockException;

	public AgricultureLivestock updateImpl(
		AgricultureLivestock agricultureLivestock);

	/**
	 * Returns the agriculture livestock with the primary key or throws a <code>NoSuchAgricultureLivestockException</code> if it could not be found.
	 *
	 * @param agricultureLivestockId the primary key of the agriculture livestock
	 * @return the agriculture livestock
	 * @throws NoSuchAgricultureLivestockException if a agriculture livestock with the primary key could not be found
	 */
	public AgricultureLivestock findByPrimaryKey(long agricultureLivestockId)
		throws NoSuchAgricultureLivestockException;

	/**
	 * Returns the agriculture livestock with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agricultureLivestockId the primary key of the agriculture livestock
	 * @return the agriculture livestock, or <code>null</code> if a agriculture livestock with the primary key could not be found
	 */
	public AgricultureLivestock fetchByPrimaryKey(long agricultureLivestockId);

	/**
	 * Returns all the agriculture livestocks.
	 *
	 * @return the agriculture livestocks
	 */
	public java.util.List<AgricultureLivestock> findAll();

	/**
	 * Returns a range of all the agriculture livestocks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture livestocks
	 * @param end the upper bound of the range of agriculture livestocks (not inclusive)
	 * @return the range of agriculture livestocks
	 */
	public java.util.List<AgricultureLivestock> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the agriculture livestocks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture livestocks
	 * @param end the upper bound of the range of agriculture livestocks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriculture livestocks
	 */
	public java.util.List<AgricultureLivestock> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureLivestock>
			orderByComparator);

	/**
	 * Returns an ordered range of all the agriculture livestocks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture livestocks
	 * @param end the upper bound of the range of agriculture livestocks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriculture livestocks
	 */
	public java.util.List<AgricultureLivestock> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureLivestock>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the agriculture livestocks from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of agriculture livestocks.
	 *
	 * @return the number of agriculture livestocks
	 */
	public int countAll();

}