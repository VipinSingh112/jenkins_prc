/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.stages.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.miic.stages.service.exception.NoSuchMiicRecommendationsDecisionException;
import com.nbp.miic.stages.service.model.MiicRecommendationsDecision;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the miic recommendations decision service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiicRecommendationsDecisionUtil
 * @generated
 */
@ProviderType
public interface MiicRecommendationsDecisionPersistence
	extends BasePersistence<MiicRecommendationsDecision> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MiicRecommendationsDecisionUtil} to access the miic recommendations decision persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the miic recommendations decision where caseId = &#63; or throws a <code>NoSuchMiicRecommendationsDecisionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching miic recommendations decision
	 * @throws NoSuchMiicRecommendationsDecisionException if a matching miic recommendations decision could not be found
	 */
	public MiicRecommendationsDecision findBygetMiic_RD_by_CI(String caseId)
		throws NoSuchMiicRecommendationsDecisionException;

	/**
	 * Returns the miic recommendations decision where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching miic recommendations decision, or <code>null</code> if a matching miic recommendations decision could not be found
	 */
	public MiicRecommendationsDecision fetchBygetMiic_RD_by_CI(String caseId);

	/**
	 * Returns the miic recommendations decision where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic recommendations decision, or <code>null</code> if a matching miic recommendations decision could not be found
	 */
	public MiicRecommendationsDecision fetchBygetMiic_RD_by_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the miic recommendations decision where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the miic recommendations decision that was removed
	 */
	public MiicRecommendationsDecision removeBygetMiic_RD_by_CI(String caseId)
		throws NoSuchMiicRecommendationsDecisionException;

	/**
	 * Returns the number of miic recommendations decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching miic recommendations decisions
	 */
	public int countBygetMiic_RD_by_CI(String caseId);

	/**
	 * Caches the miic recommendations decision in the entity cache if it is enabled.
	 *
	 * @param miicRecommendationsDecision the miic recommendations decision
	 */
	public void cacheResult(
		MiicRecommendationsDecision miicRecommendationsDecision);

	/**
	 * Caches the miic recommendations decisions in the entity cache if it is enabled.
	 *
	 * @param miicRecommendationsDecisions the miic recommendations decisions
	 */
	public void cacheResult(
		java.util.List<MiicRecommendationsDecision>
			miicRecommendationsDecisions);

	/**
	 * Creates a new miic recommendations decision with the primary key. Does not add the miic recommendations decision to the database.
	 *
	 * @param miicRecommendationsDecisionId the primary key for the new miic recommendations decision
	 * @return the new miic recommendations decision
	 */
	public MiicRecommendationsDecision create(
		long miicRecommendationsDecisionId);

	/**
	 * Removes the miic recommendations decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miicRecommendationsDecisionId the primary key of the miic recommendations decision
	 * @return the miic recommendations decision that was removed
	 * @throws NoSuchMiicRecommendationsDecisionException if a miic recommendations decision with the primary key could not be found
	 */
	public MiicRecommendationsDecision remove(
			long miicRecommendationsDecisionId)
		throws NoSuchMiicRecommendationsDecisionException;

	public MiicRecommendationsDecision updateImpl(
		MiicRecommendationsDecision miicRecommendationsDecision);

	/**
	 * Returns the miic recommendations decision with the primary key or throws a <code>NoSuchMiicRecommendationsDecisionException</code> if it could not be found.
	 *
	 * @param miicRecommendationsDecisionId the primary key of the miic recommendations decision
	 * @return the miic recommendations decision
	 * @throws NoSuchMiicRecommendationsDecisionException if a miic recommendations decision with the primary key could not be found
	 */
	public MiicRecommendationsDecision findByPrimaryKey(
			long miicRecommendationsDecisionId)
		throws NoSuchMiicRecommendationsDecisionException;

	/**
	 * Returns the miic recommendations decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miicRecommendationsDecisionId the primary key of the miic recommendations decision
	 * @return the miic recommendations decision, or <code>null</code> if a miic recommendations decision with the primary key could not be found
	 */
	public MiicRecommendationsDecision fetchByPrimaryKey(
		long miicRecommendationsDecisionId);

	/**
	 * Returns all the miic recommendations decisions.
	 *
	 * @return the miic recommendations decisions
	 */
	public java.util.List<MiicRecommendationsDecision> findAll();

	/**
	 * Returns a range of all the miic recommendations decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicRecommendationsDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic recommendations decisions
	 * @param end the upper bound of the range of miic recommendations decisions (not inclusive)
	 * @return the range of miic recommendations decisions
	 */
	public java.util.List<MiicRecommendationsDecision> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the miic recommendations decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicRecommendationsDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic recommendations decisions
	 * @param end the upper bound of the range of miic recommendations decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of miic recommendations decisions
	 */
	public java.util.List<MiicRecommendationsDecision> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiicRecommendationsDecision> orderByComparator);

	/**
	 * Returns an ordered range of all the miic recommendations decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicRecommendationsDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic recommendations decisions
	 * @param end the upper bound of the range of miic recommendations decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of miic recommendations decisions
	 */
	public java.util.List<MiicRecommendationsDecision> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiicRecommendationsDecision> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the miic recommendations decisions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of miic recommendations decisions.
	 *
	 * @return the number of miic recommendations decisions
	 */
	public int countAll();

}