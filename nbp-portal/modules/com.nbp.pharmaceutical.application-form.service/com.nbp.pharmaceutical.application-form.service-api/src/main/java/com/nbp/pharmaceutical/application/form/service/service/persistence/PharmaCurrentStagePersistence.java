/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.pharmaceutical.application.form.service.exception.NoSuchPharmaCurrentStageException;
import com.nbp.pharmaceutical.application.form.service.model.PharmaCurrentStage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the pharma current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaCurrentStageUtil
 * @generated
 */
@ProviderType
public interface PharmaCurrentStagePersistence
	extends BasePersistence<PharmaCurrentStage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PharmaCurrentStageUtil} to access the pharma current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the pharma current stage where pharmaApplicationId = &#63; or throws a <code>NoSuchPharmaCurrentStageException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma current stage
	 * @throws NoSuchPharmaCurrentStageException if a matching pharma current stage could not be found
	 */
	public PharmaCurrentStage findBygetpharmaById(long pharmaApplicationId)
		throws NoSuchPharmaCurrentStageException;

	/**
	 * Returns the pharma current stage where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma current stage, or <code>null</code> if a matching pharma current stage could not be found
	 */
	public PharmaCurrentStage fetchBygetpharmaById(long pharmaApplicationId);

	/**
	 * Returns the pharma current stage where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma current stage, or <code>null</code> if a matching pharma current stage could not be found
	 */
	public PharmaCurrentStage fetchBygetpharmaById(
		long pharmaApplicationId, boolean useFinderCache);

	/**
	 * Removes the pharma current stage where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the pharma current stage that was removed
	 */
	public PharmaCurrentStage removeBygetpharmaById(long pharmaApplicationId)
		throws NoSuchPharmaCurrentStageException;

	/**
	 * Returns the number of pharma current stages where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma current stages
	 */
	public int countBygetpharmaById(long pharmaApplicationId);

	/**
	 * Returns the pharma current stage where pharmaApplicationId = &#63; or throws a <code>NoSuchPharmaCurrentStageException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma current stage
	 * @throws NoSuchPharmaCurrentStageException if a matching pharma current stage could not be found
	 */
	public PharmaCurrentStage findBygetPA_CS_PAI(long pharmaApplicationId)
		throws NoSuchPharmaCurrentStageException;

	/**
	 * Returns the pharma current stage where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma current stage, or <code>null</code> if a matching pharma current stage could not be found
	 */
	public PharmaCurrentStage fetchBygetPA_CS_PAI(long pharmaApplicationId);

	/**
	 * Returns the pharma current stage where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma current stage, or <code>null</code> if a matching pharma current stage could not be found
	 */
	public PharmaCurrentStage fetchBygetPA_CS_PAI(
		long pharmaApplicationId, boolean useFinderCache);

	/**
	 * Removes the pharma current stage where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the pharma current stage that was removed
	 */
	public PharmaCurrentStage removeBygetPA_CS_PAI(long pharmaApplicationId)
		throws NoSuchPharmaCurrentStageException;

	/**
	 * Returns the number of pharma current stages where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma current stages
	 */
	public int countBygetPA_CS_PAI(long pharmaApplicationId);

	/**
	 * Caches the pharma current stage in the entity cache if it is enabled.
	 *
	 * @param pharmaCurrentStage the pharma current stage
	 */
	public void cacheResult(PharmaCurrentStage pharmaCurrentStage);

	/**
	 * Caches the pharma current stages in the entity cache if it is enabled.
	 *
	 * @param pharmaCurrentStages the pharma current stages
	 */
	public void cacheResult(
		java.util.List<PharmaCurrentStage> pharmaCurrentStages);

	/**
	 * Creates a new pharma current stage with the primary key. Does not add the pharma current stage to the database.
	 *
	 * @param pharmaCurrentStageId the primary key for the new pharma current stage
	 * @return the new pharma current stage
	 */
	public PharmaCurrentStage create(long pharmaCurrentStageId);

	/**
	 * Removes the pharma current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaCurrentStageId the primary key of the pharma current stage
	 * @return the pharma current stage that was removed
	 * @throws NoSuchPharmaCurrentStageException if a pharma current stage with the primary key could not be found
	 */
	public PharmaCurrentStage remove(long pharmaCurrentStageId)
		throws NoSuchPharmaCurrentStageException;

	public PharmaCurrentStage updateImpl(PharmaCurrentStage pharmaCurrentStage);

	/**
	 * Returns the pharma current stage with the primary key or throws a <code>NoSuchPharmaCurrentStageException</code> if it could not be found.
	 *
	 * @param pharmaCurrentStageId the primary key of the pharma current stage
	 * @return the pharma current stage
	 * @throws NoSuchPharmaCurrentStageException if a pharma current stage with the primary key could not be found
	 */
	public PharmaCurrentStage findByPrimaryKey(long pharmaCurrentStageId)
		throws NoSuchPharmaCurrentStageException;

	/**
	 * Returns the pharma current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaCurrentStageId the primary key of the pharma current stage
	 * @return the pharma current stage, or <code>null</code> if a pharma current stage with the primary key could not be found
	 */
	public PharmaCurrentStage fetchByPrimaryKey(long pharmaCurrentStageId);

	/**
	 * Returns all the pharma current stages.
	 *
	 * @return the pharma current stages
	 */
	public java.util.List<PharmaCurrentStage> findAll();

	/**
	 * Returns a range of all the pharma current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma current stages
	 * @param end the upper bound of the range of pharma current stages (not inclusive)
	 * @return the range of pharma current stages
	 */
	public java.util.List<PharmaCurrentStage> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the pharma current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma current stages
	 * @param end the upper bound of the range of pharma current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma current stages
	 */
	public java.util.List<PharmaCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaCurrentStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the pharma current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma current stages
	 * @param end the upper bound of the range of pharma current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma current stages
	 */
	public java.util.List<PharmaCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaCurrentStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the pharma current stages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of pharma current stages.
	 *
	 * @return the number of pharma current stages
	 */
	public int countAll();

}