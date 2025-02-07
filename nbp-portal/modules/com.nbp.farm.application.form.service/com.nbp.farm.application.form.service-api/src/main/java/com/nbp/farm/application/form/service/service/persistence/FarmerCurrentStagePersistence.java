/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.farm.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.farm.application.form.service.exception.NoSuchFarmerCurrentStageException;
import com.nbp.farm.application.form.service.model.FarmerCurrentStage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the farmer current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerCurrentStageUtil
 * @generated
 */
@ProviderType
public interface FarmerCurrentStagePersistence
	extends BasePersistence<FarmerCurrentStage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FarmerCurrentStageUtil} to access the farmer current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the farmer current stage in the entity cache if it is enabled.
	 *
	 * @param farmerCurrentStage the farmer current stage
	 */
	public void cacheResult(FarmerCurrentStage farmerCurrentStage);

	/**
	 * Caches the farmer current stages in the entity cache if it is enabled.
	 *
	 * @param farmerCurrentStages the farmer current stages
	 */
	public void cacheResult(
		java.util.List<FarmerCurrentStage> farmerCurrentStages);

	/**
	 * Creates a new farmer current stage with the primary key. Does not add the farmer current stage to the database.
	 *
	 * @param farmerCurrentStageId the primary key for the new farmer current stage
	 * @return the new farmer current stage
	 */
	public FarmerCurrentStage create(long farmerCurrentStageId);

	/**
	 * Removes the farmer current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmerCurrentStageId the primary key of the farmer current stage
	 * @return the farmer current stage that was removed
	 * @throws NoSuchFarmerCurrentStageException if a farmer current stage with the primary key could not be found
	 */
	public FarmerCurrentStage remove(long farmerCurrentStageId)
		throws NoSuchFarmerCurrentStageException;

	public FarmerCurrentStage updateImpl(FarmerCurrentStage farmerCurrentStage);

	/**
	 * Returns the farmer current stage with the primary key or throws a <code>NoSuchFarmerCurrentStageException</code> if it could not be found.
	 *
	 * @param farmerCurrentStageId the primary key of the farmer current stage
	 * @return the farmer current stage
	 * @throws NoSuchFarmerCurrentStageException if a farmer current stage with the primary key could not be found
	 */
	public FarmerCurrentStage findByPrimaryKey(long farmerCurrentStageId)
		throws NoSuchFarmerCurrentStageException;

	/**
	 * Returns the farmer current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmerCurrentStageId the primary key of the farmer current stage
	 * @return the farmer current stage, or <code>null</code> if a farmer current stage with the primary key could not be found
	 */
	public FarmerCurrentStage fetchByPrimaryKey(long farmerCurrentStageId);

	/**
	 * Returns all the farmer current stages.
	 *
	 * @return the farmer current stages
	 */
	public java.util.List<FarmerCurrentStage> findAll();

	/**
	 * Returns a range of all the farmer current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer current stages
	 * @param end the upper bound of the range of farmer current stages (not inclusive)
	 * @return the range of farmer current stages
	 */
	public java.util.List<FarmerCurrentStage> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the farmer current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer current stages
	 * @param end the upper bound of the range of farmer current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farmer current stages
	 */
	public java.util.List<FarmerCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerCurrentStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the farmer current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer current stages
	 * @param end the upper bound of the range of farmer current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farmer current stages
	 */
	public java.util.List<FarmerCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerCurrentStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the farmer current stages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of farmer current stages.
	 *
	 * @return the number of farmer current stages
	 */
	public int countAll();

}