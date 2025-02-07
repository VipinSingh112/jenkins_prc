/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjSectionOneException;
import com.nbp.ncbj.application.form.service.model.NcbjSectionOne;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncbj section one service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionOneUtil
 * @generated
 */
@ProviderType
public interface NcbjSectionOnePersistence
	extends BasePersistence<NcbjSectionOne> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcbjSectionOneUtil} to access the ncbj section one persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the ncbj section one where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjSectionOneException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section one
	 * @throws NoSuchNcbjSectionOneException if a matching ncbj section one could not be found
	 */
	public NcbjSectionOne findBygetNCBJById(long ncbjApplicationId)
		throws NoSuchNcbjSectionOneException;

	/**
	 * Returns the ncbj section one where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section one, or <code>null</code> if a matching ncbj section one could not be found
	 */
	public NcbjSectionOne fetchBygetNCBJById(long ncbjApplicationId);

	/**
	 * Returns the ncbj section one where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj section one, or <code>null</code> if a matching ncbj section one could not be found
	 */
	public NcbjSectionOne fetchBygetNCBJById(
		long ncbjApplicationId, boolean useFinderCache);

	/**
	 * Removes the ncbj section one where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj section one that was removed
	 */
	public NcbjSectionOne removeBygetNCBJById(long ncbjApplicationId)
		throws NoSuchNcbjSectionOneException;

	/**
	 * Returns the number of ncbj section ones where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj section ones
	 */
	public int countBygetNCBJById(long ncbjApplicationId);

	/**
	 * Returns the ncbj section one where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjSectionOneException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section one
	 * @throws NoSuchNcbjSectionOneException if a matching ncbj section one could not be found
	 */
	public NcbjSectionOne findBygetNCBJByAppId(long ncbjApplicationId)
		throws NoSuchNcbjSectionOneException;

	/**
	 * Returns the ncbj section one where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section one, or <code>null</code> if a matching ncbj section one could not be found
	 */
	public NcbjSectionOne fetchBygetNCBJByAppId(long ncbjApplicationId);

	/**
	 * Returns the ncbj section one where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj section one, or <code>null</code> if a matching ncbj section one could not be found
	 */
	public NcbjSectionOne fetchBygetNCBJByAppId(
		long ncbjApplicationId, boolean useFinderCache);

	/**
	 * Removes the ncbj section one where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj section one that was removed
	 */
	public NcbjSectionOne removeBygetNCBJByAppId(long ncbjApplicationId)
		throws NoSuchNcbjSectionOneException;

	/**
	 * Returns the number of ncbj section ones where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj section ones
	 */
	public int countBygetNCBJByAppId(long ncbjApplicationId);

	/**
	 * Caches the ncbj section one in the entity cache if it is enabled.
	 *
	 * @param ncbjSectionOne the ncbj section one
	 */
	public void cacheResult(NcbjSectionOne ncbjSectionOne);

	/**
	 * Caches the ncbj section ones in the entity cache if it is enabled.
	 *
	 * @param ncbjSectionOnes the ncbj section ones
	 */
	public void cacheResult(java.util.List<NcbjSectionOne> ncbjSectionOnes);

	/**
	 * Creates a new ncbj section one with the primary key. Does not add the ncbj section one to the database.
	 *
	 * @param ncbjSectionOneId the primary key for the new ncbj section one
	 * @return the new ncbj section one
	 */
	public NcbjSectionOne create(long ncbjSectionOneId);

	/**
	 * Removes the ncbj section one with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjSectionOneId the primary key of the ncbj section one
	 * @return the ncbj section one that was removed
	 * @throws NoSuchNcbjSectionOneException if a ncbj section one with the primary key could not be found
	 */
	public NcbjSectionOne remove(long ncbjSectionOneId)
		throws NoSuchNcbjSectionOneException;

	public NcbjSectionOne updateImpl(NcbjSectionOne ncbjSectionOne);

	/**
	 * Returns the ncbj section one with the primary key or throws a <code>NoSuchNcbjSectionOneException</code> if it could not be found.
	 *
	 * @param ncbjSectionOneId the primary key of the ncbj section one
	 * @return the ncbj section one
	 * @throws NoSuchNcbjSectionOneException if a ncbj section one with the primary key could not be found
	 */
	public NcbjSectionOne findByPrimaryKey(long ncbjSectionOneId)
		throws NoSuchNcbjSectionOneException;

	/**
	 * Returns the ncbj section one with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjSectionOneId the primary key of the ncbj section one
	 * @return the ncbj section one, or <code>null</code> if a ncbj section one with the primary key could not be found
	 */
	public NcbjSectionOne fetchByPrimaryKey(long ncbjSectionOneId);

	/**
	 * Returns all the ncbj section ones.
	 *
	 * @return the ncbj section ones
	 */
	public java.util.List<NcbjSectionOne> findAll();

	/**
	 * Returns a range of all the ncbj section ones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionOneModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section ones
	 * @param end the upper bound of the range of ncbj section ones (not inclusive)
	 * @return the range of ncbj section ones
	 */
	public java.util.List<NcbjSectionOne> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ncbj section ones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionOneModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section ones
	 * @param end the upper bound of the range of ncbj section ones (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj section ones
	 */
	public java.util.List<NcbjSectionOne> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjSectionOne>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj section ones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionOneModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section ones
	 * @param end the upper bound of the range of ncbj section ones (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj section ones
	 */
	public java.util.List<NcbjSectionOne> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjSectionOne>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncbj section ones from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncbj section ones.
	 *
	 * @return the number of ncbj section ones
	 */
	public int countAll();

}