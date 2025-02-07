/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence;

import com.agriculture.application.form.service.exception.NoSuchAgriculturePoultryException;
import com.agriculture.application.form.service.model.AgriculturePoultry;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the agriculture poultry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgriculturePoultryUtil
 * @generated
 */
@ProviderType
public interface AgriculturePoultryPersistence
	extends BasePersistence<AgriculturePoultry> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AgriculturePoultryUtil} to access the agriculture poultry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the agriculture poultry where agricultureApplicationId = &#63; or throws a <code>NoSuchAgriculturePoultryException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture poultry
	 * @throws NoSuchAgriculturePoultryException if a matching agriculture poultry could not be found
	 */
	public AgriculturePoultry findBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgriculturePoultryException;

	/**
	 * Returns the agriculture poultry where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture poultry, or <code>null</code> if a matching agriculture poultry could not be found
	 */
	public AgriculturePoultry fetchBygetAgricultureById(
		long agricultureApplicationId);

	/**
	 * Returns the agriculture poultry where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture poultry, or <code>null</code> if a matching agriculture poultry could not be found
	 */
	public AgriculturePoultry fetchBygetAgricultureById(
		long agricultureApplicationId, boolean useFinderCache);

	/**
	 * Removes the agriculture poultry where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agriculture poultry that was removed
	 */
	public AgriculturePoultry removeBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgriculturePoultryException;

	/**
	 * Returns the number of agriculture poultries where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture poultries
	 */
	public int countBygetAgricultureById(long agricultureApplicationId);

	/**
	 * Returns all the agriculture poultries where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture poultries
	 */
	public java.util.List<AgriculturePoultry> findBygetAP_by_AAI(
		long agricultureApplicationId);

	/**
	 * Returns a range of all the agriculture poultries where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriculturePoultryModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture poultries
	 * @param end the upper bound of the range of agriculture poultries (not inclusive)
	 * @return the range of matching agriculture poultries
	 */
	public java.util.List<AgriculturePoultry> findBygetAP_by_AAI(
		long agricultureApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the agriculture poultries where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriculturePoultryModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture poultries
	 * @param end the upper bound of the range of agriculture poultries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture poultries
	 */
	public java.util.List<AgriculturePoultry> findBygetAP_by_AAI(
		long agricultureApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgriculturePoultry>
			orderByComparator);

	/**
	 * Returns an ordered range of all the agriculture poultries where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriculturePoultryModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture poultries
	 * @param end the upper bound of the range of agriculture poultries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture poultries
	 */
	public java.util.List<AgriculturePoultry> findBygetAP_by_AAI(
		long agricultureApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgriculturePoultry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first agriculture poultry in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture poultry
	 * @throws NoSuchAgriculturePoultryException if a matching agriculture poultry could not be found
	 */
	public AgriculturePoultry findBygetAP_by_AAI_First(
			long agricultureApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AgriculturePoultry>
				orderByComparator)
		throws NoSuchAgriculturePoultryException;

	/**
	 * Returns the first agriculture poultry in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture poultry, or <code>null</code> if a matching agriculture poultry could not be found
	 */
	public AgriculturePoultry fetchBygetAP_by_AAI_First(
		long agricultureApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AgriculturePoultry>
			orderByComparator);

	/**
	 * Returns the last agriculture poultry in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture poultry
	 * @throws NoSuchAgriculturePoultryException if a matching agriculture poultry could not be found
	 */
	public AgriculturePoultry findBygetAP_by_AAI_Last(
			long agricultureApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AgriculturePoultry>
				orderByComparator)
		throws NoSuchAgriculturePoultryException;

	/**
	 * Returns the last agriculture poultry in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture poultry, or <code>null</code> if a matching agriculture poultry could not be found
	 */
	public AgriculturePoultry fetchBygetAP_by_AAI_Last(
		long agricultureApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AgriculturePoultry>
			orderByComparator);

	/**
	 * Returns the agriculture poultries before and after the current agriculture poultry in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agriculturePoultryId the primary key of the current agriculture poultry
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture poultry
	 * @throws NoSuchAgriculturePoultryException if a agriculture poultry with the primary key could not be found
	 */
	public AgriculturePoultry[] findBygetAP_by_AAI_PrevAndNext(
			long agriculturePoultryId, long agricultureApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AgriculturePoultry>
				orderByComparator)
		throws NoSuchAgriculturePoultryException;

	/**
	 * Removes all the agriculture poultries where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 */
	public void removeBygetAP_by_AAI(long agricultureApplicationId);

	/**
	 * Returns the number of agriculture poultries where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture poultries
	 */
	public int countBygetAP_by_AAI(long agricultureApplicationId);

	/**
	 * Caches the agriculture poultry in the entity cache if it is enabled.
	 *
	 * @param agriculturePoultry the agriculture poultry
	 */
	public void cacheResult(AgriculturePoultry agriculturePoultry);

	/**
	 * Caches the agriculture poultries in the entity cache if it is enabled.
	 *
	 * @param agriculturePoultries the agriculture poultries
	 */
	public void cacheResult(
		java.util.List<AgriculturePoultry> agriculturePoultries);

	/**
	 * Creates a new agriculture poultry with the primary key. Does not add the agriculture poultry to the database.
	 *
	 * @param agriculturePoultryId the primary key for the new agriculture poultry
	 * @return the new agriculture poultry
	 */
	public AgriculturePoultry create(long agriculturePoultryId);

	/**
	 * Removes the agriculture poultry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agriculturePoultryId the primary key of the agriculture poultry
	 * @return the agriculture poultry that was removed
	 * @throws NoSuchAgriculturePoultryException if a agriculture poultry with the primary key could not be found
	 */
	public AgriculturePoultry remove(long agriculturePoultryId)
		throws NoSuchAgriculturePoultryException;

	public AgriculturePoultry updateImpl(AgriculturePoultry agriculturePoultry);

	/**
	 * Returns the agriculture poultry with the primary key or throws a <code>NoSuchAgriculturePoultryException</code> if it could not be found.
	 *
	 * @param agriculturePoultryId the primary key of the agriculture poultry
	 * @return the agriculture poultry
	 * @throws NoSuchAgriculturePoultryException if a agriculture poultry with the primary key could not be found
	 */
	public AgriculturePoultry findByPrimaryKey(long agriculturePoultryId)
		throws NoSuchAgriculturePoultryException;

	/**
	 * Returns the agriculture poultry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agriculturePoultryId the primary key of the agriculture poultry
	 * @return the agriculture poultry, or <code>null</code> if a agriculture poultry with the primary key could not be found
	 */
	public AgriculturePoultry fetchByPrimaryKey(long agriculturePoultryId);

	/**
	 * Returns all the agriculture poultries.
	 *
	 * @return the agriculture poultries
	 */
	public java.util.List<AgriculturePoultry> findAll();

	/**
	 * Returns a range of all the agriculture poultries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriculturePoultryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture poultries
	 * @param end the upper bound of the range of agriculture poultries (not inclusive)
	 * @return the range of agriculture poultries
	 */
	public java.util.List<AgriculturePoultry> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the agriculture poultries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriculturePoultryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture poultries
	 * @param end the upper bound of the range of agriculture poultries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriculture poultries
	 */
	public java.util.List<AgriculturePoultry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgriculturePoultry>
			orderByComparator);

	/**
	 * Returns an ordered range of all the agriculture poultries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriculturePoultryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture poultries
	 * @param end the upper bound of the range of agriculture poultries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriculture poultries
	 */
	public java.util.List<AgriculturePoultry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgriculturePoultry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the agriculture poultries from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of agriculture poultries.
	 *
	 * @return the number of agriculture poultries
	 */
	public int countAll();

}