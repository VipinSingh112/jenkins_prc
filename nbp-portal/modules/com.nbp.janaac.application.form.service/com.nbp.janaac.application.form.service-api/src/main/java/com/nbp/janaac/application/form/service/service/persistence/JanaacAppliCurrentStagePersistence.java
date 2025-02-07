/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchJanaacAppliCurrentStageException;
import com.nbp.janaac.application.form.service.model.JanaacAppliCurrentStage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the janaac appli current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JanaacAppliCurrentStageUtil
 * @generated
 */
@ProviderType
public interface JanaacAppliCurrentStagePersistence
	extends BasePersistence<JanaacAppliCurrentStage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JanaacAppliCurrentStageUtil} to access the janaac appli current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the janaac appli current stage where janaacApplicationId = &#63; or throws a <code>NoSuchJanaacAppliCurrentStageException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching janaac appli current stage
	 * @throws NoSuchJanaacAppliCurrentStageException if a matching janaac appli current stage could not be found
	 */
	public JanaacAppliCurrentStage findBygetJanaac_Stage_JAI(
			long janaacApplicationId)
		throws NoSuchJanaacAppliCurrentStageException;

	/**
	 * Returns the janaac appli current stage where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching janaac appli current stage, or <code>null</code> if a matching janaac appli current stage could not be found
	 */
	public JanaacAppliCurrentStage fetchBygetJanaac_Stage_JAI(
		long janaacApplicationId);

	/**
	 * Returns the janaac appli current stage where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac appli current stage, or <code>null</code> if a matching janaac appli current stage could not be found
	 */
	public JanaacAppliCurrentStage fetchBygetJanaac_Stage_JAI(
		long janaacApplicationId, boolean useFinderCache);

	/**
	 * Removes the janaac appli current stage where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the janaac appli current stage that was removed
	 */
	public JanaacAppliCurrentStage removeBygetJanaac_Stage_JAI(
			long janaacApplicationId)
		throws NoSuchJanaacAppliCurrentStageException;

	/**
	 * Returns the number of janaac appli current stages where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching janaac appli current stages
	 */
	public int countBygetJanaac_Stage_JAI(long janaacApplicationId);

	/**
	 * Caches the janaac appli current stage in the entity cache if it is enabled.
	 *
	 * @param janaacAppliCurrentStage the janaac appli current stage
	 */
	public void cacheResult(JanaacAppliCurrentStage janaacAppliCurrentStage);

	/**
	 * Caches the janaac appli current stages in the entity cache if it is enabled.
	 *
	 * @param janaacAppliCurrentStages the janaac appli current stages
	 */
	public void cacheResult(
		java.util.List<JanaacAppliCurrentStage> janaacAppliCurrentStages);

	/**
	 * Creates a new janaac appli current stage with the primary key. Does not add the janaac appli current stage to the database.
	 *
	 * @param janaacAppliCurrentStageId the primary key for the new janaac appli current stage
	 * @return the new janaac appli current stage
	 */
	public JanaacAppliCurrentStage create(long janaacAppliCurrentStageId);

	/**
	 * Removes the janaac appli current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param janaacAppliCurrentStageId the primary key of the janaac appli current stage
	 * @return the janaac appli current stage that was removed
	 * @throws NoSuchJanaacAppliCurrentStageException if a janaac appli current stage with the primary key could not be found
	 */
	public JanaacAppliCurrentStage remove(long janaacAppliCurrentStageId)
		throws NoSuchJanaacAppliCurrentStageException;

	public JanaacAppliCurrentStage updateImpl(
		JanaacAppliCurrentStage janaacAppliCurrentStage);

	/**
	 * Returns the janaac appli current stage with the primary key or throws a <code>NoSuchJanaacAppliCurrentStageException</code> if it could not be found.
	 *
	 * @param janaacAppliCurrentStageId the primary key of the janaac appli current stage
	 * @return the janaac appli current stage
	 * @throws NoSuchJanaacAppliCurrentStageException if a janaac appli current stage with the primary key could not be found
	 */
	public JanaacAppliCurrentStage findByPrimaryKey(
			long janaacAppliCurrentStageId)
		throws NoSuchJanaacAppliCurrentStageException;

	/**
	 * Returns the janaac appli current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param janaacAppliCurrentStageId the primary key of the janaac appli current stage
	 * @return the janaac appli current stage, or <code>null</code> if a janaac appli current stage with the primary key could not be found
	 */
	public JanaacAppliCurrentStage fetchByPrimaryKey(
		long janaacAppliCurrentStageId);

	/**
	 * Returns all the janaac appli current stages.
	 *
	 * @return the janaac appli current stages
	 */
	public java.util.List<JanaacAppliCurrentStage> findAll();

	/**
	 * Returns a range of all the janaac appli current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacAppliCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac appli current stages
	 * @param end the upper bound of the range of janaac appli current stages (not inclusive)
	 * @return the range of janaac appli current stages
	 */
	public java.util.List<JanaacAppliCurrentStage> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the janaac appli current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacAppliCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac appli current stages
	 * @param end the upper bound of the range of janaac appli current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of janaac appli current stages
	 */
	public java.util.List<JanaacAppliCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JanaacAppliCurrentStage> orderByComparator);

	/**
	 * Returns an ordered range of all the janaac appli current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacAppliCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac appli current stages
	 * @param end the upper bound of the range of janaac appli current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of janaac appli current stages
	 */
	public java.util.List<JanaacAppliCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JanaacAppliCurrentStage> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the janaac appli current stages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of janaac appli current stages.
	 *
	 * @return the number of janaac appli current stages
	 */
	public int countAll();

}