/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.acquire.application.form.service.exception.NoSuchAcquireLandPropertyDetailsException;
import com.nbp.acquire.application.form.service.model.AcquireLandPropertyDetails;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acquire land property details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireLandPropertyDetailsUtil
 * @generated
 */
@ProviderType
public interface AcquireLandPropertyDetailsPersistence
	extends BasePersistence<AcquireLandPropertyDetails> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AcquireLandPropertyDetailsUtil} to access the acquire land property details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the acquire land property details where acquireApplicationId = &#63; or throws a <code>NoSuchAcquireLandPropertyDetailsException</code> if it could not be found.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire land property details
	 * @throws NoSuchAcquireLandPropertyDetailsException if a matching acquire land property details could not be found
	 */
	public AcquireLandPropertyDetails findBygetAcquireById(
			long acquireApplicationId)
		throws NoSuchAcquireLandPropertyDetailsException;

	/**
	 * Returns the acquire land property details where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire land property details, or <code>null</code> if a matching acquire land property details could not be found
	 */
	public AcquireLandPropertyDetails fetchBygetAcquireById(
		long acquireApplicationId);

	/**
	 * Returns the acquire land property details where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire land property details, or <code>null</code> if a matching acquire land property details could not be found
	 */
	public AcquireLandPropertyDetails fetchBygetAcquireById(
		long acquireApplicationId, boolean useFinderCache);

	/**
	 * Removes the acquire land property details where acquireApplicationId = &#63; from the database.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the acquire land property details that was removed
	 */
	public AcquireLandPropertyDetails removeBygetAcquireById(
			long acquireApplicationId)
		throws NoSuchAcquireLandPropertyDetailsException;

	/**
	 * Returns the number of acquire land property detailses where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the number of matching acquire land property detailses
	 */
	public int countBygetAcquireById(long acquireApplicationId);

	/**
	 * Caches the acquire land property details in the entity cache if it is enabled.
	 *
	 * @param acquireLandPropertyDetails the acquire land property details
	 */
	public void cacheResult(
		AcquireLandPropertyDetails acquireLandPropertyDetails);

	/**
	 * Caches the acquire land property detailses in the entity cache if it is enabled.
	 *
	 * @param acquireLandPropertyDetailses the acquire land property detailses
	 */
	public void cacheResult(
		java.util.List<AcquireLandPropertyDetails>
			acquireLandPropertyDetailses);

	/**
	 * Creates a new acquire land property details with the primary key. Does not add the acquire land property details to the database.
	 *
	 * @param acquireLandPropertyDetailsId the primary key for the new acquire land property details
	 * @return the new acquire land property details
	 */
	public AcquireLandPropertyDetails create(long acquireLandPropertyDetailsId);

	/**
	 * Removes the acquire land property details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireLandPropertyDetailsId the primary key of the acquire land property details
	 * @return the acquire land property details that was removed
	 * @throws NoSuchAcquireLandPropertyDetailsException if a acquire land property details with the primary key could not be found
	 */
	public AcquireLandPropertyDetails remove(long acquireLandPropertyDetailsId)
		throws NoSuchAcquireLandPropertyDetailsException;

	public AcquireLandPropertyDetails updateImpl(
		AcquireLandPropertyDetails acquireLandPropertyDetails);

	/**
	 * Returns the acquire land property details with the primary key or throws a <code>NoSuchAcquireLandPropertyDetailsException</code> if it could not be found.
	 *
	 * @param acquireLandPropertyDetailsId the primary key of the acquire land property details
	 * @return the acquire land property details
	 * @throws NoSuchAcquireLandPropertyDetailsException if a acquire land property details with the primary key could not be found
	 */
	public AcquireLandPropertyDetails findByPrimaryKey(
			long acquireLandPropertyDetailsId)
		throws NoSuchAcquireLandPropertyDetailsException;

	/**
	 * Returns the acquire land property details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireLandPropertyDetailsId the primary key of the acquire land property details
	 * @return the acquire land property details, or <code>null</code> if a acquire land property details with the primary key could not be found
	 */
	public AcquireLandPropertyDetails fetchByPrimaryKey(
		long acquireLandPropertyDetailsId);

	/**
	 * Returns all the acquire land property detailses.
	 *
	 * @return the acquire land property detailses
	 */
	public java.util.List<AcquireLandPropertyDetails> findAll();

	/**
	 * Returns a range of all the acquire land property detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireLandPropertyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire land property detailses
	 * @param end the upper bound of the range of acquire land property detailses (not inclusive)
	 * @return the range of acquire land property detailses
	 */
	public java.util.List<AcquireLandPropertyDetails> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the acquire land property detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireLandPropertyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire land property detailses
	 * @param end the upper bound of the range of acquire land property detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire land property detailses
	 */
	public java.util.List<AcquireLandPropertyDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AcquireLandPropertyDetails> orderByComparator);

	/**
	 * Returns an ordered range of all the acquire land property detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireLandPropertyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire land property detailses
	 * @param end the upper bound of the range of acquire land property detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire land property detailses
	 */
	public java.util.List<AcquireLandPropertyDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AcquireLandPropertyDetails> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acquire land property detailses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acquire land property detailses.
	 *
	 * @return the number of acquire land property detailses
	 */
	public int countAll();

}