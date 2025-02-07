/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.mining.stage.service.exception.NoSuchMiningApplicationMinisterialDecisionException;
import com.nbp.mining.stage.service.model.MiningApplicationMinisterialDecision;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the mining application ministerial decision service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationMinisterialDecisionUtil
 * @generated
 */
@ProviderType
public interface MiningApplicationMinisterialDecisionPersistence
	extends BasePersistence<MiningApplicationMinisterialDecision> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MiningApplicationMinisterialDecisionUtil} to access the mining application ministerial decision persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the mining application ministerial decisions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching mining application ministerial decisions
	 */
	public java.util.List<MiningApplicationMinisterialDecision> findByUuid(
		String uuid);

	/**
	 * Returns a range of all the mining application ministerial decisions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationMinisterialDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mining application ministerial decisions
	 * @param end the upper bound of the range of mining application ministerial decisions (not inclusive)
	 * @return the range of matching mining application ministerial decisions
	 */
	public java.util.List<MiningApplicationMinisterialDecision> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the mining application ministerial decisions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationMinisterialDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mining application ministerial decisions
	 * @param end the upper bound of the range of mining application ministerial decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application ministerial decisions
	 */
	public java.util.List<MiningApplicationMinisterialDecision> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationMinisterialDecision> orderByComparator);

	/**
	 * Returns an ordered range of all the mining application ministerial decisions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationMinisterialDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mining application ministerial decisions
	 * @param end the upper bound of the range of mining application ministerial decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application ministerial decisions
	 */
	public java.util.List<MiningApplicationMinisterialDecision> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationMinisterialDecision> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first mining application ministerial decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application ministerial decision
	 * @throws NoSuchMiningApplicationMinisterialDecisionException if a matching mining application ministerial decision could not be found
	 */
	public MiningApplicationMinisterialDecision findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationMinisterialDecision> orderByComparator)
		throws NoSuchMiningApplicationMinisterialDecisionException;

	/**
	 * Returns the first mining application ministerial decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application ministerial decision, or <code>null</code> if a matching mining application ministerial decision could not be found
	 */
	public MiningApplicationMinisterialDecision fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationMinisterialDecision> orderByComparator);

	/**
	 * Returns the last mining application ministerial decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application ministerial decision
	 * @throws NoSuchMiningApplicationMinisterialDecisionException if a matching mining application ministerial decision could not be found
	 */
	public MiningApplicationMinisterialDecision findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationMinisterialDecision> orderByComparator)
		throws NoSuchMiningApplicationMinisterialDecisionException;

	/**
	 * Returns the last mining application ministerial decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application ministerial decision, or <code>null</code> if a matching mining application ministerial decision could not be found
	 */
	public MiningApplicationMinisterialDecision fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationMinisterialDecision> orderByComparator);

	/**
	 * Returns the mining application ministerial decisions before and after the current mining application ministerial decision in the ordered set where uuid = &#63;.
	 *
	 * @param miningDecId the primary key of the current mining application ministerial decision
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application ministerial decision
	 * @throws NoSuchMiningApplicationMinisterialDecisionException if a mining application ministerial decision with the primary key could not be found
	 */
	public MiningApplicationMinisterialDecision[] findByUuid_PrevAndNext(
			long miningDecId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationMinisterialDecision> orderByComparator)
		throws NoSuchMiningApplicationMinisterialDecisionException;

	/**
	 * Removes all the mining application ministerial decisions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of mining application ministerial decisions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching mining application ministerial decisions
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the mining application ministerial decision where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMiningApplicationMinisterialDecisionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mining application ministerial decision
	 * @throws NoSuchMiningApplicationMinisterialDecisionException if a matching mining application ministerial decision could not be found
	 */
	public MiningApplicationMinisterialDecision findByUUID_G(
			String uuid, long groupId)
		throws NoSuchMiningApplicationMinisterialDecisionException;

	/**
	 * Returns the mining application ministerial decision where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mining application ministerial decision, or <code>null</code> if a matching mining application ministerial decision could not be found
	 */
	public MiningApplicationMinisterialDecision fetchByUUID_G(
		String uuid, long groupId);

	/**
	 * Returns the mining application ministerial decision where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining application ministerial decision, or <code>null</code> if a matching mining application ministerial decision could not be found
	 */
	public MiningApplicationMinisterialDecision fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the mining application ministerial decision where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the mining application ministerial decision that was removed
	 */
	public MiningApplicationMinisterialDecision removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchMiningApplicationMinisterialDecisionException;

	/**
	 * Returns the number of mining application ministerial decisions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching mining application ministerial decisions
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the mining application ministerial decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching mining application ministerial decisions
	 */
	public java.util.List<MiningApplicationMinisterialDecision> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the mining application ministerial decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationMinisterialDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mining application ministerial decisions
	 * @param end the upper bound of the range of mining application ministerial decisions (not inclusive)
	 * @return the range of matching mining application ministerial decisions
	 */
	public java.util.List<MiningApplicationMinisterialDecision> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the mining application ministerial decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationMinisterialDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mining application ministerial decisions
	 * @param end the upper bound of the range of mining application ministerial decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application ministerial decisions
	 */
	public java.util.List<MiningApplicationMinisterialDecision> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationMinisterialDecision> orderByComparator);

	/**
	 * Returns an ordered range of all the mining application ministerial decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationMinisterialDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mining application ministerial decisions
	 * @param end the upper bound of the range of mining application ministerial decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application ministerial decisions
	 */
	public java.util.List<MiningApplicationMinisterialDecision> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationMinisterialDecision> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first mining application ministerial decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application ministerial decision
	 * @throws NoSuchMiningApplicationMinisterialDecisionException if a matching mining application ministerial decision could not be found
	 */
	public MiningApplicationMinisterialDecision findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationMinisterialDecision> orderByComparator)
		throws NoSuchMiningApplicationMinisterialDecisionException;

	/**
	 * Returns the first mining application ministerial decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application ministerial decision, or <code>null</code> if a matching mining application ministerial decision could not be found
	 */
	public MiningApplicationMinisterialDecision fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationMinisterialDecision> orderByComparator);

	/**
	 * Returns the last mining application ministerial decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application ministerial decision
	 * @throws NoSuchMiningApplicationMinisterialDecisionException if a matching mining application ministerial decision could not be found
	 */
	public MiningApplicationMinisterialDecision findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationMinisterialDecision> orderByComparator)
		throws NoSuchMiningApplicationMinisterialDecisionException;

	/**
	 * Returns the last mining application ministerial decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application ministerial decision, or <code>null</code> if a matching mining application ministerial decision could not be found
	 */
	public MiningApplicationMinisterialDecision fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationMinisterialDecision> orderByComparator);

	/**
	 * Returns the mining application ministerial decisions before and after the current mining application ministerial decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param miningDecId the primary key of the current mining application ministerial decision
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application ministerial decision
	 * @throws NoSuchMiningApplicationMinisterialDecisionException if a mining application ministerial decision with the primary key could not be found
	 */
	public MiningApplicationMinisterialDecision[] findByUuid_C_PrevAndNext(
			long miningDecId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationMinisterialDecision> orderByComparator)
		throws NoSuchMiningApplicationMinisterialDecisionException;

	/**
	 * Removes all the mining application ministerial decisions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of mining application ministerial decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching mining application ministerial decisions
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the mining application ministerial decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching mining application ministerial decisions
	 */
	public java.util.List<MiningApplicationMinisterialDecision>
		findBygetMining_APP_List_By_CI(String caseId);

	/**
	 * Returns a range of all the mining application ministerial decisions where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationMinisterialDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of mining application ministerial decisions
	 * @param end the upper bound of the range of mining application ministerial decisions (not inclusive)
	 * @return the range of matching mining application ministerial decisions
	 */
	public java.util.List<MiningApplicationMinisterialDecision>
		findBygetMining_APP_List_By_CI(String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the mining application ministerial decisions where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationMinisterialDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of mining application ministerial decisions
	 * @param end the upper bound of the range of mining application ministerial decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application ministerial decisions
	 */
	public java.util.List<MiningApplicationMinisterialDecision>
		findBygetMining_APP_List_By_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationMinisterialDecision> orderByComparator);

	/**
	 * Returns an ordered range of all the mining application ministerial decisions where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationMinisterialDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of mining application ministerial decisions
	 * @param end the upper bound of the range of mining application ministerial decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application ministerial decisions
	 */
	public java.util.List<MiningApplicationMinisterialDecision>
		findBygetMining_APP_List_By_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationMinisterialDecision> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first mining application ministerial decision in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application ministerial decision
	 * @throws NoSuchMiningApplicationMinisterialDecisionException if a matching mining application ministerial decision could not be found
	 */
	public MiningApplicationMinisterialDecision
			findBygetMining_APP_List_By_CI_First(
				String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<MiningApplicationMinisterialDecision> orderByComparator)
		throws NoSuchMiningApplicationMinisterialDecisionException;

	/**
	 * Returns the first mining application ministerial decision in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application ministerial decision, or <code>null</code> if a matching mining application ministerial decision could not be found
	 */
	public MiningApplicationMinisterialDecision
		fetchBygetMining_APP_List_By_CI_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationMinisterialDecision> orderByComparator);

	/**
	 * Returns the last mining application ministerial decision in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application ministerial decision
	 * @throws NoSuchMiningApplicationMinisterialDecisionException if a matching mining application ministerial decision could not be found
	 */
	public MiningApplicationMinisterialDecision
			findBygetMining_APP_List_By_CI_Last(
				String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<MiningApplicationMinisterialDecision> orderByComparator)
		throws NoSuchMiningApplicationMinisterialDecisionException;

	/**
	 * Returns the last mining application ministerial decision in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application ministerial decision, or <code>null</code> if a matching mining application ministerial decision could not be found
	 */
	public MiningApplicationMinisterialDecision
		fetchBygetMining_APP_List_By_CI_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationMinisterialDecision> orderByComparator);

	/**
	 * Returns the mining application ministerial decisions before and after the current mining application ministerial decision in the ordered set where caseId = &#63;.
	 *
	 * @param miningDecId the primary key of the current mining application ministerial decision
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application ministerial decision
	 * @throws NoSuchMiningApplicationMinisterialDecisionException if a mining application ministerial decision with the primary key could not be found
	 */
	public MiningApplicationMinisterialDecision[]
			findBygetMining_APP_List_By_CI_PrevAndNext(
				long miningDecId, String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<MiningApplicationMinisterialDecision> orderByComparator)
		throws NoSuchMiningApplicationMinisterialDecisionException;

	/**
	 * Removes all the mining application ministerial decisions where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetMining_APP_List_By_CI(String caseId);

	/**
	 * Returns the number of mining application ministerial decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching mining application ministerial decisions
	 */
	public int countBygetMining_APP_List_By_CI(String caseId);

	/**
	 * Returns the mining application ministerial decision where caseId = &#63; or throws a <code>NoSuchMiningApplicationMinisterialDecisionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching mining application ministerial decision
	 * @throws NoSuchMiningApplicationMinisterialDecisionException if a matching mining application ministerial decision could not be found
	 */
	public MiningApplicationMinisterialDecision findBygetMining_APP_By_CI(
			String caseId)
		throws NoSuchMiningApplicationMinisterialDecisionException;

	/**
	 * Returns the mining application ministerial decision where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching mining application ministerial decision, or <code>null</code> if a matching mining application ministerial decision could not be found
	 */
	public MiningApplicationMinisterialDecision fetchBygetMining_APP_By_CI(
		String caseId);

	/**
	 * Returns the mining application ministerial decision where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining application ministerial decision, or <code>null</code> if a matching mining application ministerial decision could not be found
	 */
	public MiningApplicationMinisterialDecision fetchBygetMining_APP_By_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the mining application ministerial decision where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the mining application ministerial decision that was removed
	 */
	public MiningApplicationMinisterialDecision removeBygetMining_APP_By_CI(
			String caseId)
		throws NoSuchMiningApplicationMinisterialDecisionException;

	/**
	 * Returns the number of mining application ministerial decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching mining application ministerial decisions
	 */
	public int countBygetMining_APP_By_CI(String caseId);

	/**
	 * Caches the mining application ministerial decision in the entity cache if it is enabled.
	 *
	 * @param miningApplicationMinisterialDecision the mining application ministerial decision
	 */
	public void cacheResult(
		MiningApplicationMinisterialDecision
			miningApplicationMinisterialDecision);

	/**
	 * Caches the mining application ministerial decisions in the entity cache if it is enabled.
	 *
	 * @param miningApplicationMinisterialDecisions the mining application ministerial decisions
	 */
	public void cacheResult(
		java.util.List<MiningApplicationMinisterialDecision>
			miningApplicationMinisterialDecisions);

	/**
	 * Creates a new mining application ministerial decision with the primary key. Does not add the mining application ministerial decision to the database.
	 *
	 * @param miningDecId the primary key for the new mining application ministerial decision
	 * @return the new mining application ministerial decision
	 */
	public MiningApplicationMinisterialDecision create(long miningDecId);

	/**
	 * Removes the mining application ministerial decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningDecId the primary key of the mining application ministerial decision
	 * @return the mining application ministerial decision that was removed
	 * @throws NoSuchMiningApplicationMinisterialDecisionException if a mining application ministerial decision with the primary key could not be found
	 */
	public MiningApplicationMinisterialDecision remove(long miningDecId)
		throws NoSuchMiningApplicationMinisterialDecisionException;

	public MiningApplicationMinisterialDecision updateImpl(
		MiningApplicationMinisterialDecision
			miningApplicationMinisterialDecision);

	/**
	 * Returns the mining application ministerial decision with the primary key or throws a <code>NoSuchMiningApplicationMinisterialDecisionException</code> if it could not be found.
	 *
	 * @param miningDecId the primary key of the mining application ministerial decision
	 * @return the mining application ministerial decision
	 * @throws NoSuchMiningApplicationMinisterialDecisionException if a mining application ministerial decision with the primary key could not be found
	 */
	public MiningApplicationMinisterialDecision findByPrimaryKey(
			long miningDecId)
		throws NoSuchMiningApplicationMinisterialDecisionException;

	/**
	 * Returns the mining application ministerial decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningDecId the primary key of the mining application ministerial decision
	 * @return the mining application ministerial decision, or <code>null</code> if a mining application ministerial decision with the primary key could not be found
	 */
	public MiningApplicationMinisterialDecision fetchByPrimaryKey(
		long miningDecId);

	/**
	 * Returns all the mining application ministerial decisions.
	 *
	 * @return the mining application ministerial decisions
	 */
	public java.util.List<MiningApplicationMinisterialDecision> findAll();

	/**
	 * Returns a range of all the mining application ministerial decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationMinisterialDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application ministerial decisions
	 * @param end the upper bound of the range of mining application ministerial decisions (not inclusive)
	 * @return the range of mining application ministerial decisions
	 */
	public java.util.List<MiningApplicationMinisterialDecision> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the mining application ministerial decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationMinisterialDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application ministerial decisions
	 * @param end the upper bound of the range of mining application ministerial decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining application ministerial decisions
	 */
	public java.util.List<MiningApplicationMinisterialDecision> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationMinisterialDecision> orderByComparator);

	/**
	 * Returns an ordered range of all the mining application ministerial decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationMinisterialDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application ministerial decisions
	 * @param end the upper bound of the range of mining application ministerial decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining application ministerial decisions
	 */
	public java.util.List<MiningApplicationMinisterialDecision> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationMinisterialDecision> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the mining application ministerial decisions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of mining application ministerial decisions.
	 *
	 * @return the number of mining application ministerial decisions
	 */
	public int countAll();

}