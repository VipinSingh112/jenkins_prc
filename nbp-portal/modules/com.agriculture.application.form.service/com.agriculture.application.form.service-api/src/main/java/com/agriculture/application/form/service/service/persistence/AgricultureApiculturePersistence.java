/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence;

import com.agriculture.application.form.service.exception.NoSuchAgricultureApicultureException;
import com.agriculture.application.form.service.model.AgricultureApiculture;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the agriculture apiculture service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureApicultureUtil
 * @generated
 */
@ProviderType
public interface AgricultureApiculturePersistence
	extends BasePersistence<AgricultureApiculture> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AgricultureApicultureUtil} to access the agriculture apiculture persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the agriculture apiculture where agricultureApplicationId = &#63; or throws a <code>NoSuchAgricultureApicultureException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture apiculture
	 * @throws NoSuchAgricultureApicultureException if a matching agriculture apiculture could not be found
	 */
	public AgricultureApiculture findBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultureApicultureException;

	/**
	 * Returns the agriculture apiculture where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture apiculture, or <code>null</code> if a matching agriculture apiculture could not be found
	 */
	public AgricultureApiculture fetchBygetAgricultureById(
		long agricultureApplicationId);

	/**
	 * Returns the agriculture apiculture where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture apiculture, or <code>null</code> if a matching agriculture apiculture could not be found
	 */
	public AgricultureApiculture fetchBygetAgricultureById(
		long agricultureApplicationId, boolean useFinderCache);

	/**
	 * Removes the agriculture apiculture where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agriculture apiculture that was removed
	 */
	public AgricultureApiculture removeBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultureApicultureException;

	/**
	 * Returns the number of agriculture apicultures where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture apicultures
	 */
	public int countBygetAgricultureById(long agricultureApplicationId);

	/**
	 * Returns all the agriculture apicultures where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture apicultures
	 */
	public java.util.List<AgricultureApiculture> findBygetAApi_by_AAI(
		long agricultureApplicationId);

	/**
	 * Returns a range of all the agriculture apicultures where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApicultureModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture apicultures
	 * @param end the upper bound of the range of agriculture apicultures (not inclusive)
	 * @return the range of matching agriculture apicultures
	 */
	public java.util.List<AgricultureApiculture> findBygetAApi_by_AAI(
		long agricultureApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the agriculture apicultures where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApicultureModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture apicultures
	 * @param end the upper bound of the range of agriculture apicultures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture apicultures
	 */
	public java.util.List<AgricultureApiculture> findBygetAApi_by_AAI(
		long agricultureApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureApiculture>
			orderByComparator);

	/**
	 * Returns an ordered range of all the agriculture apicultures where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApicultureModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture apicultures
	 * @param end the upper bound of the range of agriculture apicultures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture apicultures
	 */
	public java.util.List<AgricultureApiculture> findBygetAApi_by_AAI(
		long agricultureApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureApiculture>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first agriculture apiculture in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture apiculture
	 * @throws NoSuchAgricultureApicultureException if a matching agriculture apiculture could not be found
	 */
	public AgricultureApiculture findBygetAApi_by_AAI_First(
			long agricultureApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureApiculture> orderByComparator)
		throws NoSuchAgricultureApicultureException;

	/**
	 * Returns the first agriculture apiculture in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture apiculture, or <code>null</code> if a matching agriculture apiculture could not be found
	 */
	public AgricultureApiculture fetchBygetAApi_by_AAI_First(
		long agricultureApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureApiculture>
			orderByComparator);

	/**
	 * Returns the last agriculture apiculture in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture apiculture
	 * @throws NoSuchAgricultureApicultureException if a matching agriculture apiculture could not be found
	 */
	public AgricultureApiculture findBygetAApi_by_AAI_Last(
			long agricultureApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureApiculture> orderByComparator)
		throws NoSuchAgricultureApicultureException;

	/**
	 * Returns the last agriculture apiculture in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture apiculture, or <code>null</code> if a matching agriculture apiculture could not be found
	 */
	public AgricultureApiculture fetchBygetAApi_by_AAI_Last(
		long agricultureApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureApiculture>
			orderByComparator);

	/**
	 * Returns the agriculture apicultures before and after the current agriculture apiculture in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApicultureId the primary key of the current agriculture apiculture
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture apiculture
	 * @throws NoSuchAgricultureApicultureException if a agriculture apiculture with the primary key could not be found
	 */
	public AgricultureApiculture[] findBygetAApi_by_AAI_PrevAndNext(
			long agricultureApicultureId, long agricultureApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureApiculture> orderByComparator)
		throws NoSuchAgricultureApicultureException;

	/**
	 * Removes all the agriculture apicultures where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 */
	public void removeBygetAApi_by_AAI(long agricultureApplicationId);

	/**
	 * Returns the number of agriculture apicultures where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture apicultures
	 */
	public int countBygetAApi_by_AAI(long agricultureApplicationId);

	/**
	 * Caches the agriculture apiculture in the entity cache if it is enabled.
	 *
	 * @param agricultureApiculture the agriculture apiculture
	 */
	public void cacheResult(AgricultureApiculture agricultureApiculture);

	/**
	 * Caches the agriculture apicultures in the entity cache if it is enabled.
	 *
	 * @param agricultureApicultures the agriculture apicultures
	 */
	public void cacheResult(
		java.util.List<AgricultureApiculture> agricultureApicultures);

	/**
	 * Creates a new agriculture apiculture with the primary key. Does not add the agriculture apiculture to the database.
	 *
	 * @param agricultureApicultureId the primary key for the new agriculture apiculture
	 * @return the new agriculture apiculture
	 */
	public AgricultureApiculture create(long agricultureApicultureId);

	/**
	 * Removes the agriculture apiculture with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agricultureApicultureId the primary key of the agriculture apiculture
	 * @return the agriculture apiculture that was removed
	 * @throws NoSuchAgricultureApicultureException if a agriculture apiculture with the primary key could not be found
	 */
	public AgricultureApiculture remove(long agricultureApicultureId)
		throws NoSuchAgricultureApicultureException;

	public AgricultureApiculture updateImpl(
		AgricultureApiculture agricultureApiculture);

	/**
	 * Returns the agriculture apiculture with the primary key or throws a <code>NoSuchAgricultureApicultureException</code> if it could not be found.
	 *
	 * @param agricultureApicultureId the primary key of the agriculture apiculture
	 * @return the agriculture apiculture
	 * @throws NoSuchAgricultureApicultureException if a agriculture apiculture with the primary key could not be found
	 */
	public AgricultureApiculture findByPrimaryKey(long agricultureApicultureId)
		throws NoSuchAgricultureApicultureException;

	/**
	 * Returns the agriculture apiculture with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agricultureApicultureId the primary key of the agriculture apiculture
	 * @return the agriculture apiculture, or <code>null</code> if a agriculture apiculture with the primary key could not be found
	 */
	public AgricultureApiculture fetchByPrimaryKey(
		long agricultureApicultureId);

	/**
	 * Returns all the agriculture apicultures.
	 *
	 * @return the agriculture apicultures
	 */
	public java.util.List<AgricultureApiculture> findAll();

	/**
	 * Returns a range of all the agriculture apicultures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApicultureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture apicultures
	 * @param end the upper bound of the range of agriculture apicultures (not inclusive)
	 * @return the range of agriculture apicultures
	 */
	public java.util.List<AgricultureApiculture> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the agriculture apicultures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApicultureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture apicultures
	 * @param end the upper bound of the range of agriculture apicultures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriculture apicultures
	 */
	public java.util.List<AgricultureApiculture> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureApiculture>
			orderByComparator);

	/**
	 * Returns an ordered range of all the agriculture apicultures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApicultureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture apicultures
	 * @param end the upper bound of the range of agriculture apicultures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriculture apicultures
	 */
	public java.util.List<AgricultureApiculture> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureApiculture>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the agriculture apicultures from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of agriculture apicultures.
	 *
	 * @return the number of agriculture apicultures
	 */
	public int countAll();

}