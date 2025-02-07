/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchOsiInsolvencyCurrentStageException;
import com.nbp.osi.insolvency.application.form.services.model.OsiInsolvencyCurrentStage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi insolvency current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvencyCurrentStageUtil
 * @generated
 */
@ProviderType
public interface OsiInsolvencyCurrentStagePersistence
	extends BasePersistence<OsiInsolvencyCurrentStage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OsiInsolvencyCurrentStageUtil} to access the osi insolvency current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the osi insolvency current stage where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiInsolvencyCurrentStageException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolvency current stage
	 * @throws NoSuchOsiInsolvencyCurrentStageException if a matching osi insolvency current stage could not be found
	 */
	public OsiInsolvencyCurrentStage findBygetOsiInsolvenyById(
			long osiInsolvencyId)
		throws NoSuchOsiInsolvencyCurrentStageException;

	/**
	 * Returns the osi insolvency current stage where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolvency current stage, or <code>null</code> if a matching osi insolvency current stage could not be found
	 */
	public OsiInsolvencyCurrentStage fetchBygetOsiInsolvenyById(
		long osiInsolvencyId);

	/**
	 * Returns the osi insolvency current stage where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency current stage, or <code>null</code> if a matching osi insolvency current stage could not be found
	 */
	public OsiInsolvencyCurrentStage fetchBygetOsiInsolvenyById(
		long osiInsolvencyId, boolean useFinderCache);

	/**
	 * Removes the osi insolvency current stage where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi insolvency current stage that was removed
	 */
	public OsiInsolvencyCurrentStage removeBygetOsiInsolvenyById(
			long osiInsolvencyId)
		throws NoSuchOsiInsolvencyCurrentStageException;

	/**
	 * Returns the number of osi insolvency current stages where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi insolvency current stages
	 */
	public int countBygetOsiInsolvenyById(long osiInsolvencyId);

	/**
	 * Returns the osi insolvency current stage where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiInsolvencyCurrentStageException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolvency current stage
	 * @throws NoSuchOsiInsolvencyCurrentStageException if a matching osi insolvency current stage could not be found
	 */
	public OsiInsolvencyCurrentStage findBygetOI_Stage_OII(long osiInsolvencyId)
		throws NoSuchOsiInsolvencyCurrentStageException;

	/**
	 * Returns the osi insolvency current stage where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolvency current stage, or <code>null</code> if a matching osi insolvency current stage could not be found
	 */
	public OsiInsolvencyCurrentStage fetchBygetOI_Stage_OII(
		long osiInsolvencyId);

	/**
	 * Returns the osi insolvency current stage where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency current stage, or <code>null</code> if a matching osi insolvency current stage could not be found
	 */
	public OsiInsolvencyCurrentStage fetchBygetOI_Stage_OII(
		long osiInsolvencyId, boolean useFinderCache);

	/**
	 * Removes the osi insolvency current stage where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi insolvency current stage that was removed
	 */
	public OsiInsolvencyCurrentStage removeBygetOI_Stage_OII(
			long osiInsolvencyId)
		throws NoSuchOsiInsolvencyCurrentStageException;

	/**
	 * Returns the number of osi insolvency current stages where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi insolvency current stages
	 */
	public int countBygetOI_Stage_OII(long osiInsolvencyId);

	/**
	 * Caches the osi insolvency current stage in the entity cache if it is enabled.
	 *
	 * @param osiInsolvencyCurrentStage the osi insolvency current stage
	 */
	public void cacheResult(
		OsiInsolvencyCurrentStage osiInsolvencyCurrentStage);

	/**
	 * Caches the osi insolvency current stages in the entity cache if it is enabled.
	 *
	 * @param osiInsolvencyCurrentStages the osi insolvency current stages
	 */
	public void cacheResult(
		java.util.List<OsiInsolvencyCurrentStage> osiInsolvencyCurrentStages);

	/**
	 * Creates a new osi insolvency current stage with the primary key. Does not add the osi insolvency current stage to the database.
	 *
	 * @param osiInsolvencyCurrentStageId the primary key for the new osi insolvency current stage
	 * @return the new osi insolvency current stage
	 */
	public OsiInsolvencyCurrentStage create(long osiInsolvencyCurrentStageId);

	/**
	 * Removes the osi insolvency current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiInsolvencyCurrentStageId the primary key of the osi insolvency current stage
	 * @return the osi insolvency current stage that was removed
	 * @throws NoSuchOsiInsolvencyCurrentStageException if a osi insolvency current stage with the primary key could not be found
	 */
	public OsiInsolvencyCurrentStage remove(long osiInsolvencyCurrentStageId)
		throws NoSuchOsiInsolvencyCurrentStageException;

	public OsiInsolvencyCurrentStage updateImpl(
		OsiInsolvencyCurrentStage osiInsolvencyCurrentStage);

	/**
	 * Returns the osi insolvency current stage with the primary key or throws a <code>NoSuchOsiInsolvencyCurrentStageException</code> if it could not be found.
	 *
	 * @param osiInsolvencyCurrentStageId the primary key of the osi insolvency current stage
	 * @return the osi insolvency current stage
	 * @throws NoSuchOsiInsolvencyCurrentStageException if a osi insolvency current stage with the primary key could not be found
	 */
	public OsiInsolvencyCurrentStage findByPrimaryKey(
			long osiInsolvencyCurrentStageId)
		throws NoSuchOsiInsolvencyCurrentStageException;

	/**
	 * Returns the osi insolvency current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiInsolvencyCurrentStageId the primary key of the osi insolvency current stage
	 * @return the osi insolvency current stage, or <code>null</code> if a osi insolvency current stage with the primary key could not be found
	 */
	public OsiInsolvencyCurrentStage fetchByPrimaryKey(
		long osiInsolvencyCurrentStageId);

	/**
	 * Returns all the osi insolvency current stages.
	 *
	 * @return the osi insolvency current stages
	 */
	public java.util.List<OsiInsolvencyCurrentStage> findAll();

	/**
	 * Returns a range of all the osi insolvency current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency current stages
	 * @param end the upper bound of the range of osi insolvency current stages (not inclusive)
	 * @return the range of osi insolvency current stages
	 */
	public java.util.List<OsiInsolvencyCurrentStage> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the osi insolvency current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency current stages
	 * @param end the upper bound of the range of osi insolvency current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi insolvency current stages
	 */
	public java.util.List<OsiInsolvencyCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolvencyCurrentStage> orderByComparator);

	/**
	 * Returns an ordered range of all the osi insolvency current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency current stages
	 * @param end the upper bound of the range of osi insolvency current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi insolvency current stages
	 */
	public java.util.List<OsiInsolvencyCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolvencyCurrentStage> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi insolvency current stages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi insolvency current stages.
	 *
	 * @return the number of osi insolvency current stages
	 */
	public int countAll();

}