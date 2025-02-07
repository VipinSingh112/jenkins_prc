/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.mining.stage.service.exception.NoSuchMiningApplicationDueDiligenceException;
import com.nbp.mining.stage.service.model.MiningApplicationDueDiligence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the mining application due diligence service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationDueDiligenceUtil
 * @generated
 */
@ProviderType
public interface MiningApplicationDueDiligencePersistence
	extends BasePersistence<MiningApplicationDueDiligence> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MiningApplicationDueDiligenceUtil} to access the mining application due diligence persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the mining application due diligences where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching mining application due diligences
	 */
	public java.util.List<MiningApplicationDueDiligence> findByUuid(
		String uuid);

	/**
	 * Returns a range of all the mining application due diligences where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @return the range of matching mining application due diligences
	 */
	public java.util.List<MiningApplicationDueDiligence> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the mining application due diligences where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application due diligences
	 */
	public java.util.List<MiningApplicationDueDiligence> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationDueDiligence> orderByComparator);

	/**
	 * Returns an ordered range of all the mining application due diligences where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application due diligences
	 */
	public java.util.List<MiningApplicationDueDiligence> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationDueDiligence> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first mining application due diligence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a matching mining application due diligence could not be found
	 */
	public MiningApplicationDueDiligence findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationDueDiligence> orderByComparator)
		throws NoSuchMiningApplicationDueDiligenceException;

	/**
	 * Returns the first mining application due diligence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application due diligence, or <code>null</code> if a matching mining application due diligence could not be found
	 */
	public MiningApplicationDueDiligence fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationDueDiligence> orderByComparator);

	/**
	 * Returns the last mining application due diligence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a matching mining application due diligence could not be found
	 */
	public MiningApplicationDueDiligence findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationDueDiligence> orderByComparator)
		throws NoSuchMiningApplicationDueDiligenceException;

	/**
	 * Returns the last mining application due diligence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application due diligence, or <code>null</code> if a matching mining application due diligence could not be found
	 */
	public MiningApplicationDueDiligence fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationDueDiligence> orderByComparator);

	/**
	 * Returns the mining application due diligences before and after the current mining application due diligence in the ordered set where uuid = &#63;.
	 *
	 * @param miningDueDiliId the primary key of the current mining application due diligence
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a mining application due diligence with the primary key could not be found
	 */
	public MiningApplicationDueDiligence[] findByUuid_PrevAndNext(
			long miningDueDiliId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationDueDiligence> orderByComparator)
		throws NoSuchMiningApplicationDueDiligenceException;

	/**
	 * Removes all the mining application due diligences where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of mining application due diligences where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching mining application due diligences
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the mining application due diligence where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMiningApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a matching mining application due diligence could not be found
	 */
	public MiningApplicationDueDiligence findByUUID_G(String uuid, long groupId)
		throws NoSuchMiningApplicationDueDiligenceException;

	/**
	 * Returns the mining application due diligence where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mining application due diligence, or <code>null</code> if a matching mining application due diligence could not be found
	 */
	public MiningApplicationDueDiligence fetchByUUID_G(
		String uuid, long groupId);

	/**
	 * Returns the mining application due diligence where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining application due diligence, or <code>null</code> if a matching mining application due diligence could not be found
	 */
	public MiningApplicationDueDiligence fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the mining application due diligence where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the mining application due diligence that was removed
	 */
	public MiningApplicationDueDiligence removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchMiningApplicationDueDiligenceException;

	/**
	 * Returns the number of mining application due diligences where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching mining application due diligences
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the mining application due diligences where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching mining application due diligences
	 */
	public java.util.List<MiningApplicationDueDiligence> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the mining application due diligences where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @return the range of matching mining application due diligences
	 */
	public java.util.List<MiningApplicationDueDiligence> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the mining application due diligences where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application due diligences
	 */
	public java.util.List<MiningApplicationDueDiligence> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationDueDiligence> orderByComparator);

	/**
	 * Returns an ordered range of all the mining application due diligences where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application due diligences
	 */
	public java.util.List<MiningApplicationDueDiligence> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationDueDiligence> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first mining application due diligence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a matching mining application due diligence could not be found
	 */
	public MiningApplicationDueDiligence findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationDueDiligence> orderByComparator)
		throws NoSuchMiningApplicationDueDiligenceException;

	/**
	 * Returns the first mining application due diligence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application due diligence, or <code>null</code> if a matching mining application due diligence could not be found
	 */
	public MiningApplicationDueDiligence fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationDueDiligence> orderByComparator);

	/**
	 * Returns the last mining application due diligence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a matching mining application due diligence could not be found
	 */
	public MiningApplicationDueDiligence findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationDueDiligence> orderByComparator)
		throws NoSuchMiningApplicationDueDiligenceException;

	/**
	 * Returns the last mining application due diligence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application due diligence, or <code>null</code> if a matching mining application due diligence could not be found
	 */
	public MiningApplicationDueDiligence fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationDueDiligence> orderByComparator);

	/**
	 * Returns the mining application due diligences before and after the current mining application due diligence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param miningDueDiliId the primary key of the current mining application due diligence
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a mining application due diligence with the primary key could not be found
	 */
	public MiningApplicationDueDiligence[] findByUuid_C_PrevAndNext(
			long miningDueDiliId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationDueDiligence> orderByComparator)
		throws NoSuchMiningApplicationDueDiligenceException;

	/**
	 * Removes all the mining application due diligences where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of mining application due diligences where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching mining application due diligences
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the mining application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching mining application due diligences
	 */
	public java.util.List<MiningApplicationDueDiligence>
		findBygetMining_APP_List_By_CI(String caseId);

	/**
	 * Returns a range of all the mining application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @return the range of matching mining application due diligences
	 */
	public java.util.List<MiningApplicationDueDiligence>
		findBygetMining_APP_List_By_CI(String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the mining application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application due diligences
	 */
	public java.util.List<MiningApplicationDueDiligence>
		findBygetMining_APP_List_By_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationDueDiligence> orderByComparator);

	/**
	 * Returns an ordered range of all the mining application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application due diligences
	 */
	public java.util.List<MiningApplicationDueDiligence>
		findBygetMining_APP_List_By_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationDueDiligence> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first mining application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a matching mining application due diligence could not be found
	 */
	public MiningApplicationDueDiligence findBygetMining_APP_List_By_CI_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationDueDiligence> orderByComparator)
		throws NoSuchMiningApplicationDueDiligenceException;

	/**
	 * Returns the first mining application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application due diligence, or <code>null</code> if a matching mining application due diligence could not be found
	 */
	public MiningApplicationDueDiligence fetchBygetMining_APP_List_By_CI_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationDueDiligence> orderByComparator);

	/**
	 * Returns the last mining application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a matching mining application due diligence could not be found
	 */
	public MiningApplicationDueDiligence findBygetMining_APP_List_By_CI_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationDueDiligence> orderByComparator)
		throws NoSuchMiningApplicationDueDiligenceException;

	/**
	 * Returns the last mining application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application due diligence, or <code>null</code> if a matching mining application due diligence could not be found
	 */
	public MiningApplicationDueDiligence fetchBygetMining_APP_List_By_CI_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationDueDiligence> orderByComparator);

	/**
	 * Returns the mining application due diligences before and after the current mining application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param miningDueDiliId the primary key of the current mining application due diligence
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a mining application due diligence with the primary key could not be found
	 */
	public MiningApplicationDueDiligence[]
			findBygetMining_APP_List_By_CI_PrevAndNext(
				long miningDueDiliId, String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<MiningApplicationDueDiligence> orderByComparator)
		throws NoSuchMiningApplicationDueDiligenceException;

	/**
	 * Removes all the mining application due diligences where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetMining_APP_List_By_CI(String caseId);

	/**
	 * Returns the number of mining application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching mining application due diligences
	 */
	public int countBygetMining_APP_List_By_CI(String caseId);

	/**
	 * Returns the mining application due diligence where caseId = &#63; or throws a <code>NoSuchMiningApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a matching mining application due diligence could not be found
	 */
	public MiningApplicationDueDiligence findBygetMining_APP_By_CI(
			String caseId)
		throws NoSuchMiningApplicationDueDiligenceException;

	/**
	 * Returns the mining application due diligence where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching mining application due diligence, or <code>null</code> if a matching mining application due diligence could not be found
	 */
	public MiningApplicationDueDiligence fetchBygetMining_APP_By_CI(
		String caseId);

	/**
	 * Returns the mining application due diligence where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining application due diligence, or <code>null</code> if a matching mining application due diligence could not be found
	 */
	public MiningApplicationDueDiligence fetchBygetMining_APP_By_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the mining application due diligence where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the mining application due diligence that was removed
	 */
	public MiningApplicationDueDiligence removeBygetMining_APP_By_CI(
			String caseId)
		throws NoSuchMiningApplicationDueDiligenceException;

	/**
	 * Returns the number of mining application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching mining application due diligences
	 */
	public int countBygetMining_APP_By_CI(String caseId);

	/**
	 * Caches the mining application due diligence in the entity cache if it is enabled.
	 *
	 * @param miningApplicationDueDiligence the mining application due diligence
	 */
	public void cacheResult(
		MiningApplicationDueDiligence miningApplicationDueDiligence);

	/**
	 * Caches the mining application due diligences in the entity cache if it is enabled.
	 *
	 * @param miningApplicationDueDiligences the mining application due diligences
	 */
	public void cacheResult(
		java.util.List<MiningApplicationDueDiligence>
			miningApplicationDueDiligences);

	/**
	 * Creates a new mining application due diligence with the primary key. Does not add the mining application due diligence to the database.
	 *
	 * @param miningDueDiliId the primary key for the new mining application due diligence
	 * @return the new mining application due diligence
	 */
	public MiningApplicationDueDiligence create(long miningDueDiliId);

	/**
	 * Removes the mining application due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningDueDiliId the primary key of the mining application due diligence
	 * @return the mining application due diligence that was removed
	 * @throws NoSuchMiningApplicationDueDiligenceException if a mining application due diligence with the primary key could not be found
	 */
	public MiningApplicationDueDiligence remove(long miningDueDiliId)
		throws NoSuchMiningApplicationDueDiligenceException;

	public MiningApplicationDueDiligence updateImpl(
		MiningApplicationDueDiligence miningApplicationDueDiligence);

	/**
	 * Returns the mining application due diligence with the primary key or throws a <code>NoSuchMiningApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param miningDueDiliId the primary key of the mining application due diligence
	 * @return the mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a mining application due diligence with the primary key could not be found
	 */
	public MiningApplicationDueDiligence findByPrimaryKey(long miningDueDiliId)
		throws NoSuchMiningApplicationDueDiligenceException;

	/**
	 * Returns the mining application due diligence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningDueDiliId the primary key of the mining application due diligence
	 * @return the mining application due diligence, or <code>null</code> if a mining application due diligence with the primary key could not be found
	 */
	public MiningApplicationDueDiligence fetchByPrimaryKey(
		long miningDueDiliId);

	/**
	 * Returns all the mining application due diligences.
	 *
	 * @return the mining application due diligences
	 */
	public java.util.List<MiningApplicationDueDiligence> findAll();

	/**
	 * Returns a range of all the mining application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @return the range of mining application due diligences
	 */
	public java.util.List<MiningApplicationDueDiligence> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the mining application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining application due diligences
	 */
	public java.util.List<MiningApplicationDueDiligence> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationDueDiligence> orderByComparator);

	/**
	 * Returns an ordered range of all the mining application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining application due diligences
	 */
	public java.util.List<MiningApplicationDueDiligence> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationDueDiligence> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the mining application due diligences from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of mining application due diligences.
	 *
	 * @return the number of mining application due diligences
	 */
	public int countAll();

}