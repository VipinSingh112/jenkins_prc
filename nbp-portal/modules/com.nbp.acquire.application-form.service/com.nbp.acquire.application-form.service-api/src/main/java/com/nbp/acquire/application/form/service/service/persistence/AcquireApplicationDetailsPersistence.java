/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.acquire.application.form.service.exception.NoSuchAcquireApplicationDetailsException;
import com.nbp.acquire.application.form.service.model.AcquireApplicationDetails;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acquire application details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireApplicationDetailsUtil
 * @generated
 */
@ProviderType
public interface AcquireApplicationDetailsPersistence
	extends BasePersistence<AcquireApplicationDetails> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AcquireApplicationDetailsUtil} to access the acquire application details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the acquire application details where acquireApplicationId = &#63; or throws a <code>NoSuchAcquireApplicationDetailsException</code> if it could not be found.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire application details
	 * @throws NoSuchAcquireApplicationDetailsException if a matching acquire application details could not be found
	 */
	public AcquireApplicationDetails findBygetAcquireById(
			long acquireApplicationId)
		throws NoSuchAcquireApplicationDetailsException;

	/**
	 * Returns the acquire application details where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire application details, or <code>null</code> if a matching acquire application details could not be found
	 */
	public AcquireApplicationDetails fetchBygetAcquireById(
		long acquireApplicationId);

	/**
	 * Returns the acquire application details where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire application details, or <code>null</code> if a matching acquire application details could not be found
	 */
	public AcquireApplicationDetails fetchBygetAcquireById(
		long acquireApplicationId, boolean useFinderCache);

	/**
	 * Removes the acquire application details where acquireApplicationId = &#63; from the database.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the acquire application details that was removed
	 */
	public AcquireApplicationDetails removeBygetAcquireById(
			long acquireApplicationId)
		throws NoSuchAcquireApplicationDetailsException;

	/**
	 * Returns the number of acquire application detailses where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the number of matching acquire application detailses
	 */
	public int countBygetAcquireById(long acquireApplicationId);

	/**
	 * Caches the acquire application details in the entity cache if it is enabled.
	 *
	 * @param acquireApplicationDetails the acquire application details
	 */
	public void cacheResult(
		AcquireApplicationDetails acquireApplicationDetails);

	/**
	 * Caches the acquire application detailses in the entity cache if it is enabled.
	 *
	 * @param acquireApplicationDetailses the acquire application detailses
	 */
	public void cacheResult(
		java.util.List<AcquireApplicationDetails> acquireApplicationDetailses);

	/**
	 * Creates a new acquire application details with the primary key. Does not add the acquire application details to the database.
	 *
	 * @param acquireApplicationDetailsId the primary key for the new acquire application details
	 * @return the new acquire application details
	 */
	public AcquireApplicationDetails create(long acquireApplicationDetailsId);

	/**
	 * Removes the acquire application details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireApplicationDetailsId the primary key of the acquire application details
	 * @return the acquire application details that was removed
	 * @throws NoSuchAcquireApplicationDetailsException if a acquire application details with the primary key could not be found
	 */
	public AcquireApplicationDetails remove(long acquireApplicationDetailsId)
		throws NoSuchAcquireApplicationDetailsException;

	public AcquireApplicationDetails updateImpl(
		AcquireApplicationDetails acquireApplicationDetails);

	/**
	 * Returns the acquire application details with the primary key or throws a <code>NoSuchAcquireApplicationDetailsException</code> if it could not be found.
	 *
	 * @param acquireApplicationDetailsId the primary key of the acquire application details
	 * @return the acquire application details
	 * @throws NoSuchAcquireApplicationDetailsException if a acquire application details with the primary key could not be found
	 */
	public AcquireApplicationDetails findByPrimaryKey(
			long acquireApplicationDetailsId)
		throws NoSuchAcquireApplicationDetailsException;

	/**
	 * Returns the acquire application details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireApplicationDetailsId the primary key of the acquire application details
	 * @return the acquire application details, or <code>null</code> if a acquire application details with the primary key could not be found
	 */
	public AcquireApplicationDetails fetchByPrimaryKey(
		long acquireApplicationDetailsId);

	/**
	 * Returns all the acquire application detailses.
	 *
	 * @return the acquire application detailses
	 */
	public java.util.List<AcquireApplicationDetails> findAll();

	/**
	 * Returns a range of all the acquire application detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire application detailses
	 * @param end the upper bound of the range of acquire application detailses (not inclusive)
	 * @return the range of acquire application detailses
	 */
	public java.util.List<AcquireApplicationDetails> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the acquire application detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire application detailses
	 * @param end the upper bound of the range of acquire application detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire application detailses
	 */
	public java.util.List<AcquireApplicationDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AcquireApplicationDetails> orderByComparator);

	/**
	 * Returns an ordered range of all the acquire application detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire application detailses
	 * @param end the upper bound of the range of acquire application detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire application detailses
	 */
	public java.util.List<AcquireApplicationDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AcquireApplicationDetails> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acquire application detailses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acquire application detailses.
	 *
	 * @return the number of acquire application detailses
	 */
	public int countAll();

}