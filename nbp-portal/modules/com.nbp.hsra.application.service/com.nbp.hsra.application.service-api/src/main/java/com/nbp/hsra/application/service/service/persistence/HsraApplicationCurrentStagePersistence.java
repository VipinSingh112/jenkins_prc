/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchHsraApplicationCurrentStageException;
import com.nbp.hsra.application.service.model.HsraApplicationCurrentStage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the hsra application current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HsraApplicationCurrentStageUtil
 * @generated
 */
@ProviderType
public interface HsraApplicationCurrentStagePersistence
	extends BasePersistence<HsraApplicationCurrentStage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HsraApplicationCurrentStageUtil} to access the hsra application current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the hsra application current stage where hsraApplicationId = &#63; or throws a <code>NoSuchHsraApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra application current stage
	 * @throws NoSuchHsraApplicationCurrentStageException if a matching hsra application current stage could not be found
	 */
	public HsraApplicationCurrentStage findBygetHsra_Stage_HAI(
			long hsraApplicationId)
		throws NoSuchHsraApplicationCurrentStageException;

	/**
	 * Returns the hsra application current stage where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra application current stage, or <code>null</code> if a matching hsra application current stage could not be found
	 */
	public HsraApplicationCurrentStage fetchBygetHsra_Stage_HAI(
		long hsraApplicationId);

	/**
	 * Returns the hsra application current stage where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application current stage, or <code>null</code> if a matching hsra application current stage could not be found
	 */
	public HsraApplicationCurrentStage fetchBygetHsra_Stage_HAI(
		long hsraApplicationId, boolean useFinderCache);

	/**
	 * Removes the hsra application current stage where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the hsra application current stage that was removed
	 */
	public HsraApplicationCurrentStage removeBygetHsra_Stage_HAI(
			long hsraApplicationId)
		throws NoSuchHsraApplicationCurrentStageException;

	/**
	 * Returns the number of hsra application current stages where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching hsra application current stages
	 */
	public int countBygetHsra_Stage_HAI(long hsraApplicationId);

	/**
	 * Caches the hsra application current stage in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationCurrentStage the hsra application current stage
	 */
	public void cacheResult(
		HsraApplicationCurrentStage hsraApplicationCurrentStage);

	/**
	 * Caches the hsra application current stages in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationCurrentStages the hsra application current stages
	 */
	public void cacheResult(
		java.util.List<HsraApplicationCurrentStage>
			hsraApplicationCurrentStages);

	/**
	 * Creates a new hsra application current stage with the primary key. Does not add the hsra application current stage to the database.
	 *
	 * @param hsraApplicationCurrentStageId the primary key for the new hsra application current stage
	 * @return the new hsra application current stage
	 */
	public HsraApplicationCurrentStage create(
		long hsraApplicationCurrentStageId);

	/**
	 * Removes the hsra application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param hsraApplicationCurrentStageId the primary key of the hsra application current stage
	 * @return the hsra application current stage that was removed
	 * @throws NoSuchHsraApplicationCurrentStageException if a hsra application current stage with the primary key could not be found
	 */
	public HsraApplicationCurrentStage remove(
			long hsraApplicationCurrentStageId)
		throws NoSuchHsraApplicationCurrentStageException;

	public HsraApplicationCurrentStage updateImpl(
		HsraApplicationCurrentStage hsraApplicationCurrentStage);

	/**
	 * Returns the hsra application current stage with the primary key or throws a <code>NoSuchHsraApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param hsraApplicationCurrentStageId the primary key of the hsra application current stage
	 * @return the hsra application current stage
	 * @throws NoSuchHsraApplicationCurrentStageException if a hsra application current stage with the primary key could not be found
	 */
	public HsraApplicationCurrentStage findByPrimaryKey(
			long hsraApplicationCurrentStageId)
		throws NoSuchHsraApplicationCurrentStageException;

	/**
	 * Returns the hsra application current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param hsraApplicationCurrentStageId the primary key of the hsra application current stage
	 * @return the hsra application current stage, or <code>null</code> if a hsra application current stage with the primary key could not be found
	 */
	public HsraApplicationCurrentStage fetchByPrimaryKey(
		long hsraApplicationCurrentStageId);

	/**
	 * Returns all the hsra application current stages.
	 *
	 * @return the hsra application current stages
	 */
	public java.util.List<HsraApplicationCurrentStage> findAll();

	/**
	 * Returns a range of all the hsra application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application current stages
	 * @param end the upper bound of the range of hsra application current stages (not inclusive)
	 * @return the range of hsra application current stages
	 */
	public java.util.List<HsraApplicationCurrentStage> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the hsra application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application current stages
	 * @param end the upper bound of the range of hsra application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of hsra application current stages
	 */
	public java.util.List<HsraApplicationCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HsraApplicationCurrentStage> orderByComparator);

	/**
	 * Returns an ordered range of all the hsra application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application current stages
	 * @param end the upper bound of the range of hsra application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of hsra application current stages
	 */
	public java.util.List<HsraApplicationCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HsraApplicationCurrentStage> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the hsra application current stages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of hsra application current stages.
	 *
	 * @return the number of hsra application current stages
	 */
	public int countAll();

}