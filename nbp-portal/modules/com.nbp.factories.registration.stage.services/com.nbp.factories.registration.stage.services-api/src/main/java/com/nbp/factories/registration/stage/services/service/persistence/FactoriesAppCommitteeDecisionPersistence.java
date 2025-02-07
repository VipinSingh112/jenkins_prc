/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.factories.registration.stage.services.exception.NoSuchFactoriesAppCommitteeDecisionException;
import com.nbp.factories.registration.stage.services.model.FactoriesAppCommitteeDecision;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the factories app committee decision service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesAppCommitteeDecisionUtil
 * @generated
 */
@ProviderType
public interface FactoriesAppCommitteeDecisionPersistence
	extends BasePersistence<FactoriesAppCommitteeDecision> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FactoriesAppCommitteeDecisionUtil} to access the factories app committee decision persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the factories app committee decision where caseId = &#63; or throws a <code>NoSuchFactoriesAppCommitteeDecisionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching factories app committee decision
	 * @throws NoSuchFactoriesAppCommitteeDecisionException if a matching factories app committee decision could not be found
	 */
	public FactoriesAppCommitteeDecision findBygetFactory_CD_CI(String caseId)
		throws NoSuchFactoriesAppCommitteeDecisionException;

	/**
	 * Returns the factories app committee decision where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching factories app committee decision, or <code>null</code> if a matching factories app committee decision could not be found
	 */
	public FactoriesAppCommitteeDecision fetchBygetFactory_CD_CI(String caseId);

	/**
	 * Returns the factories app committee decision where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories app committee decision, or <code>null</code> if a matching factories app committee decision could not be found
	 */
	public FactoriesAppCommitteeDecision fetchBygetFactory_CD_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the factories app committee decision where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the factories app committee decision that was removed
	 */
	public FactoriesAppCommitteeDecision removeBygetFactory_CD_CI(String caseId)
		throws NoSuchFactoriesAppCommitteeDecisionException;

	/**
	 * Returns the number of factories app committee decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching factories app committee decisions
	 */
	public int countBygetFactory_CD_CI(String caseId);

	/**
	 * Returns all the factories app committee decisions where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @return the matching factories app committee decisions
	 */
	public java.util.List<FactoriesAppCommitteeDecision> findBygetFactory_By_CD(
		String committeeDecision);

	/**
	 * Returns a range of all the factories app committee decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesAppCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of factories app committee decisions
	 * @param end the upper bound of the range of factories app committee decisions (not inclusive)
	 * @return the range of matching factories app committee decisions
	 */
	public java.util.List<FactoriesAppCommitteeDecision> findBygetFactory_By_CD(
		String committeeDecision, int start, int end);

	/**
	 * Returns an ordered range of all the factories app committee decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesAppCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of factories app committee decisions
	 * @param end the upper bound of the range of factories app committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories app committee decisions
	 */
	public java.util.List<FactoriesAppCommitteeDecision> findBygetFactory_By_CD(
		String committeeDecision, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesAppCommitteeDecision> orderByComparator);

	/**
	 * Returns an ordered range of all the factories app committee decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesAppCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of factories app committee decisions
	 * @param end the upper bound of the range of factories app committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories app committee decisions
	 */
	public java.util.List<FactoriesAppCommitteeDecision> findBygetFactory_By_CD(
		String committeeDecision, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesAppCommitteeDecision> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first factories app committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories app committee decision
	 * @throws NoSuchFactoriesAppCommitteeDecisionException if a matching factories app committee decision could not be found
	 */
	public FactoriesAppCommitteeDecision findBygetFactory_By_CD_First(
			String committeeDecision,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesAppCommitteeDecision> orderByComparator)
		throws NoSuchFactoriesAppCommitteeDecisionException;

	/**
	 * Returns the first factories app committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories app committee decision, or <code>null</code> if a matching factories app committee decision could not be found
	 */
	public FactoriesAppCommitteeDecision fetchBygetFactory_By_CD_First(
		String committeeDecision,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesAppCommitteeDecision> orderByComparator);

	/**
	 * Returns the last factories app committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories app committee decision
	 * @throws NoSuchFactoriesAppCommitteeDecisionException if a matching factories app committee decision could not be found
	 */
	public FactoriesAppCommitteeDecision findBygetFactory_By_CD_Last(
			String committeeDecision,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesAppCommitteeDecision> orderByComparator)
		throws NoSuchFactoriesAppCommitteeDecisionException;

	/**
	 * Returns the last factories app committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories app committee decision, or <code>null</code> if a matching factories app committee decision could not be found
	 */
	public FactoriesAppCommitteeDecision fetchBygetFactory_By_CD_Last(
		String committeeDecision,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesAppCommitteeDecision> orderByComparator);

	/**
	 * Returns the factories app committee decisions before and after the current factories app committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param factoriesAppCommiDecId the primary key of the current factories app committee decision
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories app committee decision
	 * @throws NoSuchFactoriesAppCommitteeDecisionException if a factories app committee decision with the primary key could not be found
	 */
	public FactoriesAppCommitteeDecision[] findBygetFactory_By_CD_PrevAndNext(
			long factoriesAppCommiDecId, String committeeDecision,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesAppCommitteeDecision> orderByComparator)
		throws NoSuchFactoriesAppCommitteeDecisionException;

	/**
	 * Removes all the factories app committee decisions where committeeDecision = &#63; from the database.
	 *
	 * @param committeeDecision the committee decision
	 */
	public void removeBygetFactory_By_CD(String committeeDecision);

	/**
	 * Returns the number of factories app committee decisions where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @return the number of matching factories app committee decisions
	 */
	public int countBygetFactory_By_CD(String committeeDecision);

	/**
	 * Caches the factories app committee decision in the entity cache if it is enabled.
	 *
	 * @param factoriesAppCommitteeDecision the factories app committee decision
	 */
	public void cacheResult(
		FactoriesAppCommitteeDecision factoriesAppCommitteeDecision);

	/**
	 * Caches the factories app committee decisions in the entity cache if it is enabled.
	 *
	 * @param factoriesAppCommitteeDecisions the factories app committee decisions
	 */
	public void cacheResult(
		java.util.List<FactoriesAppCommitteeDecision>
			factoriesAppCommitteeDecisions);

	/**
	 * Creates a new factories app committee decision with the primary key. Does not add the factories app committee decision to the database.
	 *
	 * @param factoriesAppCommiDecId the primary key for the new factories app committee decision
	 * @return the new factories app committee decision
	 */
	public FactoriesAppCommitteeDecision create(long factoriesAppCommiDecId);

	/**
	 * Removes the factories app committee decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param factoriesAppCommiDecId the primary key of the factories app committee decision
	 * @return the factories app committee decision that was removed
	 * @throws NoSuchFactoriesAppCommitteeDecisionException if a factories app committee decision with the primary key could not be found
	 */
	public FactoriesAppCommitteeDecision remove(long factoriesAppCommiDecId)
		throws NoSuchFactoriesAppCommitteeDecisionException;

	public FactoriesAppCommitteeDecision updateImpl(
		FactoriesAppCommitteeDecision factoriesAppCommitteeDecision);

	/**
	 * Returns the factories app committee decision with the primary key or throws a <code>NoSuchFactoriesAppCommitteeDecisionException</code> if it could not be found.
	 *
	 * @param factoriesAppCommiDecId the primary key of the factories app committee decision
	 * @return the factories app committee decision
	 * @throws NoSuchFactoriesAppCommitteeDecisionException if a factories app committee decision with the primary key could not be found
	 */
	public FactoriesAppCommitteeDecision findByPrimaryKey(
			long factoriesAppCommiDecId)
		throws NoSuchFactoriesAppCommitteeDecisionException;

	/**
	 * Returns the factories app committee decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param factoriesAppCommiDecId the primary key of the factories app committee decision
	 * @return the factories app committee decision, or <code>null</code> if a factories app committee decision with the primary key could not be found
	 */
	public FactoriesAppCommitteeDecision fetchByPrimaryKey(
		long factoriesAppCommiDecId);

	/**
	 * Returns all the factories app committee decisions.
	 *
	 * @return the factories app committee decisions
	 */
	public java.util.List<FactoriesAppCommitteeDecision> findAll();

	/**
	 * Returns a range of all the factories app committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesAppCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories app committee decisions
	 * @param end the upper bound of the range of factories app committee decisions (not inclusive)
	 * @return the range of factories app committee decisions
	 */
	public java.util.List<FactoriesAppCommitteeDecision> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the factories app committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesAppCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories app committee decisions
	 * @param end the upper bound of the range of factories app committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of factories app committee decisions
	 */
	public java.util.List<FactoriesAppCommitteeDecision> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesAppCommitteeDecision> orderByComparator);

	/**
	 * Returns an ordered range of all the factories app committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesAppCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories app committee decisions
	 * @param end the upper bound of the range of factories app committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of factories app committee decisions
	 */
	public java.util.List<FactoriesAppCommitteeDecision> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesAppCommitteeDecision> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the factories app committee decisions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of factories app committee decisions.
	 *
	 * @return the number of factories app committee decisions
	 */
	public int countAll();

}