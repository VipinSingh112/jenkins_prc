/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence;

import com.agriculture.application.form.service.exception.NoSuchAgriApplicationCurrentStageException;
import com.agriculture.application.form.service.model.AgriApplicationCurrentStage;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the agri application current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgriApplicationCurrentStageUtil
 * @generated
 */
@ProviderType
public interface AgriApplicationCurrentStagePersistence
	extends BasePersistence<AgriApplicationCurrentStage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AgriApplicationCurrentStageUtil} to access the agri application current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the agri application current stage where agricultureApplicationId = &#63; or throws a <code>NoSuchAgriApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agri application current stage
	 * @throws NoSuchAgriApplicationCurrentStageException if a matching agri application current stage could not be found
	 */
	public AgriApplicationCurrentStage findBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgriApplicationCurrentStageException;

	/**
	 * Returns the agri application current stage where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agri application current stage, or <code>null</code> if a matching agri application current stage could not be found
	 */
	public AgriApplicationCurrentStage fetchBygetAgricultureById(
		long agricultureApplicationId);

	/**
	 * Returns the agri application current stage where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agri application current stage, or <code>null</code> if a matching agri application current stage could not be found
	 */
	public AgriApplicationCurrentStage fetchBygetAgricultureById(
		long agricultureApplicationId, boolean useFinderCache);

	/**
	 * Removes the agri application current stage where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agri application current stage that was removed
	 */
	public AgriApplicationCurrentStage removeBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgriApplicationCurrentStageException;

	/**
	 * Returns the number of agri application current stages where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agri application current stages
	 */
	public int countBygetAgricultureById(long agricultureApplicationId);

	/**
	 * Returns the agri application current stage where agricultureApplicationId = &#63; or throws a <code>NoSuchAgriApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agri application current stage
	 * @throws NoSuchAgriApplicationCurrentStageException if a matching agri application current stage could not be found
	 */
	public AgriApplicationCurrentStage findBygetAA_Stage_AAI(
			long agricultureApplicationId)
		throws NoSuchAgriApplicationCurrentStageException;

	/**
	 * Returns the agri application current stage where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agri application current stage, or <code>null</code> if a matching agri application current stage could not be found
	 */
	public AgriApplicationCurrentStage fetchBygetAA_Stage_AAI(
		long agricultureApplicationId);

	/**
	 * Returns the agri application current stage where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agri application current stage, or <code>null</code> if a matching agri application current stage could not be found
	 */
	public AgriApplicationCurrentStage fetchBygetAA_Stage_AAI(
		long agricultureApplicationId, boolean useFinderCache);

	/**
	 * Removes the agri application current stage where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agri application current stage that was removed
	 */
	public AgriApplicationCurrentStage removeBygetAA_Stage_AAI(
			long agricultureApplicationId)
		throws NoSuchAgriApplicationCurrentStageException;

	/**
	 * Returns the number of agri application current stages where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agri application current stages
	 */
	public int countBygetAA_Stage_AAI(long agricultureApplicationId);

	/**
	 * Caches the agri application current stage in the entity cache if it is enabled.
	 *
	 * @param agriApplicationCurrentStage the agri application current stage
	 */
	public void cacheResult(
		AgriApplicationCurrentStage agriApplicationCurrentStage);

	/**
	 * Caches the agri application current stages in the entity cache if it is enabled.
	 *
	 * @param agriApplicationCurrentStages the agri application current stages
	 */
	public void cacheResult(
		java.util.List<AgriApplicationCurrentStage>
			agriApplicationCurrentStages);

	/**
	 * Creates a new agri application current stage with the primary key. Does not add the agri application current stage to the database.
	 *
	 * @param agriApplicationCurrentStageId the primary key for the new agri application current stage
	 * @return the new agri application current stage
	 */
	public AgriApplicationCurrentStage create(
		long agriApplicationCurrentStageId);

	/**
	 * Removes the agri application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agriApplicationCurrentStageId the primary key of the agri application current stage
	 * @return the agri application current stage that was removed
	 * @throws NoSuchAgriApplicationCurrentStageException if a agri application current stage with the primary key could not be found
	 */
	public AgriApplicationCurrentStage remove(
			long agriApplicationCurrentStageId)
		throws NoSuchAgriApplicationCurrentStageException;

	public AgriApplicationCurrentStage updateImpl(
		AgriApplicationCurrentStage agriApplicationCurrentStage);

	/**
	 * Returns the agri application current stage with the primary key or throws a <code>NoSuchAgriApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param agriApplicationCurrentStageId the primary key of the agri application current stage
	 * @return the agri application current stage
	 * @throws NoSuchAgriApplicationCurrentStageException if a agri application current stage with the primary key could not be found
	 */
	public AgriApplicationCurrentStage findByPrimaryKey(
			long agriApplicationCurrentStageId)
		throws NoSuchAgriApplicationCurrentStageException;

	/**
	 * Returns the agri application current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agriApplicationCurrentStageId the primary key of the agri application current stage
	 * @return the agri application current stage, or <code>null</code> if a agri application current stage with the primary key could not be found
	 */
	public AgriApplicationCurrentStage fetchByPrimaryKey(
		long agriApplicationCurrentStageId);

	/**
	 * Returns all the agri application current stages.
	 *
	 * @return the agri application current stages
	 */
	public java.util.List<AgriApplicationCurrentStage> findAll();

	/**
	 * Returns a range of all the agri application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agri application current stages
	 * @param end the upper bound of the range of agri application current stages (not inclusive)
	 * @return the range of agri application current stages
	 */
	public java.util.List<AgriApplicationCurrentStage> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the agri application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agri application current stages
	 * @param end the upper bound of the range of agri application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agri application current stages
	 */
	public java.util.List<AgriApplicationCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AgriApplicationCurrentStage> orderByComparator);

	/**
	 * Returns an ordered range of all the agri application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agri application current stages
	 * @param end the upper bound of the range of agri application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agri application current stages
	 */
	public java.util.List<AgriApplicationCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AgriApplicationCurrentStage> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the agri application current stages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of agri application current stages.
	 *
	 * @return the number of agri application current stages
	 */
	public int countAll();

}