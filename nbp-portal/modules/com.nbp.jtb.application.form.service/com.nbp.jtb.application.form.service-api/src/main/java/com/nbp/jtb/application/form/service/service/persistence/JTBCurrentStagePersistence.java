/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.form.service.exception.NoSuchJTBCurrentStageException;
import com.nbp.jtb.application.form.service.model.JTBCurrentStage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the jtb current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JTBCurrentStageUtil
 * @generated
 */
@ProviderType
public interface JTBCurrentStagePersistence
	extends BasePersistence<JTBCurrentStage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JTBCurrentStageUtil} to access the jtb current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the jtb current stage where jtbApplicationId = &#63; or throws a <code>NoSuchJTBCurrentStageException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb current stage
	 * @throws NoSuchJTBCurrentStageException if a matching jtb current stage could not be found
	 */
	public JTBCurrentStage findBygetByJTB_Stage(long jtbApplicationId)
		throws NoSuchJTBCurrentStageException;

	/**
	 * Returns the jtb current stage where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb current stage, or <code>null</code> if a matching jtb current stage could not be found
	 */
	public JTBCurrentStage fetchBygetByJTB_Stage(long jtbApplicationId);

	/**
	 * Returns the jtb current stage where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb current stage, or <code>null</code> if a matching jtb current stage could not be found
	 */
	public JTBCurrentStage fetchBygetByJTB_Stage(
		long jtbApplicationId, boolean useFinderCache);

	/**
	 * Removes the jtb current stage where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the jtb current stage that was removed
	 */
	public JTBCurrentStage removeBygetByJTB_Stage(long jtbApplicationId)
		throws NoSuchJTBCurrentStageException;

	/**
	 * Returns the number of jtb current stages where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb current stages
	 */
	public int countBygetByJTB_Stage(long jtbApplicationId);

	/**
	 * Caches the jtb current stage in the entity cache if it is enabled.
	 *
	 * @param jtbCurrentStage the jtb current stage
	 */
	public void cacheResult(JTBCurrentStage jtbCurrentStage);

	/**
	 * Caches the jtb current stages in the entity cache if it is enabled.
	 *
	 * @param jtbCurrentStages the jtb current stages
	 */
	public void cacheResult(java.util.List<JTBCurrentStage> jtbCurrentStages);

	/**
	 * Creates a new jtb current stage with the primary key. Does not add the jtb current stage to the database.
	 *
	 * @param jTBCurrentStageId the primary key for the new jtb current stage
	 * @return the new jtb current stage
	 */
	public JTBCurrentStage create(long jTBCurrentStageId);

	/**
	 * Removes the jtb current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jTBCurrentStageId the primary key of the jtb current stage
	 * @return the jtb current stage that was removed
	 * @throws NoSuchJTBCurrentStageException if a jtb current stage with the primary key could not be found
	 */
	public JTBCurrentStage remove(long jTBCurrentStageId)
		throws NoSuchJTBCurrentStageException;

	public JTBCurrentStage updateImpl(JTBCurrentStage jtbCurrentStage);

	/**
	 * Returns the jtb current stage with the primary key or throws a <code>NoSuchJTBCurrentStageException</code> if it could not be found.
	 *
	 * @param jTBCurrentStageId the primary key of the jtb current stage
	 * @return the jtb current stage
	 * @throws NoSuchJTBCurrentStageException if a jtb current stage with the primary key could not be found
	 */
	public JTBCurrentStage findByPrimaryKey(long jTBCurrentStageId)
		throws NoSuchJTBCurrentStageException;

	/**
	 * Returns the jtb current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jTBCurrentStageId the primary key of the jtb current stage
	 * @return the jtb current stage, or <code>null</code> if a jtb current stage with the primary key could not be found
	 */
	public JTBCurrentStage fetchByPrimaryKey(long jTBCurrentStageId);

	/**
	 * Returns all the jtb current stages.
	 *
	 * @return the jtb current stages
	 */
	public java.util.List<JTBCurrentStage> findAll();

	/**
	 * Returns a range of all the jtb current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb current stages
	 * @param end the upper bound of the range of jtb current stages (not inclusive)
	 * @return the range of jtb current stages
	 */
	public java.util.List<JTBCurrentStage> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the jtb current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb current stages
	 * @param end the upper bound of the range of jtb current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb current stages
	 */
	public java.util.List<JTBCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JTBCurrentStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jtb current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb current stages
	 * @param end the upper bound of the range of jtb current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb current stages
	 */
	public java.util.List<JTBCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JTBCurrentStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the jtb current stages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of jtb current stages.
	 *
	 * @return the number of jtb current stages
	 */
	public int countAll();

}