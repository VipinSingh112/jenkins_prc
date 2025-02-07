/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.acquire.application.form.service.exception.NoSuchAcquireCurrentStageException;
import com.nbp.acquire.application.form.service.model.AcquireCurrentStage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acquire current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireCurrentStageUtil
 * @generated
 */
@ProviderType
public interface AcquireCurrentStagePersistence
	extends BasePersistence<AcquireCurrentStage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AcquireCurrentStageUtil} to access the acquire current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the acquire current stage where acquireApplicationId = &#63; or throws a <code>NoSuchAcquireCurrentStageException</code> if it could not be found.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire current stage
	 * @throws NoSuchAcquireCurrentStageException if a matching acquire current stage could not be found
	 */
	public AcquireCurrentStage findBygetAcquireById(long acquireApplicationId)
		throws NoSuchAcquireCurrentStageException;

	/**
	 * Returns the acquire current stage where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire current stage, or <code>null</code> if a matching acquire current stage could not be found
	 */
	public AcquireCurrentStage fetchBygetAcquireById(long acquireApplicationId);

	/**
	 * Returns the acquire current stage where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire current stage, or <code>null</code> if a matching acquire current stage could not be found
	 */
	public AcquireCurrentStage fetchBygetAcquireById(
		long acquireApplicationId, boolean useFinderCache);

	/**
	 * Removes the acquire current stage where acquireApplicationId = &#63; from the database.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the acquire current stage that was removed
	 */
	public AcquireCurrentStage removeBygetAcquireById(long acquireApplicationId)
		throws NoSuchAcquireCurrentStageException;

	/**
	 * Returns the number of acquire current stages where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the number of matching acquire current stages
	 */
	public int countBygetAcquireById(long acquireApplicationId);

	/**
	 * Caches the acquire current stage in the entity cache if it is enabled.
	 *
	 * @param acquireCurrentStage the acquire current stage
	 */
	public void cacheResult(AcquireCurrentStage acquireCurrentStage);

	/**
	 * Caches the acquire current stages in the entity cache if it is enabled.
	 *
	 * @param acquireCurrentStages the acquire current stages
	 */
	public void cacheResult(
		java.util.List<AcquireCurrentStage> acquireCurrentStages);

	/**
	 * Creates a new acquire current stage with the primary key. Does not add the acquire current stage to the database.
	 *
	 * @param acquireCurrentStageId the primary key for the new acquire current stage
	 * @return the new acquire current stage
	 */
	public AcquireCurrentStage create(long acquireCurrentStageId);

	/**
	 * Removes the acquire current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireCurrentStageId the primary key of the acquire current stage
	 * @return the acquire current stage that was removed
	 * @throws NoSuchAcquireCurrentStageException if a acquire current stage with the primary key could not be found
	 */
	public AcquireCurrentStage remove(long acquireCurrentStageId)
		throws NoSuchAcquireCurrentStageException;

	public AcquireCurrentStage updateImpl(
		AcquireCurrentStage acquireCurrentStage);

	/**
	 * Returns the acquire current stage with the primary key or throws a <code>NoSuchAcquireCurrentStageException</code> if it could not be found.
	 *
	 * @param acquireCurrentStageId the primary key of the acquire current stage
	 * @return the acquire current stage
	 * @throws NoSuchAcquireCurrentStageException if a acquire current stage with the primary key could not be found
	 */
	public AcquireCurrentStage findByPrimaryKey(long acquireCurrentStageId)
		throws NoSuchAcquireCurrentStageException;

	/**
	 * Returns the acquire current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireCurrentStageId the primary key of the acquire current stage
	 * @return the acquire current stage, or <code>null</code> if a acquire current stage with the primary key could not be found
	 */
	public AcquireCurrentStage fetchByPrimaryKey(long acquireCurrentStageId);

	/**
	 * Returns all the acquire current stages.
	 *
	 * @return the acquire current stages
	 */
	public java.util.List<AcquireCurrentStage> findAll();

	/**
	 * Returns a range of all the acquire current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire current stages
	 * @param end the upper bound of the range of acquire current stages (not inclusive)
	 * @return the range of acquire current stages
	 */
	public java.util.List<AcquireCurrentStage> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acquire current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire current stages
	 * @param end the upper bound of the range of acquire current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire current stages
	 */
	public java.util.List<AcquireCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireCurrentStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acquire current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire current stages
	 * @param end the upper bound of the range of acquire current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire current stages
	 */
	public java.util.List<AcquireCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireCurrentStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acquire current stages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acquire current stages.
	 *
	 * @return the number of acquire current stages
	 */
	public int countAll();

}