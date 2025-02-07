/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.stage.services.exception.NoSuchSezStatusARCDecisionException;
import com.nbp.sez.status.application.stage.services.model.SezStatusARCDecision;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez status arc decision service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusARCDecisionUtil
 * @generated
 */
@ProviderType
public interface SezStatusARCDecisionPersistence
	extends BasePersistence<SezStatusARCDecision> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezStatusARCDecisionUtil} to access the sez status arc decision persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the sez status arc decisions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching sez status arc decisions
	 */
	public java.util.List<SezStatusARCDecision> findByUuid(String uuid);

	/**
	 * Returns a range of all the sez status arc decisions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusARCDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status arc decisions
	 * @param end the upper bound of the range of sez status arc decisions (not inclusive)
	 * @return the range of matching sez status arc decisions
	 */
	public java.util.List<SezStatusARCDecision> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the sez status arc decisions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusARCDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status arc decisions
	 * @param end the upper bound of the range of sez status arc decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status arc decisions
	 */
	public java.util.List<SezStatusARCDecision> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusARCDecision>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sez status arc decisions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusARCDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status arc decisions
	 * @param end the upper bound of the range of sez status arc decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status arc decisions
	 */
	public java.util.List<SezStatusARCDecision> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusARCDecision>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sez status arc decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status arc decision
	 * @throws NoSuchSezStatusARCDecisionException if a matching sez status arc decision could not be found
	 */
	public SezStatusARCDecision findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusARCDecision> orderByComparator)
		throws NoSuchSezStatusARCDecisionException;

	/**
	 * Returns the first sez status arc decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status arc decision, or <code>null</code> if a matching sez status arc decision could not be found
	 */
	public SezStatusARCDecision fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusARCDecision>
			orderByComparator);

	/**
	 * Returns the last sez status arc decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status arc decision
	 * @throws NoSuchSezStatusARCDecisionException if a matching sez status arc decision could not be found
	 */
	public SezStatusARCDecision findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusARCDecision> orderByComparator)
		throws NoSuchSezStatusARCDecisionException;

	/**
	 * Returns the last sez status arc decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status arc decision, or <code>null</code> if a matching sez status arc decision could not be found
	 */
	public SezStatusARCDecision fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusARCDecision>
			orderByComparator);

	/**
	 * Returns the sez status arc decisions before and after the current sez status arc decision in the ordered set where uuid = &#63;.
	 *
	 * @param sezStatusCommitteeId the primary key of the current sez status arc decision
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status arc decision
	 * @throws NoSuchSezStatusARCDecisionException if a sez status arc decision with the primary key could not be found
	 */
	public SezStatusARCDecision[] findByUuid_PrevAndNext(
			long sezStatusCommitteeId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusARCDecision> orderByComparator)
		throws NoSuchSezStatusARCDecisionException;

	/**
	 * Removes all the sez status arc decisions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of sez status arc decisions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching sez status arc decisions
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the sez status arc decision where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSezStatusARCDecisionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sez status arc decision
	 * @throws NoSuchSezStatusARCDecisionException if a matching sez status arc decision could not be found
	 */
	public SezStatusARCDecision findByUUID_G(String uuid, long groupId)
		throws NoSuchSezStatusARCDecisionException;

	/**
	 * Returns the sez status arc decision where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sez status arc decision, or <code>null</code> if a matching sez status arc decision could not be found
	 */
	public SezStatusARCDecision fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the sez status arc decision where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status arc decision, or <code>null</code> if a matching sez status arc decision could not be found
	 */
	public SezStatusARCDecision fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the sez status arc decision where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the sez status arc decision that was removed
	 */
	public SezStatusARCDecision removeByUUID_G(String uuid, long groupId)
		throws NoSuchSezStatusARCDecisionException;

	/**
	 * Returns the number of sez status arc decisions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching sez status arc decisions
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the sez status arc decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching sez status arc decisions
	 */
	public java.util.List<SezStatusARCDecision> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the sez status arc decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusARCDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status arc decisions
	 * @param end the upper bound of the range of sez status arc decisions (not inclusive)
	 * @return the range of matching sez status arc decisions
	 */
	public java.util.List<SezStatusARCDecision> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the sez status arc decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusARCDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status arc decisions
	 * @param end the upper bound of the range of sez status arc decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status arc decisions
	 */
	public java.util.List<SezStatusARCDecision> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusARCDecision>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sez status arc decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusARCDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status arc decisions
	 * @param end the upper bound of the range of sez status arc decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status arc decisions
	 */
	public java.util.List<SezStatusARCDecision> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusARCDecision>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sez status arc decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status arc decision
	 * @throws NoSuchSezStatusARCDecisionException if a matching sez status arc decision could not be found
	 */
	public SezStatusARCDecision findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusARCDecision> orderByComparator)
		throws NoSuchSezStatusARCDecisionException;

	/**
	 * Returns the first sez status arc decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status arc decision, or <code>null</code> if a matching sez status arc decision could not be found
	 */
	public SezStatusARCDecision fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusARCDecision>
			orderByComparator);

	/**
	 * Returns the last sez status arc decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status arc decision
	 * @throws NoSuchSezStatusARCDecisionException if a matching sez status arc decision could not be found
	 */
	public SezStatusARCDecision findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusARCDecision> orderByComparator)
		throws NoSuchSezStatusARCDecisionException;

	/**
	 * Returns the last sez status arc decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status arc decision, or <code>null</code> if a matching sez status arc decision could not be found
	 */
	public SezStatusARCDecision fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusARCDecision>
			orderByComparator);

	/**
	 * Returns the sez status arc decisions before and after the current sez status arc decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param sezStatusCommitteeId the primary key of the current sez status arc decision
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status arc decision
	 * @throws NoSuchSezStatusARCDecisionException if a sez status arc decision with the primary key could not be found
	 */
	public SezStatusARCDecision[] findByUuid_C_PrevAndNext(
			long sezStatusCommitteeId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusARCDecision> orderByComparator)
		throws NoSuchSezStatusARCDecisionException;

	/**
	 * Removes all the sez status arc decisions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of sez status arc decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching sez status arc decisions
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the sez status arc decision where caseId = &#63; or throws a <code>NoSuchSezStatusARCDecisionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status arc decision
	 * @throws NoSuchSezStatusARCDecisionException if a matching sez status arc decision could not be found
	 */
	public SezStatusARCDecision findBygetSezStatus_Committee_Decision_By_CI(
			String caseId)
		throws NoSuchSezStatusARCDecisionException;

	/**
	 * Returns the sez status arc decision where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status arc decision, or <code>null</code> if a matching sez status arc decision could not be found
	 */
	public SezStatusARCDecision fetchBygetSezStatus_Committee_Decision_By_CI(
		String caseId);

	/**
	 * Returns the sez status arc decision where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status arc decision, or <code>null</code> if a matching sez status arc decision could not be found
	 */
	public SezStatusARCDecision fetchBygetSezStatus_Committee_Decision_By_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the sez status arc decision where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the sez status arc decision that was removed
	 */
	public SezStatusARCDecision removeBygetSezStatus_Committee_Decision_By_CI(
			String caseId)
		throws NoSuchSezStatusARCDecisionException;

	/**
	 * Returns the number of sez status arc decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching sez status arc decisions
	 */
	public int countBygetSezStatus_Committee_Decision_By_CI(String caseId);

	/**
	 * Caches the sez status arc decision in the entity cache if it is enabled.
	 *
	 * @param sezStatusARCDecision the sez status arc decision
	 */
	public void cacheResult(SezStatusARCDecision sezStatusARCDecision);

	/**
	 * Caches the sez status arc decisions in the entity cache if it is enabled.
	 *
	 * @param sezStatusARCDecisions the sez status arc decisions
	 */
	public void cacheResult(
		java.util.List<SezStatusARCDecision> sezStatusARCDecisions);

	/**
	 * Creates a new sez status arc decision with the primary key. Does not add the sez status arc decision to the database.
	 *
	 * @param sezStatusCommitteeId the primary key for the new sez status arc decision
	 * @return the new sez status arc decision
	 */
	public SezStatusARCDecision create(long sezStatusCommitteeId);

	/**
	 * Removes the sez status arc decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezStatusCommitteeId the primary key of the sez status arc decision
	 * @return the sez status arc decision that was removed
	 * @throws NoSuchSezStatusARCDecisionException if a sez status arc decision with the primary key could not be found
	 */
	public SezStatusARCDecision remove(long sezStatusCommitteeId)
		throws NoSuchSezStatusARCDecisionException;

	public SezStatusARCDecision updateImpl(
		SezStatusARCDecision sezStatusARCDecision);

	/**
	 * Returns the sez status arc decision with the primary key or throws a <code>NoSuchSezStatusARCDecisionException</code> if it could not be found.
	 *
	 * @param sezStatusCommitteeId the primary key of the sez status arc decision
	 * @return the sez status arc decision
	 * @throws NoSuchSezStatusARCDecisionException if a sez status arc decision with the primary key could not be found
	 */
	public SezStatusARCDecision findByPrimaryKey(long sezStatusCommitteeId)
		throws NoSuchSezStatusARCDecisionException;

	/**
	 * Returns the sez status arc decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezStatusCommitteeId the primary key of the sez status arc decision
	 * @return the sez status arc decision, or <code>null</code> if a sez status arc decision with the primary key could not be found
	 */
	public SezStatusARCDecision fetchByPrimaryKey(long sezStatusCommitteeId);

	/**
	 * Returns all the sez status arc decisions.
	 *
	 * @return the sez status arc decisions
	 */
	public java.util.List<SezStatusARCDecision> findAll();

	/**
	 * Returns a range of all the sez status arc decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusARCDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status arc decisions
	 * @param end the upper bound of the range of sez status arc decisions (not inclusive)
	 * @return the range of sez status arc decisions
	 */
	public java.util.List<SezStatusARCDecision> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the sez status arc decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusARCDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status arc decisions
	 * @param end the upper bound of the range of sez status arc decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status arc decisions
	 */
	public java.util.List<SezStatusARCDecision> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusARCDecision>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sez status arc decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusARCDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status arc decisions
	 * @param end the upper bound of the range of sez status arc decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status arc decisions
	 */
	public java.util.List<SezStatusARCDecision> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusARCDecision>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez status arc decisions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez status arc decisions.
	 *
	 * @return the number of sez status arc decisions
	 */
	public int countAll();

}