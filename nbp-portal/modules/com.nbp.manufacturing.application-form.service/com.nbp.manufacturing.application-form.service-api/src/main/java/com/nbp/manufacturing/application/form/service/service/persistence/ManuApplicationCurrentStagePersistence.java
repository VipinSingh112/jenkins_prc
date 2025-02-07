/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.manufacturing.application.form.service.exception.NoSuchManuApplicationCurrentStageException;
import com.nbp.manufacturing.application.form.service.model.ManuApplicationCurrentStage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the manu application current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManuApplicationCurrentStageUtil
 * @generated
 */
@ProviderType
public interface ManuApplicationCurrentStagePersistence
	extends BasePersistence<ManuApplicationCurrentStage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ManuApplicationCurrentStageUtil} to access the manu application current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the manu application current stage where manufacturingApplicationId = &#63; or throws a <code>NoSuchManuApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu application current stage
	 * @throws NoSuchManuApplicationCurrentStageException if a matching manu application current stage could not be found
	 */
	public ManuApplicationCurrentStage findBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchManuApplicationCurrentStageException;

	/**
	 * Returns the manu application current stage where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu application current stage, or <code>null</code> if a matching manu application current stage could not be found
	 */
	public ManuApplicationCurrentStage fetchBygetManufactureById(
		long manufacturingApplicationId);

	/**
	 * Returns the manu application current stage where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manu application current stage, or <code>null</code> if a matching manu application current stage could not be found
	 */
	public ManuApplicationCurrentStage fetchBygetManufactureById(
		long manufacturingApplicationId, boolean useFinderCache);

	/**
	 * Removes the manu application current stage where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the manu application current stage that was removed
	 */
	public ManuApplicationCurrentStage removeBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchManuApplicationCurrentStageException;

	/**
	 * Returns the number of manu application current stages where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu application current stages
	 */
	public int countBygetManufactureById(long manufacturingApplicationId);

	/**
	 * Returns all the manu application current stages where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu application current stages
	 */
	public java.util.List<ManuApplicationCurrentStage> findBygetMA_CS_MAI(
		long manufacturingApplicationId);

	/**
	 * Returns a range of all the manu application current stages where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu application current stages
	 * @param end the upper bound of the range of manu application current stages (not inclusive)
	 * @return the range of matching manu application current stages
	 */
	public java.util.List<ManuApplicationCurrentStage> findBygetMA_CS_MAI(
		long manufacturingApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the manu application current stages where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu application current stages
	 * @param end the upper bound of the range of manu application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu application current stages
	 */
	public java.util.List<ManuApplicationCurrentStage> findBygetMA_CS_MAI(
		long manufacturingApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManuApplicationCurrentStage> orderByComparator);

	/**
	 * Returns an ordered range of all the manu application current stages where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu application current stages
	 * @param end the upper bound of the range of manu application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu application current stages
	 */
	public java.util.List<ManuApplicationCurrentStage> findBygetMA_CS_MAI(
		long manufacturingApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManuApplicationCurrentStage> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first manu application current stage in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu application current stage
	 * @throws NoSuchManuApplicationCurrentStageException if a matching manu application current stage could not be found
	 */
	public ManuApplicationCurrentStage findBygetMA_CS_MAI_First(
			long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManuApplicationCurrentStage> orderByComparator)
		throws NoSuchManuApplicationCurrentStageException;

	/**
	 * Returns the first manu application current stage in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu application current stage, or <code>null</code> if a matching manu application current stage could not be found
	 */
	public ManuApplicationCurrentStage fetchBygetMA_CS_MAI_First(
		long manufacturingApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManuApplicationCurrentStage> orderByComparator);

	/**
	 * Returns the last manu application current stage in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu application current stage
	 * @throws NoSuchManuApplicationCurrentStageException if a matching manu application current stage could not be found
	 */
	public ManuApplicationCurrentStage findBygetMA_CS_MAI_Last(
			long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManuApplicationCurrentStage> orderByComparator)
		throws NoSuchManuApplicationCurrentStageException;

	/**
	 * Returns the last manu application current stage in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu application current stage, or <code>null</code> if a matching manu application current stage could not be found
	 */
	public ManuApplicationCurrentStage fetchBygetMA_CS_MAI_Last(
		long manufacturingApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManuApplicationCurrentStage> orderByComparator);

	/**
	 * Returns the manu application current stages before and after the current manu application current stage in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manuApplicationCuurentStageId the primary key of the current manu application current stage
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu application current stage
	 * @throws NoSuchManuApplicationCurrentStageException if a manu application current stage with the primary key could not be found
	 */
	public ManuApplicationCurrentStage[] findBygetMA_CS_MAI_PrevAndNext(
			long manuApplicationCuurentStageId, long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ManuApplicationCurrentStage> orderByComparator)
		throws NoSuchManuApplicationCurrentStageException;

	/**
	 * Removes all the manu application current stages where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	public void removeBygetMA_CS_MAI(long manufacturingApplicationId);

	/**
	 * Returns the number of manu application current stages where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu application current stages
	 */
	public int countBygetMA_CS_MAI(long manufacturingApplicationId);

	/**
	 * Caches the manu application current stage in the entity cache if it is enabled.
	 *
	 * @param manuApplicationCurrentStage the manu application current stage
	 */
	public void cacheResult(
		ManuApplicationCurrentStage manuApplicationCurrentStage);

	/**
	 * Caches the manu application current stages in the entity cache if it is enabled.
	 *
	 * @param manuApplicationCurrentStages the manu application current stages
	 */
	public void cacheResult(
		java.util.List<ManuApplicationCurrentStage>
			manuApplicationCurrentStages);

	/**
	 * Creates a new manu application current stage with the primary key. Does not add the manu application current stage to the database.
	 *
	 * @param manuApplicationCuurentStageId the primary key for the new manu application current stage
	 * @return the new manu application current stage
	 */
	public ManuApplicationCurrentStage create(
		long manuApplicationCuurentStageId);

	/**
	 * Removes the manu application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manuApplicationCuurentStageId the primary key of the manu application current stage
	 * @return the manu application current stage that was removed
	 * @throws NoSuchManuApplicationCurrentStageException if a manu application current stage with the primary key could not be found
	 */
	public ManuApplicationCurrentStage remove(
			long manuApplicationCuurentStageId)
		throws NoSuchManuApplicationCurrentStageException;

	public ManuApplicationCurrentStage updateImpl(
		ManuApplicationCurrentStage manuApplicationCurrentStage);

	/**
	 * Returns the manu application current stage with the primary key or throws a <code>NoSuchManuApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param manuApplicationCuurentStageId the primary key of the manu application current stage
	 * @return the manu application current stage
	 * @throws NoSuchManuApplicationCurrentStageException if a manu application current stage with the primary key could not be found
	 */
	public ManuApplicationCurrentStage findByPrimaryKey(
			long manuApplicationCuurentStageId)
		throws NoSuchManuApplicationCurrentStageException;

	/**
	 * Returns the manu application current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manuApplicationCuurentStageId the primary key of the manu application current stage
	 * @return the manu application current stage, or <code>null</code> if a manu application current stage with the primary key could not be found
	 */
	public ManuApplicationCurrentStage fetchByPrimaryKey(
		long manuApplicationCuurentStageId);

	/**
	 * Returns all the manu application current stages.
	 *
	 * @return the manu application current stages
	 */
	public java.util.List<ManuApplicationCurrentStage> findAll();

	/**
	 * Returns a range of all the manu application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu application current stages
	 * @param end the upper bound of the range of manu application current stages (not inclusive)
	 * @return the range of manu application current stages
	 */
	public java.util.List<ManuApplicationCurrentStage> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the manu application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu application current stages
	 * @param end the upper bound of the range of manu application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manu application current stages
	 */
	public java.util.List<ManuApplicationCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManuApplicationCurrentStage> orderByComparator);

	/**
	 * Returns an ordered range of all the manu application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu application current stages
	 * @param end the upper bound of the range of manu application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manu application current stages
	 */
	public java.util.List<ManuApplicationCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManuApplicationCurrentStage> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the manu application current stages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of manu application current stages.
	 *
	 * @return the number of manu application current stages
	 */
	public int countAll();

}