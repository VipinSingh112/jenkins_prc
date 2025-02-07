/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.medical.facilities.application.form.service.exception.NoSuchMedicalFacilitiesNurseStaffException;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesNurseStaff;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the medical facilities nurse staff service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesNurseStaffUtil
 * @generated
 */
@ProviderType
public interface MedicalFacilitiesNurseStaffPersistence
	extends BasePersistence<MedicalFacilitiesNurseStaff> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MedicalFacilitiesNurseStaffUtil} to access the medical facilities nurse staff persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the medical facilities nurse staffs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching medical facilities nurse staffs
	 */
	public java.util.List<MedicalFacilitiesNurseStaff> findByUuid(String uuid);

	/**
	 * Returns a range of all the medical facilities nurse staffs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @return the range of matching medical facilities nurse staffs
	 */
	public java.util.List<MedicalFacilitiesNurseStaff> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities nurse staffs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities nurse staffs
	 */
	public java.util.List<MedicalFacilitiesNurseStaff> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesNurseStaff> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities nurse staffs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities nurse staffs
	 */
	public java.util.List<MedicalFacilitiesNurseStaff> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesNurseStaff> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first medical facilities nurse staff in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse staff
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a matching medical facilities nurse staff could not be found
	 */
	public MedicalFacilitiesNurseStaff findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesNurseStaff> orderByComparator)
		throws NoSuchMedicalFacilitiesNurseStaffException;

	/**
	 * Returns the first medical facilities nurse staff in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse staff, or <code>null</code> if a matching medical facilities nurse staff could not be found
	 */
	public MedicalFacilitiesNurseStaff fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesNurseStaff> orderByComparator);

	/**
	 * Returns the last medical facilities nurse staff in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse staff
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a matching medical facilities nurse staff could not be found
	 */
	public MedicalFacilitiesNurseStaff findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesNurseStaff> orderByComparator)
		throws NoSuchMedicalFacilitiesNurseStaffException;

	/**
	 * Returns the last medical facilities nurse staff in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse staff, or <code>null</code> if a matching medical facilities nurse staff could not be found
	 */
	public MedicalFacilitiesNurseStaff fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesNurseStaff> orderByComparator);

	/**
	 * Returns the medical facilities nurse staffs before and after the current medical facilities nurse staff in the ordered set where uuid = &#63;.
	 *
	 * @param medicalFacilitiesNurseStaffId the primary key of the current medical facilities nurse staff
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities nurse staff
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a medical facilities nurse staff with the primary key could not be found
	 */
	public MedicalFacilitiesNurseStaff[] findByUuid_PrevAndNext(
			long medicalFacilitiesNurseStaffId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesNurseStaff> orderByComparator)
		throws NoSuchMedicalFacilitiesNurseStaffException;

	/**
	 * Removes all the medical facilities nurse staffs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of medical facilities nurse staffs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching medical facilities nurse staffs
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the medical facilities nurse staff where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMedicalFacilitiesNurseStaffException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities nurse staff
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a matching medical facilities nurse staff could not be found
	 */
	public MedicalFacilitiesNurseStaff findByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalFacilitiesNurseStaffException;

	/**
	 * Returns the medical facilities nurse staff where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities nurse staff, or <code>null</code> if a matching medical facilities nurse staff could not be found
	 */
	public MedicalFacilitiesNurseStaff fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the medical facilities nurse staff where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities nurse staff, or <code>null</code> if a matching medical facilities nurse staff could not be found
	 */
	public MedicalFacilitiesNurseStaff fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the medical facilities nurse staff where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the medical facilities nurse staff that was removed
	 */
	public MedicalFacilitiesNurseStaff removeByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalFacilitiesNurseStaffException;

	/**
	 * Returns the number of medical facilities nurse staffs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching medical facilities nurse staffs
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the medical facilities nurse staffs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching medical facilities nurse staffs
	 */
	public java.util.List<MedicalFacilitiesNurseStaff> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the medical facilities nurse staffs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @return the range of matching medical facilities nurse staffs
	 */
	public java.util.List<MedicalFacilitiesNurseStaff> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities nurse staffs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities nurse staffs
	 */
	public java.util.List<MedicalFacilitiesNurseStaff> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesNurseStaff> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities nurse staffs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities nurse staffs
	 */
	public java.util.List<MedicalFacilitiesNurseStaff> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesNurseStaff> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first medical facilities nurse staff in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse staff
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a matching medical facilities nurse staff could not be found
	 */
	public MedicalFacilitiesNurseStaff findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesNurseStaff> orderByComparator)
		throws NoSuchMedicalFacilitiesNurseStaffException;

	/**
	 * Returns the first medical facilities nurse staff in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse staff, or <code>null</code> if a matching medical facilities nurse staff could not be found
	 */
	public MedicalFacilitiesNurseStaff fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesNurseStaff> orderByComparator);

	/**
	 * Returns the last medical facilities nurse staff in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse staff
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a matching medical facilities nurse staff could not be found
	 */
	public MedicalFacilitiesNurseStaff findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesNurseStaff> orderByComparator)
		throws NoSuchMedicalFacilitiesNurseStaffException;

	/**
	 * Returns the last medical facilities nurse staff in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse staff, or <code>null</code> if a matching medical facilities nurse staff could not be found
	 */
	public MedicalFacilitiesNurseStaff fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesNurseStaff> orderByComparator);

	/**
	 * Returns the medical facilities nurse staffs before and after the current medical facilities nurse staff in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param medicalFacilitiesNurseStaffId the primary key of the current medical facilities nurse staff
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities nurse staff
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a medical facilities nurse staff with the primary key could not be found
	 */
	public MedicalFacilitiesNurseStaff[] findByUuid_C_PrevAndNext(
			long medicalFacilitiesNurseStaffId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesNurseStaff> orderByComparator)
		throws NoSuchMedicalFacilitiesNurseStaffException;

	/**
	 * Removes all the medical facilities nurse staffs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of medical facilities nurse staffs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching medical facilities nurse staffs
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the medical facilities nurse staffs where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities nurse staffs
	 */
	public java.util.List<MedicalFacilitiesNurseStaff>
		findBygetMedicalFacilitiesById(long medicalFacilitiesAppId);

	/**
	 * Returns a range of all the medical facilities nurse staffs where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @return the range of matching medical facilities nurse staffs
	 */
	public java.util.List<MedicalFacilitiesNurseStaff>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities nurse staffs where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities nurse staffs
	 */
	public java.util.List<MedicalFacilitiesNurseStaff>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesNurseStaff> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities nurse staffs where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities nurse staffs
	 */
	public java.util.List<MedicalFacilitiesNurseStaff>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesNurseStaff> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first medical facilities nurse staff in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse staff
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a matching medical facilities nurse staff could not be found
	 */
	public MedicalFacilitiesNurseStaff findBygetMedicalFacilitiesById_First(
			long medicalFacilitiesAppId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesNurseStaff> orderByComparator)
		throws NoSuchMedicalFacilitiesNurseStaffException;

	/**
	 * Returns the first medical facilities nurse staff in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse staff, or <code>null</code> if a matching medical facilities nurse staff could not be found
	 */
	public MedicalFacilitiesNurseStaff fetchBygetMedicalFacilitiesById_First(
		long medicalFacilitiesAppId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesNurseStaff> orderByComparator);

	/**
	 * Returns the last medical facilities nurse staff in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse staff
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a matching medical facilities nurse staff could not be found
	 */
	public MedicalFacilitiesNurseStaff findBygetMedicalFacilitiesById_Last(
			long medicalFacilitiesAppId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesNurseStaff> orderByComparator)
		throws NoSuchMedicalFacilitiesNurseStaffException;

	/**
	 * Returns the last medical facilities nurse staff in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse staff, or <code>null</code> if a matching medical facilities nurse staff could not be found
	 */
	public MedicalFacilitiesNurseStaff fetchBygetMedicalFacilitiesById_Last(
		long medicalFacilitiesAppId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesNurseStaff> orderByComparator);

	/**
	 * Returns the medical facilities nurse staffs before and after the current medical facilities nurse staff in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesNurseStaffId the primary key of the current medical facilities nurse staff
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities nurse staff
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a medical facilities nurse staff with the primary key could not be found
	 */
	public MedicalFacilitiesNurseStaff[]
			findBygetMedicalFacilitiesById_PrevAndNext(
				long medicalFacilitiesNurseStaffId, long medicalFacilitiesAppId,
				com.liferay.portal.kernel.util.OrderByComparator
					<MedicalFacilitiesNurseStaff> orderByComparator)
		throws NoSuchMedicalFacilitiesNurseStaffException;

	/**
	 * Removes all the medical facilities nurse staffs where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 */
	public void removeBygetMedicalFacilitiesById(long medicalFacilitiesAppId);

	/**
	 * Returns the number of medical facilities nurse staffs where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical facilities nurse staffs
	 */
	public int countBygetMedicalFacilitiesById(long medicalFacilitiesAppId);

	/**
	 * Caches the medical facilities nurse staff in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesNurseStaff the medical facilities nurse staff
	 */
	public void cacheResult(
		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff);

	/**
	 * Caches the medical facilities nurse staffs in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesNurseStaffs the medical facilities nurse staffs
	 */
	public void cacheResult(
		java.util.List<MedicalFacilitiesNurseStaff>
			medicalFacilitiesNurseStaffs);

	/**
	 * Creates a new medical facilities nurse staff with the primary key. Does not add the medical facilities nurse staff to the database.
	 *
	 * @param medicalFacilitiesNurseStaffId the primary key for the new medical facilities nurse staff
	 * @return the new medical facilities nurse staff
	 */
	public MedicalFacilitiesNurseStaff create(
		long medicalFacilitiesNurseStaffId);

	/**
	 * Removes the medical facilities nurse staff with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalFacilitiesNurseStaffId the primary key of the medical facilities nurse staff
	 * @return the medical facilities nurse staff that was removed
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a medical facilities nurse staff with the primary key could not be found
	 */
	public MedicalFacilitiesNurseStaff remove(
			long medicalFacilitiesNurseStaffId)
		throws NoSuchMedicalFacilitiesNurseStaffException;

	public MedicalFacilitiesNurseStaff updateImpl(
		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff);

	/**
	 * Returns the medical facilities nurse staff with the primary key or throws a <code>NoSuchMedicalFacilitiesNurseStaffException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesNurseStaffId the primary key of the medical facilities nurse staff
	 * @return the medical facilities nurse staff
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a medical facilities nurse staff with the primary key could not be found
	 */
	public MedicalFacilitiesNurseStaff findByPrimaryKey(
			long medicalFacilitiesNurseStaffId)
		throws NoSuchMedicalFacilitiesNurseStaffException;

	/**
	 * Returns the medical facilities nurse staff with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalFacilitiesNurseStaffId the primary key of the medical facilities nurse staff
	 * @return the medical facilities nurse staff, or <code>null</code> if a medical facilities nurse staff with the primary key could not be found
	 */
	public MedicalFacilitiesNurseStaff fetchByPrimaryKey(
		long medicalFacilitiesNurseStaffId);

	/**
	 * Returns all the medical facilities nurse staffs.
	 *
	 * @return the medical facilities nurse staffs
	 */
	public java.util.List<MedicalFacilitiesNurseStaff> findAll();

	/**
	 * Returns a range of all the medical facilities nurse staffs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @return the range of medical facilities nurse staffs
	 */
	public java.util.List<MedicalFacilitiesNurseStaff> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities nurse staffs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical facilities nurse staffs
	 */
	public java.util.List<MedicalFacilitiesNurseStaff> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesNurseStaff> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities nurse staffs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical facilities nurse staffs
	 */
	public java.util.List<MedicalFacilitiesNurseStaff> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesNurseStaff> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the medical facilities nurse staffs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of medical facilities nurse staffs.
	 *
	 * @return the number of medical facilities nurse staffs
	 */
	public int countAll();

}