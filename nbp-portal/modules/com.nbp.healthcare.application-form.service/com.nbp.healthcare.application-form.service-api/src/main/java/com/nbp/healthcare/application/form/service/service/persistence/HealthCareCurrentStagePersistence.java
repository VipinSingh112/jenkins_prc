/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.healthcare.application.form.service.exception.NoSuchHealthCareCurrentStageException;
import com.nbp.healthcare.application.form.service.model.HealthCareCurrentStage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the health care current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareCurrentStageUtil
 * @generated
 */
@ProviderType
public interface HealthCareCurrentStagePersistence
	extends BasePersistence<HealthCareCurrentStage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HealthCareCurrentStageUtil} to access the health care current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the health care current stage where healthCareApplicationId = &#63; or throws a <code>NoSuchHealthCareCurrentStageException</code> if it could not be found.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care current stage
	 * @throws NoSuchHealthCareCurrentStageException if a matching health care current stage could not be found
	 */
	public HealthCareCurrentStage findBygethealthById(
			long healthCareApplicationId)
		throws NoSuchHealthCareCurrentStageException;

	/**
	 * Returns the health care current stage where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care current stage, or <code>null</code> if a matching health care current stage could not be found
	 */
	public HealthCareCurrentStage fetchBygethealthById(
		long healthCareApplicationId);

	/**
	 * Returns the health care current stage where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care current stage, or <code>null</code> if a matching health care current stage could not be found
	 */
	public HealthCareCurrentStage fetchBygethealthById(
		long healthCareApplicationId, boolean useFinderCache);

	/**
	 * Removes the health care current stage where healthCareApplicationId = &#63; from the database.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the health care current stage that was removed
	 */
	public HealthCareCurrentStage removeBygethealthById(
			long healthCareApplicationId)
		throws NoSuchHealthCareCurrentStageException;

	/**
	 * Returns the number of health care current stages where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the number of matching health care current stages
	 */
	public int countBygethealthById(long healthCareApplicationId);

	/**
	 * Caches the health care current stage in the entity cache if it is enabled.
	 *
	 * @param healthCareCurrentStage the health care current stage
	 */
	public void cacheResult(HealthCareCurrentStage healthCareCurrentStage);

	/**
	 * Caches the health care current stages in the entity cache if it is enabled.
	 *
	 * @param healthCareCurrentStages the health care current stages
	 */
	public void cacheResult(
		java.util.List<HealthCareCurrentStage> healthCareCurrentStages);

	/**
	 * Creates a new health care current stage with the primary key. Does not add the health care current stage to the database.
	 *
	 * @param HealthCareCurrentStageId the primary key for the new health care current stage
	 * @return the new health care current stage
	 */
	public HealthCareCurrentStage create(long HealthCareCurrentStageId);

	/**
	 * Removes the health care current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param HealthCareCurrentStageId the primary key of the health care current stage
	 * @return the health care current stage that was removed
	 * @throws NoSuchHealthCareCurrentStageException if a health care current stage with the primary key could not be found
	 */
	public HealthCareCurrentStage remove(long HealthCareCurrentStageId)
		throws NoSuchHealthCareCurrentStageException;

	public HealthCareCurrentStage updateImpl(
		HealthCareCurrentStage healthCareCurrentStage);

	/**
	 * Returns the health care current stage with the primary key or throws a <code>NoSuchHealthCareCurrentStageException</code> if it could not be found.
	 *
	 * @param HealthCareCurrentStageId the primary key of the health care current stage
	 * @return the health care current stage
	 * @throws NoSuchHealthCareCurrentStageException if a health care current stage with the primary key could not be found
	 */
	public HealthCareCurrentStage findByPrimaryKey(
			long HealthCareCurrentStageId)
		throws NoSuchHealthCareCurrentStageException;

	/**
	 * Returns the health care current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param HealthCareCurrentStageId the primary key of the health care current stage
	 * @return the health care current stage, or <code>null</code> if a health care current stage with the primary key could not be found
	 */
	public HealthCareCurrentStage fetchByPrimaryKey(
		long HealthCareCurrentStageId);

	/**
	 * Returns all the health care current stages.
	 *
	 * @return the health care current stages
	 */
	public java.util.List<HealthCareCurrentStage> findAll();

	/**
	 * Returns a range of all the health care current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care current stages
	 * @param end the upper bound of the range of health care current stages (not inclusive)
	 * @return the range of health care current stages
	 */
	public java.util.List<HealthCareCurrentStage> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the health care current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care current stages
	 * @param end the upper bound of the range of health care current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health care current stages
	 */
	public java.util.List<HealthCareCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HealthCareCurrentStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the health care current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care current stages
	 * @param end the upper bound of the range of health care current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health care current stages
	 */
	public java.util.List<HealthCareCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HealthCareCurrentStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the health care current stages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of health care current stages.
	 *
	 * @return the number of health care current stages
	 */
	public int countAll();

}