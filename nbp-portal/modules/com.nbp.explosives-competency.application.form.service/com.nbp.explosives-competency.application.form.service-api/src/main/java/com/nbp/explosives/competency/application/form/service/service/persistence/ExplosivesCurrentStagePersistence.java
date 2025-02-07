/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.explosives.competency.application.form.service.exception.NoSuchExplosivesCurrentStageException;
import com.nbp.explosives.competency.application.form.service.model.ExplosivesCurrentStage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the explosives current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExplosivesCurrentStageUtil
 * @generated
 */
@ProviderType
public interface ExplosivesCurrentStagePersistence
	extends BasePersistence<ExplosivesCurrentStage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ExplosivesCurrentStageUtil} to access the explosives current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the explosives current stage where explosivesApplicationId = &#63; or throws a <code>NoSuchExplosivesCurrentStageException</code> if it could not be found.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the matching explosives current stage
	 * @throws NoSuchExplosivesCurrentStageException if a matching explosives current stage could not be found
	 */
	public ExplosivesCurrentStage findBygetByExplosive_Stage(
			long explosivesApplicationId)
		throws NoSuchExplosivesCurrentStageException;

	/**
	 * Returns the explosives current stage where explosivesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the matching explosives current stage, or <code>null</code> if a matching explosives current stage could not be found
	 */
	public ExplosivesCurrentStage fetchBygetByExplosive_Stage(
		long explosivesApplicationId);

	/**
	 * Returns the explosives current stage where explosivesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosives current stage, or <code>null</code> if a matching explosives current stage could not be found
	 */
	public ExplosivesCurrentStage fetchBygetByExplosive_Stage(
		long explosivesApplicationId, boolean useFinderCache);

	/**
	 * Removes the explosives current stage where explosivesApplicationId = &#63; from the database.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the explosives current stage that was removed
	 */
	public ExplosivesCurrentStage removeBygetByExplosive_Stage(
			long explosivesApplicationId)
		throws NoSuchExplosivesCurrentStageException;

	/**
	 * Returns the number of explosives current stages where explosivesApplicationId = &#63;.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the number of matching explosives current stages
	 */
	public int countBygetByExplosive_Stage(long explosivesApplicationId);

	/**
	 * Caches the explosives current stage in the entity cache if it is enabled.
	 *
	 * @param explosivesCurrentStage the explosives current stage
	 */
	public void cacheResult(ExplosivesCurrentStage explosivesCurrentStage);

	/**
	 * Caches the explosives current stages in the entity cache if it is enabled.
	 *
	 * @param explosivesCurrentStages the explosives current stages
	 */
	public void cacheResult(
		java.util.List<ExplosivesCurrentStage> explosivesCurrentStages);

	/**
	 * Creates a new explosives current stage with the primary key. Does not add the explosives current stage to the database.
	 *
	 * @param explosiveStageId the primary key for the new explosives current stage
	 * @return the new explosives current stage
	 */
	public ExplosivesCurrentStage create(long explosiveStageId);

	/**
	 * Removes the explosives current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param explosiveStageId the primary key of the explosives current stage
	 * @return the explosives current stage that was removed
	 * @throws NoSuchExplosivesCurrentStageException if a explosives current stage with the primary key could not be found
	 */
	public ExplosivesCurrentStage remove(long explosiveStageId)
		throws NoSuchExplosivesCurrentStageException;

	public ExplosivesCurrentStage updateImpl(
		ExplosivesCurrentStage explosivesCurrentStage);

	/**
	 * Returns the explosives current stage with the primary key or throws a <code>NoSuchExplosivesCurrentStageException</code> if it could not be found.
	 *
	 * @param explosiveStageId the primary key of the explosives current stage
	 * @return the explosives current stage
	 * @throws NoSuchExplosivesCurrentStageException if a explosives current stage with the primary key could not be found
	 */
	public ExplosivesCurrentStage findByPrimaryKey(long explosiveStageId)
		throws NoSuchExplosivesCurrentStageException;

	/**
	 * Returns the explosives current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param explosiveStageId the primary key of the explosives current stage
	 * @return the explosives current stage, or <code>null</code> if a explosives current stage with the primary key could not be found
	 */
	public ExplosivesCurrentStage fetchByPrimaryKey(long explosiveStageId);

	/**
	 * Returns all the explosives current stages.
	 *
	 * @return the explosives current stages
	 */
	public java.util.List<ExplosivesCurrentStage> findAll();

	/**
	 * Returns a range of all the explosives current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosives current stages
	 * @param end the upper bound of the range of explosives current stages (not inclusive)
	 * @return the range of explosives current stages
	 */
	public java.util.List<ExplosivesCurrentStage> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the explosives current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosives current stages
	 * @param end the upper bound of the range of explosives current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of explosives current stages
	 */
	public java.util.List<ExplosivesCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExplosivesCurrentStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the explosives current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosives current stages
	 * @param end the upper bound of the range of explosives current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of explosives current stages
	 */
	public java.util.List<ExplosivesCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExplosivesCurrentStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the explosives current stages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of explosives current stages.
	 *
	 * @return the number of explosives current stages
	 */
	public int countAll();

}