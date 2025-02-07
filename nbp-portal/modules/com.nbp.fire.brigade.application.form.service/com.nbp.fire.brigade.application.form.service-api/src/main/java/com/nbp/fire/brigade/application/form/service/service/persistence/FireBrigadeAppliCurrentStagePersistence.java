/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.fire.brigade.application.form.service.exception.NoSuchFireBrigadeAppliCurrentStageException;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeAppliCurrentStage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the fire brigade appli current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeAppliCurrentStageUtil
 * @generated
 */
@ProviderType
public interface FireBrigadeAppliCurrentStagePersistence
	extends BasePersistence<FireBrigadeAppliCurrentStage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FireBrigadeAppliCurrentStageUtil} to access the fire brigade appli current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the fire brigade appli current stage where fireBrigadeApplicationId = &#63; or throws a <code>NoSuchFireBrigadeAppliCurrentStageException</code> if it could not be found.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade appli current stage
	 * @throws NoSuchFireBrigadeAppliCurrentStageException if a matching fire brigade appli current stage could not be found
	 */
	public FireBrigadeAppliCurrentStage findBygetFireBrigade_Stage_FBAI(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeAppliCurrentStageException;

	/**
	 * Returns the fire brigade appli current stage where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade appli current stage, or <code>null</code> if a matching fire brigade appli current stage could not be found
	 */
	public FireBrigadeAppliCurrentStage fetchBygetFireBrigade_Stage_FBAI(
		long fireBrigadeApplicationId);

	/**
	 * Returns the fire brigade appli current stage where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade appli current stage, or <code>null</code> if a matching fire brigade appli current stage could not be found
	 */
	public FireBrigadeAppliCurrentStage fetchBygetFireBrigade_Stage_FBAI(
		long fireBrigadeApplicationId, boolean useFinderCache);

	/**
	 * Removes the fire brigade appli current stage where fireBrigadeApplicationId = &#63; from the database.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the fire brigade appli current stage that was removed
	 */
	public FireBrigadeAppliCurrentStage removeBygetFireBrigade_Stage_FBAI(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeAppliCurrentStageException;

	/**
	 * Returns the number of fire brigade appli current stages where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the number of matching fire brigade appli current stages
	 */
	public int countBygetFireBrigade_Stage_FBAI(long fireBrigadeApplicationId);

	/**
	 * Caches the fire brigade appli current stage in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeAppliCurrentStage the fire brigade appli current stage
	 */
	public void cacheResult(
		FireBrigadeAppliCurrentStage fireBrigadeAppliCurrentStage);

	/**
	 * Caches the fire brigade appli current stages in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeAppliCurrentStages the fire brigade appli current stages
	 */
	public void cacheResult(
		java.util.List<FireBrigadeAppliCurrentStage>
			fireBrigadeAppliCurrentStages);

	/**
	 * Creates a new fire brigade appli current stage with the primary key. Does not add the fire brigade appli current stage to the database.
	 *
	 * @param fireBrigadeAppliCurrentStageId the primary key for the new fire brigade appli current stage
	 * @return the new fire brigade appli current stage
	 */
	public FireBrigadeAppliCurrentStage create(
		long fireBrigadeAppliCurrentStageId);

	/**
	 * Removes the fire brigade appli current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadeAppliCurrentStageId the primary key of the fire brigade appli current stage
	 * @return the fire brigade appli current stage that was removed
	 * @throws NoSuchFireBrigadeAppliCurrentStageException if a fire brigade appli current stage with the primary key could not be found
	 */
	public FireBrigadeAppliCurrentStage remove(
			long fireBrigadeAppliCurrentStageId)
		throws NoSuchFireBrigadeAppliCurrentStageException;

	public FireBrigadeAppliCurrentStage updateImpl(
		FireBrigadeAppliCurrentStage fireBrigadeAppliCurrentStage);

	/**
	 * Returns the fire brigade appli current stage with the primary key or throws a <code>NoSuchFireBrigadeAppliCurrentStageException</code> if it could not be found.
	 *
	 * @param fireBrigadeAppliCurrentStageId the primary key of the fire brigade appli current stage
	 * @return the fire brigade appli current stage
	 * @throws NoSuchFireBrigadeAppliCurrentStageException if a fire brigade appli current stage with the primary key could not be found
	 */
	public FireBrigadeAppliCurrentStage findByPrimaryKey(
			long fireBrigadeAppliCurrentStageId)
		throws NoSuchFireBrigadeAppliCurrentStageException;

	/**
	 * Returns the fire brigade appli current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadeAppliCurrentStageId the primary key of the fire brigade appli current stage
	 * @return the fire brigade appli current stage, or <code>null</code> if a fire brigade appli current stage with the primary key could not be found
	 */
	public FireBrigadeAppliCurrentStage fetchByPrimaryKey(
		long fireBrigadeAppliCurrentStageId);

	/**
	 * Returns all the fire brigade appli current stages.
	 *
	 * @return the fire brigade appli current stages
	 */
	public java.util.List<FireBrigadeAppliCurrentStage> findAll();

	/**
	 * Returns a range of all the fire brigade appli current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeAppliCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade appli current stages
	 * @param end the upper bound of the range of fire brigade appli current stages (not inclusive)
	 * @return the range of fire brigade appli current stages
	 */
	public java.util.List<FireBrigadeAppliCurrentStage> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the fire brigade appli current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeAppliCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade appli current stages
	 * @param end the upper bound of the range of fire brigade appli current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade appli current stages
	 */
	public java.util.List<FireBrigadeAppliCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadeAppliCurrentStage> orderByComparator);

	/**
	 * Returns an ordered range of all the fire brigade appli current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeAppliCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade appli current stages
	 * @param end the upper bound of the range of fire brigade appli current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade appli current stages
	 */
	public java.util.List<FireBrigadeAppliCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadeAppliCurrentStage> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the fire brigade appli current stages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of fire brigade appli current stages.
	 *
	 * @return the number of fire brigade appli current stages
	 */
	public int countAll();

}