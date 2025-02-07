/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.medical.facilities.application.form.service.exception.NoSuchMedicalCurrentStageException;
import com.nbp.medical.facilities.application.form.service.model.MedicalCurrentStage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the medical current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalCurrentStageUtil
 * @generated
 */
@ProviderType
public interface MedicalCurrentStagePersistence
	extends BasePersistence<MedicalCurrentStage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MedicalCurrentStageUtil} to access the medical current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the medical current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching medical current stages
	 */
	public java.util.List<MedicalCurrentStage> findByUuid(String uuid);

	/**
	 * Returns a range of all the medical current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical current stages
	 * @param end the upper bound of the range of medical current stages (not inclusive)
	 * @return the range of matching medical current stages
	 */
	public java.util.List<MedicalCurrentStage> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the medical current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical current stages
	 * @param end the upper bound of the range of medical current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical current stages
	 */
	public java.util.List<MedicalCurrentStage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MedicalCurrentStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the medical current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical current stages
	 * @param end the upper bound of the range of medical current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical current stages
	 */
	public java.util.List<MedicalCurrentStage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MedicalCurrentStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first medical current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical current stage
	 * @throws NoSuchMedicalCurrentStageException if a matching medical current stage could not be found
	 */
	public MedicalCurrentStage findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalCurrentStage> orderByComparator)
		throws NoSuchMedicalCurrentStageException;

	/**
	 * Returns the first medical current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical current stage, or <code>null</code> if a matching medical current stage could not be found
	 */
	public MedicalCurrentStage fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<MedicalCurrentStage>
			orderByComparator);

	/**
	 * Returns the last medical current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical current stage
	 * @throws NoSuchMedicalCurrentStageException if a matching medical current stage could not be found
	 */
	public MedicalCurrentStage findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalCurrentStage> orderByComparator)
		throws NoSuchMedicalCurrentStageException;

	/**
	 * Returns the last medical current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical current stage, or <code>null</code> if a matching medical current stage could not be found
	 */
	public MedicalCurrentStage fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<MedicalCurrentStage>
			orderByComparator);

	/**
	 * Returns the medical current stages before and after the current medical current stage in the ordered set where uuid = &#63;.
	 *
	 * @param medicalCurrentStageId the primary key of the current medical current stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical current stage
	 * @throws NoSuchMedicalCurrentStageException if a medical current stage with the primary key could not be found
	 */
	public MedicalCurrentStage[] findByUuid_PrevAndNext(
			long medicalCurrentStageId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalCurrentStage> orderByComparator)
		throws NoSuchMedicalCurrentStageException;

	/**
	 * Removes all the medical current stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of medical current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching medical current stages
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the medical current stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMedicalCurrentStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical current stage
	 * @throws NoSuchMedicalCurrentStageException if a matching medical current stage could not be found
	 */
	public MedicalCurrentStage findByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalCurrentStageException;

	/**
	 * Returns the medical current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical current stage, or <code>null</code> if a matching medical current stage could not be found
	 */
	public MedicalCurrentStage fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the medical current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical current stage, or <code>null</code> if a matching medical current stage could not be found
	 */
	public MedicalCurrentStage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the medical current stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the medical current stage that was removed
	 */
	public MedicalCurrentStage removeByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalCurrentStageException;

	/**
	 * Returns the number of medical current stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching medical current stages
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the medical current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching medical current stages
	 */
	public java.util.List<MedicalCurrentStage> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the medical current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical current stages
	 * @param end the upper bound of the range of medical current stages (not inclusive)
	 * @return the range of matching medical current stages
	 */
	public java.util.List<MedicalCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the medical current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical current stages
	 * @param end the upper bound of the range of medical current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical current stages
	 */
	public java.util.List<MedicalCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MedicalCurrentStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the medical current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical current stages
	 * @param end the upper bound of the range of medical current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical current stages
	 */
	public java.util.List<MedicalCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MedicalCurrentStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first medical current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical current stage
	 * @throws NoSuchMedicalCurrentStageException if a matching medical current stage could not be found
	 */
	public MedicalCurrentStage findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalCurrentStage> orderByComparator)
		throws NoSuchMedicalCurrentStageException;

	/**
	 * Returns the first medical current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical current stage, or <code>null</code> if a matching medical current stage could not be found
	 */
	public MedicalCurrentStage fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<MedicalCurrentStage>
			orderByComparator);

	/**
	 * Returns the last medical current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical current stage
	 * @throws NoSuchMedicalCurrentStageException if a matching medical current stage could not be found
	 */
	public MedicalCurrentStage findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalCurrentStage> orderByComparator)
		throws NoSuchMedicalCurrentStageException;

	/**
	 * Returns the last medical current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical current stage, or <code>null</code> if a matching medical current stage could not be found
	 */
	public MedicalCurrentStage fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<MedicalCurrentStage>
			orderByComparator);

	/**
	 * Returns the medical current stages before and after the current medical current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param medicalCurrentStageId the primary key of the current medical current stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical current stage
	 * @throws NoSuchMedicalCurrentStageException if a medical current stage with the primary key could not be found
	 */
	public MedicalCurrentStage[] findByUuid_C_PrevAndNext(
			long medicalCurrentStageId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalCurrentStage> orderByComparator)
		throws NoSuchMedicalCurrentStageException;

	/**
	 * Removes all the medical current stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of medical current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching medical current stages
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the medical current stage where medicalFacilitiesAppId = &#63; or throws a <code>NoSuchMedicalCurrentStageException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical current stage
	 * @throws NoSuchMedicalCurrentStageException if a matching medical current stage could not be found
	 */
	public MedicalCurrentStage findBygetByMED_Stage(long medicalFacilitiesAppId)
		throws NoSuchMedicalCurrentStageException;

	/**
	 * Returns the medical current stage where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical current stage, or <code>null</code> if a matching medical current stage could not be found
	 */
	public MedicalCurrentStage fetchBygetByMED_Stage(
		long medicalFacilitiesAppId);

	/**
	 * Returns the medical current stage where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical current stage, or <code>null</code> if a matching medical current stage could not be found
	 */
	public MedicalCurrentStage fetchBygetByMED_Stage(
		long medicalFacilitiesAppId, boolean useFinderCache);

	/**
	 * Removes the medical current stage where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the medical current stage that was removed
	 */
	public MedicalCurrentStage removeBygetByMED_Stage(
			long medicalFacilitiesAppId)
		throws NoSuchMedicalCurrentStageException;

	/**
	 * Returns the number of medical current stages where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical current stages
	 */
	public int countBygetByMED_Stage(long medicalFacilitiesAppId);

	/**
	 * Caches the medical current stage in the entity cache if it is enabled.
	 *
	 * @param medicalCurrentStage the medical current stage
	 */
	public void cacheResult(MedicalCurrentStage medicalCurrentStage);

	/**
	 * Caches the medical current stages in the entity cache if it is enabled.
	 *
	 * @param medicalCurrentStages the medical current stages
	 */
	public void cacheResult(
		java.util.List<MedicalCurrentStage> medicalCurrentStages);

	/**
	 * Creates a new medical current stage with the primary key. Does not add the medical current stage to the database.
	 *
	 * @param medicalCurrentStageId the primary key for the new medical current stage
	 * @return the new medical current stage
	 */
	public MedicalCurrentStage create(long medicalCurrentStageId);

	/**
	 * Removes the medical current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalCurrentStageId the primary key of the medical current stage
	 * @return the medical current stage that was removed
	 * @throws NoSuchMedicalCurrentStageException if a medical current stage with the primary key could not be found
	 */
	public MedicalCurrentStage remove(long medicalCurrentStageId)
		throws NoSuchMedicalCurrentStageException;

	public MedicalCurrentStage updateImpl(
		MedicalCurrentStage medicalCurrentStage);

	/**
	 * Returns the medical current stage with the primary key or throws a <code>NoSuchMedicalCurrentStageException</code> if it could not be found.
	 *
	 * @param medicalCurrentStageId the primary key of the medical current stage
	 * @return the medical current stage
	 * @throws NoSuchMedicalCurrentStageException if a medical current stage with the primary key could not be found
	 */
	public MedicalCurrentStage findByPrimaryKey(long medicalCurrentStageId)
		throws NoSuchMedicalCurrentStageException;

	/**
	 * Returns the medical current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalCurrentStageId the primary key of the medical current stage
	 * @return the medical current stage, or <code>null</code> if a medical current stage with the primary key could not be found
	 */
	public MedicalCurrentStage fetchByPrimaryKey(long medicalCurrentStageId);

	/**
	 * Returns all the medical current stages.
	 *
	 * @return the medical current stages
	 */
	public java.util.List<MedicalCurrentStage> findAll();

	/**
	 * Returns a range of all the medical current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical current stages
	 * @param end the upper bound of the range of medical current stages (not inclusive)
	 * @return the range of medical current stages
	 */
	public java.util.List<MedicalCurrentStage> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the medical current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical current stages
	 * @param end the upper bound of the range of medical current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical current stages
	 */
	public java.util.List<MedicalCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MedicalCurrentStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the medical current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical current stages
	 * @param end the upper bound of the range of medical current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical current stages
	 */
	public java.util.List<MedicalCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MedicalCurrentStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the medical current stages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of medical current stages.
	 *
	 * @return the number of medical current stages
	 */
	public int countAll();

}