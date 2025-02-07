/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.explosives.competency.stages.service.exception.NoSuchExplosiveReviewAndVerificationException;
import com.nbp.explosives.competency.stages.service.model.ExplosiveReviewAndVerification;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the explosive review and verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveReviewAndVerificationUtil
 * @generated
 */
@ProviderType
public interface ExplosiveReviewAndVerificationPersistence
	extends BasePersistence<ExplosiveReviewAndVerification> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ExplosiveReviewAndVerificationUtil} to access the explosive review and verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the explosive review and verifications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching explosive review and verifications
	 */
	public java.util.List<ExplosiveReviewAndVerification> findByUuid(
		String uuid);

	/**
	 * Returns a range of all the explosive review and verifications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @return the range of matching explosive review and verifications
	 */
	public java.util.List<ExplosiveReviewAndVerification> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the explosive review and verifications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive review and verifications
	 */
	public java.util.List<ExplosiveReviewAndVerification> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveReviewAndVerification> orderByComparator);

	/**
	 * Returns an ordered range of all the explosive review and verifications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive review and verifications
	 */
	public java.util.List<ExplosiveReviewAndVerification> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveReviewAndVerification> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first explosive review and verification in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a matching explosive review and verification could not be found
	 */
	public ExplosiveReviewAndVerification findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveReviewAndVerification> orderByComparator)
		throws NoSuchExplosiveReviewAndVerificationException;

	/**
	 * Returns the first explosive review and verification in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive review and verification, or <code>null</code> if a matching explosive review and verification could not be found
	 */
	public ExplosiveReviewAndVerification fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveReviewAndVerification> orderByComparator);

	/**
	 * Returns the last explosive review and verification in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a matching explosive review and verification could not be found
	 */
	public ExplosiveReviewAndVerification findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveReviewAndVerification> orderByComparator)
		throws NoSuchExplosiveReviewAndVerificationException;

	/**
	 * Returns the last explosive review and verification in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive review and verification, or <code>null</code> if a matching explosive review and verification could not be found
	 */
	public ExplosiveReviewAndVerification fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveReviewAndVerification> orderByComparator);

	/**
	 * Returns the explosive review and verifications before and after the current explosive review and verification in the ordered set where uuid = &#63;.
	 *
	 * @param issuanceId the primary key of the current explosive review and verification
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a explosive review and verification with the primary key could not be found
	 */
	public ExplosiveReviewAndVerification[] findByUuid_PrevAndNext(
			long issuanceId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveReviewAndVerification> orderByComparator)
		throws NoSuchExplosiveReviewAndVerificationException;

	/**
	 * Removes all the explosive review and verifications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of explosive review and verifications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching explosive review and verifications
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the explosive review and verification where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchExplosiveReviewAndVerificationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a matching explosive review and verification could not be found
	 */
	public ExplosiveReviewAndVerification findByUUID_G(
			String uuid, long groupId)
		throws NoSuchExplosiveReviewAndVerificationException;

	/**
	 * Returns the explosive review and verification where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching explosive review and verification, or <code>null</code> if a matching explosive review and verification could not be found
	 */
	public ExplosiveReviewAndVerification fetchByUUID_G(
		String uuid, long groupId);

	/**
	 * Returns the explosive review and verification where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive review and verification, or <code>null</code> if a matching explosive review and verification could not be found
	 */
	public ExplosiveReviewAndVerification fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the explosive review and verification where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the explosive review and verification that was removed
	 */
	public ExplosiveReviewAndVerification removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchExplosiveReviewAndVerificationException;

	/**
	 * Returns the number of explosive review and verifications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching explosive review and verifications
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the explosive review and verifications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching explosive review and verifications
	 */
	public java.util.List<ExplosiveReviewAndVerification> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the explosive review and verifications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @return the range of matching explosive review and verifications
	 */
	public java.util.List<ExplosiveReviewAndVerification> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the explosive review and verifications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive review and verifications
	 */
	public java.util.List<ExplosiveReviewAndVerification> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveReviewAndVerification> orderByComparator);

	/**
	 * Returns an ordered range of all the explosive review and verifications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive review and verifications
	 */
	public java.util.List<ExplosiveReviewAndVerification> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveReviewAndVerification> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first explosive review and verification in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a matching explosive review and verification could not be found
	 */
	public ExplosiveReviewAndVerification findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveReviewAndVerification> orderByComparator)
		throws NoSuchExplosiveReviewAndVerificationException;

	/**
	 * Returns the first explosive review and verification in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive review and verification, or <code>null</code> if a matching explosive review and verification could not be found
	 */
	public ExplosiveReviewAndVerification fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveReviewAndVerification> orderByComparator);

	/**
	 * Returns the last explosive review and verification in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a matching explosive review and verification could not be found
	 */
	public ExplosiveReviewAndVerification findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveReviewAndVerification> orderByComparator)
		throws NoSuchExplosiveReviewAndVerificationException;

	/**
	 * Returns the last explosive review and verification in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive review and verification, or <code>null</code> if a matching explosive review and verification could not be found
	 */
	public ExplosiveReviewAndVerification fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveReviewAndVerification> orderByComparator);

	/**
	 * Returns the explosive review and verifications before and after the current explosive review and verification in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param issuanceId the primary key of the current explosive review and verification
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a explosive review and verification with the primary key could not be found
	 */
	public ExplosiveReviewAndVerification[] findByUuid_C_PrevAndNext(
			long issuanceId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveReviewAndVerification> orderByComparator)
		throws NoSuchExplosiveReviewAndVerificationException;

	/**
	 * Removes all the explosive review and verifications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of explosive review and verifications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching explosive review and verifications
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the explosive review and verification where caseId = &#63; or throws a <code>NoSuchExplosiveReviewAndVerificationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a matching explosive review and verification could not be found
	 */
	public ExplosiveReviewAndVerification findBygetEXP_RV_CI(String caseId)
		throws NoSuchExplosiveReviewAndVerificationException;

	/**
	 * Returns the explosive review and verification where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching explosive review and verification, or <code>null</code> if a matching explosive review and verification could not be found
	 */
	public ExplosiveReviewAndVerification fetchBygetEXP_RV_CI(String caseId);

	/**
	 * Returns the explosive review and verification where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive review and verification, or <code>null</code> if a matching explosive review and verification could not be found
	 */
	public ExplosiveReviewAndVerification fetchBygetEXP_RV_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the explosive review and verification where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the explosive review and verification that was removed
	 */
	public ExplosiveReviewAndVerification removeBygetEXP_RV_CI(String caseId)
		throws NoSuchExplosiveReviewAndVerificationException;

	/**
	 * Returns the number of explosive review and verifications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching explosive review and verifications
	 */
	public int countBygetEXP_RV_CI(String caseId);

	/**
	 * Returns all the explosive review and verifications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching explosive review and verifications
	 */
	public java.util.List<ExplosiveReviewAndVerification>
		findBygetEXP_RV_List_CI(String caseId);

	/**
	 * Returns a range of all the explosive review and verifications where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @return the range of matching explosive review and verifications
	 */
	public java.util.List<ExplosiveReviewAndVerification>
		findBygetEXP_RV_List_CI(String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the explosive review and verifications where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive review and verifications
	 */
	public java.util.List<ExplosiveReviewAndVerification>
		findBygetEXP_RV_List_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveReviewAndVerification> orderByComparator);

	/**
	 * Returns an ordered range of all the explosive review and verifications where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive review and verifications
	 */
	public java.util.List<ExplosiveReviewAndVerification>
		findBygetEXP_RV_List_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveReviewAndVerification> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first explosive review and verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a matching explosive review and verification could not be found
	 */
	public ExplosiveReviewAndVerification findBygetEXP_RV_List_CI_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveReviewAndVerification> orderByComparator)
		throws NoSuchExplosiveReviewAndVerificationException;

	/**
	 * Returns the first explosive review and verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive review and verification, or <code>null</code> if a matching explosive review and verification could not be found
	 */
	public ExplosiveReviewAndVerification fetchBygetEXP_RV_List_CI_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveReviewAndVerification> orderByComparator);

	/**
	 * Returns the last explosive review and verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a matching explosive review and verification could not be found
	 */
	public ExplosiveReviewAndVerification findBygetEXP_RV_List_CI_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveReviewAndVerification> orderByComparator)
		throws NoSuchExplosiveReviewAndVerificationException;

	/**
	 * Returns the last explosive review and verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive review and verification, or <code>null</code> if a matching explosive review and verification could not be found
	 */
	public ExplosiveReviewAndVerification fetchBygetEXP_RV_List_CI_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveReviewAndVerification> orderByComparator);

	/**
	 * Returns the explosive review and verifications before and after the current explosive review and verification in the ordered set where caseId = &#63;.
	 *
	 * @param issuanceId the primary key of the current explosive review and verification
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a explosive review and verification with the primary key could not be found
	 */
	public ExplosiveReviewAndVerification[] findBygetEXP_RV_List_CI_PrevAndNext(
			long issuanceId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveReviewAndVerification> orderByComparator)
		throws NoSuchExplosiveReviewAndVerificationException;

	/**
	 * Removes all the explosive review and verifications where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetEXP_RV_List_CI(String caseId);

	/**
	 * Returns the number of explosive review and verifications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching explosive review and verifications
	 */
	public int countBygetEXP_RV_List_CI(String caseId);

	/**
	 * Caches the explosive review and verification in the entity cache if it is enabled.
	 *
	 * @param explosiveReviewAndVerification the explosive review and verification
	 */
	public void cacheResult(
		ExplosiveReviewAndVerification explosiveReviewAndVerification);

	/**
	 * Caches the explosive review and verifications in the entity cache if it is enabled.
	 *
	 * @param explosiveReviewAndVerifications the explosive review and verifications
	 */
	public void cacheResult(
		java.util.List<ExplosiveReviewAndVerification>
			explosiveReviewAndVerifications);

	/**
	 * Creates a new explosive review and verification with the primary key. Does not add the explosive review and verification to the database.
	 *
	 * @param issuanceId the primary key for the new explosive review and verification
	 * @return the new explosive review and verification
	 */
	public ExplosiveReviewAndVerification create(long issuanceId);

	/**
	 * Removes the explosive review and verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param issuanceId the primary key of the explosive review and verification
	 * @return the explosive review and verification that was removed
	 * @throws NoSuchExplosiveReviewAndVerificationException if a explosive review and verification with the primary key could not be found
	 */
	public ExplosiveReviewAndVerification remove(long issuanceId)
		throws NoSuchExplosiveReviewAndVerificationException;

	public ExplosiveReviewAndVerification updateImpl(
		ExplosiveReviewAndVerification explosiveReviewAndVerification);

	/**
	 * Returns the explosive review and verification with the primary key or throws a <code>NoSuchExplosiveReviewAndVerificationException</code> if it could not be found.
	 *
	 * @param issuanceId the primary key of the explosive review and verification
	 * @return the explosive review and verification
	 * @throws NoSuchExplosiveReviewAndVerificationException if a explosive review and verification with the primary key could not be found
	 */
	public ExplosiveReviewAndVerification findByPrimaryKey(long issuanceId)
		throws NoSuchExplosiveReviewAndVerificationException;

	/**
	 * Returns the explosive review and verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param issuanceId the primary key of the explosive review and verification
	 * @return the explosive review and verification, or <code>null</code> if a explosive review and verification with the primary key could not be found
	 */
	public ExplosiveReviewAndVerification fetchByPrimaryKey(long issuanceId);

	/**
	 * Returns all the explosive review and verifications.
	 *
	 * @return the explosive review and verifications
	 */
	public java.util.List<ExplosiveReviewAndVerification> findAll();

	/**
	 * Returns a range of all the explosive review and verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @return the range of explosive review and verifications
	 */
	public java.util.List<ExplosiveReviewAndVerification> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the explosive review and verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of explosive review and verifications
	 */
	public java.util.List<ExplosiveReviewAndVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveReviewAndVerification> orderByComparator);

	/**
	 * Returns an ordered range of all the explosive review and verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of explosive review and verifications
	 */
	public java.util.List<ExplosiveReviewAndVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveReviewAndVerification> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the explosive review and verifications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of explosive review and verifications.
	 *
	 * @return the number of explosive review and verifications
	 */
	public int countAll();

}