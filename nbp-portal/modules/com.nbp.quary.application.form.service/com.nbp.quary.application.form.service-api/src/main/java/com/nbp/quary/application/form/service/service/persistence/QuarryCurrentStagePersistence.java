/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.quary.application.form.service.exception.NoSuchQuarryCurrentStageException;
import com.nbp.quary.application.form.service.model.QuarryCurrentStage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the quarry current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryCurrentStageUtil
 * @generated
 */
@ProviderType
public interface QuarryCurrentStagePersistence
	extends BasePersistence<QuarryCurrentStage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QuarryCurrentStageUtil} to access the quarry current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the quarry current stage where quarryApplicationId = &#63; or throws a <code>NoSuchQuarryCurrentStageException</code> if it could not be found.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry current stage
	 * @throws NoSuchQuarryCurrentStageException if a matching quarry current stage could not be found
	 */
	public QuarryCurrentStage findBygetQuarry_ById(long quarryApplicationId)
		throws NoSuchQuarryCurrentStageException;

	/**
	 * Returns the quarry current stage where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry current stage, or <code>null</code> if a matching quarry current stage could not be found
	 */
	public QuarryCurrentStage fetchBygetQuarry_ById(long quarryApplicationId);

	/**
	 * Returns the quarry current stage where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry current stage, or <code>null</code> if a matching quarry current stage could not be found
	 */
	public QuarryCurrentStage fetchBygetQuarry_ById(
		long quarryApplicationId, boolean useFinderCache);

	/**
	 * Removes the quarry current stage where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the quarry current stage that was removed
	 */
	public QuarryCurrentStage removeBygetQuarry_ById(long quarryApplicationId)
		throws NoSuchQuarryCurrentStageException;

	/**
	 * Returns the number of quarry current stages where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry current stages
	 */
	public int countBygetQuarry_ById(long quarryApplicationId);

	/**
	 * Returns all the quarry current stages where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry current stages
	 */
	public java.util.List<QuarryCurrentStage> findBygetQuarry_CS_AI(
		long quarryApplicationId);

	/**
	 * Returns a range of all the quarry current stages where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry current stages
	 * @param end the upper bound of the range of quarry current stages (not inclusive)
	 * @return the range of matching quarry current stages
	 */
	public java.util.List<QuarryCurrentStage> findBygetQuarry_CS_AI(
		long quarryApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the quarry current stages where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry current stages
	 * @param end the upper bound of the range of quarry current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry current stages
	 */
	public java.util.List<QuarryCurrentStage> findBygetQuarry_CS_AI(
		long quarryApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryCurrentStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the quarry current stages where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry current stages
	 * @param end the upper bound of the range of quarry current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry current stages
	 */
	public java.util.List<QuarryCurrentStage> findBygetQuarry_CS_AI(
		long quarryApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryCurrentStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first quarry current stage in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry current stage
	 * @throws NoSuchQuarryCurrentStageException if a matching quarry current stage could not be found
	 */
	public QuarryCurrentStage findBygetQuarry_CS_AI_First(
			long quarryApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryCurrentStage>
				orderByComparator)
		throws NoSuchQuarryCurrentStageException;

	/**
	 * Returns the first quarry current stage in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry current stage, or <code>null</code> if a matching quarry current stage could not be found
	 */
	public QuarryCurrentStage fetchBygetQuarry_CS_AI_First(
		long quarryApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryCurrentStage>
			orderByComparator);

	/**
	 * Returns the last quarry current stage in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry current stage
	 * @throws NoSuchQuarryCurrentStageException if a matching quarry current stage could not be found
	 */
	public QuarryCurrentStage findBygetQuarry_CS_AI_Last(
			long quarryApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryCurrentStage>
				orderByComparator)
		throws NoSuchQuarryCurrentStageException;

	/**
	 * Returns the last quarry current stage in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry current stage, or <code>null</code> if a matching quarry current stage could not be found
	 */
	public QuarryCurrentStage fetchBygetQuarry_CS_AI_Last(
		long quarryApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryCurrentStage>
			orderByComparator);

	/**
	 * Returns the quarry current stages before and after the current quarry current stage in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param auarryStageId the primary key of the current quarry current stage
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry current stage
	 * @throws NoSuchQuarryCurrentStageException if a quarry current stage with the primary key could not be found
	 */
	public QuarryCurrentStage[] findBygetQuarry_CS_AI_PrevAndNext(
			long auarryStageId, long quarryApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryCurrentStage>
				orderByComparator)
		throws NoSuchQuarryCurrentStageException;

	/**
	 * Removes all the quarry current stages where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 */
	public void removeBygetQuarry_CS_AI(long quarryApplicationId);

	/**
	 * Returns the number of quarry current stages where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry current stages
	 */
	public int countBygetQuarry_CS_AI(long quarryApplicationId);

	/**
	 * Caches the quarry current stage in the entity cache if it is enabled.
	 *
	 * @param quarryCurrentStage the quarry current stage
	 */
	public void cacheResult(QuarryCurrentStage quarryCurrentStage);

	/**
	 * Caches the quarry current stages in the entity cache if it is enabled.
	 *
	 * @param quarryCurrentStages the quarry current stages
	 */
	public void cacheResult(
		java.util.List<QuarryCurrentStage> quarryCurrentStages);

	/**
	 * Creates a new quarry current stage with the primary key. Does not add the quarry current stage to the database.
	 *
	 * @param auarryStageId the primary key for the new quarry current stage
	 * @return the new quarry current stage
	 */
	public QuarryCurrentStage create(long auarryStageId);

	/**
	 * Removes the quarry current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param auarryStageId the primary key of the quarry current stage
	 * @return the quarry current stage that was removed
	 * @throws NoSuchQuarryCurrentStageException if a quarry current stage with the primary key could not be found
	 */
	public QuarryCurrentStage remove(long auarryStageId)
		throws NoSuchQuarryCurrentStageException;

	public QuarryCurrentStage updateImpl(QuarryCurrentStage quarryCurrentStage);

	/**
	 * Returns the quarry current stage with the primary key or throws a <code>NoSuchQuarryCurrentStageException</code> if it could not be found.
	 *
	 * @param auarryStageId the primary key of the quarry current stage
	 * @return the quarry current stage
	 * @throws NoSuchQuarryCurrentStageException if a quarry current stage with the primary key could not be found
	 */
	public QuarryCurrentStage findByPrimaryKey(long auarryStageId)
		throws NoSuchQuarryCurrentStageException;

	/**
	 * Returns the quarry current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param auarryStageId the primary key of the quarry current stage
	 * @return the quarry current stage, or <code>null</code> if a quarry current stage with the primary key could not be found
	 */
	public QuarryCurrentStage fetchByPrimaryKey(long auarryStageId);

	/**
	 * Returns all the quarry current stages.
	 *
	 * @return the quarry current stages
	 */
	public java.util.List<QuarryCurrentStage> findAll();

	/**
	 * Returns a range of all the quarry current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry current stages
	 * @param end the upper bound of the range of quarry current stages (not inclusive)
	 * @return the range of quarry current stages
	 */
	public java.util.List<QuarryCurrentStage> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the quarry current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry current stages
	 * @param end the upper bound of the range of quarry current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry current stages
	 */
	public java.util.List<QuarryCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryCurrentStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the quarry current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry current stages
	 * @param end the upper bound of the range of quarry current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry current stages
	 */
	public java.util.List<QuarryCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryCurrentStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the quarry current stages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of quarry current stages.
	 *
	 * @return the number of quarry current stages
	 */
	public int countAll();

}