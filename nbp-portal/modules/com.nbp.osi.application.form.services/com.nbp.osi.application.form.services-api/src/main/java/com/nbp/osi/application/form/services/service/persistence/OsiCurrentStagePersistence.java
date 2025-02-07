/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.application.form.services.exception.NoSuchOsiCurrentStageException;
import com.nbp.osi.application.form.services.model.OsiCurrentStage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiCurrentStageUtil
 * @generated
 */
@ProviderType
public interface OsiCurrentStagePersistence
	extends BasePersistence<OsiCurrentStage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OsiCurrentStageUtil} to access the osi current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the osi current stage where osiApplicationId = &#63; or throws a <code>NoSuchOsiCurrentStageException</code> if it could not be found.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching osi current stage
	 * @throws NoSuchOsiCurrentStageException if a matching osi current stage could not be found
	 */
	public OsiCurrentStage findBygetOsiById(long osiApplicationId)
		throws NoSuchOsiCurrentStageException;

	/**
	 * Returns the osi current stage where osiApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching osi current stage, or <code>null</code> if a matching osi current stage could not be found
	 */
	public OsiCurrentStage fetchBygetOsiById(long osiApplicationId);

	/**
	 * Returns the osi current stage where osiApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi current stage, or <code>null</code> if a matching osi current stage could not be found
	 */
	public OsiCurrentStage fetchBygetOsiById(
		long osiApplicationId, boolean useFinderCache);

	/**
	 * Removes the osi current stage where osiApplicationId = &#63; from the database.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the osi current stage that was removed
	 */
	public OsiCurrentStage removeBygetOsiById(long osiApplicationId)
		throws NoSuchOsiCurrentStageException;

	/**
	 * Returns the number of osi current stages where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the number of matching osi current stages
	 */
	public int countBygetOsiById(long osiApplicationId);

	/**
	 * Caches the osi current stage in the entity cache if it is enabled.
	 *
	 * @param osiCurrentStage the osi current stage
	 */
	public void cacheResult(OsiCurrentStage osiCurrentStage);

	/**
	 * Caches the osi current stages in the entity cache if it is enabled.
	 *
	 * @param osiCurrentStages the osi current stages
	 */
	public void cacheResult(java.util.List<OsiCurrentStage> osiCurrentStages);

	/**
	 * Creates a new osi current stage with the primary key. Does not add the osi current stage to the database.
	 *
	 * @param osiCurrentStageId the primary key for the new osi current stage
	 * @return the new osi current stage
	 */
	public OsiCurrentStage create(long osiCurrentStageId);

	/**
	 * Removes the osi current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiCurrentStageId the primary key of the osi current stage
	 * @return the osi current stage that was removed
	 * @throws NoSuchOsiCurrentStageException if a osi current stage with the primary key could not be found
	 */
	public OsiCurrentStage remove(long osiCurrentStageId)
		throws NoSuchOsiCurrentStageException;

	public OsiCurrentStage updateImpl(OsiCurrentStage osiCurrentStage);

	/**
	 * Returns the osi current stage with the primary key or throws a <code>NoSuchOsiCurrentStageException</code> if it could not be found.
	 *
	 * @param osiCurrentStageId the primary key of the osi current stage
	 * @return the osi current stage
	 * @throws NoSuchOsiCurrentStageException if a osi current stage with the primary key could not be found
	 */
	public OsiCurrentStage findByPrimaryKey(long osiCurrentStageId)
		throws NoSuchOsiCurrentStageException;

	/**
	 * Returns the osi current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiCurrentStageId the primary key of the osi current stage
	 * @return the osi current stage, or <code>null</code> if a osi current stage with the primary key could not be found
	 */
	public OsiCurrentStage fetchByPrimaryKey(long osiCurrentStageId);

	/**
	 * Returns all the osi current stages.
	 *
	 * @return the osi current stages
	 */
	public java.util.List<OsiCurrentStage> findAll();

	/**
	 * Returns a range of all the osi current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi current stages
	 * @param end the upper bound of the range of osi current stages (not inclusive)
	 * @return the range of osi current stages
	 */
	public java.util.List<OsiCurrentStage> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the osi current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi current stages
	 * @param end the upper bound of the range of osi current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi current stages
	 */
	public java.util.List<OsiCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiCurrentStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi current stages
	 * @param end the upper bound of the range of osi current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi current stages
	 */
	public java.util.List<OsiCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiCurrentStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi current stages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi current stages.
	 *
	 * @return the number of osi current stages
	 */
	public int countAll();

}