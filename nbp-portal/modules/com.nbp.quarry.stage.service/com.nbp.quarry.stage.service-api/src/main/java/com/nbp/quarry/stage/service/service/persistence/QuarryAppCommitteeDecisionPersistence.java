/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.quarry.stage.service.exception.NoSuchQuarryAppCommitteeDecisionException;
import com.nbp.quarry.stage.service.model.QuarryAppCommitteeDecision;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the quarry app committee decision service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryAppCommitteeDecisionUtil
 * @generated
 */
@ProviderType
public interface QuarryAppCommitteeDecisionPersistence
	extends BasePersistence<QuarryAppCommitteeDecision> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QuarryAppCommitteeDecisionUtil} to access the quarry app committee decision persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the quarry app committee decision where caseId = &#63; or throws a <code>NoSuchQuarryAppCommitteeDecisionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry app committee decision
	 * @throws NoSuchQuarryAppCommitteeDecisionException if a matching quarry app committee decision could not be found
	 */
	public QuarryAppCommitteeDecision findBygetQuarry_CD_CI(String caseId)
		throws NoSuchQuarryAppCommitteeDecisionException;

	/**
	 * Returns the quarry app committee decision where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry app committee decision, or <code>null</code> if a matching quarry app committee decision could not be found
	 */
	public QuarryAppCommitteeDecision fetchBygetQuarry_CD_CI(String caseId);

	/**
	 * Returns the quarry app committee decision where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry app committee decision, or <code>null</code> if a matching quarry app committee decision could not be found
	 */
	public QuarryAppCommitteeDecision fetchBygetQuarry_CD_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the quarry app committee decision where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the quarry app committee decision that was removed
	 */
	public QuarryAppCommitteeDecision removeBygetQuarry_CD_CI(String caseId)
		throws NoSuchQuarryAppCommitteeDecisionException;

	/**
	 * Returns the number of quarry app committee decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching quarry app committee decisions
	 */
	public int countBygetQuarry_CD_CI(String caseId);

	/**
	 * Returns all the quarry app committee decisions where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @return the matching quarry app committee decisions
	 */
	public java.util.List<QuarryAppCommitteeDecision> findBygetQuarry_By_CD(
		String committeeDecision);

	/**
	 * Returns a range of all the quarry app committee decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryAppCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of quarry app committee decisions
	 * @param end the upper bound of the range of quarry app committee decisions (not inclusive)
	 * @return the range of matching quarry app committee decisions
	 */
	public java.util.List<QuarryAppCommitteeDecision> findBygetQuarry_By_CD(
		String committeeDecision, int start, int end);

	/**
	 * Returns an ordered range of all the quarry app committee decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryAppCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of quarry app committee decisions
	 * @param end the upper bound of the range of quarry app committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry app committee decisions
	 */
	public java.util.List<QuarryAppCommitteeDecision> findBygetQuarry_By_CD(
		String committeeDecision, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryAppCommitteeDecision> orderByComparator);

	/**
	 * Returns an ordered range of all the quarry app committee decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryAppCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of quarry app committee decisions
	 * @param end the upper bound of the range of quarry app committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry app committee decisions
	 */
	public java.util.List<QuarryAppCommitteeDecision> findBygetQuarry_By_CD(
		String committeeDecision, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryAppCommitteeDecision> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first quarry app committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry app committee decision
	 * @throws NoSuchQuarryAppCommitteeDecisionException if a matching quarry app committee decision could not be found
	 */
	public QuarryAppCommitteeDecision findBygetQuarry_By_CD_First(
			String committeeDecision,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryAppCommitteeDecision> orderByComparator)
		throws NoSuchQuarryAppCommitteeDecisionException;

	/**
	 * Returns the first quarry app committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry app committee decision, or <code>null</code> if a matching quarry app committee decision could not be found
	 */
	public QuarryAppCommitteeDecision fetchBygetQuarry_By_CD_First(
		String committeeDecision,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryAppCommitteeDecision> orderByComparator);

	/**
	 * Returns the last quarry app committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry app committee decision
	 * @throws NoSuchQuarryAppCommitteeDecisionException if a matching quarry app committee decision could not be found
	 */
	public QuarryAppCommitteeDecision findBygetQuarry_By_CD_Last(
			String committeeDecision,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryAppCommitteeDecision> orderByComparator)
		throws NoSuchQuarryAppCommitteeDecisionException;

	/**
	 * Returns the last quarry app committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry app committee decision, or <code>null</code> if a matching quarry app committee decision could not be found
	 */
	public QuarryAppCommitteeDecision fetchBygetQuarry_By_CD_Last(
		String committeeDecision,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryAppCommitteeDecision> orderByComparator);

	/**
	 * Returns the quarry app committee decisions before and after the current quarry app committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param quarryAppCommitteeDecisionId the primary key of the current quarry app committee decision
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry app committee decision
	 * @throws NoSuchQuarryAppCommitteeDecisionException if a quarry app committee decision with the primary key could not be found
	 */
	public QuarryAppCommitteeDecision[] findBygetQuarry_By_CD_PrevAndNext(
			long quarryAppCommitteeDecisionId, String committeeDecision,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryAppCommitteeDecision> orderByComparator)
		throws NoSuchQuarryAppCommitteeDecisionException;

	/**
	 * Removes all the quarry app committee decisions where committeeDecision = &#63; from the database.
	 *
	 * @param committeeDecision the committee decision
	 */
	public void removeBygetQuarry_By_CD(String committeeDecision);

	/**
	 * Returns the number of quarry app committee decisions where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @return the number of matching quarry app committee decisions
	 */
	public int countBygetQuarry_By_CD(String committeeDecision);

	/**
	 * Caches the quarry app committee decision in the entity cache if it is enabled.
	 *
	 * @param quarryAppCommitteeDecision the quarry app committee decision
	 */
	public void cacheResult(
		QuarryAppCommitteeDecision quarryAppCommitteeDecision);

	/**
	 * Caches the quarry app committee decisions in the entity cache if it is enabled.
	 *
	 * @param quarryAppCommitteeDecisions the quarry app committee decisions
	 */
	public void cacheResult(
		java.util.List<QuarryAppCommitteeDecision> quarryAppCommitteeDecisions);

	/**
	 * Creates a new quarry app committee decision with the primary key. Does not add the quarry app committee decision to the database.
	 *
	 * @param quarryAppCommitteeDecisionId the primary key for the new quarry app committee decision
	 * @return the new quarry app committee decision
	 */
	public QuarryAppCommitteeDecision create(long quarryAppCommitteeDecisionId);

	/**
	 * Removes the quarry app committee decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param quarryAppCommitteeDecisionId the primary key of the quarry app committee decision
	 * @return the quarry app committee decision that was removed
	 * @throws NoSuchQuarryAppCommitteeDecisionException if a quarry app committee decision with the primary key could not be found
	 */
	public QuarryAppCommitteeDecision remove(long quarryAppCommitteeDecisionId)
		throws NoSuchQuarryAppCommitteeDecisionException;

	public QuarryAppCommitteeDecision updateImpl(
		QuarryAppCommitteeDecision quarryAppCommitteeDecision);

	/**
	 * Returns the quarry app committee decision with the primary key or throws a <code>NoSuchQuarryAppCommitteeDecisionException</code> if it could not be found.
	 *
	 * @param quarryAppCommitteeDecisionId the primary key of the quarry app committee decision
	 * @return the quarry app committee decision
	 * @throws NoSuchQuarryAppCommitteeDecisionException if a quarry app committee decision with the primary key could not be found
	 */
	public QuarryAppCommitteeDecision findByPrimaryKey(
			long quarryAppCommitteeDecisionId)
		throws NoSuchQuarryAppCommitteeDecisionException;

	/**
	 * Returns the quarry app committee decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param quarryAppCommitteeDecisionId the primary key of the quarry app committee decision
	 * @return the quarry app committee decision, or <code>null</code> if a quarry app committee decision with the primary key could not be found
	 */
	public QuarryAppCommitteeDecision fetchByPrimaryKey(
		long quarryAppCommitteeDecisionId);

	/**
	 * Returns all the quarry app committee decisions.
	 *
	 * @return the quarry app committee decisions
	 */
	public java.util.List<QuarryAppCommitteeDecision> findAll();

	/**
	 * Returns a range of all the quarry app committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryAppCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry app committee decisions
	 * @param end the upper bound of the range of quarry app committee decisions (not inclusive)
	 * @return the range of quarry app committee decisions
	 */
	public java.util.List<QuarryAppCommitteeDecision> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the quarry app committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryAppCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry app committee decisions
	 * @param end the upper bound of the range of quarry app committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry app committee decisions
	 */
	public java.util.List<QuarryAppCommitteeDecision> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryAppCommitteeDecision> orderByComparator);

	/**
	 * Returns an ordered range of all the quarry app committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryAppCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry app committee decisions
	 * @param end the upper bound of the range of quarry app committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry app committee decisions
	 */
	public java.util.List<QuarryAppCommitteeDecision> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryAppCommitteeDecision> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the quarry app committee decisions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of quarry app committee decisions.
	 *
	 * @return the number of quarry app committee decisions
	 */
	public int countAll();

}