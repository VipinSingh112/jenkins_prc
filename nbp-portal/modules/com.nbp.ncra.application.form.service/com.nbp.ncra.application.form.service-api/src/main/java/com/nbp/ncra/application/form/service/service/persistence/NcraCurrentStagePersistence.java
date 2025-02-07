/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncra.application.form.service.exception.NoSuchNcraCurrentStageException;
import com.nbp.ncra.application.form.service.model.NcraCurrentStage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncra current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcraCurrentStageUtil
 * @generated
 */
@ProviderType
public interface NcraCurrentStagePersistence
	extends BasePersistence<NcraCurrentStage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcraCurrentStageUtil} to access the ncra current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the ncra current stage where ncraApplicationId = &#63; or throws a <code>NoSuchNcraCurrentStageException</code> if it could not be found.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra current stage
	 * @throws NoSuchNcraCurrentStageException if a matching ncra current stage could not be found
	 */
	public NcraCurrentStage findBygetNcraCurrent_By_NCRA_Id(
			long ncraApplicationId)
		throws NoSuchNcraCurrentStageException;

	/**
	 * Returns the ncra current stage where ncraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra current stage, or <code>null</code> if a matching ncra current stage could not be found
	 */
	public NcraCurrentStage fetchBygetNcraCurrent_By_NCRA_Id(
		long ncraApplicationId);

	/**
	 * Returns the ncra current stage where ncraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra current stage, or <code>null</code> if a matching ncra current stage could not be found
	 */
	public NcraCurrentStage fetchBygetNcraCurrent_By_NCRA_Id(
		long ncraApplicationId, boolean useFinderCache);

	/**
	 * Removes the ncra current stage where ncraApplicationId = &#63; from the database.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the ncra current stage that was removed
	 */
	public NcraCurrentStage removeBygetNcraCurrent_By_NCRA_Id(
			long ncraApplicationId)
		throws NoSuchNcraCurrentStageException;

	/**
	 * Returns the number of ncra current stages where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the number of matching ncra current stages
	 */
	public int countBygetNcraCurrent_By_NCRA_Id(long ncraApplicationId);

	/**
	 * Returns all the ncra current stages where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra current stages
	 */
	public java.util.List<NcraCurrentStage> findBygetNCRA_CS_NAI(
		long ncraApplicationId);

	/**
	 * Returns a range of all the ncra current stages where ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra current stages
	 * @param end the upper bound of the range of ncra current stages (not inclusive)
	 * @return the range of matching ncra current stages
	 */
	public java.util.List<NcraCurrentStage> findBygetNCRA_CS_NAI(
		long ncraApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the ncra current stages where ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra current stages
	 * @param end the upper bound of the range of ncra current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra current stages
	 */
	public java.util.List<NcraCurrentStage> findBygetNCRA_CS_NAI(
		long ncraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraCurrentStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncra current stages where ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra current stages
	 * @param end the upper bound of the range of ncra current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra current stages
	 */
	public java.util.List<NcraCurrentStage> findBygetNCRA_CS_NAI(
		long ncraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraCurrentStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncra current stage in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra current stage
	 * @throws NoSuchNcraCurrentStageException if a matching ncra current stage could not be found
	 */
	public NcraCurrentStage findBygetNCRA_CS_NAI_First(
			long ncraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<NcraCurrentStage>
				orderByComparator)
		throws NoSuchNcraCurrentStageException;

	/**
	 * Returns the first ncra current stage in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra current stage, or <code>null</code> if a matching ncra current stage could not be found
	 */
	public NcraCurrentStage fetchBygetNCRA_CS_NAI_First(
		long ncraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<NcraCurrentStage>
			orderByComparator);

	/**
	 * Returns the last ncra current stage in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra current stage
	 * @throws NoSuchNcraCurrentStageException if a matching ncra current stage could not be found
	 */
	public NcraCurrentStage findBygetNCRA_CS_NAI_Last(
			long ncraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<NcraCurrentStage>
				orderByComparator)
		throws NoSuchNcraCurrentStageException;

	/**
	 * Returns the last ncra current stage in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra current stage, or <code>null</code> if a matching ncra current stage could not be found
	 */
	public NcraCurrentStage fetchBygetNCRA_CS_NAI_Last(
		long ncraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<NcraCurrentStage>
			orderByComparator);

	/**
	 * Returns the ncra current stages before and after the current ncra current stage in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraCurrentStageId the primary key of the current ncra current stage
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra current stage
	 * @throws NoSuchNcraCurrentStageException if a ncra current stage with the primary key could not be found
	 */
	public NcraCurrentStage[] findBygetNCRA_CS_NAI_PrevAndNext(
			long ncraCurrentStageId, long ncraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<NcraCurrentStage>
				orderByComparator)
		throws NoSuchNcraCurrentStageException;

	/**
	 * Removes all the ncra current stages where ncraApplicationId = &#63; from the database.
	 *
	 * @param ncraApplicationId the ncra application ID
	 */
	public void removeBygetNCRA_CS_NAI(long ncraApplicationId);

	/**
	 * Returns the number of ncra current stages where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the number of matching ncra current stages
	 */
	public int countBygetNCRA_CS_NAI(long ncraApplicationId);

	/**
	 * Caches the ncra current stage in the entity cache if it is enabled.
	 *
	 * @param ncraCurrentStage the ncra current stage
	 */
	public void cacheResult(NcraCurrentStage ncraCurrentStage);

	/**
	 * Caches the ncra current stages in the entity cache if it is enabled.
	 *
	 * @param ncraCurrentStages the ncra current stages
	 */
	public void cacheResult(java.util.List<NcraCurrentStage> ncraCurrentStages);

	/**
	 * Creates a new ncra current stage with the primary key. Does not add the ncra current stage to the database.
	 *
	 * @param ncraCurrentStageId the primary key for the new ncra current stage
	 * @return the new ncra current stage
	 */
	public NcraCurrentStage create(long ncraCurrentStageId);

	/**
	 * Removes the ncra current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncraCurrentStageId the primary key of the ncra current stage
	 * @return the ncra current stage that was removed
	 * @throws NoSuchNcraCurrentStageException if a ncra current stage with the primary key could not be found
	 */
	public NcraCurrentStage remove(long ncraCurrentStageId)
		throws NoSuchNcraCurrentStageException;

	public NcraCurrentStage updateImpl(NcraCurrentStage ncraCurrentStage);

	/**
	 * Returns the ncra current stage with the primary key or throws a <code>NoSuchNcraCurrentStageException</code> if it could not be found.
	 *
	 * @param ncraCurrentStageId the primary key of the ncra current stage
	 * @return the ncra current stage
	 * @throws NoSuchNcraCurrentStageException if a ncra current stage with the primary key could not be found
	 */
	public NcraCurrentStage findByPrimaryKey(long ncraCurrentStageId)
		throws NoSuchNcraCurrentStageException;

	/**
	 * Returns the ncra current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncraCurrentStageId the primary key of the ncra current stage
	 * @return the ncra current stage, or <code>null</code> if a ncra current stage with the primary key could not be found
	 */
	public NcraCurrentStage fetchByPrimaryKey(long ncraCurrentStageId);

	/**
	 * Returns all the ncra current stages.
	 *
	 * @return the ncra current stages
	 */
	public java.util.List<NcraCurrentStage> findAll();

	/**
	 * Returns a range of all the ncra current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra current stages
	 * @param end the upper bound of the range of ncra current stages (not inclusive)
	 * @return the range of ncra current stages
	 */
	public java.util.List<NcraCurrentStage> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ncra current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra current stages
	 * @param end the upper bound of the range of ncra current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncra current stages
	 */
	public java.util.List<NcraCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraCurrentStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncra current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra current stages
	 * @param end the upper bound of the range of ncra current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncra current stages
	 */
	public java.util.List<NcraCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraCurrentStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncra current stages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncra current stages.
	 *
	 * @return the number of ncra current stages
	 */
	public int countAll();

}