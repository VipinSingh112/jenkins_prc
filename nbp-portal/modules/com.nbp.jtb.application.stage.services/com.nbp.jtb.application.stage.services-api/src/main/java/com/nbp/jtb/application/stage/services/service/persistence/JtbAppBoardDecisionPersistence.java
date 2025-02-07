/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.stage.services.exception.NoSuchJtbAppBoardDecisionException;
import com.nbp.jtb.application.stage.services.model.JtbAppBoardDecision;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the jtb app board decision service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JtbAppBoardDecisionUtil
 * @generated
 */
@ProviderType
public interface JtbAppBoardDecisionPersistence
	extends BasePersistence<JtbAppBoardDecision> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JtbAppBoardDecisionUtil} to access the jtb app board decision persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the jtb app board decision where caseId = &#63; or throws a <code>NoSuchJtbAppBoardDecisionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb app board decision
	 * @throws NoSuchJtbAppBoardDecisionException if a matching jtb app board decision could not be found
	 */
	public JtbAppBoardDecision findBygetjtb_CD_CI(String caseId)
		throws NoSuchJtbAppBoardDecisionException;

	/**
	 * Returns the jtb app board decision where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb app board decision, or <code>null</code> if a matching jtb app board decision could not be found
	 */
	public JtbAppBoardDecision fetchBygetjtb_CD_CI(String caseId);

	/**
	 * Returns the jtb app board decision where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb app board decision, or <code>null</code> if a matching jtb app board decision could not be found
	 */
	public JtbAppBoardDecision fetchBygetjtb_CD_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the jtb app board decision where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jtb app board decision that was removed
	 */
	public JtbAppBoardDecision removeBygetjtb_CD_CI(String caseId)
		throws NoSuchJtbAppBoardDecisionException;

	/**
	 * Returns the number of jtb app board decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jtb app board decisions
	 */
	public int countBygetjtb_CD_CI(String caseId);

	/**
	 * Returns all the jtb app board decisions where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @return the matching jtb app board decisions
	 */
	public java.util.List<JtbAppBoardDecision> findBygetjtb_By_CD(
		String committeeDecision);

	/**
	 * Returns a range of all the jtb app board decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of jtb app board decisions
	 * @param end the upper bound of the range of jtb app board decisions (not inclusive)
	 * @return the range of matching jtb app board decisions
	 */
	public java.util.List<JtbAppBoardDecision> findBygetjtb_By_CD(
		String committeeDecision, int start, int end);

	/**
	 * Returns an ordered range of all the jtb app board decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of jtb app board decisions
	 * @param end the upper bound of the range of jtb app board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb app board decisions
	 */
	public java.util.List<JtbAppBoardDecision> findBygetjtb_By_CD(
		String committeeDecision, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbAppBoardDecision>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jtb app board decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of jtb app board decisions
	 * @param end the upper bound of the range of jtb app board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb app board decisions
	 */
	public java.util.List<JtbAppBoardDecision> findBygetjtb_By_CD(
		String committeeDecision, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbAppBoardDecision>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jtb app board decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb app board decision
	 * @throws NoSuchJtbAppBoardDecisionException if a matching jtb app board decision could not be found
	 */
	public JtbAppBoardDecision findBygetjtb_By_CD_First(
			String committeeDecision,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbAppBoardDecision> orderByComparator)
		throws NoSuchJtbAppBoardDecisionException;

	/**
	 * Returns the first jtb app board decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb app board decision, or <code>null</code> if a matching jtb app board decision could not be found
	 */
	public JtbAppBoardDecision fetchBygetjtb_By_CD_First(
		String committeeDecision,
		com.liferay.portal.kernel.util.OrderByComparator<JtbAppBoardDecision>
			orderByComparator);

	/**
	 * Returns the last jtb app board decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb app board decision
	 * @throws NoSuchJtbAppBoardDecisionException if a matching jtb app board decision could not be found
	 */
	public JtbAppBoardDecision findBygetjtb_By_CD_Last(
			String committeeDecision,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbAppBoardDecision> orderByComparator)
		throws NoSuchJtbAppBoardDecisionException;

	/**
	 * Returns the last jtb app board decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb app board decision, or <code>null</code> if a matching jtb app board decision could not be found
	 */
	public JtbAppBoardDecision fetchBygetjtb_By_CD_Last(
		String committeeDecision,
		com.liferay.portal.kernel.util.OrderByComparator<JtbAppBoardDecision>
			orderByComparator);

	/**
	 * Returns the jtb app board decisions before and after the current jtb app board decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param jtbAppDeciBoardDecisionId the primary key of the current jtb app board decision
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb app board decision
	 * @throws NoSuchJtbAppBoardDecisionException if a jtb app board decision with the primary key could not be found
	 */
	public JtbAppBoardDecision[] findBygetjtb_By_CD_PrevAndNext(
			long jtbAppDeciBoardDecisionId, String committeeDecision,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbAppBoardDecision> orderByComparator)
		throws NoSuchJtbAppBoardDecisionException;

	/**
	 * Removes all the jtb app board decisions where committeeDecision = &#63; from the database.
	 *
	 * @param committeeDecision the committee decision
	 */
	public void removeBygetjtb_By_CD(String committeeDecision);

	/**
	 * Returns the number of jtb app board decisions where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @return the number of matching jtb app board decisions
	 */
	public int countBygetjtb_By_CD(String committeeDecision);

	/**
	 * Caches the jtb app board decision in the entity cache if it is enabled.
	 *
	 * @param jtbAppBoardDecision the jtb app board decision
	 */
	public void cacheResult(JtbAppBoardDecision jtbAppBoardDecision);

	/**
	 * Caches the jtb app board decisions in the entity cache if it is enabled.
	 *
	 * @param jtbAppBoardDecisions the jtb app board decisions
	 */
	public void cacheResult(
		java.util.List<JtbAppBoardDecision> jtbAppBoardDecisions);

	/**
	 * Creates a new jtb app board decision with the primary key. Does not add the jtb app board decision to the database.
	 *
	 * @param jtbAppDeciBoardDecisionId the primary key for the new jtb app board decision
	 * @return the new jtb app board decision
	 */
	public JtbAppBoardDecision create(long jtbAppDeciBoardDecisionId);

	/**
	 * Removes the jtb app board decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jtbAppDeciBoardDecisionId the primary key of the jtb app board decision
	 * @return the jtb app board decision that was removed
	 * @throws NoSuchJtbAppBoardDecisionException if a jtb app board decision with the primary key could not be found
	 */
	public JtbAppBoardDecision remove(long jtbAppDeciBoardDecisionId)
		throws NoSuchJtbAppBoardDecisionException;

	public JtbAppBoardDecision updateImpl(
		JtbAppBoardDecision jtbAppBoardDecision);

	/**
	 * Returns the jtb app board decision with the primary key or throws a <code>NoSuchJtbAppBoardDecisionException</code> if it could not be found.
	 *
	 * @param jtbAppDeciBoardDecisionId the primary key of the jtb app board decision
	 * @return the jtb app board decision
	 * @throws NoSuchJtbAppBoardDecisionException if a jtb app board decision with the primary key could not be found
	 */
	public JtbAppBoardDecision findByPrimaryKey(long jtbAppDeciBoardDecisionId)
		throws NoSuchJtbAppBoardDecisionException;

	/**
	 * Returns the jtb app board decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jtbAppDeciBoardDecisionId the primary key of the jtb app board decision
	 * @return the jtb app board decision, or <code>null</code> if a jtb app board decision with the primary key could not be found
	 */
	public JtbAppBoardDecision fetchByPrimaryKey(
		long jtbAppDeciBoardDecisionId);

	/**
	 * Returns all the jtb app board decisions.
	 *
	 * @return the jtb app board decisions
	 */
	public java.util.List<JtbAppBoardDecision> findAll();

	/**
	 * Returns a range of all the jtb app board decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb app board decisions
	 * @param end the upper bound of the range of jtb app board decisions (not inclusive)
	 * @return the range of jtb app board decisions
	 */
	public java.util.List<JtbAppBoardDecision> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the jtb app board decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb app board decisions
	 * @param end the upper bound of the range of jtb app board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb app board decisions
	 */
	public java.util.List<JtbAppBoardDecision> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbAppBoardDecision>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jtb app board decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb app board decisions
	 * @param end the upper bound of the range of jtb app board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb app board decisions
	 */
	public java.util.List<JtbAppBoardDecision> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbAppBoardDecision>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the jtb app board decisions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of jtb app board decisions.
	 *
	 * @return the number of jtb app board decisions
	 */
	public int countAll();

}