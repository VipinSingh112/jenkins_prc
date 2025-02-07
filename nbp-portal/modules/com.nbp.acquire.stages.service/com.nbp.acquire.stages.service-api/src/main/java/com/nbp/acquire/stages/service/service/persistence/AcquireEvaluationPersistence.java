/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.acquire.stages.service.exception.NoSuchAcquireEvaluationException;
import com.nbp.acquire.stages.service.model.AcquireEvaluation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acquire evaluation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireEvaluationUtil
 * @generated
 */
@ProviderType
public interface AcquireEvaluationPersistence
	extends BasePersistence<AcquireEvaluation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AcquireEvaluationUtil} to access the acquire evaluation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the acquire evaluation where caseId = &#63; or throws a <code>NoSuchAcquireEvaluationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire evaluation
	 * @throws NoSuchAcquireEvaluationException if a matching acquire evaluation could not be found
	 */
	public AcquireEvaluation findBygetAcquireEvaluationBy_CaseId(String caseId)
		throws NoSuchAcquireEvaluationException;

	/**
	 * Returns the acquire evaluation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire evaluation, or <code>null</code> if a matching acquire evaluation could not be found
	 */
	public AcquireEvaluation fetchBygetAcquireEvaluationBy_CaseId(
		String caseId);

	/**
	 * Returns the acquire evaluation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire evaluation, or <code>null</code> if a matching acquire evaluation could not be found
	 */
	public AcquireEvaluation fetchBygetAcquireEvaluationBy_CaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the acquire evaluation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the acquire evaluation that was removed
	 */
	public AcquireEvaluation removeBygetAcquireEvaluationBy_CaseId(
			String caseId)
		throws NoSuchAcquireEvaluationException;

	/**
	 * Returns the number of acquire evaluations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire evaluations
	 */
	public int countBygetAcquireEvaluationBy_CaseId(String caseId);

	/**
	 * Caches the acquire evaluation in the entity cache if it is enabled.
	 *
	 * @param acquireEvaluation the acquire evaluation
	 */
	public void cacheResult(AcquireEvaluation acquireEvaluation);

	/**
	 * Caches the acquire evaluations in the entity cache if it is enabled.
	 *
	 * @param acquireEvaluations the acquire evaluations
	 */
	public void cacheResult(
		java.util.List<AcquireEvaluation> acquireEvaluations);

	/**
	 * Creates a new acquire evaluation with the primary key. Does not add the acquire evaluation to the database.
	 *
	 * @param acquireEvaluationId the primary key for the new acquire evaluation
	 * @return the new acquire evaluation
	 */
	public AcquireEvaluation create(long acquireEvaluationId);

	/**
	 * Removes the acquire evaluation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireEvaluationId the primary key of the acquire evaluation
	 * @return the acquire evaluation that was removed
	 * @throws NoSuchAcquireEvaluationException if a acquire evaluation with the primary key could not be found
	 */
	public AcquireEvaluation remove(long acquireEvaluationId)
		throws NoSuchAcquireEvaluationException;

	public AcquireEvaluation updateImpl(AcquireEvaluation acquireEvaluation);

	/**
	 * Returns the acquire evaluation with the primary key or throws a <code>NoSuchAcquireEvaluationException</code> if it could not be found.
	 *
	 * @param acquireEvaluationId the primary key of the acquire evaluation
	 * @return the acquire evaluation
	 * @throws NoSuchAcquireEvaluationException if a acquire evaluation with the primary key could not be found
	 */
	public AcquireEvaluation findByPrimaryKey(long acquireEvaluationId)
		throws NoSuchAcquireEvaluationException;

	/**
	 * Returns the acquire evaluation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireEvaluationId the primary key of the acquire evaluation
	 * @return the acquire evaluation, or <code>null</code> if a acquire evaluation with the primary key could not be found
	 */
	public AcquireEvaluation fetchByPrimaryKey(long acquireEvaluationId);

	/**
	 * Returns all the acquire evaluations.
	 *
	 * @return the acquire evaluations
	 */
	public java.util.List<AcquireEvaluation> findAll();

	/**
	 * Returns a range of all the acquire evaluations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireEvaluationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire evaluations
	 * @param end the upper bound of the range of acquire evaluations (not inclusive)
	 * @return the range of acquire evaluations
	 */
	public java.util.List<AcquireEvaluation> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acquire evaluations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireEvaluationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire evaluations
	 * @param end the upper bound of the range of acquire evaluations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire evaluations
	 */
	public java.util.List<AcquireEvaluation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireEvaluation>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acquire evaluations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireEvaluationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire evaluations
	 * @param end the upper bound of the range of acquire evaluations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire evaluations
	 */
	public java.util.List<AcquireEvaluation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireEvaluation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acquire evaluations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acquire evaluations.
	 *
	 * @return the number of acquire evaluations
	 */
	public int countAll();

}