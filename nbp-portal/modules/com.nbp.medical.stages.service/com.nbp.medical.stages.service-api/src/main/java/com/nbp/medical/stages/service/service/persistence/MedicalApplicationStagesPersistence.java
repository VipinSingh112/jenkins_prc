/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.stages.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.medical.stages.service.exception.NoSuchMedicalApplicationStagesException;
import com.nbp.medical.stages.service.model.MedicalApplicationStages;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the medical application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalApplicationStagesUtil
 * @generated
 */
@ProviderType
public interface MedicalApplicationStagesPersistence
	extends BasePersistence<MedicalApplicationStages> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MedicalApplicationStagesUtil} to access the medical application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the medical application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching medical application stageses
	 */
	public java.util.List<MedicalApplicationStages> findByUuid(String uuid);

	/**
	 * Returns a range of all the medical application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @return the range of matching medical application stageses
	 */
	public java.util.List<MedicalApplicationStages> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the medical application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical application stageses
	 */
	public java.util.List<MedicalApplicationStages> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the medical application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical application stageses
	 */
	public java.util.List<MedicalApplicationStages> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first medical application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	public MedicalApplicationStages findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalApplicationStages> orderByComparator)
		throws NoSuchMedicalApplicationStagesException;

	/**
	 * Returns the first medical application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public MedicalApplicationStages fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalApplicationStages> orderByComparator);

	/**
	 * Returns the last medical application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	public MedicalApplicationStages findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalApplicationStages> orderByComparator)
		throws NoSuchMedicalApplicationStagesException;

	/**
	 * Returns the last medical application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public MedicalApplicationStages fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalApplicationStages> orderByComparator);

	/**
	 * Returns the medical application stageses before and after the current medical application stages in the ordered set where uuid = &#63;.
	 *
	 * @param medicalStagesId the primary key of the current medical application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a medical application stages with the primary key could not be found
	 */
	public MedicalApplicationStages[] findByUuid_PrevAndNext(
			long medicalStagesId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalApplicationStages> orderByComparator)
		throws NoSuchMedicalApplicationStagesException;

	/**
	 * Removes all the medical application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of medical application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching medical application stageses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the medical application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMedicalApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	public MedicalApplicationStages findByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalApplicationStagesException;

	/**
	 * Returns the medical application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public MedicalApplicationStages fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the medical application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public MedicalApplicationStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the medical application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the medical application stages that was removed
	 */
	public MedicalApplicationStages removeByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalApplicationStagesException;

	/**
	 * Returns the number of medical application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching medical application stageses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the medical application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching medical application stageses
	 */
	public java.util.List<MedicalApplicationStages> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the medical application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @return the range of matching medical application stageses
	 */
	public java.util.List<MedicalApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the medical application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical application stageses
	 */
	public java.util.List<MedicalApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the medical application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical application stageses
	 */
	public java.util.List<MedicalApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first medical application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	public MedicalApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalApplicationStages> orderByComparator)
		throws NoSuchMedicalApplicationStagesException;

	/**
	 * Returns the first medical application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public MedicalApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalApplicationStages> orderByComparator);

	/**
	 * Returns the last medical application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	public MedicalApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalApplicationStages> orderByComparator)
		throws NoSuchMedicalApplicationStagesException;

	/**
	 * Returns the last medical application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public MedicalApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalApplicationStages> orderByComparator);

	/**
	 * Returns the medical application stageses before and after the current medical application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param medicalStagesId the primary key of the current medical application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a medical application stages with the primary key could not be found
	 */
	public MedicalApplicationStages[] findByUuid_C_PrevAndNext(
			long medicalStagesId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalApplicationStages> orderByComparator)
		throws NoSuchMedicalApplicationStagesException;

	/**
	 * Removes all the medical application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of medical application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching medical application stageses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the medical application stages where medicalApplicationId = &#63; or throws a <code>NoSuchMedicalApplicationStagesException</code> if it could not be found.
	 *
	 * @param medicalApplicationId the medical application ID
	 * @return the matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	public MedicalApplicationStages findBygetMedical_AI(
			long medicalApplicationId)
		throws NoSuchMedicalApplicationStagesException;

	/**
	 * Returns the medical application stages where medicalApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param medicalApplicationId the medical application ID
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public MedicalApplicationStages fetchBygetMedical_AI(
		long medicalApplicationId);

	/**
	 * Returns the medical application stages where medicalApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param medicalApplicationId the medical application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public MedicalApplicationStages fetchBygetMedical_AI(
		long medicalApplicationId, boolean useFinderCache);

	/**
	 * Removes the medical application stages where medicalApplicationId = &#63; from the database.
	 *
	 * @param medicalApplicationId the medical application ID
	 * @return the medical application stages that was removed
	 */
	public MedicalApplicationStages removeBygetMedical_AI(
			long medicalApplicationId)
		throws NoSuchMedicalApplicationStagesException;

	/**
	 * Returns the number of medical application stageses where medicalApplicationId = &#63;.
	 *
	 * @param medicalApplicationId the medical application ID
	 * @return the number of matching medical application stageses
	 */
	public int countBygetMedical_AI(long medicalApplicationId);

	/**
	 * Returns the medical application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchMedicalApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	public MedicalApplicationStages findBygetMedical_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchMedicalApplicationStagesException;

	/**
	 * Returns the medical application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public MedicalApplicationStages fetchBygetMedical_By_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the medical application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public MedicalApplicationStages fetchBygetMedical_By_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache);

	/**
	 * Removes the medical application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the medical application stages that was removed
	 */
	public MedicalApplicationStages removeBygetMedical_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchMedicalApplicationStagesException;

	/**
	 * Returns the number of medical application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching medical application stageses
	 */
	public int countBygetMedical_By_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the medical application stages where caseId = &#63; or throws a <code>NoSuchMedicalApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	public MedicalApplicationStages findByget_Medical_By_CaseId(String caseId)
		throws NoSuchMedicalApplicationStagesException;

	/**
	 * Returns the medical application stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public MedicalApplicationStages fetchByget_Medical_By_CaseId(String caseId);

	/**
	 * Returns the medical application stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public MedicalApplicationStages fetchByget_Medical_By_CaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the medical application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the medical application stages that was removed
	 */
	public MedicalApplicationStages removeByget_Medical_By_CaseId(String caseId)
		throws NoSuchMedicalApplicationStagesException;

	/**
	 * Returns the number of medical application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching medical application stageses
	 */
	public int countByget_Medical_By_CaseId(String caseId);

	/**
	 * Returns the medical application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchMedicalApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	public MedicalApplicationStages findBygetMedical_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchMedicalApplicationStagesException;

	/**
	 * Returns the medical application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public MedicalApplicationStages fetchBygetMedical_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName);

	/**
	 * Returns the medical application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public MedicalApplicationStages fetchBygetMedical_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName,
		boolean useFinderCache);

	/**
	 * Removes the medical application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the medical application stages that was removed
	 */
	public MedicalApplicationStages removeBygetMedical_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchMedicalApplicationStagesException;

	/**
	 * Returns the number of medical application stageses where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching medical application stageses
	 */
	public int countBygetMedical_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName);

	/**
	 * Returns the medical application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchMedicalApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	public MedicalApplicationStages findBygetMedical_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchMedicalApplicationStagesException;

	/**
	 * Returns the medical application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public MedicalApplicationStages fetchBygetMedical_By_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns the medical application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public MedicalApplicationStages fetchBygetMedical_By_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache);

	/**
	 * Removes the medical application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the medical application stages that was removed
	 */
	public MedicalApplicationStages removeBygetMedical_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchMedicalApplicationStagesException;

	/**
	 * Returns the number of medical application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching medical application stageses
	 */
	public int countBygetMedical_By_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns all the medical application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching medical application stageses
	 */
	public java.util.List<MedicalApplicationStages> findBygetMedical_By_CaseId(
		String caseId);

	/**
	 * Returns a range of all the medical application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @return the range of matching medical application stageses
	 */
	public java.util.List<MedicalApplicationStages> findBygetMedical_By_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the medical application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical application stageses
	 */
	public java.util.List<MedicalApplicationStages> findBygetMedical_By_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the medical application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical application stageses
	 */
	public java.util.List<MedicalApplicationStages> findBygetMedical_By_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first medical application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	public MedicalApplicationStages findBygetMedical_By_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalApplicationStages> orderByComparator)
		throws NoSuchMedicalApplicationStagesException;

	/**
	 * Returns the first medical application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public MedicalApplicationStages fetchBygetMedical_By_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalApplicationStages> orderByComparator);

	/**
	 * Returns the last medical application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	public MedicalApplicationStages findBygetMedical_By_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalApplicationStages> orderByComparator)
		throws NoSuchMedicalApplicationStagesException;

	/**
	 * Returns the last medical application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public MedicalApplicationStages fetchBygetMedical_By_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalApplicationStages> orderByComparator);

	/**
	 * Returns the medical application stageses before and after the current medical application stages in the ordered set where caseId = &#63;.
	 *
	 * @param medicalStagesId the primary key of the current medical application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a medical application stages with the primary key could not be found
	 */
	public MedicalApplicationStages[] findBygetMedical_By_CaseId_PrevAndNext(
			long medicalStagesId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalApplicationStages> orderByComparator)
		throws NoSuchMedicalApplicationStagesException;

	/**
	 * Removes all the medical application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetMedical_By_CaseId(String caseId);

	/**
	 * Returns the number of medical application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching medical application stageses
	 */
	public int countBygetMedical_By_CaseId(String caseId);

	/**
	 * Returns all the medical application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching medical application stageses
	 */
	public java.util.List<MedicalApplicationStages>
		findBygetMedical_By_StageName(String stageName);

	/**
	 * Returns a range of all the medical application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @return the range of matching medical application stageses
	 */
	public java.util.List<MedicalApplicationStages>
		findBygetMedical_By_StageName(String stageName, int start, int end);

	/**
	 * Returns an ordered range of all the medical application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical application stageses
	 */
	public java.util.List<MedicalApplicationStages>
		findBygetMedical_By_StageName(
			String stageName, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the medical application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical application stageses
	 */
	public java.util.List<MedicalApplicationStages>
		findBygetMedical_By_StageName(
			String stageName, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalApplicationStages> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first medical application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	public MedicalApplicationStages findBygetMedical_By_StageName_First(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalApplicationStages> orderByComparator)
		throws NoSuchMedicalApplicationStagesException;

	/**
	 * Returns the first medical application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public MedicalApplicationStages fetchBygetMedical_By_StageName_First(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalApplicationStages> orderByComparator);

	/**
	 * Returns the last medical application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	public MedicalApplicationStages findBygetMedical_By_StageName_Last(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalApplicationStages> orderByComparator)
		throws NoSuchMedicalApplicationStagesException;

	/**
	 * Returns the last medical application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public MedicalApplicationStages fetchBygetMedical_By_StageName_Last(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalApplicationStages> orderByComparator);

	/**
	 * Returns the medical application stageses before and after the current medical application stages in the ordered set where stageName = &#63;.
	 *
	 * @param medicalStagesId the primary key of the current medical application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a medical application stages with the primary key could not be found
	 */
	public MedicalApplicationStages[] findBygetMedical_By_StageName_PrevAndNext(
			long medicalStagesId, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalApplicationStages> orderByComparator)
		throws NoSuchMedicalApplicationStagesException;

	/**
	 * Removes all the medical application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public void removeBygetMedical_By_StageName(String stageName);

	/**
	 * Returns the number of medical application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching medical application stageses
	 */
	public int countBygetMedical_By_StageName(String stageName);

	/**
	 * Caches the medical application stages in the entity cache if it is enabled.
	 *
	 * @param medicalApplicationStages the medical application stages
	 */
	public void cacheResult(MedicalApplicationStages medicalApplicationStages);

	/**
	 * Caches the medical application stageses in the entity cache if it is enabled.
	 *
	 * @param medicalApplicationStageses the medical application stageses
	 */
	public void cacheResult(
		java.util.List<MedicalApplicationStages> medicalApplicationStageses);

	/**
	 * Creates a new medical application stages with the primary key. Does not add the medical application stages to the database.
	 *
	 * @param medicalStagesId the primary key for the new medical application stages
	 * @return the new medical application stages
	 */
	public MedicalApplicationStages create(long medicalStagesId);

	/**
	 * Removes the medical application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalStagesId the primary key of the medical application stages
	 * @return the medical application stages that was removed
	 * @throws NoSuchMedicalApplicationStagesException if a medical application stages with the primary key could not be found
	 */
	public MedicalApplicationStages remove(long medicalStagesId)
		throws NoSuchMedicalApplicationStagesException;

	public MedicalApplicationStages updateImpl(
		MedicalApplicationStages medicalApplicationStages);

	/**
	 * Returns the medical application stages with the primary key or throws a <code>NoSuchMedicalApplicationStagesException</code> if it could not be found.
	 *
	 * @param medicalStagesId the primary key of the medical application stages
	 * @return the medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a medical application stages with the primary key could not be found
	 */
	public MedicalApplicationStages findByPrimaryKey(long medicalStagesId)
		throws NoSuchMedicalApplicationStagesException;

	/**
	 * Returns the medical application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalStagesId the primary key of the medical application stages
	 * @return the medical application stages, or <code>null</code> if a medical application stages with the primary key could not be found
	 */
	public MedicalApplicationStages fetchByPrimaryKey(long medicalStagesId);

	/**
	 * Returns all the medical application stageses.
	 *
	 * @return the medical application stageses
	 */
	public java.util.List<MedicalApplicationStages> findAll();

	/**
	 * Returns a range of all the medical application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @return the range of medical application stageses
	 */
	public java.util.List<MedicalApplicationStages> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the medical application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical application stageses
	 */
	public java.util.List<MedicalApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the medical application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical application stageses
	 */
	public java.util.List<MedicalApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the medical application stageses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of medical application stageses.
	 *
	 * @return the number of medical application stageses
	 */
	public int countAll();

}