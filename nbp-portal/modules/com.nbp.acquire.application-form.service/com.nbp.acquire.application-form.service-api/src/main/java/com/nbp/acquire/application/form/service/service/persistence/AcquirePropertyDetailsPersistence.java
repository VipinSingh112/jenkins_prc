/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.acquire.application.form.service.exception.NoSuchAcquirePropertyDetailsException;
import com.nbp.acquire.application.form.service.model.AcquirePropertyDetails;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acquire property details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquirePropertyDetailsUtil
 * @generated
 */
@ProviderType
public interface AcquirePropertyDetailsPersistence
	extends BasePersistence<AcquirePropertyDetails> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AcquirePropertyDetailsUtil} to access the acquire property details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the acquire property details where acquireApplicationId = &#63; or throws a <code>NoSuchAcquirePropertyDetailsException</code> if it could not be found.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire property details
	 * @throws NoSuchAcquirePropertyDetailsException if a matching acquire property details could not be found
	 */
	public AcquirePropertyDetails findBygetAcquireById(
			long acquireApplicationId)
		throws NoSuchAcquirePropertyDetailsException;

	/**
	 * Returns the acquire property details where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire property details, or <code>null</code> if a matching acquire property details could not be found
	 */
	public AcquirePropertyDetails fetchBygetAcquireById(
		long acquireApplicationId);

	/**
	 * Returns the acquire property details where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire property details, or <code>null</code> if a matching acquire property details could not be found
	 */
	public AcquirePropertyDetails fetchBygetAcquireById(
		long acquireApplicationId, boolean useFinderCache);

	/**
	 * Removes the acquire property details where acquireApplicationId = &#63; from the database.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the acquire property details that was removed
	 */
	public AcquirePropertyDetails removeBygetAcquireById(
			long acquireApplicationId)
		throws NoSuchAcquirePropertyDetailsException;

	/**
	 * Returns the number of acquire property detailses where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the number of matching acquire property detailses
	 */
	public int countBygetAcquireById(long acquireApplicationId);

	/**
	 * Caches the acquire property details in the entity cache if it is enabled.
	 *
	 * @param acquirePropertyDetails the acquire property details
	 */
	public void cacheResult(AcquirePropertyDetails acquirePropertyDetails);

	/**
	 * Caches the acquire property detailses in the entity cache if it is enabled.
	 *
	 * @param acquirePropertyDetailses the acquire property detailses
	 */
	public void cacheResult(
		java.util.List<AcquirePropertyDetails> acquirePropertyDetailses);

	/**
	 * Creates a new acquire property details with the primary key. Does not add the acquire property details to the database.
	 *
	 * @param acquirePropertyDetailsId the primary key for the new acquire property details
	 * @return the new acquire property details
	 */
	public AcquirePropertyDetails create(long acquirePropertyDetailsId);

	/**
	 * Removes the acquire property details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquirePropertyDetailsId the primary key of the acquire property details
	 * @return the acquire property details that was removed
	 * @throws NoSuchAcquirePropertyDetailsException if a acquire property details with the primary key could not be found
	 */
	public AcquirePropertyDetails remove(long acquirePropertyDetailsId)
		throws NoSuchAcquirePropertyDetailsException;

	public AcquirePropertyDetails updateImpl(
		AcquirePropertyDetails acquirePropertyDetails);

	/**
	 * Returns the acquire property details with the primary key or throws a <code>NoSuchAcquirePropertyDetailsException</code> if it could not be found.
	 *
	 * @param acquirePropertyDetailsId the primary key of the acquire property details
	 * @return the acquire property details
	 * @throws NoSuchAcquirePropertyDetailsException if a acquire property details with the primary key could not be found
	 */
	public AcquirePropertyDetails findByPrimaryKey(
			long acquirePropertyDetailsId)
		throws NoSuchAcquirePropertyDetailsException;

	/**
	 * Returns the acquire property details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquirePropertyDetailsId the primary key of the acquire property details
	 * @return the acquire property details, or <code>null</code> if a acquire property details with the primary key could not be found
	 */
	public AcquirePropertyDetails fetchByPrimaryKey(
		long acquirePropertyDetailsId);

	/**
	 * Returns all the acquire property detailses.
	 *
	 * @return the acquire property detailses
	 */
	public java.util.List<AcquirePropertyDetails> findAll();

	/**
	 * Returns a range of all the acquire property detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePropertyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire property detailses
	 * @param end the upper bound of the range of acquire property detailses (not inclusive)
	 * @return the range of acquire property detailses
	 */
	public java.util.List<AcquirePropertyDetails> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acquire property detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePropertyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire property detailses
	 * @param end the upper bound of the range of acquire property detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire property detailses
	 */
	public java.util.List<AcquirePropertyDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquirePropertyDetails>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acquire property detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePropertyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire property detailses
	 * @param end the upper bound of the range of acquire property detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire property detailses
	 */
	public java.util.List<AcquirePropertyDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquirePropertyDetails>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acquire property detailses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acquire property detailses.
	 *
	 * @return the number of acquire property detailses
	 */
	public int countAll();

}