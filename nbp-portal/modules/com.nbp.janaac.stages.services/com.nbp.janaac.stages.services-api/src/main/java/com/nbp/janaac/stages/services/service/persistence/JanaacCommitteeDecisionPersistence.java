/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.stages.services.exception.NoSuchJanaacCommitteeDecisionException;
import com.nbp.janaac.stages.services.model.JanaacCommitteeDecision;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the janaac committee decision service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JanaacCommitteeDecisionUtil
 * @generated
 */
@ProviderType
public interface JanaacCommitteeDecisionPersistence
	extends BasePersistence<JanaacCommitteeDecision> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JanaacCommitteeDecisionUtil} to access the janaac committee decision persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the janaac committee decision where caseId = &#63; or throws a <code>NoSuchJanaacCommitteeDecisionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac committee decision
	 * @throws NoSuchJanaacCommitteeDecisionException if a matching janaac committee decision could not be found
	 */
	public JanaacCommitteeDecision findBygetJanaac_by_caseId(String caseId)
		throws NoSuchJanaacCommitteeDecisionException;

	/**
	 * Returns the janaac committee decision where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac committee decision, or <code>null</code> if a matching janaac committee decision could not be found
	 */
	public JanaacCommitteeDecision fetchBygetJanaac_by_caseId(String caseId);

	/**
	 * Returns the janaac committee decision where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac committee decision, or <code>null</code> if a matching janaac committee decision could not be found
	 */
	public JanaacCommitteeDecision fetchBygetJanaac_by_caseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the janaac committee decision where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the janaac committee decision that was removed
	 */
	public JanaacCommitteeDecision removeBygetJanaac_by_caseId(String caseId)
		throws NoSuchJanaacCommitteeDecisionException;

	/**
	 * Returns the number of janaac committee decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching janaac committee decisions
	 */
	public int countBygetJanaac_by_caseId(String caseId);

	/**
	 * Caches the janaac committee decision in the entity cache if it is enabled.
	 *
	 * @param janaacCommitteeDecision the janaac committee decision
	 */
	public void cacheResult(JanaacCommitteeDecision janaacCommitteeDecision);

	/**
	 * Caches the janaac committee decisions in the entity cache if it is enabled.
	 *
	 * @param janaacCommitteeDecisions the janaac committee decisions
	 */
	public void cacheResult(
		java.util.List<JanaacCommitteeDecision> janaacCommitteeDecisions);

	/**
	 * Creates a new janaac committee decision with the primary key. Does not add the janaac committee decision to the database.
	 *
	 * @param janaacCommitteeDecisionId the primary key for the new janaac committee decision
	 * @return the new janaac committee decision
	 */
	public JanaacCommitteeDecision create(long janaacCommitteeDecisionId);

	/**
	 * Removes the janaac committee decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param janaacCommitteeDecisionId the primary key of the janaac committee decision
	 * @return the janaac committee decision that was removed
	 * @throws NoSuchJanaacCommitteeDecisionException if a janaac committee decision with the primary key could not be found
	 */
	public JanaacCommitteeDecision remove(long janaacCommitteeDecisionId)
		throws NoSuchJanaacCommitteeDecisionException;

	public JanaacCommitteeDecision updateImpl(
		JanaacCommitteeDecision janaacCommitteeDecision);

	/**
	 * Returns the janaac committee decision with the primary key or throws a <code>NoSuchJanaacCommitteeDecisionException</code> if it could not be found.
	 *
	 * @param janaacCommitteeDecisionId the primary key of the janaac committee decision
	 * @return the janaac committee decision
	 * @throws NoSuchJanaacCommitteeDecisionException if a janaac committee decision with the primary key could not be found
	 */
	public JanaacCommitteeDecision findByPrimaryKey(
			long janaacCommitteeDecisionId)
		throws NoSuchJanaacCommitteeDecisionException;

	/**
	 * Returns the janaac committee decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param janaacCommitteeDecisionId the primary key of the janaac committee decision
	 * @return the janaac committee decision, or <code>null</code> if a janaac committee decision with the primary key could not be found
	 */
	public JanaacCommitteeDecision fetchByPrimaryKey(
		long janaacCommitteeDecisionId);

	/**
	 * Returns all the janaac committee decisions.
	 *
	 * @return the janaac committee decisions
	 */
	public java.util.List<JanaacCommitteeDecision> findAll();

	/**
	 * Returns a range of all the janaac committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac committee decisions
	 * @param end the upper bound of the range of janaac committee decisions (not inclusive)
	 * @return the range of janaac committee decisions
	 */
	public java.util.List<JanaacCommitteeDecision> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the janaac committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac committee decisions
	 * @param end the upper bound of the range of janaac committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of janaac committee decisions
	 */
	public java.util.List<JanaacCommitteeDecision> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JanaacCommitteeDecision> orderByComparator);

	/**
	 * Returns an ordered range of all the janaac committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac committee decisions
	 * @param end the upper bound of the range of janaac committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of janaac committee decisions
	 */
	public java.util.List<JanaacCommitteeDecision> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JanaacCommitteeDecision> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the janaac committee decisions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of janaac committee decisions.
	 *
	 * @return the number of janaac committee decisions
	 */
	public int countAll();

}