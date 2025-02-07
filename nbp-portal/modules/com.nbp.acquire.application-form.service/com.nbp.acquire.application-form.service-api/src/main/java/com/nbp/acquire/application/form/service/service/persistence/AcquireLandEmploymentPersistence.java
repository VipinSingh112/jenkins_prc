/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.acquire.application.form.service.exception.NoSuchAcquireLandEmploymentException;
import com.nbp.acquire.application.form.service.model.AcquireLandEmployment;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acquire land employment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireLandEmploymentUtil
 * @generated
 */
@ProviderType
public interface AcquireLandEmploymentPersistence
	extends BasePersistence<AcquireLandEmployment> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AcquireLandEmploymentUtil} to access the acquire land employment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the acquire land employment where acquireApplicationId = &#63; or throws a <code>NoSuchAcquireLandEmploymentException</code> if it could not be found.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire land employment
	 * @throws NoSuchAcquireLandEmploymentException if a matching acquire land employment could not be found
	 */
	public AcquireLandEmployment findBygetAcquireById(long acquireApplicationId)
		throws NoSuchAcquireLandEmploymentException;

	/**
	 * Returns the acquire land employment where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire land employment, or <code>null</code> if a matching acquire land employment could not be found
	 */
	public AcquireLandEmployment fetchBygetAcquireById(
		long acquireApplicationId);

	/**
	 * Returns the acquire land employment where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire land employment, or <code>null</code> if a matching acquire land employment could not be found
	 */
	public AcquireLandEmployment fetchBygetAcquireById(
		long acquireApplicationId, boolean useFinderCache);

	/**
	 * Removes the acquire land employment where acquireApplicationId = &#63; from the database.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the acquire land employment that was removed
	 */
	public AcquireLandEmployment removeBygetAcquireById(
			long acquireApplicationId)
		throws NoSuchAcquireLandEmploymentException;

	/**
	 * Returns the number of acquire land employments where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the number of matching acquire land employments
	 */
	public int countBygetAcquireById(long acquireApplicationId);

	/**
	 * Caches the acquire land employment in the entity cache if it is enabled.
	 *
	 * @param acquireLandEmployment the acquire land employment
	 */
	public void cacheResult(AcquireLandEmployment acquireLandEmployment);

	/**
	 * Caches the acquire land employments in the entity cache if it is enabled.
	 *
	 * @param acquireLandEmployments the acquire land employments
	 */
	public void cacheResult(
		java.util.List<AcquireLandEmployment> acquireLandEmployments);

	/**
	 * Creates a new acquire land employment with the primary key. Does not add the acquire land employment to the database.
	 *
	 * @param acquireLandEmploymentId the primary key for the new acquire land employment
	 * @return the new acquire land employment
	 */
	public AcquireLandEmployment create(long acquireLandEmploymentId);

	/**
	 * Removes the acquire land employment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireLandEmploymentId the primary key of the acquire land employment
	 * @return the acquire land employment that was removed
	 * @throws NoSuchAcquireLandEmploymentException if a acquire land employment with the primary key could not be found
	 */
	public AcquireLandEmployment remove(long acquireLandEmploymentId)
		throws NoSuchAcquireLandEmploymentException;

	public AcquireLandEmployment updateImpl(
		AcquireLandEmployment acquireLandEmployment);

	/**
	 * Returns the acquire land employment with the primary key or throws a <code>NoSuchAcquireLandEmploymentException</code> if it could not be found.
	 *
	 * @param acquireLandEmploymentId the primary key of the acquire land employment
	 * @return the acquire land employment
	 * @throws NoSuchAcquireLandEmploymentException if a acquire land employment with the primary key could not be found
	 */
	public AcquireLandEmployment findByPrimaryKey(long acquireLandEmploymentId)
		throws NoSuchAcquireLandEmploymentException;

	/**
	 * Returns the acquire land employment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireLandEmploymentId the primary key of the acquire land employment
	 * @return the acquire land employment, or <code>null</code> if a acquire land employment with the primary key could not be found
	 */
	public AcquireLandEmployment fetchByPrimaryKey(
		long acquireLandEmploymentId);

	/**
	 * Returns all the acquire land employments.
	 *
	 * @return the acquire land employments
	 */
	public java.util.List<AcquireLandEmployment> findAll();

	/**
	 * Returns a range of all the acquire land employments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireLandEmploymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire land employments
	 * @param end the upper bound of the range of acquire land employments (not inclusive)
	 * @return the range of acquire land employments
	 */
	public java.util.List<AcquireLandEmployment> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acquire land employments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireLandEmploymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire land employments
	 * @param end the upper bound of the range of acquire land employments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire land employments
	 */
	public java.util.List<AcquireLandEmployment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireLandEmployment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acquire land employments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireLandEmploymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire land employments
	 * @param end the upper bound of the range of acquire land employments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire land employments
	 */
	public java.util.List<AcquireLandEmployment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireLandEmployment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acquire land employments from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acquire land employments.
	 *
	 * @return the number of acquire land employments
	 */
	public int countAll();

}