/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.explosives.competency.stages.service.exception.NoSuchExplosiveIssuanceOfLicenceException;
import com.nbp.explosives.competency.stages.service.model.ExplosiveIssuanceOfLicence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the explosive issuance of licence service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveIssuanceOfLicenceUtil
 * @generated
 */
@ProviderType
public interface ExplosiveIssuanceOfLicencePersistence
	extends BasePersistence<ExplosiveIssuanceOfLicence> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ExplosiveIssuanceOfLicenceUtil} to access the explosive issuance of licence persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the explosive issuance of licences where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching explosive issuance of licences
	 */
	public java.util.List<ExplosiveIssuanceOfLicence> findByUuid(String uuid);

	/**
	 * Returns a range of all the explosive issuance of licences where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @return the range of matching explosive issuance of licences
	 */
	public java.util.List<ExplosiveIssuanceOfLicence> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the explosive issuance of licences where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive issuance of licences
	 */
	public java.util.List<ExplosiveIssuanceOfLicence> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveIssuanceOfLicence> orderByComparator);

	/**
	 * Returns an ordered range of all the explosive issuance of licences where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive issuance of licences
	 */
	public java.util.List<ExplosiveIssuanceOfLicence> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveIssuanceOfLicence> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first explosive issuance of licence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a matching explosive issuance of licence could not be found
	 */
	public ExplosiveIssuanceOfLicence findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveIssuanceOfLicence> orderByComparator)
		throws NoSuchExplosiveIssuanceOfLicenceException;

	/**
	 * Returns the first explosive issuance of licence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive issuance of licence, or <code>null</code> if a matching explosive issuance of licence could not be found
	 */
	public ExplosiveIssuanceOfLicence fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveIssuanceOfLicence> orderByComparator);

	/**
	 * Returns the last explosive issuance of licence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a matching explosive issuance of licence could not be found
	 */
	public ExplosiveIssuanceOfLicence findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveIssuanceOfLicence> orderByComparator)
		throws NoSuchExplosiveIssuanceOfLicenceException;

	/**
	 * Returns the last explosive issuance of licence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive issuance of licence, or <code>null</code> if a matching explosive issuance of licence could not be found
	 */
	public ExplosiveIssuanceOfLicence fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveIssuanceOfLicence> orderByComparator);

	/**
	 * Returns the explosive issuance of licences before and after the current explosive issuance of licence in the ordered set where uuid = &#63;.
	 *
	 * @param issuanceId the primary key of the current explosive issuance of licence
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a explosive issuance of licence with the primary key could not be found
	 */
	public ExplosiveIssuanceOfLicence[] findByUuid_PrevAndNext(
			long issuanceId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveIssuanceOfLicence> orderByComparator)
		throws NoSuchExplosiveIssuanceOfLicenceException;

	/**
	 * Removes all the explosive issuance of licences where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of explosive issuance of licences where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching explosive issuance of licences
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the explosive issuance of licence where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchExplosiveIssuanceOfLicenceException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a matching explosive issuance of licence could not be found
	 */
	public ExplosiveIssuanceOfLicence findByUUID_G(String uuid, long groupId)
		throws NoSuchExplosiveIssuanceOfLicenceException;

	/**
	 * Returns the explosive issuance of licence where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching explosive issuance of licence, or <code>null</code> if a matching explosive issuance of licence could not be found
	 */
	public ExplosiveIssuanceOfLicence fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the explosive issuance of licence where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive issuance of licence, or <code>null</code> if a matching explosive issuance of licence could not be found
	 */
	public ExplosiveIssuanceOfLicence fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the explosive issuance of licence where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the explosive issuance of licence that was removed
	 */
	public ExplosiveIssuanceOfLicence removeByUUID_G(String uuid, long groupId)
		throws NoSuchExplosiveIssuanceOfLicenceException;

	/**
	 * Returns the number of explosive issuance of licences where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching explosive issuance of licences
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the explosive issuance of licences where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching explosive issuance of licences
	 */
	public java.util.List<ExplosiveIssuanceOfLicence> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the explosive issuance of licences where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @return the range of matching explosive issuance of licences
	 */
	public java.util.List<ExplosiveIssuanceOfLicence> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the explosive issuance of licences where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive issuance of licences
	 */
	public java.util.List<ExplosiveIssuanceOfLicence> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveIssuanceOfLicence> orderByComparator);

	/**
	 * Returns an ordered range of all the explosive issuance of licences where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive issuance of licences
	 */
	public java.util.List<ExplosiveIssuanceOfLicence> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveIssuanceOfLicence> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first explosive issuance of licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a matching explosive issuance of licence could not be found
	 */
	public ExplosiveIssuanceOfLicence findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveIssuanceOfLicence> orderByComparator)
		throws NoSuchExplosiveIssuanceOfLicenceException;

	/**
	 * Returns the first explosive issuance of licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive issuance of licence, or <code>null</code> if a matching explosive issuance of licence could not be found
	 */
	public ExplosiveIssuanceOfLicence fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveIssuanceOfLicence> orderByComparator);

	/**
	 * Returns the last explosive issuance of licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a matching explosive issuance of licence could not be found
	 */
	public ExplosiveIssuanceOfLicence findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveIssuanceOfLicence> orderByComparator)
		throws NoSuchExplosiveIssuanceOfLicenceException;

	/**
	 * Returns the last explosive issuance of licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive issuance of licence, or <code>null</code> if a matching explosive issuance of licence could not be found
	 */
	public ExplosiveIssuanceOfLicence fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveIssuanceOfLicence> orderByComparator);

	/**
	 * Returns the explosive issuance of licences before and after the current explosive issuance of licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param issuanceId the primary key of the current explosive issuance of licence
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a explosive issuance of licence with the primary key could not be found
	 */
	public ExplosiveIssuanceOfLicence[] findByUuid_C_PrevAndNext(
			long issuanceId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveIssuanceOfLicence> orderByComparator)
		throws NoSuchExplosiveIssuanceOfLicenceException;

	/**
	 * Removes all the explosive issuance of licences where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of explosive issuance of licences where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching explosive issuance of licences
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the explosive issuance of licence where caseId = &#63; or throws a <code>NoSuchExplosiveIssuanceOfLicenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a matching explosive issuance of licence could not be found
	 */
	public ExplosiveIssuanceOfLicence findBygetEXP_CD_CI(String caseId)
		throws NoSuchExplosiveIssuanceOfLicenceException;

	/**
	 * Returns the explosive issuance of licence where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching explosive issuance of licence, or <code>null</code> if a matching explosive issuance of licence could not be found
	 */
	public ExplosiveIssuanceOfLicence fetchBygetEXP_CD_CI(String caseId);

	/**
	 * Returns the explosive issuance of licence where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive issuance of licence, or <code>null</code> if a matching explosive issuance of licence could not be found
	 */
	public ExplosiveIssuanceOfLicence fetchBygetEXP_CD_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the explosive issuance of licence where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the explosive issuance of licence that was removed
	 */
	public ExplosiveIssuanceOfLicence removeBygetEXP_CD_CI(String caseId)
		throws NoSuchExplosiveIssuanceOfLicenceException;

	/**
	 * Returns the number of explosive issuance of licences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching explosive issuance of licences
	 */
	public int countBygetEXP_CD_CI(String caseId);

	/**
	 * Returns all the explosive issuance of licences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching explosive issuance of licences
	 */
	public java.util.List<ExplosiveIssuanceOfLicence> findBygetEXP_CD_List_CI(
		String caseId);

	/**
	 * Returns a range of all the explosive issuance of licences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @return the range of matching explosive issuance of licences
	 */
	public java.util.List<ExplosiveIssuanceOfLicence> findBygetEXP_CD_List_CI(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the explosive issuance of licences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive issuance of licences
	 */
	public java.util.List<ExplosiveIssuanceOfLicence> findBygetEXP_CD_List_CI(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveIssuanceOfLicence> orderByComparator);

	/**
	 * Returns an ordered range of all the explosive issuance of licences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive issuance of licences
	 */
	public java.util.List<ExplosiveIssuanceOfLicence> findBygetEXP_CD_List_CI(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveIssuanceOfLicence> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first explosive issuance of licence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a matching explosive issuance of licence could not be found
	 */
	public ExplosiveIssuanceOfLicence findBygetEXP_CD_List_CI_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveIssuanceOfLicence> orderByComparator)
		throws NoSuchExplosiveIssuanceOfLicenceException;

	/**
	 * Returns the first explosive issuance of licence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive issuance of licence, or <code>null</code> if a matching explosive issuance of licence could not be found
	 */
	public ExplosiveIssuanceOfLicence fetchBygetEXP_CD_List_CI_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveIssuanceOfLicence> orderByComparator);

	/**
	 * Returns the last explosive issuance of licence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a matching explosive issuance of licence could not be found
	 */
	public ExplosiveIssuanceOfLicence findBygetEXP_CD_List_CI_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveIssuanceOfLicence> orderByComparator)
		throws NoSuchExplosiveIssuanceOfLicenceException;

	/**
	 * Returns the last explosive issuance of licence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive issuance of licence, or <code>null</code> if a matching explosive issuance of licence could not be found
	 */
	public ExplosiveIssuanceOfLicence fetchBygetEXP_CD_List_CI_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveIssuanceOfLicence> orderByComparator);

	/**
	 * Returns the explosive issuance of licences before and after the current explosive issuance of licence in the ordered set where caseId = &#63;.
	 *
	 * @param issuanceId the primary key of the current explosive issuance of licence
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a explosive issuance of licence with the primary key could not be found
	 */
	public ExplosiveIssuanceOfLicence[] findBygetEXP_CD_List_CI_PrevAndNext(
			long issuanceId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ExplosiveIssuanceOfLicence> orderByComparator)
		throws NoSuchExplosiveIssuanceOfLicenceException;

	/**
	 * Removes all the explosive issuance of licences where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetEXP_CD_List_CI(String caseId);

	/**
	 * Returns the number of explosive issuance of licences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching explosive issuance of licences
	 */
	public int countBygetEXP_CD_List_CI(String caseId);

	/**
	 * Caches the explosive issuance of licence in the entity cache if it is enabled.
	 *
	 * @param explosiveIssuanceOfLicence the explosive issuance of licence
	 */
	public void cacheResult(
		ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence);

	/**
	 * Caches the explosive issuance of licences in the entity cache if it is enabled.
	 *
	 * @param explosiveIssuanceOfLicences the explosive issuance of licences
	 */
	public void cacheResult(
		java.util.List<ExplosiveIssuanceOfLicence> explosiveIssuanceOfLicences);

	/**
	 * Creates a new explosive issuance of licence with the primary key. Does not add the explosive issuance of licence to the database.
	 *
	 * @param issuanceId the primary key for the new explosive issuance of licence
	 * @return the new explosive issuance of licence
	 */
	public ExplosiveIssuanceOfLicence create(long issuanceId);

	/**
	 * Removes the explosive issuance of licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param issuanceId the primary key of the explosive issuance of licence
	 * @return the explosive issuance of licence that was removed
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a explosive issuance of licence with the primary key could not be found
	 */
	public ExplosiveIssuanceOfLicence remove(long issuanceId)
		throws NoSuchExplosiveIssuanceOfLicenceException;

	public ExplosiveIssuanceOfLicence updateImpl(
		ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence);

	/**
	 * Returns the explosive issuance of licence with the primary key or throws a <code>NoSuchExplosiveIssuanceOfLicenceException</code> if it could not be found.
	 *
	 * @param issuanceId the primary key of the explosive issuance of licence
	 * @return the explosive issuance of licence
	 * @throws NoSuchExplosiveIssuanceOfLicenceException if a explosive issuance of licence with the primary key could not be found
	 */
	public ExplosiveIssuanceOfLicence findByPrimaryKey(long issuanceId)
		throws NoSuchExplosiveIssuanceOfLicenceException;

	/**
	 * Returns the explosive issuance of licence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param issuanceId the primary key of the explosive issuance of licence
	 * @return the explosive issuance of licence, or <code>null</code> if a explosive issuance of licence with the primary key could not be found
	 */
	public ExplosiveIssuanceOfLicence fetchByPrimaryKey(long issuanceId);

	/**
	 * Returns all the explosive issuance of licences.
	 *
	 * @return the explosive issuance of licences
	 */
	public java.util.List<ExplosiveIssuanceOfLicence> findAll();

	/**
	 * Returns a range of all the explosive issuance of licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @return the range of explosive issuance of licences
	 */
	public java.util.List<ExplosiveIssuanceOfLicence> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the explosive issuance of licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of explosive issuance of licences
	 */
	public java.util.List<ExplosiveIssuanceOfLicence> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveIssuanceOfLicence> orderByComparator);

	/**
	 * Returns an ordered range of all the explosive issuance of licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveIssuanceOfLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive issuance of licences
	 * @param end the upper bound of the range of explosive issuance of licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of explosive issuance of licences
	 */
	public java.util.List<ExplosiveIssuanceOfLicence> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ExplosiveIssuanceOfLicence> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the explosive issuance of licences from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of explosive issuance of licences.
	 *
	 * @return the number of explosive issuance of licences
	 */
	public int countAll();

}