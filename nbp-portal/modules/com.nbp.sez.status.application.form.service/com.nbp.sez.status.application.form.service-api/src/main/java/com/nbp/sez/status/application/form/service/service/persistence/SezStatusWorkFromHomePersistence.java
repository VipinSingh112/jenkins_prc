/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezStatusWorkFromHomeException;
import com.nbp.sez.status.application.form.service.model.SezStatusWorkFromHome;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez status work from home service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusWorkFromHomeUtil
 * @generated
 */
@ProviderType
public interface SezStatusWorkFromHomePersistence
	extends BasePersistence<SezStatusWorkFromHome> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezStatusWorkFromHomeUtil} to access the sez status work from home persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the sez status work from home where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezStatusWorkFromHomeException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status work from home
	 * @throws NoSuchSezStatusWorkFromHomeException if a matching sez status work from home could not be found
	 */
	public SezStatusWorkFromHome findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezStatusWorkFromHomeException;

	/**
	 * Returns the sez status work from home where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status work from home, or <code>null</code> if a matching sez status work from home could not be found
	 */
	public SezStatusWorkFromHome fetchBygetSezStatusByAppId(
		long sezStatusApplicationId);

	/**
	 * Returns the sez status work from home where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status work from home, or <code>null</code> if a matching sez status work from home could not be found
	 */
	public SezStatusWorkFromHome fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache);

	/**
	 * Removes the sez status work from home where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez status work from home that was removed
	 */
	public SezStatusWorkFromHome removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezStatusWorkFromHomeException;

	/**
	 * Returns the number of sez status work from homes where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez status work from homes
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez status work from home in the entity cache if it is enabled.
	 *
	 * @param sezStatusWorkFromHome the sez status work from home
	 */
	public void cacheResult(SezStatusWorkFromHome sezStatusWorkFromHome);

	/**
	 * Caches the sez status work from homes in the entity cache if it is enabled.
	 *
	 * @param sezStatusWorkFromHomes the sez status work from homes
	 */
	public void cacheResult(
		java.util.List<SezStatusWorkFromHome> sezStatusWorkFromHomes);

	/**
	 * Creates a new sez status work from home with the primary key. Does not add the sez status work from home to the database.
	 *
	 * @param sezStatusWorkFromHomeId the primary key for the new sez status work from home
	 * @return the new sez status work from home
	 */
	public SezStatusWorkFromHome create(long sezStatusWorkFromHomeId);

	/**
	 * Removes the sez status work from home with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezStatusWorkFromHomeId the primary key of the sez status work from home
	 * @return the sez status work from home that was removed
	 * @throws NoSuchSezStatusWorkFromHomeException if a sez status work from home with the primary key could not be found
	 */
	public SezStatusWorkFromHome remove(long sezStatusWorkFromHomeId)
		throws NoSuchSezStatusWorkFromHomeException;

	public SezStatusWorkFromHome updateImpl(
		SezStatusWorkFromHome sezStatusWorkFromHome);

	/**
	 * Returns the sez status work from home with the primary key or throws a <code>NoSuchSezStatusWorkFromHomeException</code> if it could not be found.
	 *
	 * @param sezStatusWorkFromHomeId the primary key of the sez status work from home
	 * @return the sez status work from home
	 * @throws NoSuchSezStatusWorkFromHomeException if a sez status work from home with the primary key could not be found
	 */
	public SezStatusWorkFromHome findByPrimaryKey(long sezStatusWorkFromHomeId)
		throws NoSuchSezStatusWorkFromHomeException;

	/**
	 * Returns the sez status work from home with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezStatusWorkFromHomeId the primary key of the sez status work from home
	 * @return the sez status work from home, or <code>null</code> if a sez status work from home with the primary key could not be found
	 */
	public SezStatusWorkFromHome fetchByPrimaryKey(
		long sezStatusWorkFromHomeId);

	/**
	 * Returns all the sez status work from homes.
	 *
	 * @return the sez status work from homes
	 */
	public java.util.List<SezStatusWorkFromHome> findAll();

	/**
	 * Returns a range of all the sez status work from homes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWorkFromHomeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status work from homes
	 * @param end the upper bound of the range of sez status work from homes (not inclusive)
	 * @return the range of sez status work from homes
	 */
	public java.util.List<SezStatusWorkFromHome> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the sez status work from homes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWorkFromHomeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status work from homes
	 * @param end the upper bound of the range of sez status work from homes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status work from homes
	 */
	public java.util.List<SezStatusWorkFromHome> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusWorkFromHome>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sez status work from homes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWorkFromHomeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status work from homes
	 * @param end the upper bound of the range of sez status work from homes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status work from homes
	 */
	public java.util.List<SezStatusWorkFromHome> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusWorkFromHome>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez status work from homes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez status work from homes.
	 *
	 * @return the number of sez status work from homes
	 */
	public int countAll();

}