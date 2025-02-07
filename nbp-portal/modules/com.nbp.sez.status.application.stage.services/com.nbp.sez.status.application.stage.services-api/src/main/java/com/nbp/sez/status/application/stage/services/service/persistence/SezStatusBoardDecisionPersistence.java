/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.stage.services.exception.NoSuchSezStatusBoardDecisionException;
import com.nbp.sez.status.application.stage.services.model.SezStatusBoardDecision;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez status board decision service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusBoardDecisionUtil
 * @generated
 */
@ProviderType
public interface SezStatusBoardDecisionPersistence
	extends BasePersistence<SezStatusBoardDecision> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezStatusBoardDecisionUtil} to access the sez status board decision persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the sez status board decisions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching sez status board decisions
	 */
	public java.util.List<SezStatusBoardDecision> findByUuid(String uuid);

	/**
	 * Returns a range of all the sez status board decisions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status board decisions
	 * @param end the upper bound of the range of sez status board decisions (not inclusive)
	 * @return the range of matching sez status board decisions
	 */
	public java.util.List<SezStatusBoardDecision> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the sez status board decisions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status board decisions
	 * @param end the upper bound of the range of sez status board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status board decisions
	 */
	public java.util.List<SezStatusBoardDecision> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusBoardDecision>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sez status board decisions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status board decisions
	 * @param end the upper bound of the range of sez status board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status board decisions
	 */
	public java.util.List<SezStatusBoardDecision> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusBoardDecision>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sez status board decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status board decision
	 * @throws NoSuchSezStatusBoardDecisionException if a matching sez status board decision could not be found
	 */
	public SezStatusBoardDecision findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusBoardDecision> orderByComparator)
		throws NoSuchSezStatusBoardDecisionException;

	/**
	 * Returns the first sez status board decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status board decision, or <code>null</code> if a matching sez status board decision could not be found
	 */
	public SezStatusBoardDecision fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusBoardDecision>
			orderByComparator);

	/**
	 * Returns the last sez status board decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status board decision
	 * @throws NoSuchSezStatusBoardDecisionException if a matching sez status board decision could not be found
	 */
	public SezStatusBoardDecision findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusBoardDecision> orderByComparator)
		throws NoSuchSezStatusBoardDecisionException;

	/**
	 * Returns the last sez status board decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status board decision, or <code>null</code> if a matching sez status board decision could not be found
	 */
	public SezStatusBoardDecision fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusBoardDecision>
			orderByComparator);

	/**
	 * Returns the sez status board decisions before and after the current sez status board decision in the ordered set where uuid = &#63;.
	 *
	 * @param sezStatusBoardId the primary key of the current sez status board decision
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status board decision
	 * @throws NoSuchSezStatusBoardDecisionException if a sez status board decision with the primary key could not be found
	 */
	public SezStatusBoardDecision[] findByUuid_PrevAndNext(
			long sezStatusBoardId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusBoardDecision> orderByComparator)
		throws NoSuchSezStatusBoardDecisionException;

	/**
	 * Removes all the sez status board decisions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of sez status board decisions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching sez status board decisions
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the sez status board decision where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSezStatusBoardDecisionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sez status board decision
	 * @throws NoSuchSezStatusBoardDecisionException if a matching sez status board decision could not be found
	 */
	public SezStatusBoardDecision findByUUID_G(String uuid, long groupId)
		throws NoSuchSezStatusBoardDecisionException;

	/**
	 * Returns the sez status board decision where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sez status board decision, or <code>null</code> if a matching sez status board decision could not be found
	 */
	public SezStatusBoardDecision fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the sez status board decision where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status board decision, or <code>null</code> if a matching sez status board decision could not be found
	 */
	public SezStatusBoardDecision fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the sez status board decision where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the sez status board decision that was removed
	 */
	public SezStatusBoardDecision removeByUUID_G(String uuid, long groupId)
		throws NoSuchSezStatusBoardDecisionException;

	/**
	 * Returns the number of sez status board decisions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching sez status board decisions
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the sez status board decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching sez status board decisions
	 */
	public java.util.List<SezStatusBoardDecision> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the sez status board decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status board decisions
	 * @param end the upper bound of the range of sez status board decisions (not inclusive)
	 * @return the range of matching sez status board decisions
	 */
	public java.util.List<SezStatusBoardDecision> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the sez status board decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status board decisions
	 * @param end the upper bound of the range of sez status board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status board decisions
	 */
	public java.util.List<SezStatusBoardDecision> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusBoardDecision>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sez status board decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status board decisions
	 * @param end the upper bound of the range of sez status board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status board decisions
	 */
	public java.util.List<SezStatusBoardDecision> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusBoardDecision>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sez status board decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status board decision
	 * @throws NoSuchSezStatusBoardDecisionException if a matching sez status board decision could not be found
	 */
	public SezStatusBoardDecision findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusBoardDecision> orderByComparator)
		throws NoSuchSezStatusBoardDecisionException;

	/**
	 * Returns the first sez status board decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status board decision, or <code>null</code> if a matching sez status board decision could not be found
	 */
	public SezStatusBoardDecision fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusBoardDecision>
			orderByComparator);

	/**
	 * Returns the last sez status board decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status board decision
	 * @throws NoSuchSezStatusBoardDecisionException if a matching sez status board decision could not be found
	 */
	public SezStatusBoardDecision findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusBoardDecision> orderByComparator)
		throws NoSuchSezStatusBoardDecisionException;

	/**
	 * Returns the last sez status board decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status board decision, or <code>null</code> if a matching sez status board decision could not be found
	 */
	public SezStatusBoardDecision fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusBoardDecision>
			orderByComparator);

	/**
	 * Returns the sez status board decisions before and after the current sez status board decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param sezStatusBoardId the primary key of the current sez status board decision
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status board decision
	 * @throws NoSuchSezStatusBoardDecisionException if a sez status board decision with the primary key could not be found
	 */
	public SezStatusBoardDecision[] findByUuid_C_PrevAndNext(
			long sezStatusBoardId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusBoardDecision> orderByComparator)
		throws NoSuchSezStatusBoardDecisionException;

	/**
	 * Removes all the sez status board decisions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of sez status board decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching sez status board decisions
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the sez status board decision where caseId = &#63; or throws a <code>NoSuchSezStatusBoardDecisionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status board decision
	 * @throws NoSuchSezStatusBoardDecisionException if a matching sez status board decision could not be found
	 */
	public SezStatusBoardDecision findBygetSezStatus_Board_Decision_By_CI(
			String caseId)
		throws NoSuchSezStatusBoardDecisionException;

	/**
	 * Returns the sez status board decision where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status board decision, or <code>null</code> if a matching sez status board decision could not be found
	 */
	public SezStatusBoardDecision fetchBygetSezStatus_Board_Decision_By_CI(
		String caseId);

	/**
	 * Returns the sez status board decision where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status board decision, or <code>null</code> if a matching sez status board decision could not be found
	 */
	public SezStatusBoardDecision fetchBygetSezStatus_Board_Decision_By_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the sez status board decision where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the sez status board decision that was removed
	 */
	public SezStatusBoardDecision removeBygetSezStatus_Board_Decision_By_CI(
			String caseId)
		throws NoSuchSezStatusBoardDecisionException;

	/**
	 * Returns the number of sez status board decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching sez status board decisions
	 */
	public int countBygetSezStatus_Board_Decision_By_CI(String caseId);

	/**
	 * Caches the sez status board decision in the entity cache if it is enabled.
	 *
	 * @param sezStatusBoardDecision the sez status board decision
	 */
	public void cacheResult(SezStatusBoardDecision sezStatusBoardDecision);

	/**
	 * Caches the sez status board decisions in the entity cache if it is enabled.
	 *
	 * @param sezStatusBoardDecisions the sez status board decisions
	 */
	public void cacheResult(
		java.util.List<SezStatusBoardDecision> sezStatusBoardDecisions);

	/**
	 * Creates a new sez status board decision with the primary key. Does not add the sez status board decision to the database.
	 *
	 * @param sezStatusBoardId the primary key for the new sez status board decision
	 * @return the new sez status board decision
	 */
	public SezStatusBoardDecision create(long sezStatusBoardId);

	/**
	 * Removes the sez status board decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezStatusBoardId the primary key of the sez status board decision
	 * @return the sez status board decision that was removed
	 * @throws NoSuchSezStatusBoardDecisionException if a sez status board decision with the primary key could not be found
	 */
	public SezStatusBoardDecision remove(long sezStatusBoardId)
		throws NoSuchSezStatusBoardDecisionException;

	public SezStatusBoardDecision updateImpl(
		SezStatusBoardDecision sezStatusBoardDecision);

	/**
	 * Returns the sez status board decision with the primary key or throws a <code>NoSuchSezStatusBoardDecisionException</code> if it could not be found.
	 *
	 * @param sezStatusBoardId the primary key of the sez status board decision
	 * @return the sez status board decision
	 * @throws NoSuchSezStatusBoardDecisionException if a sez status board decision with the primary key could not be found
	 */
	public SezStatusBoardDecision findByPrimaryKey(long sezStatusBoardId)
		throws NoSuchSezStatusBoardDecisionException;

	/**
	 * Returns the sez status board decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezStatusBoardId the primary key of the sez status board decision
	 * @return the sez status board decision, or <code>null</code> if a sez status board decision with the primary key could not be found
	 */
	public SezStatusBoardDecision fetchByPrimaryKey(long sezStatusBoardId);

	/**
	 * Returns all the sez status board decisions.
	 *
	 * @return the sez status board decisions
	 */
	public java.util.List<SezStatusBoardDecision> findAll();

	/**
	 * Returns a range of all the sez status board decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status board decisions
	 * @param end the upper bound of the range of sez status board decisions (not inclusive)
	 * @return the range of sez status board decisions
	 */
	public java.util.List<SezStatusBoardDecision> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the sez status board decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status board decisions
	 * @param end the upper bound of the range of sez status board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status board decisions
	 */
	public java.util.List<SezStatusBoardDecision> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusBoardDecision>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sez status board decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status board decisions
	 * @param end the upper bound of the range of sez status board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status board decisions
	 */
	public java.util.List<SezStatusBoardDecision> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusBoardDecision>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez status board decisions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez status board decisions.
	 *
	 * @return the number of sez status board decisions
	 */
	public int countAll();

}