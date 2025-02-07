/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.medical.facilities.application.form.service.exception.NoSuchMedicalFacilitiesNurseDetailException;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesNurseDetail;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the medical facilities nurse detail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesNurseDetailUtil
 * @generated
 */
@ProviderType
public interface MedicalFacilitiesNurseDetailPersistence
	extends BasePersistence<MedicalFacilitiesNurseDetail> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MedicalFacilitiesNurseDetailUtil} to access the medical facilities nurse detail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the medical facilities nurse details where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching medical facilities nurse details
	 */
	public java.util.List<MedicalFacilitiesNurseDetail> findByUuid(String uuid);

	/**
	 * Returns a range of all the medical facilities nurse details where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @return the range of matching medical facilities nurse details
	 */
	public java.util.List<MedicalFacilitiesNurseDetail> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities nurse details where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities nurse details
	 */
	public java.util.List<MedicalFacilitiesNurseDetail> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesNurseDetail> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities nurse details where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities nurse details
	 */
	public java.util.List<MedicalFacilitiesNurseDetail> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesNurseDetail> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first medical facilities nurse detail in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse detail
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a matching medical facilities nurse detail could not be found
	 */
	public MedicalFacilitiesNurseDetail findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesNurseDetail> orderByComparator)
		throws NoSuchMedicalFacilitiesNurseDetailException;

	/**
	 * Returns the first medical facilities nurse detail in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse detail, or <code>null</code> if a matching medical facilities nurse detail could not be found
	 */
	public MedicalFacilitiesNurseDetail fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesNurseDetail> orderByComparator);

	/**
	 * Returns the last medical facilities nurse detail in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse detail
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a matching medical facilities nurse detail could not be found
	 */
	public MedicalFacilitiesNurseDetail findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesNurseDetail> orderByComparator)
		throws NoSuchMedicalFacilitiesNurseDetailException;

	/**
	 * Returns the last medical facilities nurse detail in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse detail, or <code>null</code> if a matching medical facilities nurse detail could not be found
	 */
	public MedicalFacilitiesNurseDetail fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesNurseDetail> orderByComparator);

	/**
	 * Returns the medical facilities nurse details before and after the current medical facilities nurse detail in the ordered set where uuid = &#63;.
	 *
	 * @param medicalFacilitiesNurseDetailId the primary key of the current medical facilities nurse detail
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities nurse detail
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a medical facilities nurse detail with the primary key could not be found
	 */
	public MedicalFacilitiesNurseDetail[] findByUuid_PrevAndNext(
			long medicalFacilitiesNurseDetailId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesNurseDetail> orderByComparator)
		throws NoSuchMedicalFacilitiesNurseDetailException;

	/**
	 * Removes all the medical facilities nurse details where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of medical facilities nurse details where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching medical facilities nurse details
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the medical facilities nurse detail where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMedicalFacilitiesNurseDetailException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities nurse detail
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a matching medical facilities nurse detail could not be found
	 */
	public MedicalFacilitiesNurseDetail findByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalFacilitiesNurseDetailException;

	/**
	 * Returns the medical facilities nurse detail where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities nurse detail, or <code>null</code> if a matching medical facilities nurse detail could not be found
	 */
	public MedicalFacilitiesNurseDetail fetchByUUID_G(
		String uuid, long groupId);

	/**
	 * Returns the medical facilities nurse detail where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities nurse detail, or <code>null</code> if a matching medical facilities nurse detail could not be found
	 */
	public MedicalFacilitiesNurseDetail fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the medical facilities nurse detail where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the medical facilities nurse detail that was removed
	 */
	public MedicalFacilitiesNurseDetail removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchMedicalFacilitiesNurseDetailException;

	/**
	 * Returns the number of medical facilities nurse details where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching medical facilities nurse details
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the medical facilities nurse details where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching medical facilities nurse details
	 */
	public java.util.List<MedicalFacilitiesNurseDetail> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the medical facilities nurse details where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @return the range of matching medical facilities nurse details
	 */
	public java.util.List<MedicalFacilitiesNurseDetail> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities nurse details where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities nurse details
	 */
	public java.util.List<MedicalFacilitiesNurseDetail> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesNurseDetail> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities nurse details where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities nurse details
	 */
	public java.util.List<MedicalFacilitiesNurseDetail> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesNurseDetail> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first medical facilities nurse detail in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse detail
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a matching medical facilities nurse detail could not be found
	 */
	public MedicalFacilitiesNurseDetail findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesNurseDetail> orderByComparator)
		throws NoSuchMedicalFacilitiesNurseDetailException;

	/**
	 * Returns the first medical facilities nurse detail in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse detail, or <code>null</code> if a matching medical facilities nurse detail could not be found
	 */
	public MedicalFacilitiesNurseDetail fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesNurseDetail> orderByComparator);

	/**
	 * Returns the last medical facilities nurse detail in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse detail
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a matching medical facilities nurse detail could not be found
	 */
	public MedicalFacilitiesNurseDetail findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesNurseDetail> orderByComparator)
		throws NoSuchMedicalFacilitiesNurseDetailException;

	/**
	 * Returns the last medical facilities nurse detail in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse detail, or <code>null</code> if a matching medical facilities nurse detail could not be found
	 */
	public MedicalFacilitiesNurseDetail fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesNurseDetail> orderByComparator);

	/**
	 * Returns the medical facilities nurse details before and after the current medical facilities nurse detail in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param medicalFacilitiesNurseDetailId the primary key of the current medical facilities nurse detail
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities nurse detail
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a medical facilities nurse detail with the primary key could not be found
	 */
	public MedicalFacilitiesNurseDetail[] findByUuid_C_PrevAndNext(
			long medicalFacilitiesNurseDetailId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesNurseDetail> orderByComparator)
		throws NoSuchMedicalFacilitiesNurseDetailException;

	/**
	 * Removes all the medical facilities nurse details where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of medical facilities nurse details where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching medical facilities nurse details
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the medical facilities nurse details where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities nurse details
	 */
	public java.util.List<MedicalFacilitiesNurseDetail>
		findBygetMedicalFacilitiesById(long medicalFacilitiesAppId);

	/**
	 * Returns a range of all the medical facilities nurse details where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @return the range of matching medical facilities nurse details
	 */
	public java.util.List<MedicalFacilitiesNurseDetail>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities nurse details where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities nurse details
	 */
	public java.util.List<MedicalFacilitiesNurseDetail>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesNurseDetail> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities nurse details where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities nurse details
	 */
	public java.util.List<MedicalFacilitiesNurseDetail>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesNurseDetail> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first medical facilities nurse detail in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse detail
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a matching medical facilities nurse detail could not be found
	 */
	public MedicalFacilitiesNurseDetail findBygetMedicalFacilitiesById_First(
			long medicalFacilitiesAppId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesNurseDetail> orderByComparator)
		throws NoSuchMedicalFacilitiesNurseDetailException;

	/**
	 * Returns the first medical facilities nurse detail in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse detail, or <code>null</code> if a matching medical facilities nurse detail could not be found
	 */
	public MedicalFacilitiesNurseDetail fetchBygetMedicalFacilitiesById_First(
		long medicalFacilitiesAppId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesNurseDetail> orderByComparator);

	/**
	 * Returns the last medical facilities nurse detail in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse detail
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a matching medical facilities nurse detail could not be found
	 */
	public MedicalFacilitiesNurseDetail findBygetMedicalFacilitiesById_Last(
			long medicalFacilitiesAppId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesNurseDetail> orderByComparator)
		throws NoSuchMedicalFacilitiesNurseDetailException;

	/**
	 * Returns the last medical facilities nurse detail in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse detail, or <code>null</code> if a matching medical facilities nurse detail could not be found
	 */
	public MedicalFacilitiesNurseDetail fetchBygetMedicalFacilitiesById_Last(
		long medicalFacilitiesAppId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesNurseDetail> orderByComparator);

	/**
	 * Returns the medical facilities nurse details before and after the current medical facilities nurse detail in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesNurseDetailId the primary key of the current medical facilities nurse detail
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities nurse detail
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a medical facilities nurse detail with the primary key could not be found
	 */
	public MedicalFacilitiesNurseDetail[]
			findBygetMedicalFacilitiesById_PrevAndNext(
				long medicalFacilitiesNurseDetailId,
				long medicalFacilitiesAppId,
				com.liferay.portal.kernel.util.OrderByComparator
					<MedicalFacilitiesNurseDetail> orderByComparator)
		throws NoSuchMedicalFacilitiesNurseDetailException;

	/**
	 * Removes all the medical facilities nurse details where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 */
	public void removeBygetMedicalFacilitiesById(long medicalFacilitiesAppId);

	/**
	 * Returns the number of medical facilities nurse details where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical facilities nurse details
	 */
	public int countBygetMedicalFacilitiesById(long medicalFacilitiesAppId);

	/**
	 * Caches the medical facilities nurse detail in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesNurseDetail the medical facilities nurse detail
	 */
	public void cacheResult(
		MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail);

	/**
	 * Caches the medical facilities nurse details in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesNurseDetails the medical facilities nurse details
	 */
	public void cacheResult(
		java.util.List<MedicalFacilitiesNurseDetail>
			medicalFacilitiesNurseDetails);

	/**
	 * Creates a new medical facilities nurse detail with the primary key. Does not add the medical facilities nurse detail to the database.
	 *
	 * @param medicalFacilitiesNurseDetailId the primary key for the new medical facilities nurse detail
	 * @return the new medical facilities nurse detail
	 */
	public MedicalFacilitiesNurseDetail create(
		long medicalFacilitiesNurseDetailId);

	/**
	 * Removes the medical facilities nurse detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalFacilitiesNurseDetailId the primary key of the medical facilities nurse detail
	 * @return the medical facilities nurse detail that was removed
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a medical facilities nurse detail with the primary key could not be found
	 */
	public MedicalFacilitiesNurseDetail remove(
			long medicalFacilitiesNurseDetailId)
		throws NoSuchMedicalFacilitiesNurseDetailException;

	public MedicalFacilitiesNurseDetail updateImpl(
		MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail);

	/**
	 * Returns the medical facilities nurse detail with the primary key or throws a <code>NoSuchMedicalFacilitiesNurseDetailException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesNurseDetailId the primary key of the medical facilities nurse detail
	 * @return the medical facilities nurse detail
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a medical facilities nurse detail with the primary key could not be found
	 */
	public MedicalFacilitiesNurseDetail findByPrimaryKey(
			long medicalFacilitiesNurseDetailId)
		throws NoSuchMedicalFacilitiesNurseDetailException;

	/**
	 * Returns the medical facilities nurse detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalFacilitiesNurseDetailId the primary key of the medical facilities nurse detail
	 * @return the medical facilities nurse detail, or <code>null</code> if a medical facilities nurse detail with the primary key could not be found
	 */
	public MedicalFacilitiesNurseDetail fetchByPrimaryKey(
		long medicalFacilitiesNurseDetailId);

	/**
	 * Returns all the medical facilities nurse details.
	 *
	 * @return the medical facilities nurse details
	 */
	public java.util.List<MedicalFacilitiesNurseDetail> findAll();

	/**
	 * Returns a range of all the medical facilities nurse details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @return the range of medical facilities nurse details
	 */
	public java.util.List<MedicalFacilitiesNurseDetail> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities nurse details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical facilities nurse details
	 */
	public java.util.List<MedicalFacilitiesNurseDetail> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesNurseDetail> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities nurse details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical facilities nurse details
	 */
	public java.util.List<MedicalFacilitiesNurseDetail> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesNurseDetail> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the medical facilities nurse details from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of medical facilities nurse details.
	 *
	 * @return the number of medical facilities nurse details
	 */
	public int countAll();

}