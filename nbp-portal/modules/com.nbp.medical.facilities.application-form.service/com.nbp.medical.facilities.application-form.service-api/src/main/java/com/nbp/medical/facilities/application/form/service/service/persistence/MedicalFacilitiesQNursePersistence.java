/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.medical.facilities.application.form.service.exception.NoSuchMedicalFacilitiesQNurseException;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesQNurse;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the medical facilities q nurse service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesQNurseUtil
 * @generated
 */
@ProviderType
public interface MedicalFacilitiesQNursePersistence
	extends BasePersistence<MedicalFacilitiesQNurse> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MedicalFacilitiesQNurseUtil} to access the medical facilities q nurse persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the medical facilities q nurses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching medical facilities q nurses
	 */
	public java.util.List<MedicalFacilitiesQNurse> findByUuid(String uuid);

	/**
	 * Returns a range of all the medical facilities q nurses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesQNurseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities q nurses
	 * @param end the upper bound of the range of medical facilities q nurses (not inclusive)
	 * @return the range of matching medical facilities q nurses
	 */
	public java.util.List<MedicalFacilitiesQNurse> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities q nurses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesQNurseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities q nurses
	 * @param end the upper bound of the range of medical facilities q nurses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities q nurses
	 */
	public java.util.List<MedicalFacilitiesQNurse> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesQNurse> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities q nurses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesQNurseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities q nurses
	 * @param end the upper bound of the range of medical facilities q nurses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities q nurses
	 */
	public java.util.List<MedicalFacilitiesQNurse> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesQNurse> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first medical facilities q nurse in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities q nurse
	 * @throws NoSuchMedicalFacilitiesQNurseException if a matching medical facilities q nurse could not be found
	 */
	public MedicalFacilitiesQNurse findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesQNurse> orderByComparator)
		throws NoSuchMedicalFacilitiesQNurseException;

	/**
	 * Returns the first medical facilities q nurse in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities q nurse, or <code>null</code> if a matching medical facilities q nurse could not be found
	 */
	public MedicalFacilitiesQNurse fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesQNurse> orderByComparator);

	/**
	 * Returns the last medical facilities q nurse in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities q nurse
	 * @throws NoSuchMedicalFacilitiesQNurseException if a matching medical facilities q nurse could not be found
	 */
	public MedicalFacilitiesQNurse findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesQNurse> orderByComparator)
		throws NoSuchMedicalFacilitiesQNurseException;

	/**
	 * Returns the last medical facilities q nurse in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities q nurse, or <code>null</code> if a matching medical facilities q nurse could not be found
	 */
	public MedicalFacilitiesQNurse fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesQNurse> orderByComparator);

	/**
	 * Returns the medical facilities q nurses before and after the current medical facilities q nurse in the ordered set where uuid = &#63;.
	 *
	 * @param medicalFacilitiesQNurseId the primary key of the current medical facilities q nurse
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities q nurse
	 * @throws NoSuchMedicalFacilitiesQNurseException if a medical facilities q nurse with the primary key could not be found
	 */
	public MedicalFacilitiesQNurse[] findByUuid_PrevAndNext(
			long medicalFacilitiesQNurseId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesQNurse> orderByComparator)
		throws NoSuchMedicalFacilitiesQNurseException;

	/**
	 * Removes all the medical facilities q nurses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of medical facilities q nurses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching medical facilities q nurses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the medical facilities q nurse where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMedicalFacilitiesQNurseException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities q nurse
	 * @throws NoSuchMedicalFacilitiesQNurseException if a matching medical facilities q nurse could not be found
	 */
	public MedicalFacilitiesQNurse findByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalFacilitiesQNurseException;

	/**
	 * Returns the medical facilities q nurse where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities q nurse, or <code>null</code> if a matching medical facilities q nurse could not be found
	 */
	public MedicalFacilitiesQNurse fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the medical facilities q nurse where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities q nurse, or <code>null</code> if a matching medical facilities q nurse could not be found
	 */
	public MedicalFacilitiesQNurse fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the medical facilities q nurse where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the medical facilities q nurse that was removed
	 */
	public MedicalFacilitiesQNurse removeByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalFacilitiesQNurseException;

	/**
	 * Returns the number of medical facilities q nurses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching medical facilities q nurses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the medical facilities q nurses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching medical facilities q nurses
	 */
	public java.util.List<MedicalFacilitiesQNurse> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the medical facilities q nurses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesQNurseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities q nurses
	 * @param end the upper bound of the range of medical facilities q nurses (not inclusive)
	 * @return the range of matching medical facilities q nurses
	 */
	public java.util.List<MedicalFacilitiesQNurse> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities q nurses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesQNurseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities q nurses
	 * @param end the upper bound of the range of medical facilities q nurses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities q nurses
	 */
	public java.util.List<MedicalFacilitiesQNurse> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesQNurse> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities q nurses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesQNurseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities q nurses
	 * @param end the upper bound of the range of medical facilities q nurses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities q nurses
	 */
	public java.util.List<MedicalFacilitiesQNurse> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesQNurse> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first medical facilities q nurse in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities q nurse
	 * @throws NoSuchMedicalFacilitiesQNurseException if a matching medical facilities q nurse could not be found
	 */
	public MedicalFacilitiesQNurse findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesQNurse> orderByComparator)
		throws NoSuchMedicalFacilitiesQNurseException;

	/**
	 * Returns the first medical facilities q nurse in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities q nurse, or <code>null</code> if a matching medical facilities q nurse could not be found
	 */
	public MedicalFacilitiesQNurse fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesQNurse> orderByComparator);

	/**
	 * Returns the last medical facilities q nurse in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities q nurse
	 * @throws NoSuchMedicalFacilitiesQNurseException if a matching medical facilities q nurse could not be found
	 */
	public MedicalFacilitiesQNurse findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesQNurse> orderByComparator)
		throws NoSuchMedicalFacilitiesQNurseException;

	/**
	 * Returns the last medical facilities q nurse in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities q nurse, or <code>null</code> if a matching medical facilities q nurse could not be found
	 */
	public MedicalFacilitiesQNurse fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesQNurse> orderByComparator);

	/**
	 * Returns the medical facilities q nurses before and after the current medical facilities q nurse in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param medicalFacilitiesQNurseId the primary key of the current medical facilities q nurse
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities q nurse
	 * @throws NoSuchMedicalFacilitiesQNurseException if a medical facilities q nurse with the primary key could not be found
	 */
	public MedicalFacilitiesQNurse[] findByUuid_C_PrevAndNext(
			long medicalFacilitiesQNurseId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesQNurse> orderByComparator)
		throws NoSuchMedicalFacilitiesQNurseException;

	/**
	 * Removes all the medical facilities q nurses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of medical facilities q nurses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching medical facilities q nurses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the medical facilities q nurse where medicalFacilitiesAppId = &#63; or throws a <code>NoSuchMedicalFacilitiesQNurseException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities q nurse
	 * @throws NoSuchMedicalFacilitiesQNurseException if a matching medical facilities q nurse could not be found
	 */
	public MedicalFacilitiesQNurse findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId)
		throws NoSuchMedicalFacilitiesQNurseException;

	/**
	 * Returns the medical facilities q nurse where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities q nurse, or <code>null</code> if a matching medical facilities q nurse could not be found
	 */
	public MedicalFacilitiesQNurse fetchBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId);

	/**
	 * Returns the medical facilities q nurse where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities q nurse, or <code>null</code> if a matching medical facilities q nurse could not be found
	 */
	public MedicalFacilitiesQNurse fetchBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId, boolean useFinderCache);

	/**
	 * Removes the medical facilities q nurse where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the medical facilities q nurse that was removed
	 */
	public MedicalFacilitiesQNurse removeBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId)
		throws NoSuchMedicalFacilitiesQNurseException;

	/**
	 * Returns the number of medical facilities q nurses where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical facilities q nurses
	 */
	public int countBygetMedicalFacilitiesById(long medicalFacilitiesAppId);

	/**
	 * Caches the medical facilities q nurse in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesQNurse the medical facilities q nurse
	 */
	public void cacheResult(MedicalFacilitiesQNurse medicalFacilitiesQNurse);

	/**
	 * Caches the medical facilities q nurses in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesQNurses the medical facilities q nurses
	 */
	public void cacheResult(
		java.util.List<MedicalFacilitiesQNurse> medicalFacilitiesQNurses);

	/**
	 * Creates a new medical facilities q nurse with the primary key. Does not add the medical facilities q nurse to the database.
	 *
	 * @param medicalFacilitiesQNurseId the primary key for the new medical facilities q nurse
	 * @return the new medical facilities q nurse
	 */
	public MedicalFacilitiesQNurse create(long medicalFacilitiesQNurseId);

	/**
	 * Removes the medical facilities q nurse with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalFacilitiesQNurseId the primary key of the medical facilities q nurse
	 * @return the medical facilities q nurse that was removed
	 * @throws NoSuchMedicalFacilitiesQNurseException if a medical facilities q nurse with the primary key could not be found
	 */
	public MedicalFacilitiesQNurse remove(long medicalFacilitiesQNurseId)
		throws NoSuchMedicalFacilitiesQNurseException;

	public MedicalFacilitiesQNurse updateImpl(
		MedicalFacilitiesQNurse medicalFacilitiesQNurse);

	/**
	 * Returns the medical facilities q nurse with the primary key or throws a <code>NoSuchMedicalFacilitiesQNurseException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesQNurseId the primary key of the medical facilities q nurse
	 * @return the medical facilities q nurse
	 * @throws NoSuchMedicalFacilitiesQNurseException if a medical facilities q nurse with the primary key could not be found
	 */
	public MedicalFacilitiesQNurse findByPrimaryKey(
			long medicalFacilitiesQNurseId)
		throws NoSuchMedicalFacilitiesQNurseException;

	/**
	 * Returns the medical facilities q nurse with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalFacilitiesQNurseId the primary key of the medical facilities q nurse
	 * @return the medical facilities q nurse, or <code>null</code> if a medical facilities q nurse with the primary key could not be found
	 */
	public MedicalFacilitiesQNurse fetchByPrimaryKey(
		long medicalFacilitiesQNurseId);

	/**
	 * Returns all the medical facilities q nurses.
	 *
	 * @return the medical facilities q nurses
	 */
	public java.util.List<MedicalFacilitiesQNurse> findAll();

	/**
	 * Returns a range of all the medical facilities q nurses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesQNurseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities q nurses
	 * @param end the upper bound of the range of medical facilities q nurses (not inclusive)
	 * @return the range of medical facilities q nurses
	 */
	public java.util.List<MedicalFacilitiesQNurse> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities q nurses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesQNurseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities q nurses
	 * @param end the upper bound of the range of medical facilities q nurses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical facilities q nurses
	 */
	public java.util.List<MedicalFacilitiesQNurse> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesQNurse> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities q nurses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesQNurseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities q nurses
	 * @param end the upper bound of the range of medical facilities q nurses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical facilities q nurses
	 */
	public java.util.List<MedicalFacilitiesQNurse> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesQNurse> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the medical facilities q nurses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of medical facilities q nurses.
	 *
	 * @return the number of medical facilities q nurses
	 */
	public int countAll();

}