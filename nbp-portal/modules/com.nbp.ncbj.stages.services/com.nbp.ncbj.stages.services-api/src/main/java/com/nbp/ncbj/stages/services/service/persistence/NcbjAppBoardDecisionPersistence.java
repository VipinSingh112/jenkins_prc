/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncbj.stages.services.exception.NoSuchNcbjAppBoardDecisionException;
import com.nbp.ncbj.stages.services.model.NcbjAppBoardDecision;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncbj app board decision service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjAppBoardDecisionUtil
 * @generated
 */
@ProviderType
public interface NcbjAppBoardDecisionPersistence
	extends BasePersistence<NcbjAppBoardDecision> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcbjAppBoardDecisionUtil} to access the ncbj app board decision persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the ncbj app board decision where caseId = &#63; or throws a <code>NoSuchNcbjAppBoardDecisionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj app board decision
	 * @throws NoSuchNcbjAppBoardDecisionException if a matching ncbj app board decision could not be found
	 */
	public NcbjAppBoardDecision findBygetNcbj_CD_CI(String caseId)
		throws NoSuchNcbjAppBoardDecisionException;

	/**
	 * Returns the ncbj app board decision where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj app board decision, or <code>null</code> if a matching ncbj app board decision could not be found
	 */
	public NcbjAppBoardDecision fetchBygetNcbj_CD_CI(String caseId);

	/**
	 * Returns the ncbj app board decision where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj app board decision, or <code>null</code> if a matching ncbj app board decision could not be found
	 */
	public NcbjAppBoardDecision fetchBygetNcbj_CD_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the ncbj app board decision where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ncbj app board decision that was removed
	 */
	public NcbjAppBoardDecision removeBygetNcbj_CD_CI(String caseId)
		throws NoSuchNcbjAppBoardDecisionException;

	/**
	 * Returns the number of ncbj app board decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncbj app board decisions
	 */
	public int countBygetNcbj_CD_CI(String caseId);

	/**
	 * Returns all the ncbj app board decisions where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @return the matching ncbj app board decisions
	 */
	public java.util.List<NcbjAppBoardDecision> findBygetNcbj_By_CD(
		String committeeDecision);

	/**
	 * Returns a range of all the ncbj app board decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of ncbj app board decisions
	 * @param end the upper bound of the range of ncbj app board decisions (not inclusive)
	 * @return the range of matching ncbj app board decisions
	 */
	public java.util.List<NcbjAppBoardDecision> findBygetNcbj_By_CD(
		String committeeDecision, int start, int end);

	/**
	 * Returns an ordered range of all the ncbj app board decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of ncbj app board decisions
	 * @param end the upper bound of the range of ncbj app board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj app board decisions
	 */
	public java.util.List<NcbjAppBoardDecision> findBygetNcbj_By_CD(
		String committeeDecision, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjAppBoardDecision>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj app board decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of ncbj app board decisions
	 * @param end the upper bound of the range of ncbj app board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj app board decisions
	 */
	public java.util.List<NcbjAppBoardDecision> findBygetNcbj_By_CD(
		String committeeDecision, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjAppBoardDecision>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncbj app board decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj app board decision
	 * @throws NoSuchNcbjAppBoardDecisionException if a matching ncbj app board decision could not be found
	 */
	public NcbjAppBoardDecision findBygetNcbj_By_CD_First(
			String committeeDecision,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjAppBoardDecision> orderByComparator)
		throws NoSuchNcbjAppBoardDecisionException;

	/**
	 * Returns the first ncbj app board decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj app board decision, or <code>null</code> if a matching ncbj app board decision could not be found
	 */
	public NcbjAppBoardDecision fetchBygetNcbj_By_CD_First(
		String committeeDecision,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjAppBoardDecision>
			orderByComparator);

	/**
	 * Returns the last ncbj app board decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj app board decision
	 * @throws NoSuchNcbjAppBoardDecisionException if a matching ncbj app board decision could not be found
	 */
	public NcbjAppBoardDecision findBygetNcbj_By_CD_Last(
			String committeeDecision,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjAppBoardDecision> orderByComparator)
		throws NoSuchNcbjAppBoardDecisionException;

	/**
	 * Returns the last ncbj app board decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj app board decision, or <code>null</code> if a matching ncbj app board decision could not be found
	 */
	public NcbjAppBoardDecision fetchBygetNcbj_By_CD_Last(
		String committeeDecision,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjAppBoardDecision>
			orderByComparator);

	/**
	 * Returns the ncbj app board decisions before and after the current ncbj app board decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param ncbjAppBoardDecisionId the primary key of the current ncbj app board decision
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj app board decision
	 * @throws NoSuchNcbjAppBoardDecisionException if a ncbj app board decision with the primary key could not be found
	 */
	public NcbjAppBoardDecision[] findBygetNcbj_By_CD_PrevAndNext(
			long ncbjAppBoardDecisionId, String committeeDecision,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjAppBoardDecision> orderByComparator)
		throws NoSuchNcbjAppBoardDecisionException;

	/**
	 * Removes all the ncbj app board decisions where committeeDecision = &#63; from the database.
	 *
	 * @param committeeDecision the committee decision
	 */
	public void removeBygetNcbj_By_CD(String committeeDecision);

	/**
	 * Returns the number of ncbj app board decisions where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @return the number of matching ncbj app board decisions
	 */
	public int countBygetNcbj_By_CD(String committeeDecision);

	/**
	 * Caches the ncbj app board decision in the entity cache if it is enabled.
	 *
	 * @param ncbjAppBoardDecision the ncbj app board decision
	 */
	public void cacheResult(NcbjAppBoardDecision ncbjAppBoardDecision);

	/**
	 * Caches the ncbj app board decisions in the entity cache if it is enabled.
	 *
	 * @param ncbjAppBoardDecisions the ncbj app board decisions
	 */
	public void cacheResult(
		java.util.List<NcbjAppBoardDecision> ncbjAppBoardDecisions);

	/**
	 * Creates a new ncbj app board decision with the primary key. Does not add the ncbj app board decision to the database.
	 *
	 * @param ncbjAppBoardDecisionId the primary key for the new ncbj app board decision
	 * @return the new ncbj app board decision
	 */
	public NcbjAppBoardDecision create(long ncbjAppBoardDecisionId);

	/**
	 * Removes the ncbj app board decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjAppBoardDecisionId the primary key of the ncbj app board decision
	 * @return the ncbj app board decision that was removed
	 * @throws NoSuchNcbjAppBoardDecisionException if a ncbj app board decision with the primary key could not be found
	 */
	public NcbjAppBoardDecision remove(long ncbjAppBoardDecisionId)
		throws NoSuchNcbjAppBoardDecisionException;

	public NcbjAppBoardDecision updateImpl(
		NcbjAppBoardDecision ncbjAppBoardDecision);

	/**
	 * Returns the ncbj app board decision with the primary key or throws a <code>NoSuchNcbjAppBoardDecisionException</code> if it could not be found.
	 *
	 * @param ncbjAppBoardDecisionId the primary key of the ncbj app board decision
	 * @return the ncbj app board decision
	 * @throws NoSuchNcbjAppBoardDecisionException if a ncbj app board decision with the primary key could not be found
	 */
	public NcbjAppBoardDecision findByPrimaryKey(long ncbjAppBoardDecisionId)
		throws NoSuchNcbjAppBoardDecisionException;

	/**
	 * Returns the ncbj app board decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjAppBoardDecisionId the primary key of the ncbj app board decision
	 * @return the ncbj app board decision, or <code>null</code> if a ncbj app board decision with the primary key could not be found
	 */
	public NcbjAppBoardDecision fetchByPrimaryKey(long ncbjAppBoardDecisionId);

	/**
	 * Returns all the ncbj app board decisions.
	 *
	 * @return the ncbj app board decisions
	 */
	public java.util.List<NcbjAppBoardDecision> findAll();

	/**
	 * Returns a range of all the ncbj app board decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj app board decisions
	 * @param end the upper bound of the range of ncbj app board decisions (not inclusive)
	 * @return the range of ncbj app board decisions
	 */
	public java.util.List<NcbjAppBoardDecision> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ncbj app board decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj app board decisions
	 * @param end the upper bound of the range of ncbj app board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj app board decisions
	 */
	public java.util.List<NcbjAppBoardDecision> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjAppBoardDecision>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj app board decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjAppBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj app board decisions
	 * @param end the upper bound of the range of ncbj app board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj app board decisions
	 */
	public java.util.List<NcbjAppBoardDecision> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjAppBoardDecision>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncbj app board decisions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncbj app board decisions.
	 *
	 * @return the number of ncbj app board decisions
	 */
	public int countAll();

}