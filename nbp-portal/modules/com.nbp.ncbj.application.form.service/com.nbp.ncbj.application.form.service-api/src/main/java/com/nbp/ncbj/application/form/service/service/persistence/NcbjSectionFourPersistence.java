/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjSectionFourException;
import com.nbp.ncbj.application.form.service.model.NcbjSectionFour;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncbj section four service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionFourUtil
 * @generated
 */
@ProviderType
public interface NcbjSectionFourPersistence
	extends BasePersistence<NcbjSectionFour> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcbjSectionFourUtil} to access the ncbj section four persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the ncbj section four where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjSectionFourException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section four
	 * @throws NoSuchNcbjSectionFourException if a matching ncbj section four could not be found
	 */
	public NcbjSectionFour findBygetNCBJByAppId(long ncbjApplicationId)
		throws NoSuchNcbjSectionFourException;

	/**
	 * Returns the ncbj section four where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section four, or <code>null</code> if a matching ncbj section four could not be found
	 */
	public NcbjSectionFour fetchBygetNCBJByAppId(long ncbjApplicationId);

	/**
	 * Returns the ncbj section four where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj section four, or <code>null</code> if a matching ncbj section four could not be found
	 */
	public NcbjSectionFour fetchBygetNCBJByAppId(
		long ncbjApplicationId, boolean useFinderCache);

	/**
	 * Removes the ncbj section four where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj section four that was removed
	 */
	public NcbjSectionFour removeBygetNCBJByAppId(long ncbjApplicationId)
		throws NoSuchNcbjSectionFourException;

	/**
	 * Returns the number of ncbj section fours where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj section fours
	 */
	public int countBygetNCBJByAppId(long ncbjApplicationId);

	/**
	 * Caches the ncbj section four in the entity cache if it is enabled.
	 *
	 * @param ncbjSectionFour the ncbj section four
	 */
	public void cacheResult(NcbjSectionFour ncbjSectionFour);

	/**
	 * Caches the ncbj section fours in the entity cache if it is enabled.
	 *
	 * @param ncbjSectionFours the ncbj section fours
	 */
	public void cacheResult(java.util.List<NcbjSectionFour> ncbjSectionFours);

	/**
	 * Creates a new ncbj section four with the primary key. Does not add the ncbj section four to the database.
	 *
	 * @param ncbjSectionFourId the primary key for the new ncbj section four
	 * @return the new ncbj section four
	 */
	public NcbjSectionFour create(long ncbjSectionFourId);

	/**
	 * Removes the ncbj section four with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjSectionFourId the primary key of the ncbj section four
	 * @return the ncbj section four that was removed
	 * @throws NoSuchNcbjSectionFourException if a ncbj section four with the primary key could not be found
	 */
	public NcbjSectionFour remove(long ncbjSectionFourId)
		throws NoSuchNcbjSectionFourException;

	public NcbjSectionFour updateImpl(NcbjSectionFour ncbjSectionFour);

	/**
	 * Returns the ncbj section four with the primary key or throws a <code>NoSuchNcbjSectionFourException</code> if it could not be found.
	 *
	 * @param ncbjSectionFourId the primary key of the ncbj section four
	 * @return the ncbj section four
	 * @throws NoSuchNcbjSectionFourException if a ncbj section four with the primary key could not be found
	 */
	public NcbjSectionFour findByPrimaryKey(long ncbjSectionFourId)
		throws NoSuchNcbjSectionFourException;

	/**
	 * Returns the ncbj section four with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjSectionFourId the primary key of the ncbj section four
	 * @return the ncbj section four, or <code>null</code> if a ncbj section four with the primary key could not be found
	 */
	public NcbjSectionFour fetchByPrimaryKey(long ncbjSectionFourId);

	/**
	 * Returns all the ncbj section fours.
	 *
	 * @return the ncbj section fours
	 */
	public java.util.List<NcbjSectionFour> findAll();

	/**
	 * Returns a range of all the ncbj section fours.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionFourModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section fours
	 * @param end the upper bound of the range of ncbj section fours (not inclusive)
	 * @return the range of ncbj section fours
	 */
	public java.util.List<NcbjSectionFour> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ncbj section fours.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionFourModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section fours
	 * @param end the upper bound of the range of ncbj section fours (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj section fours
	 */
	public java.util.List<NcbjSectionFour> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjSectionFour>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj section fours.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionFourModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section fours
	 * @param end the upper bound of the range of ncbj section fours (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj section fours
	 */
	public java.util.List<NcbjSectionFour> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjSectionFour>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncbj section fours from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncbj section fours.
	 *
	 * @return the number of ncbj section fours
	 */
	public int countAll();

}