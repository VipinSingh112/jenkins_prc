/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.npm.cannabis.application.stages.services.exception.NoSuchFullLicenseCommitteeDecisionException;
import com.npm.cannabis.application.stages.services.model.FullLicenseCommitteeDecision;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the full license committee decision service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FullLicenseCommitteeDecisionUtil
 * @generated
 */
@ProviderType
public interface FullLicenseCommitteeDecisionPersistence
	extends BasePersistence<FullLicenseCommitteeDecision> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FullLicenseCommitteeDecisionUtil} to access the full license committee decision persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the full license committee decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching full license committee decisions
	 */
	public java.util.List<FullLicenseCommitteeDecision> findBygetFLCD_CaseId(
		String caseId);

	/**
	 * Returns a range of all the full license committee decisions where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FullLicenseCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of full license committee decisions
	 * @param end the upper bound of the range of full license committee decisions (not inclusive)
	 * @return the range of matching full license committee decisions
	 */
	public java.util.List<FullLicenseCommitteeDecision> findBygetFLCD_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the full license committee decisions where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FullLicenseCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of full license committee decisions
	 * @param end the upper bound of the range of full license committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching full license committee decisions
	 */
	public java.util.List<FullLicenseCommitteeDecision> findBygetFLCD_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FullLicenseCommitteeDecision> orderByComparator);

	/**
	 * Returns an ordered range of all the full license committee decisions where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FullLicenseCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of full license committee decisions
	 * @param end the upper bound of the range of full license committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching full license committee decisions
	 */
	public java.util.List<FullLicenseCommitteeDecision> findBygetFLCD_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FullLicenseCommitteeDecision> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first full license committee decision in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching full license committee decision
	 * @throws NoSuchFullLicenseCommitteeDecisionException if a matching full license committee decision could not be found
	 */
	public FullLicenseCommitteeDecision findBygetFLCD_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FullLicenseCommitteeDecision> orderByComparator)
		throws NoSuchFullLicenseCommitteeDecisionException;

	/**
	 * Returns the first full license committee decision in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching full license committee decision, or <code>null</code> if a matching full license committee decision could not be found
	 */
	public FullLicenseCommitteeDecision fetchBygetFLCD_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<FullLicenseCommitteeDecision> orderByComparator);

	/**
	 * Returns the last full license committee decision in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching full license committee decision
	 * @throws NoSuchFullLicenseCommitteeDecisionException if a matching full license committee decision could not be found
	 */
	public FullLicenseCommitteeDecision findBygetFLCD_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FullLicenseCommitteeDecision> orderByComparator)
		throws NoSuchFullLicenseCommitteeDecisionException;

	/**
	 * Returns the last full license committee decision in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching full license committee decision, or <code>null</code> if a matching full license committee decision could not be found
	 */
	public FullLicenseCommitteeDecision fetchBygetFLCD_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<FullLicenseCommitteeDecision> orderByComparator);

	/**
	 * Returns the full license committee decisions before and after the current full license committee decision in the ordered set where caseId = &#63;.
	 *
	 * @param fullLicenseCommitteeDecisionId the primary key of the current full license committee decision
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next full license committee decision
	 * @throws NoSuchFullLicenseCommitteeDecisionException if a full license committee decision with the primary key could not be found
	 */
	public FullLicenseCommitteeDecision[] findBygetFLCD_CaseId_PrevAndNext(
			long fullLicenseCommitteeDecisionId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FullLicenseCommitteeDecision> orderByComparator)
		throws NoSuchFullLicenseCommitteeDecisionException;

	/**
	 * Removes all the full license committee decisions where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetFLCD_CaseId(String caseId);

	/**
	 * Returns the number of full license committee decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching full license committee decisions
	 */
	public int countBygetFLCD_CaseId(String caseId);

	/**
	 * Returns the full license committee decision where caseId = &#63; or throws a <code>NoSuchFullLicenseCommitteeDecisionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching full license committee decision
	 * @throws NoSuchFullLicenseCommitteeDecisionException if a matching full license committee decision could not be found
	 */
	public FullLicenseCommitteeDecision findBygetFLCD_By_CaseId(String caseId)
		throws NoSuchFullLicenseCommitteeDecisionException;

	/**
	 * Returns the full license committee decision where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching full license committee decision, or <code>null</code> if a matching full license committee decision could not be found
	 */
	public FullLicenseCommitteeDecision fetchBygetFLCD_By_CaseId(String caseId);

	/**
	 * Returns the full license committee decision where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching full license committee decision, or <code>null</code> if a matching full license committee decision could not be found
	 */
	public FullLicenseCommitteeDecision fetchBygetFLCD_By_CaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the full license committee decision where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the full license committee decision that was removed
	 */
	public FullLicenseCommitteeDecision removeBygetFLCD_By_CaseId(String caseId)
		throws NoSuchFullLicenseCommitteeDecisionException;

	/**
	 * Returns the number of full license committee decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching full license committee decisions
	 */
	public int countBygetFLCD_By_CaseId(String caseId);

	/**
	 * Returns all the full license committee decisions where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @return the matching full license committee decisions
	 */
	public java.util.List<FullLicenseCommitteeDecision> findBygetFLCD_CD(
		String committeeDecision);

	/**
	 * Returns a range of all the full license committee decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FullLicenseCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of full license committee decisions
	 * @param end the upper bound of the range of full license committee decisions (not inclusive)
	 * @return the range of matching full license committee decisions
	 */
	public java.util.List<FullLicenseCommitteeDecision> findBygetFLCD_CD(
		String committeeDecision, int start, int end);

	/**
	 * Returns an ordered range of all the full license committee decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FullLicenseCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of full license committee decisions
	 * @param end the upper bound of the range of full license committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching full license committee decisions
	 */
	public java.util.List<FullLicenseCommitteeDecision> findBygetFLCD_CD(
		String committeeDecision, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FullLicenseCommitteeDecision> orderByComparator);

	/**
	 * Returns an ordered range of all the full license committee decisions where committeeDecision = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FullLicenseCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param committeeDecision the committee decision
	 * @param start the lower bound of the range of full license committee decisions
	 * @param end the upper bound of the range of full license committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching full license committee decisions
	 */
	public java.util.List<FullLicenseCommitteeDecision> findBygetFLCD_CD(
		String committeeDecision, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FullLicenseCommitteeDecision> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first full license committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching full license committee decision
	 * @throws NoSuchFullLicenseCommitteeDecisionException if a matching full license committee decision could not be found
	 */
	public FullLicenseCommitteeDecision findBygetFLCD_CD_First(
			String committeeDecision,
			com.liferay.portal.kernel.util.OrderByComparator
				<FullLicenseCommitteeDecision> orderByComparator)
		throws NoSuchFullLicenseCommitteeDecisionException;

	/**
	 * Returns the first full license committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching full license committee decision, or <code>null</code> if a matching full license committee decision could not be found
	 */
	public FullLicenseCommitteeDecision fetchBygetFLCD_CD_First(
		String committeeDecision,
		com.liferay.portal.kernel.util.OrderByComparator
			<FullLicenseCommitteeDecision> orderByComparator);

	/**
	 * Returns the last full license committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching full license committee decision
	 * @throws NoSuchFullLicenseCommitteeDecisionException if a matching full license committee decision could not be found
	 */
	public FullLicenseCommitteeDecision findBygetFLCD_CD_Last(
			String committeeDecision,
			com.liferay.portal.kernel.util.OrderByComparator
				<FullLicenseCommitteeDecision> orderByComparator)
		throws NoSuchFullLicenseCommitteeDecisionException;

	/**
	 * Returns the last full license committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching full license committee decision, or <code>null</code> if a matching full license committee decision could not be found
	 */
	public FullLicenseCommitteeDecision fetchBygetFLCD_CD_Last(
		String committeeDecision,
		com.liferay.portal.kernel.util.OrderByComparator
			<FullLicenseCommitteeDecision> orderByComparator);

	/**
	 * Returns the full license committee decisions before and after the current full license committee decision in the ordered set where committeeDecision = &#63;.
	 *
	 * @param fullLicenseCommitteeDecisionId the primary key of the current full license committee decision
	 * @param committeeDecision the committee decision
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next full license committee decision
	 * @throws NoSuchFullLicenseCommitteeDecisionException if a full license committee decision with the primary key could not be found
	 */
	public FullLicenseCommitteeDecision[] findBygetFLCD_CD_PrevAndNext(
			long fullLicenseCommitteeDecisionId, String committeeDecision,
			com.liferay.portal.kernel.util.OrderByComparator
				<FullLicenseCommitteeDecision> orderByComparator)
		throws NoSuchFullLicenseCommitteeDecisionException;

	/**
	 * Removes all the full license committee decisions where committeeDecision = &#63; from the database.
	 *
	 * @param committeeDecision the committee decision
	 */
	public void removeBygetFLCD_CD(String committeeDecision);

	/**
	 * Returns the number of full license committee decisions where committeeDecision = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @return the number of matching full license committee decisions
	 */
	public int countBygetFLCD_CD(String committeeDecision);

	/**
	 * Returns the full license committee decision where committeeDecision = &#63; and caseId = &#63; or throws a <code>NoSuchFullLicenseCommitteeDecisionException</code> if it could not be found.
	 *
	 * @param committeeDecision the committee decision
	 * @param caseId the case ID
	 * @return the matching full license committee decision
	 * @throws NoSuchFullLicenseCommitteeDecisionException if a matching full license committee decision could not be found
	 */
	public FullLicenseCommitteeDecision findBygetFLCD_CD_caseId(
			String committeeDecision, String caseId)
		throws NoSuchFullLicenseCommitteeDecisionException;

	/**
	 * Returns the full license committee decision where committeeDecision = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param committeeDecision the committee decision
	 * @param caseId the case ID
	 * @return the matching full license committee decision, or <code>null</code> if a matching full license committee decision could not be found
	 */
	public FullLicenseCommitteeDecision fetchBygetFLCD_CD_caseId(
		String committeeDecision, String caseId);

	/**
	 * Returns the full license committee decision where committeeDecision = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param committeeDecision the committee decision
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching full license committee decision, or <code>null</code> if a matching full license committee decision could not be found
	 */
	public FullLicenseCommitteeDecision fetchBygetFLCD_CD_caseId(
		String committeeDecision, String caseId, boolean useFinderCache);

	/**
	 * Removes the full license committee decision where committeeDecision = &#63; and caseId = &#63; from the database.
	 *
	 * @param committeeDecision the committee decision
	 * @param caseId the case ID
	 * @return the full license committee decision that was removed
	 */
	public FullLicenseCommitteeDecision removeBygetFLCD_CD_caseId(
			String committeeDecision, String caseId)
		throws NoSuchFullLicenseCommitteeDecisionException;

	/**
	 * Returns the number of full license committee decisions where committeeDecision = &#63; and caseId = &#63;.
	 *
	 * @param committeeDecision the committee decision
	 * @param caseId the case ID
	 * @return the number of matching full license committee decisions
	 */
	public int countBygetFLCD_CD_caseId(
		String committeeDecision, String caseId);

	/**
	 * Caches the full license committee decision in the entity cache if it is enabled.
	 *
	 * @param fullLicenseCommitteeDecision the full license committee decision
	 */
	public void cacheResult(
		FullLicenseCommitteeDecision fullLicenseCommitteeDecision);

	/**
	 * Caches the full license committee decisions in the entity cache if it is enabled.
	 *
	 * @param fullLicenseCommitteeDecisions the full license committee decisions
	 */
	public void cacheResult(
		java.util.List<FullLicenseCommitteeDecision>
			fullLicenseCommitteeDecisions);

	/**
	 * Creates a new full license committee decision with the primary key. Does not add the full license committee decision to the database.
	 *
	 * @param fullLicenseCommitteeDecisionId the primary key for the new full license committee decision
	 * @return the new full license committee decision
	 */
	public FullLicenseCommitteeDecision create(
		long fullLicenseCommitteeDecisionId);

	/**
	 * Removes the full license committee decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fullLicenseCommitteeDecisionId the primary key of the full license committee decision
	 * @return the full license committee decision that was removed
	 * @throws NoSuchFullLicenseCommitteeDecisionException if a full license committee decision with the primary key could not be found
	 */
	public FullLicenseCommitteeDecision remove(
			long fullLicenseCommitteeDecisionId)
		throws NoSuchFullLicenseCommitteeDecisionException;

	public FullLicenseCommitteeDecision updateImpl(
		FullLicenseCommitteeDecision fullLicenseCommitteeDecision);

	/**
	 * Returns the full license committee decision with the primary key or throws a <code>NoSuchFullLicenseCommitteeDecisionException</code> if it could not be found.
	 *
	 * @param fullLicenseCommitteeDecisionId the primary key of the full license committee decision
	 * @return the full license committee decision
	 * @throws NoSuchFullLicenseCommitteeDecisionException if a full license committee decision with the primary key could not be found
	 */
	public FullLicenseCommitteeDecision findByPrimaryKey(
			long fullLicenseCommitteeDecisionId)
		throws NoSuchFullLicenseCommitteeDecisionException;

	/**
	 * Returns the full license committee decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fullLicenseCommitteeDecisionId the primary key of the full license committee decision
	 * @return the full license committee decision, or <code>null</code> if a full license committee decision with the primary key could not be found
	 */
	public FullLicenseCommitteeDecision fetchByPrimaryKey(
		long fullLicenseCommitteeDecisionId);

	/**
	 * Returns all the full license committee decisions.
	 *
	 * @return the full license committee decisions
	 */
	public java.util.List<FullLicenseCommitteeDecision> findAll();

	/**
	 * Returns a range of all the full license committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FullLicenseCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of full license committee decisions
	 * @param end the upper bound of the range of full license committee decisions (not inclusive)
	 * @return the range of full license committee decisions
	 */
	public java.util.List<FullLicenseCommitteeDecision> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the full license committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FullLicenseCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of full license committee decisions
	 * @param end the upper bound of the range of full license committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of full license committee decisions
	 */
	public java.util.List<FullLicenseCommitteeDecision> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FullLicenseCommitteeDecision> orderByComparator);

	/**
	 * Returns an ordered range of all the full license committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FullLicenseCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of full license committee decisions
	 * @param end the upper bound of the range of full license committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of full license committee decisions
	 */
	public java.util.List<FullLicenseCommitteeDecision> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FullLicenseCommitteeDecision> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the full license committee decisions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of full license committee decisions.
	 *
	 * @return the number of full license committee decisions
	 */
	public int countAll();

}