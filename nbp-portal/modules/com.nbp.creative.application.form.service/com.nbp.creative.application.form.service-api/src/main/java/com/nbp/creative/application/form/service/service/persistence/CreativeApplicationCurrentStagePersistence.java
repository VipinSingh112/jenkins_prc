/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.creative.application.form.service.exception.NoSuchCreativeApplicationCurrentStageException;
import com.nbp.creative.application.form.service.model.CreativeApplicationCurrentStage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the creative application current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeApplicationCurrentStageUtil
 * @generated
 */
@ProviderType
public interface CreativeApplicationCurrentStagePersistence
	extends BasePersistence<CreativeApplicationCurrentStage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CreativeApplicationCurrentStageUtil} to access the creative application current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the creative application current stage where CreativeApplicationId = &#63; or throws a <code>NoSuchCreativeApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative application current stage
	 * @throws NoSuchCreativeApplicationCurrentStageException if a matching creative application current stage could not be found
	 */
	public CreativeApplicationCurrentStage findBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeApplicationCurrentStageException;

	/**
	 * Returns the creative application current stage where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative application current stage, or <code>null</code> if a matching creative application current stage could not be found
	 */
	public CreativeApplicationCurrentStage fetchBygetCreativeById(
		long CreativeApplicationId);

	/**
	 * Returns the creative application current stage where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative application current stage, or <code>null</code> if a matching creative application current stage could not be found
	 */
	public CreativeApplicationCurrentStage fetchBygetCreativeById(
		long CreativeApplicationId, boolean useFinderCache);

	/**
	 * Removes the creative application current stage where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the creative application current stage that was removed
	 */
	public CreativeApplicationCurrentStage removeBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeApplicationCurrentStageException;

	/**
	 * Returns the number of creative application current stages where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative application current stages
	 */
	public int countBygetCreativeById(long CreativeApplicationId);

	/**
	 * Returns the creative application current stage where CreativeApplicationId = &#63; or throws a <code>NoSuchCreativeApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative application current stage
	 * @throws NoSuchCreativeApplicationCurrentStageException if a matching creative application current stage could not be found
	 */
	public CreativeApplicationCurrentStage findBygetCA_Stage_CAI(
			long CreativeApplicationId)
		throws NoSuchCreativeApplicationCurrentStageException;

	/**
	 * Returns the creative application current stage where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative application current stage, or <code>null</code> if a matching creative application current stage could not be found
	 */
	public CreativeApplicationCurrentStage fetchBygetCA_Stage_CAI(
		long CreativeApplicationId);

	/**
	 * Returns the creative application current stage where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative application current stage, or <code>null</code> if a matching creative application current stage could not be found
	 */
	public CreativeApplicationCurrentStage fetchBygetCA_Stage_CAI(
		long CreativeApplicationId, boolean useFinderCache);

	/**
	 * Removes the creative application current stage where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the creative application current stage that was removed
	 */
	public CreativeApplicationCurrentStage removeBygetCA_Stage_CAI(
			long CreativeApplicationId)
		throws NoSuchCreativeApplicationCurrentStageException;

	/**
	 * Returns the number of creative application current stages where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative application current stages
	 */
	public int countBygetCA_Stage_CAI(long CreativeApplicationId);

	/**
	 * Caches the creative application current stage in the entity cache if it is enabled.
	 *
	 * @param creativeApplicationCurrentStage the creative application current stage
	 */
	public void cacheResult(
		CreativeApplicationCurrentStage creativeApplicationCurrentStage);

	/**
	 * Caches the creative application current stages in the entity cache if it is enabled.
	 *
	 * @param creativeApplicationCurrentStages the creative application current stages
	 */
	public void cacheResult(
		java.util.List<CreativeApplicationCurrentStage>
			creativeApplicationCurrentStages);

	/**
	 * Creates a new creative application current stage with the primary key. Does not add the creative application current stage to the database.
	 *
	 * @param creativeAppliCurrentStageId the primary key for the new creative application current stage
	 * @return the new creative application current stage
	 */
	public CreativeApplicationCurrentStage create(
		long creativeAppliCurrentStageId);

	/**
	 * Removes the creative application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeAppliCurrentStageId the primary key of the creative application current stage
	 * @return the creative application current stage that was removed
	 * @throws NoSuchCreativeApplicationCurrentStageException if a creative application current stage with the primary key could not be found
	 */
	public CreativeApplicationCurrentStage remove(
			long creativeAppliCurrentStageId)
		throws NoSuchCreativeApplicationCurrentStageException;

	public CreativeApplicationCurrentStage updateImpl(
		CreativeApplicationCurrentStage creativeApplicationCurrentStage);

	/**
	 * Returns the creative application current stage with the primary key or throws a <code>NoSuchCreativeApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param creativeAppliCurrentStageId the primary key of the creative application current stage
	 * @return the creative application current stage
	 * @throws NoSuchCreativeApplicationCurrentStageException if a creative application current stage with the primary key could not be found
	 */
	public CreativeApplicationCurrentStage findByPrimaryKey(
			long creativeAppliCurrentStageId)
		throws NoSuchCreativeApplicationCurrentStageException;

	/**
	 * Returns the creative application current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeAppliCurrentStageId the primary key of the creative application current stage
	 * @return the creative application current stage, or <code>null</code> if a creative application current stage with the primary key could not be found
	 */
	public CreativeApplicationCurrentStage fetchByPrimaryKey(
		long creativeAppliCurrentStageId);

	/**
	 * Returns all the creative application current stages.
	 *
	 * @return the creative application current stages
	 */
	public java.util.List<CreativeApplicationCurrentStage> findAll();

	/**
	 * Returns a range of all the creative application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative application current stages
	 * @param end the upper bound of the range of creative application current stages (not inclusive)
	 * @return the range of creative application current stages
	 */
	public java.util.List<CreativeApplicationCurrentStage> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the creative application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative application current stages
	 * @param end the upper bound of the range of creative application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative application current stages
	 */
	public java.util.List<CreativeApplicationCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeApplicationCurrentStage> orderByComparator);

	/**
	 * Returns an ordered range of all the creative application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative application current stages
	 * @param end the upper bound of the range of creative application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative application current stages
	 */
	public java.util.List<CreativeApplicationCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeApplicationCurrentStage> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the creative application current stages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of creative application current stages.
	 *
	 * @return the number of creative application current stages
	 */
	public int countAll();

}