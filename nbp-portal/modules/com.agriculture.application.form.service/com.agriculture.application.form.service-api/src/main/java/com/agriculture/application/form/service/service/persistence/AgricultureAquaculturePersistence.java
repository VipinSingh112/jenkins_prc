/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence;

import com.agriculture.application.form.service.exception.NoSuchAgricultureAquacultureException;
import com.agriculture.application.form.service.model.AgricultureAquaculture;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the agriculture aquaculture service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureAquacultureUtil
 * @generated
 */
@ProviderType
public interface AgricultureAquaculturePersistence
	extends BasePersistence<AgricultureAquaculture> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AgricultureAquacultureUtil} to access the agriculture aquaculture persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the agriculture aquaculture where agricultureApplicationId = &#63; or throws a <code>NoSuchAgricultureAquacultureException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture aquaculture
	 * @throws NoSuchAgricultureAquacultureException if a matching agriculture aquaculture could not be found
	 */
	public AgricultureAquaculture findBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultureAquacultureException;

	/**
	 * Returns the agriculture aquaculture where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture aquaculture, or <code>null</code> if a matching agriculture aquaculture could not be found
	 */
	public AgricultureAquaculture fetchBygetAgricultureById(
		long agricultureApplicationId);

	/**
	 * Returns the agriculture aquaculture where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture aquaculture, or <code>null</code> if a matching agriculture aquaculture could not be found
	 */
	public AgricultureAquaculture fetchBygetAgricultureById(
		long agricultureApplicationId, boolean useFinderCache);

	/**
	 * Removes the agriculture aquaculture where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agriculture aquaculture that was removed
	 */
	public AgricultureAquaculture removeBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultureAquacultureException;

	/**
	 * Returns the number of agriculture aquacultures where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture aquacultures
	 */
	public int countBygetAgricultureById(long agricultureApplicationId);

	/**
	 * Returns all the agriculture aquacultures where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture aquacultures
	 */
	public java.util.List<AgricultureAquaculture> findBygetAAqua_by_AAI(
		long agricultureApplicationId);

	/**
	 * Returns a range of all the agriculture aquacultures where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureAquacultureModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture aquacultures
	 * @param end the upper bound of the range of agriculture aquacultures (not inclusive)
	 * @return the range of matching agriculture aquacultures
	 */
	public java.util.List<AgricultureAquaculture> findBygetAAqua_by_AAI(
		long agricultureApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the agriculture aquacultures where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureAquacultureModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture aquacultures
	 * @param end the upper bound of the range of agriculture aquacultures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture aquacultures
	 */
	public java.util.List<AgricultureAquaculture> findBygetAAqua_by_AAI(
		long agricultureApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureAquaculture>
			orderByComparator);

	/**
	 * Returns an ordered range of all the agriculture aquacultures where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureAquacultureModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture aquacultures
	 * @param end the upper bound of the range of agriculture aquacultures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture aquacultures
	 */
	public java.util.List<AgricultureAquaculture> findBygetAAqua_by_AAI(
		long agricultureApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureAquaculture>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first agriculture aquaculture in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture aquaculture
	 * @throws NoSuchAgricultureAquacultureException if a matching agriculture aquaculture could not be found
	 */
	public AgricultureAquaculture findBygetAAqua_by_AAI_First(
			long agricultureApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureAquaculture> orderByComparator)
		throws NoSuchAgricultureAquacultureException;

	/**
	 * Returns the first agriculture aquaculture in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture aquaculture, or <code>null</code> if a matching agriculture aquaculture could not be found
	 */
	public AgricultureAquaculture fetchBygetAAqua_by_AAI_First(
		long agricultureApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureAquaculture>
			orderByComparator);

	/**
	 * Returns the last agriculture aquaculture in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture aquaculture
	 * @throws NoSuchAgricultureAquacultureException if a matching agriculture aquaculture could not be found
	 */
	public AgricultureAquaculture findBygetAAqua_by_AAI_Last(
			long agricultureApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureAquaculture> orderByComparator)
		throws NoSuchAgricultureAquacultureException;

	/**
	 * Returns the last agriculture aquaculture in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture aquaculture, or <code>null</code> if a matching agriculture aquaculture could not be found
	 */
	public AgricultureAquaculture fetchBygetAAqua_by_AAI_Last(
		long agricultureApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureAquaculture>
			orderByComparator);

	/**
	 * Returns the agriculture aquacultures before and after the current agriculture aquaculture in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureAquacultureId the primary key of the current agriculture aquaculture
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture aquaculture
	 * @throws NoSuchAgricultureAquacultureException if a agriculture aquaculture with the primary key could not be found
	 */
	public AgricultureAquaculture[] findBygetAAqua_by_AAI_PrevAndNext(
			long agricultureAquacultureId, long agricultureApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureAquaculture> orderByComparator)
		throws NoSuchAgricultureAquacultureException;

	/**
	 * Removes all the agriculture aquacultures where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 */
	public void removeBygetAAqua_by_AAI(long agricultureApplicationId);

	/**
	 * Returns the number of agriculture aquacultures where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture aquacultures
	 */
	public int countBygetAAqua_by_AAI(long agricultureApplicationId);

	/**
	 * Caches the agriculture aquaculture in the entity cache if it is enabled.
	 *
	 * @param agricultureAquaculture the agriculture aquaculture
	 */
	public void cacheResult(AgricultureAquaculture agricultureAquaculture);

	/**
	 * Caches the agriculture aquacultures in the entity cache if it is enabled.
	 *
	 * @param agricultureAquacultures the agriculture aquacultures
	 */
	public void cacheResult(
		java.util.List<AgricultureAquaculture> agricultureAquacultures);

	/**
	 * Creates a new agriculture aquaculture with the primary key. Does not add the agriculture aquaculture to the database.
	 *
	 * @param agricultureAquacultureId the primary key for the new agriculture aquaculture
	 * @return the new agriculture aquaculture
	 */
	public AgricultureAquaculture create(long agricultureAquacultureId);

	/**
	 * Removes the agriculture aquaculture with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agricultureAquacultureId the primary key of the agriculture aquaculture
	 * @return the agriculture aquaculture that was removed
	 * @throws NoSuchAgricultureAquacultureException if a agriculture aquaculture with the primary key could not be found
	 */
	public AgricultureAquaculture remove(long agricultureAquacultureId)
		throws NoSuchAgricultureAquacultureException;

	public AgricultureAquaculture updateImpl(
		AgricultureAquaculture agricultureAquaculture);

	/**
	 * Returns the agriculture aquaculture with the primary key or throws a <code>NoSuchAgricultureAquacultureException</code> if it could not be found.
	 *
	 * @param agricultureAquacultureId the primary key of the agriculture aquaculture
	 * @return the agriculture aquaculture
	 * @throws NoSuchAgricultureAquacultureException if a agriculture aquaculture with the primary key could not be found
	 */
	public AgricultureAquaculture findByPrimaryKey(
			long agricultureAquacultureId)
		throws NoSuchAgricultureAquacultureException;

	/**
	 * Returns the agriculture aquaculture with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agricultureAquacultureId the primary key of the agriculture aquaculture
	 * @return the agriculture aquaculture, or <code>null</code> if a agriculture aquaculture with the primary key could not be found
	 */
	public AgricultureAquaculture fetchByPrimaryKey(
		long agricultureAquacultureId);

	/**
	 * Returns all the agriculture aquacultures.
	 *
	 * @return the agriculture aquacultures
	 */
	public java.util.List<AgricultureAquaculture> findAll();

	/**
	 * Returns a range of all the agriculture aquacultures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureAquacultureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture aquacultures
	 * @param end the upper bound of the range of agriculture aquacultures (not inclusive)
	 * @return the range of agriculture aquacultures
	 */
	public java.util.List<AgricultureAquaculture> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the agriculture aquacultures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureAquacultureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture aquacultures
	 * @param end the upper bound of the range of agriculture aquacultures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriculture aquacultures
	 */
	public java.util.List<AgricultureAquaculture> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureAquaculture>
			orderByComparator);

	/**
	 * Returns an ordered range of all the agriculture aquacultures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureAquacultureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture aquacultures
	 * @param end the upper bound of the range of agriculture aquacultures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriculture aquacultures
	 */
	public java.util.List<AgricultureAquaculture> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureAquaculture>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the agriculture aquacultures from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of agriculture aquacultures.
	 *
	 * @return the number of agriculture aquacultures
	 */
	public int countAll();

}