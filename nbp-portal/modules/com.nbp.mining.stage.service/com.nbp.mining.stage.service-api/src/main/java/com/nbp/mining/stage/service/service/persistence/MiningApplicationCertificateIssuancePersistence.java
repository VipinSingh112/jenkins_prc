/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.mining.stage.service.exception.NoSuchMiningApplicationCertificateIssuanceException;
import com.nbp.mining.stage.service.model.MiningApplicationCertificateIssuance;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the mining application certificate issuance service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationCertificateIssuanceUtil
 * @generated
 */
@ProviderType
public interface MiningApplicationCertificateIssuancePersistence
	extends BasePersistence<MiningApplicationCertificateIssuance> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MiningApplicationCertificateIssuanceUtil} to access the mining application certificate issuance persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the mining application certificate issuances where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching mining application certificate issuances
	 */
	public java.util.List<MiningApplicationCertificateIssuance> findByUuid(
		String uuid);

	/**
	 * Returns a range of all the mining application certificate issuances where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mining application certificate issuances
	 * @param end the upper bound of the range of mining application certificate issuances (not inclusive)
	 * @return the range of matching mining application certificate issuances
	 */
	public java.util.List<MiningApplicationCertificateIssuance> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the mining application certificate issuances where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mining application certificate issuances
	 * @param end the upper bound of the range of mining application certificate issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application certificate issuances
	 */
	public java.util.List<MiningApplicationCertificateIssuance> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationCertificateIssuance> orderByComparator);

	/**
	 * Returns an ordered range of all the mining application certificate issuances where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mining application certificate issuances
	 * @param end the upper bound of the range of mining application certificate issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application certificate issuances
	 */
	public java.util.List<MiningApplicationCertificateIssuance> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationCertificateIssuance> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first mining application certificate issuance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application certificate issuance
	 * @throws NoSuchMiningApplicationCertificateIssuanceException if a matching mining application certificate issuance could not be found
	 */
	public MiningApplicationCertificateIssuance findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationCertificateIssuance> orderByComparator)
		throws NoSuchMiningApplicationCertificateIssuanceException;

	/**
	 * Returns the first mining application certificate issuance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application certificate issuance, or <code>null</code> if a matching mining application certificate issuance could not be found
	 */
	public MiningApplicationCertificateIssuance fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationCertificateIssuance> orderByComparator);

	/**
	 * Returns the last mining application certificate issuance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application certificate issuance
	 * @throws NoSuchMiningApplicationCertificateIssuanceException if a matching mining application certificate issuance could not be found
	 */
	public MiningApplicationCertificateIssuance findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationCertificateIssuance> orderByComparator)
		throws NoSuchMiningApplicationCertificateIssuanceException;

	/**
	 * Returns the last mining application certificate issuance in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application certificate issuance, or <code>null</code> if a matching mining application certificate issuance could not be found
	 */
	public MiningApplicationCertificateIssuance fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationCertificateIssuance> orderByComparator);

	/**
	 * Returns the mining application certificate issuances before and after the current mining application certificate issuance in the ordered set where uuid = &#63;.
	 *
	 * @param miningCertIssuId the primary key of the current mining application certificate issuance
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application certificate issuance
	 * @throws NoSuchMiningApplicationCertificateIssuanceException if a mining application certificate issuance with the primary key could not be found
	 */
	public MiningApplicationCertificateIssuance[] findByUuid_PrevAndNext(
			long miningCertIssuId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationCertificateIssuance> orderByComparator)
		throws NoSuchMiningApplicationCertificateIssuanceException;

	/**
	 * Removes all the mining application certificate issuances where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of mining application certificate issuances where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching mining application certificate issuances
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the mining application certificate issuance where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMiningApplicationCertificateIssuanceException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mining application certificate issuance
	 * @throws NoSuchMiningApplicationCertificateIssuanceException if a matching mining application certificate issuance could not be found
	 */
	public MiningApplicationCertificateIssuance findByUUID_G(
			String uuid, long groupId)
		throws NoSuchMiningApplicationCertificateIssuanceException;

	/**
	 * Returns the mining application certificate issuance where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mining application certificate issuance, or <code>null</code> if a matching mining application certificate issuance could not be found
	 */
	public MiningApplicationCertificateIssuance fetchByUUID_G(
		String uuid, long groupId);

	/**
	 * Returns the mining application certificate issuance where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining application certificate issuance, or <code>null</code> if a matching mining application certificate issuance could not be found
	 */
	public MiningApplicationCertificateIssuance fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the mining application certificate issuance where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the mining application certificate issuance that was removed
	 */
	public MiningApplicationCertificateIssuance removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchMiningApplicationCertificateIssuanceException;

	/**
	 * Returns the number of mining application certificate issuances where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching mining application certificate issuances
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the mining application certificate issuances where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching mining application certificate issuances
	 */
	public java.util.List<MiningApplicationCertificateIssuance> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the mining application certificate issuances where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mining application certificate issuances
	 * @param end the upper bound of the range of mining application certificate issuances (not inclusive)
	 * @return the range of matching mining application certificate issuances
	 */
	public java.util.List<MiningApplicationCertificateIssuance> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the mining application certificate issuances where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mining application certificate issuances
	 * @param end the upper bound of the range of mining application certificate issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application certificate issuances
	 */
	public java.util.List<MiningApplicationCertificateIssuance> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationCertificateIssuance> orderByComparator);

	/**
	 * Returns an ordered range of all the mining application certificate issuances where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mining application certificate issuances
	 * @param end the upper bound of the range of mining application certificate issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application certificate issuances
	 */
	public java.util.List<MiningApplicationCertificateIssuance> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationCertificateIssuance> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first mining application certificate issuance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application certificate issuance
	 * @throws NoSuchMiningApplicationCertificateIssuanceException if a matching mining application certificate issuance could not be found
	 */
	public MiningApplicationCertificateIssuance findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationCertificateIssuance> orderByComparator)
		throws NoSuchMiningApplicationCertificateIssuanceException;

	/**
	 * Returns the first mining application certificate issuance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application certificate issuance, or <code>null</code> if a matching mining application certificate issuance could not be found
	 */
	public MiningApplicationCertificateIssuance fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationCertificateIssuance> orderByComparator);

	/**
	 * Returns the last mining application certificate issuance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application certificate issuance
	 * @throws NoSuchMiningApplicationCertificateIssuanceException if a matching mining application certificate issuance could not be found
	 */
	public MiningApplicationCertificateIssuance findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationCertificateIssuance> orderByComparator)
		throws NoSuchMiningApplicationCertificateIssuanceException;

	/**
	 * Returns the last mining application certificate issuance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application certificate issuance, or <code>null</code> if a matching mining application certificate issuance could not be found
	 */
	public MiningApplicationCertificateIssuance fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationCertificateIssuance> orderByComparator);

	/**
	 * Returns the mining application certificate issuances before and after the current mining application certificate issuance in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param miningCertIssuId the primary key of the current mining application certificate issuance
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application certificate issuance
	 * @throws NoSuchMiningApplicationCertificateIssuanceException if a mining application certificate issuance with the primary key could not be found
	 */
	public MiningApplicationCertificateIssuance[] findByUuid_C_PrevAndNext(
			long miningCertIssuId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationCertificateIssuance> orderByComparator)
		throws NoSuchMiningApplicationCertificateIssuanceException;

	/**
	 * Removes all the mining application certificate issuances where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of mining application certificate issuances where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching mining application certificate issuances
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the mining application certificate issuances where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching mining application certificate issuances
	 */
	public java.util.List<MiningApplicationCertificateIssuance>
		findBygetMining_APP_List_By_CI(String caseId);

	/**
	 * Returns a range of all the mining application certificate issuances where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of mining application certificate issuances
	 * @param end the upper bound of the range of mining application certificate issuances (not inclusive)
	 * @return the range of matching mining application certificate issuances
	 */
	public java.util.List<MiningApplicationCertificateIssuance>
		findBygetMining_APP_List_By_CI(String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the mining application certificate issuances where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of mining application certificate issuances
	 * @param end the upper bound of the range of mining application certificate issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application certificate issuances
	 */
	public java.util.List<MiningApplicationCertificateIssuance>
		findBygetMining_APP_List_By_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationCertificateIssuance> orderByComparator);

	/**
	 * Returns an ordered range of all the mining application certificate issuances where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of mining application certificate issuances
	 * @param end the upper bound of the range of mining application certificate issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application certificate issuances
	 */
	public java.util.List<MiningApplicationCertificateIssuance>
		findBygetMining_APP_List_By_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationCertificateIssuance> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first mining application certificate issuance in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application certificate issuance
	 * @throws NoSuchMiningApplicationCertificateIssuanceException if a matching mining application certificate issuance could not be found
	 */
	public MiningApplicationCertificateIssuance
			findBygetMining_APP_List_By_CI_First(
				String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<MiningApplicationCertificateIssuance> orderByComparator)
		throws NoSuchMiningApplicationCertificateIssuanceException;

	/**
	 * Returns the first mining application certificate issuance in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application certificate issuance, or <code>null</code> if a matching mining application certificate issuance could not be found
	 */
	public MiningApplicationCertificateIssuance
		fetchBygetMining_APP_List_By_CI_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationCertificateIssuance> orderByComparator);

	/**
	 * Returns the last mining application certificate issuance in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application certificate issuance
	 * @throws NoSuchMiningApplicationCertificateIssuanceException if a matching mining application certificate issuance could not be found
	 */
	public MiningApplicationCertificateIssuance
			findBygetMining_APP_List_By_CI_Last(
				String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<MiningApplicationCertificateIssuance> orderByComparator)
		throws NoSuchMiningApplicationCertificateIssuanceException;

	/**
	 * Returns the last mining application certificate issuance in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application certificate issuance, or <code>null</code> if a matching mining application certificate issuance could not be found
	 */
	public MiningApplicationCertificateIssuance
		fetchBygetMining_APP_List_By_CI_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationCertificateIssuance> orderByComparator);

	/**
	 * Returns the mining application certificate issuances before and after the current mining application certificate issuance in the ordered set where caseId = &#63;.
	 *
	 * @param miningCertIssuId the primary key of the current mining application certificate issuance
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application certificate issuance
	 * @throws NoSuchMiningApplicationCertificateIssuanceException if a mining application certificate issuance with the primary key could not be found
	 */
	public MiningApplicationCertificateIssuance[]
			findBygetMining_APP_List_By_CI_PrevAndNext(
				long miningCertIssuId, String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<MiningApplicationCertificateIssuance> orderByComparator)
		throws NoSuchMiningApplicationCertificateIssuanceException;

	/**
	 * Removes all the mining application certificate issuances where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetMining_APP_List_By_CI(String caseId);

	/**
	 * Returns the number of mining application certificate issuances where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching mining application certificate issuances
	 */
	public int countBygetMining_APP_List_By_CI(String caseId);

	/**
	 * Returns the mining application certificate issuance where caseId = &#63; or throws a <code>NoSuchMiningApplicationCertificateIssuanceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching mining application certificate issuance
	 * @throws NoSuchMiningApplicationCertificateIssuanceException if a matching mining application certificate issuance could not be found
	 */
	public MiningApplicationCertificateIssuance findBygetMining_APP_By_CI(
			String caseId)
		throws NoSuchMiningApplicationCertificateIssuanceException;

	/**
	 * Returns the mining application certificate issuance where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching mining application certificate issuance, or <code>null</code> if a matching mining application certificate issuance could not be found
	 */
	public MiningApplicationCertificateIssuance fetchBygetMining_APP_By_CI(
		String caseId);

	/**
	 * Returns the mining application certificate issuance where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining application certificate issuance, or <code>null</code> if a matching mining application certificate issuance could not be found
	 */
	public MiningApplicationCertificateIssuance fetchBygetMining_APP_By_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the mining application certificate issuance where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the mining application certificate issuance that was removed
	 */
	public MiningApplicationCertificateIssuance removeBygetMining_APP_By_CI(
			String caseId)
		throws NoSuchMiningApplicationCertificateIssuanceException;

	/**
	 * Returns the number of mining application certificate issuances where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching mining application certificate issuances
	 */
	public int countBygetMining_APP_By_CI(String caseId);

	/**
	 * Returns the mining application certificate issuance where certificateNumber = &#63; or throws a <code>NoSuchMiningApplicationCertificateIssuanceException</code> if it could not be found.
	 *
	 * @param certificateNumber the certificate number
	 * @return the matching mining application certificate issuance
	 * @throws NoSuchMiningApplicationCertificateIssuanceException if a matching mining application certificate issuance could not be found
	 */
	public MiningApplicationCertificateIssuance findBygetMining_APP_By_CN(
			String certificateNumber)
		throws NoSuchMiningApplicationCertificateIssuanceException;

	/**
	 * Returns the mining application certificate issuance where certificateNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param certificateNumber the certificate number
	 * @return the matching mining application certificate issuance, or <code>null</code> if a matching mining application certificate issuance could not be found
	 */
	public MiningApplicationCertificateIssuance fetchBygetMining_APP_By_CN(
		String certificateNumber);

	/**
	 * Returns the mining application certificate issuance where certificateNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param certificateNumber the certificate number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining application certificate issuance, or <code>null</code> if a matching mining application certificate issuance could not be found
	 */
	public MiningApplicationCertificateIssuance fetchBygetMining_APP_By_CN(
		String certificateNumber, boolean useFinderCache);

	/**
	 * Removes the mining application certificate issuance where certificateNumber = &#63; from the database.
	 *
	 * @param certificateNumber the certificate number
	 * @return the mining application certificate issuance that was removed
	 */
	public MiningApplicationCertificateIssuance removeBygetMining_APP_By_CN(
			String certificateNumber)
		throws NoSuchMiningApplicationCertificateIssuanceException;

	/**
	 * Returns the number of mining application certificate issuances where certificateNumber = &#63;.
	 *
	 * @param certificateNumber the certificate number
	 * @return the number of matching mining application certificate issuances
	 */
	public int countBygetMining_APP_By_CN(String certificateNumber);

	/**
	 * Caches the mining application certificate issuance in the entity cache if it is enabled.
	 *
	 * @param miningApplicationCertificateIssuance the mining application certificate issuance
	 */
	public void cacheResult(
		MiningApplicationCertificateIssuance
			miningApplicationCertificateIssuance);

	/**
	 * Caches the mining application certificate issuances in the entity cache if it is enabled.
	 *
	 * @param miningApplicationCertificateIssuances the mining application certificate issuances
	 */
	public void cacheResult(
		java.util.List<MiningApplicationCertificateIssuance>
			miningApplicationCertificateIssuances);

	/**
	 * Creates a new mining application certificate issuance with the primary key. Does not add the mining application certificate issuance to the database.
	 *
	 * @param miningCertIssuId the primary key for the new mining application certificate issuance
	 * @return the new mining application certificate issuance
	 */
	public MiningApplicationCertificateIssuance create(long miningCertIssuId);

	/**
	 * Removes the mining application certificate issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningCertIssuId the primary key of the mining application certificate issuance
	 * @return the mining application certificate issuance that was removed
	 * @throws NoSuchMiningApplicationCertificateIssuanceException if a mining application certificate issuance with the primary key could not be found
	 */
	public MiningApplicationCertificateIssuance remove(long miningCertIssuId)
		throws NoSuchMiningApplicationCertificateIssuanceException;

	public MiningApplicationCertificateIssuance updateImpl(
		MiningApplicationCertificateIssuance
			miningApplicationCertificateIssuance);

	/**
	 * Returns the mining application certificate issuance with the primary key or throws a <code>NoSuchMiningApplicationCertificateIssuanceException</code> if it could not be found.
	 *
	 * @param miningCertIssuId the primary key of the mining application certificate issuance
	 * @return the mining application certificate issuance
	 * @throws NoSuchMiningApplicationCertificateIssuanceException if a mining application certificate issuance with the primary key could not be found
	 */
	public MiningApplicationCertificateIssuance findByPrimaryKey(
			long miningCertIssuId)
		throws NoSuchMiningApplicationCertificateIssuanceException;

	/**
	 * Returns the mining application certificate issuance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningCertIssuId the primary key of the mining application certificate issuance
	 * @return the mining application certificate issuance, or <code>null</code> if a mining application certificate issuance with the primary key could not be found
	 */
	public MiningApplicationCertificateIssuance fetchByPrimaryKey(
		long miningCertIssuId);

	/**
	 * Returns all the mining application certificate issuances.
	 *
	 * @return the mining application certificate issuances
	 */
	public java.util.List<MiningApplicationCertificateIssuance> findAll();

	/**
	 * Returns a range of all the mining application certificate issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application certificate issuances
	 * @param end the upper bound of the range of mining application certificate issuances (not inclusive)
	 * @return the range of mining application certificate issuances
	 */
	public java.util.List<MiningApplicationCertificateIssuance> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the mining application certificate issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application certificate issuances
	 * @param end the upper bound of the range of mining application certificate issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining application certificate issuances
	 */
	public java.util.List<MiningApplicationCertificateIssuance> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationCertificateIssuance> orderByComparator);

	/**
	 * Returns an ordered range of all the mining application certificate issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application certificate issuances
	 * @param end the upper bound of the range of mining application certificate issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining application certificate issuances
	 */
	public java.util.List<MiningApplicationCertificateIssuance> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationCertificateIssuance> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the mining application certificate issuances from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of mining application certificate issuances.
	 *
	 * @return the number of mining application certificate issuances
	 */
	public int countAll();

}