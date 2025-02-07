/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.pharmaceutical.stages.services.exception.NoSuchPharmaApplicationCommitteeDecisionException;
import com.nbp.pharmaceutical.stages.services.model.PharmaApplicationCommitteeDecision;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the pharma application committee decision service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationCommitteeDecisionUtil
 * @generated
 */
@ProviderType
public interface PharmaApplicationCommitteeDecisionPersistence
	extends BasePersistence<PharmaApplicationCommitteeDecision> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PharmaApplicationCommitteeDecisionUtil} to access the pharma application committee decision persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the pharma application committee decision where caseId = &#63; or throws a <code>NoSuchPharmaApplicationCommitteeDecisionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching pharma application committee decision
	 * @throws NoSuchPharmaApplicationCommitteeDecisionException if a matching pharma application committee decision could not be found
	 */
	public PharmaApplicationCommitteeDecision findBygetPharma_CD_CI(
			String caseId)
		throws NoSuchPharmaApplicationCommitteeDecisionException;

	/**
	 * Returns the pharma application committee decision where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching pharma application committee decision, or <code>null</code> if a matching pharma application committee decision could not be found
	 */
	public PharmaApplicationCommitteeDecision fetchBygetPharma_CD_CI(
		String caseId);

	/**
	 * Returns the pharma application committee decision where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application committee decision, or <code>null</code> if a matching pharma application committee decision could not be found
	 */
	public PharmaApplicationCommitteeDecision fetchBygetPharma_CD_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the pharma application committee decision where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the pharma application committee decision that was removed
	 */
	public PharmaApplicationCommitteeDecision removeBygetPharma_CD_CI(
			String caseId)
		throws NoSuchPharmaApplicationCommitteeDecisionException;

	/**
	 * Returns the number of pharma application committee decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching pharma application committee decisions
	 */
	public int countBygetPharma_CD_CI(String caseId);

	/**
	 * Returns all the pharma application committee decisions where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @return the matching pharma application committee decisions
	 */
	public java.util.List<PharmaApplicationCommitteeDecision>
		findBygetPharma_By_CD(String committeeDecision);

	/**
	 * Returns a range of all the pharma application committee decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of pharma application committee decisions
	 * @param end the upper bound of the range of pharma application committee decisions (not inclusive)
	 * @return the range of matching pharma application committee decisions
	 */
	public java.util.List<PharmaApplicationCommitteeDecision>
		findBygetPharma_By_CD(String committeeDecision, int start, int end);

	/**
	 * Returns an ordered range of all the pharma application committee decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of pharma application committee decisions
	 * @param end the upper bound of the range of pharma application committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma application committee decisions
	 */
	public java.util.List<PharmaApplicationCommitteeDecision>
		findBygetPharma_By_CD(
			String committeeDecision, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaApplicationCommitteeDecision> orderByComparator);

	/**
	 * Returns an ordered range of all the pharma application committee decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of pharma application committee decisions
	 * @param end the upper bound of the range of pharma application committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma application committee decisions
	 */
	public java.util.List<PharmaApplicationCommitteeDecision>
		findBygetPharma_By_CD(
			String committeeDecision, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaApplicationCommitteeDecision> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first pharma application committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application committee decision
	 * @throws NoSuchPharmaApplicationCommitteeDecisionException if a matching pharma application committee decision could not be found
	 */
	public PharmaApplicationCommitteeDecision findBygetPharma_By_CD_First(
			String committeeDecision,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaApplicationCommitteeDecision> orderByComparator)
		throws NoSuchPharmaApplicationCommitteeDecisionException;

	/**
	 * Returns the first pharma application committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application committee decision, or <code>null</code> if a matching pharma application committee decision could not be found
	 */
	public PharmaApplicationCommitteeDecision fetchBygetPharma_By_CD_First(
		String committeeDecision,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaApplicationCommitteeDecision> orderByComparator);

	/**
	 * Returns the last pharma application committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application committee decision
	 * @throws NoSuchPharmaApplicationCommitteeDecisionException if a matching pharma application committee decision could not be found
	 */
	public PharmaApplicationCommitteeDecision findBygetPharma_By_CD_Last(
			String committeeDecision,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaApplicationCommitteeDecision> orderByComparator)
		throws NoSuchPharmaApplicationCommitteeDecisionException;

	/**
	 * Returns the last pharma application committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application committee decision, or <code>null</code> if a matching pharma application committee decision could not be found
	 */
	public PharmaApplicationCommitteeDecision fetchBygetPharma_By_CD_Last(
		String committeeDecision,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaApplicationCommitteeDecision> orderByComparator);

	/**
	 * Returns the pharma application committee decisions before and after the current pharma application committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param pharmaCommitteeDecisionId the primary key of the current pharma application committee decision
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma application committee decision
	 * @throws NoSuchPharmaApplicationCommitteeDecisionException if a pharma application committee decision with the primary key could not be found
	 */
	public PharmaApplicationCommitteeDecision[]
			findBygetPharma_By_CD_PrevAndNext(
				long pharmaCommitteeDecisionId, String committeeDecision,
				com.liferay.portal.kernel.util.OrderByComparator
					<PharmaApplicationCommitteeDecision> orderByComparator)
		throws NoSuchPharmaApplicationCommitteeDecisionException;

	/**
	 * Removes all the pharma application committee decisions where committeeDecision = &#63; from the database.
	 *
	 * @param committeeDecision the committee decision
	 */
	public void removeBygetPharma_By_CD(String committeeDecision);

	/**
	 * Returns the number of pharma application committee decisions where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @return the number of matching pharma application committee decisions
	 */
	public int countBygetPharma_By_CD(String committeeDecision);

	/**
	 * Caches the pharma application committee decision in the entity cache if it is enabled.
	 *
	 * @param pharmaApplicationCommitteeDecision the pharma application committee decision
	 */
	public void cacheResult(
		PharmaApplicationCommitteeDecision pharmaApplicationCommitteeDecision);

	/**
	 * Caches the pharma application committee decisions in the entity cache if it is enabled.
	 *
	 * @param pharmaApplicationCommitteeDecisions the pharma application committee decisions
	 */
	public void cacheResult(
		java.util.List<PharmaApplicationCommitteeDecision>
			pharmaApplicationCommitteeDecisions);

	/**
	 * Creates a new pharma application committee decision with the primary key. Does not add the pharma application committee decision to the database.
	 *
	 * @param pharmaCommitteeDecisionId the primary key for the new pharma application committee decision
	 * @return the new pharma application committee decision
	 */
	public PharmaApplicationCommitteeDecision create(
		long pharmaCommitteeDecisionId);

	/**
	 * Removes the pharma application committee decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaCommitteeDecisionId the primary key of the pharma application committee decision
	 * @return the pharma application committee decision that was removed
	 * @throws NoSuchPharmaApplicationCommitteeDecisionException if a pharma application committee decision with the primary key could not be found
	 */
	public PharmaApplicationCommitteeDecision remove(
			long pharmaCommitteeDecisionId)
		throws NoSuchPharmaApplicationCommitteeDecisionException;

	public PharmaApplicationCommitteeDecision updateImpl(
		PharmaApplicationCommitteeDecision pharmaApplicationCommitteeDecision);

	/**
	 * Returns the pharma application committee decision with the primary key or throws a <code>NoSuchPharmaApplicationCommitteeDecisionException</code> if it could not be found.
	 *
	 * @param pharmaCommitteeDecisionId the primary key of the pharma application committee decision
	 * @return the pharma application committee decision
	 * @throws NoSuchPharmaApplicationCommitteeDecisionException if a pharma application committee decision with the primary key could not be found
	 */
	public PharmaApplicationCommitteeDecision findByPrimaryKey(
			long pharmaCommitteeDecisionId)
		throws NoSuchPharmaApplicationCommitteeDecisionException;

	/**
	 * Returns the pharma application committee decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaCommitteeDecisionId the primary key of the pharma application committee decision
	 * @return the pharma application committee decision, or <code>null</code> if a pharma application committee decision with the primary key could not be found
	 */
	public PharmaApplicationCommitteeDecision fetchByPrimaryKey(
		long pharmaCommitteeDecisionId);

	/**
	 * Returns all the pharma application committee decisions.
	 *
	 * @return the pharma application committee decisions
	 */
	public java.util.List<PharmaApplicationCommitteeDecision> findAll();

	/**
	 * Returns a range of all the pharma application committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application committee decisions
	 * @param end the upper bound of the range of pharma application committee decisions (not inclusive)
	 * @return the range of pharma application committee decisions
	 */
	public java.util.List<PharmaApplicationCommitteeDecision> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the pharma application committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application committee decisions
	 * @param end the upper bound of the range of pharma application committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma application committee decisions
	 */
	public java.util.List<PharmaApplicationCommitteeDecision> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaApplicationCommitteeDecision> orderByComparator);

	/**
	 * Returns an ordered range of all the pharma application committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application committee decisions
	 * @param end the upper bound of the range of pharma application committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma application committee decisions
	 */
	public java.util.List<PharmaApplicationCommitteeDecision> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaApplicationCommitteeDecision> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the pharma application committee decisions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of pharma application committee decisions.
	 *
	 * @return the number of pharma application committee decisions
	 */
	public int countAll();

}