/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjSectionTwoException;
import com.nbp.ncbj.application.form.service.model.NcbjSectionTwo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncbj section two service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionTwoUtil
 * @generated
 */
@ProviderType
public interface NcbjSectionTwoPersistence
	extends BasePersistence<NcbjSectionTwo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcbjSectionTwoUtil} to access the ncbj section two persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the ncbj section two where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjSectionTwoException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section two
	 * @throws NoSuchNcbjSectionTwoException if a matching ncbj section two could not be found
	 */
	public NcbjSectionTwo findBygetNCBJByAppId(long ncbjApplicationId)
		throws NoSuchNcbjSectionTwoException;

	/**
	 * Returns the ncbj section two where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section two, or <code>null</code> if a matching ncbj section two could not be found
	 */
	public NcbjSectionTwo fetchBygetNCBJByAppId(long ncbjApplicationId);

	/**
	 * Returns the ncbj section two where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj section two, or <code>null</code> if a matching ncbj section two could not be found
	 */
	public NcbjSectionTwo fetchBygetNCBJByAppId(
		long ncbjApplicationId, boolean useFinderCache);

	/**
	 * Removes the ncbj section two where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj section two that was removed
	 */
	public NcbjSectionTwo removeBygetNCBJByAppId(long ncbjApplicationId)
		throws NoSuchNcbjSectionTwoException;

	/**
	 * Returns the number of ncbj section twos where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj section twos
	 */
	public int countBygetNCBJByAppId(long ncbjApplicationId);

	/**
	 * Caches the ncbj section two in the entity cache if it is enabled.
	 *
	 * @param ncbjSectionTwo the ncbj section two
	 */
	public void cacheResult(NcbjSectionTwo ncbjSectionTwo);

	/**
	 * Caches the ncbj section twos in the entity cache if it is enabled.
	 *
	 * @param ncbjSectionTwos the ncbj section twos
	 */
	public void cacheResult(java.util.List<NcbjSectionTwo> ncbjSectionTwos);

	/**
	 * Creates a new ncbj section two with the primary key. Does not add the ncbj section two to the database.
	 *
	 * @param ncbjSectionTwoId the primary key for the new ncbj section two
	 * @return the new ncbj section two
	 */
	public NcbjSectionTwo create(long ncbjSectionTwoId);

	/**
	 * Removes the ncbj section two with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjSectionTwoId the primary key of the ncbj section two
	 * @return the ncbj section two that was removed
	 * @throws NoSuchNcbjSectionTwoException if a ncbj section two with the primary key could not be found
	 */
	public NcbjSectionTwo remove(long ncbjSectionTwoId)
		throws NoSuchNcbjSectionTwoException;

	public NcbjSectionTwo updateImpl(NcbjSectionTwo ncbjSectionTwo);

	/**
	 * Returns the ncbj section two with the primary key or throws a <code>NoSuchNcbjSectionTwoException</code> if it could not be found.
	 *
	 * @param ncbjSectionTwoId the primary key of the ncbj section two
	 * @return the ncbj section two
	 * @throws NoSuchNcbjSectionTwoException if a ncbj section two with the primary key could not be found
	 */
	public NcbjSectionTwo findByPrimaryKey(long ncbjSectionTwoId)
		throws NoSuchNcbjSectionTwoException;

	/**
	 * Returns the ncbj section two with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjSectionTwoId the primary key of the ncbj section two
	 * @return the ncbj section two, or <code>null</code> if a ncbj section two with the primary key could not be found
	 */
	public NcbjSectionTwo fetchByPrimaryKey(long ncbjSectionTwoId);

	/**
	 * Returns all the ncbj section twos.
	 *
	 * @return the ncbj section twos
	 */
	public java.util.List<NcbjSectionTwo> findAll();

	/**
	 * Returns a range of all the ncbj section twos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionTwoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section twos
	 * @param end the upper bound of the range of ncbj section twos (not inclusive)
	 * @return the range of ncbj section twos
	 */
	public java.util.List<NcbjSectionTwo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ncbj section twos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionTwoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section twos
	 * @param end the upper bound of the range of ncbj section twos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj section twos
	 */
	public java.util.List<NcbjSectionTwo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjSectionTwo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj section twos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionTwoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section twos
	 * @param end the upper bound of the range of ncbj section twos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj section twos
	 */
	public java.util.List<NcbjSectionTwo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjSectionTwo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncbj section twos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncbj section twos.
	 *
	 * @return the number of ncbj section twos
	 */
	public int countAll();

}