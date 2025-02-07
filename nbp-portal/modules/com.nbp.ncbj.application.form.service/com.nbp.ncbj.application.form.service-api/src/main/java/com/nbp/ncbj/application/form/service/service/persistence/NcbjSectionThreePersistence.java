/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjSectionThreeException;
import com.nbp.ncbj.application.form.service.model.NcbjSectionThree;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncbj section three service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionThreeUtil
 * @generated
 */
@ProviderType
public interface NcbjSectionThreePersistence
	extends BasePersistence<NcbjSectionThree> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcbjSectionThreeUtil} to access the ncbj section three persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the ncbj section three where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjSectionThreeException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section three
	 * @throws NoSuchNcbjSectionThreeException if a matching ncbj section three could not be found
	 */
	public NcbjSectionThree findBygetNCBJByAppId(long ncbjApplicationId)
		throws NoSuchNcbjSectionThreeException;

	/**
	 * Returns the ncbj section three where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section three, or <code>null</code> if a matching ncbj section three could not be found
	 */
	public NcbjSectionThree fetchBygetNCBJByAppId(long ncbjApplicationId);

	/**
	 * Returns the ncbj section three where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj section three, or <code>null</code> if a matching ncbj section three could not be found
	 */
	public NcbjSectionThree fetchBygetNCBJByAppId(
		long ncbjApplicationId, boolean useFinderCache);

	/**
	 * Removes the ncbj section three where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj section three that was removed
	 */
	public NcbjSectionThree removeBygetNCBJByAppId(long ncbjApplicationId)
		throws NoSuchNcbjSectionThreeException;

	/**
	 * Returns the number of ncbj section threes where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj section threes
	 */
	public int countBygetNCBJByAppId(long ncbjApplicationId);

	/**
	 * Caches the ncbj section three in the entity cache if it is enabled.
	 *
	 * @param ncbjSectionThree the ncbj section three
	 */
	public void cacheResult(NcbjSectionThree ncbjSectionThree);

	/**
	 * Caches the ncbj section threes in the entity cache if it is enabled.
	 *
	 * @param ncbjSectionThrees the ncbj section threes
	 */
	public void cacheResult(java.util.List<NcbjSectionThree> ncbjSectionThrees);

	/**
	 * Creates a new ncbj section three with the primary key. Does not add the ncbj section three to the database.
	 *
	 * @param ncbjSectionThreeId the primary key for the new ncbj section three
	 * @return the new ncbj section three
	 */
	public NcbjSectionThree create(long ncbjSectionThreeId);

	/**
	 * Removes the ncbj section three with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjSectionThreeId the primary key of the ncbj section three
	 * @return the ncbj section three that was removed
	 * @throws NoSuchNcbjSectionThreeException if a ncbj section three with the primary key could not be found
	 */
	public NcbjSectionThree remove(long ncbjSectionThreeId)
		throws NoSuchNcbjSectionThreeException;

	public NcbjSectionThree updateImpl(NcbjSectionThree ncbjSectionThree);

	/**
	 * Returns the ncbj section three with the primary key or throws a <code>NoSuchNcbjSectionThreeException</code> if it could not be found.
	 *
	 * @param ncbjSectionThreeId the primary key of the ncbj section three
	 * @return the ncbj section three
	 * @throws NoSuchNcbjSectionThreeException if a ncbj section three with the primary key could not be found
	 */
	public NcbjSectionThree findByPrimaryKey(long ncbjSectionThreeId)
		throws NoSuchNcbjSectionThreeException;

	/**
	 * Returns the ncbj section three with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjSectionThreeId the primary key of the ncbj section three
	 * @return the ncbj section three, or <code>null</code> if a ncbj section three with the primary key could not be found
	 */
	public NcbjSectionThree fetchByPrimaryKey(long ncbjSectionThreeId);

	/**
	 * Returns all the ncbj section threes.
	 *
	 * @return the ncbj section threes
	 */
	public java.util.List<NcbjSectionThree> findAll();

	/**
	 * Returns a range of all the ncbj section threes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionThreeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section threes
	 * @param end the upper bound of the range of ncbj section threes (not inclusive)
	 * @return the range of ncbj section threes
	 */
	public java.util.List<NcbjSectionThree> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ncbj section threes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionThreeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section threes
	 * @param end the upper bound of the range of ncbj section threes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj section threes
	 */
	public java.util.List<NcbjSectionThree> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjSectionThree>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj section threes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionThreeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section threes
	 * @param end the upper bound of the range of ncbj section threes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj section threes
	 */
	public java.util.List<NcbjSectionThree> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjSectionThree>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncbj section threes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncbj section threes.
	 *
	 * @return the number of ncbj section threes
	 */
	public int countAll();

}