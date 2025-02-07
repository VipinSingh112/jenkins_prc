/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.medical.facilities.application.form.service.exception.NoSuchMedicalFacilitiesComDetailException;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesComDetail;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the medical facilities com detail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesComDetailUtil
 * @generated
 */
@ProviderType
public interface MedicalFacilitiesComDetailPersistence
	extends BasePersistence<MedicalFacilitiesComDetail> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MedicalFacilitiesComDetailUtil} to access the medical facilities com detail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the medical facilities com details where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching medical facilities com details
	 */
	public java.util.List<MedicalFacilitiesComDetail> findByUuid(String uuid);

	/**
	 * Returns a range of all the medical facilities com details where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesComDetailModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities com details
	 * @param end the upper bound of the range of medical facilities com details (not inclusive)
	 * @return the range of matching medical facilities com details
	 */
	public java.util.List<MedicalFacilitiesComDetail> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities com details where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesComDetailModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities com details
	 * @param end the upper bound of the range of medical facilities com details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities com details
	 */
	public java.util.List<MedicalFacilitiesComDetail> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesComDetail> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities com details where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesComDetailModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities com details
	 * @param end the upper bound of the range of medical facilities com details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities com details
	 */
	public java.util.List<MedicalFacilitiesComDetail> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesComDetail> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first medical facilities com detail in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities com detail
	 * @throws NoSuchMedicalFacilitiesComDetailException if a matching medical facilities com detail could not be found
	 */
	public MedicalFacilitiesComDetail findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesComDetail> orderByComparator)
		throws NoSuchMedicalFacilitiesComDetailException;

	/**
	 * Returns the first medical facilities com detail in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities com detail, or <code>null</code> if a matching medical facilities com detail could not be found
	 */
	public MedicalFacilitiesComDetail fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesComDetail> orderByComparator);

	/**
	 * Returns the last medical facilities com detail in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities com detail
	 * @throws NoSuchMedicalFacilitiesComDetailException if a matching medical facilities com detail could not be found
	 */
	public MedicalFacilitiesComDetail findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesComDetail> orderByComparator)
		throws NoSuchMedicalFacilitiesComDetailException;

	/**
	 * Returns the last medical facilities com detail in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities com detail, or <code>null</code> if a matching medical facilities com detail could not be found
	 */
	public MedicalFacilitiesComDetail fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesComDetail> orderByComparator);

	/**
	 * Returns the medical facilities com details before and after the current medical facilities com detail in the ordered set where uuid = &#63;.
	 *
	 * @param medicalFacilitiesComDetailId the primary key of the current medical facilities com detail
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities com detail
	 * @throws NoSuchMedicalFacilitiesComDetailException if a medical facilities com detail with the primary key could not be found
	 */
	public MedicalFacilitiesComDetail[] findByUuid_PrevAndNext(
			long medicalFacilitiesComDetailId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesComDetail> orderByComparator)
		throws NoSuchMedicalFacilitiesComDetailException;

	/**
	 * Removes all the medical facilities com details where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of medical facilities com details where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching medical facilities com details
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the medical facilities com detail where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMedicalFacilitiesComDetailException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities com detail
	 * @throws NoSuchMedicalFacilitiesComDetailException if a matching medical facilities com detail could not be found
	 */
	public MedicalFacilitiesComDetail findByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalFacilitiesComDetailException;

	/**
	 * Returns the medical facilities com detail where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities com detail, or <code>null</code> if a matching medical facilities com detail could not be found
	 */
	public MedicalFacilitiesComDetail fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the medical facilities com detail where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities com detail, or <code>null</code> if a matching medical facilities com detail could not be found
	 */
	public MedicalFacilitiesComDetail fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the medical facilities com detail where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the medical facilities com detail that was removed
	 */
	public MedicalFacilitiesComDetail removeByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalFacilitiesComDetailException;

	/**
	 * Returns the number of medical facilities com details where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching medical facilities com details
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the medical facilities com details where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching medical facilities com details
	 */
	public java.util.List<MedicalFacilitiesComDetail> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the medical facilities com details where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesComDetailModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities com details
	 * @param end the upper bound of the range of medical facilities com details (not inclusive)
	 * @return the range of matching medical facilities com details
	 */
	public java.util.List<MedicalFacilitiesComDetail> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities com details where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesComDetailModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities com details
	 * @param end the upper bound of the range of medical facilities com details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities com details
	 */
	public java.util.List<MedicalFacilitiesComDetail> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesComDetail> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities com details where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesComDetailModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities com details
	 * @param end the upper bound of the range of medical facilities com details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities com details
	 */
	public java.util.List<MedicalFacilitiesComDetail> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesComDetail> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first medical facilities com detail in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities com detail
	 * @throws NoSuchMedicalFacilitiesComDetailException if a matching medical facilities com detail could not be found
	 */
	public MedicalFacilitiesComDetail findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesComDetail> orderByComparator)
		throws NoSuchMedicalFacilitiesComDetailException;

	/**
	 * Returns the first medical facilities com detail in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities com detail, or <code>null</code> if a matching medical facilities com detail could not be found
	 */
	public MedicalFacilitiesComDetail fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesComDetail> orderByComparator);

	/**
	 * Returns the last medical facilities com detail in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities com detail
	 * @throws NoSuchMedicalFacilitiesComDetailException if a matching medical facilities com detail could not be found
	 */
	public MedicalFacilitiesComDetail findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesComDetail> orderByComparator)
		throws NoSuchMedicalFacilitiesComDetailException;

	/**
	 * Returns the last medical facilities com detail in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities com detail, or <code>null</code> if a matching medical facilities com detail could not be found
	 */
	public MedicalFacilitiesComDetail fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesComDetail> orderByComparator);

	/**
	 * Returns the medical facilities com details before and after the current medical facilities com detail in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param medicalFacilitiesComDetailId the primary key of the current medical facilities com detail
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities com detail
	 * @throws NoSuchMedicalFacilitiesComDetailException if a medical facilities com detail with the primary key could not be found
	 */
	public MedicalFacilitiesComDetail[] findByUuid_C_PrevAndNext(
			long medicalFacilitiesComDetailId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesComDetail> orderByComparator)
		throws NoSuchMedicalFacilitiesComDetailException;

	/**
	 * Removes all the medical facilities com details where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of medical facilities com details where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching medical facilities com details
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the medical facilities com details where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities com details
	 */
	public java.util.List<MedicalFacilitiesComDetail>
		findBygetMedicalFacilitiesById(long medicalFacilitiesAppId);

	/**
	 * Returns a range of all the medical facilities com details where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesComDetailModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities com details
	 * @param end the upper bound of the range of medical facilities com details (not inclusive)
	 * @return the range of matching medical facilities com details
	 */
	public java.util.List<MedicalFacilitiesComDetail>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities com details where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesComDetailModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities com details
	 * @param end the upper bound of the range of medical facilities com details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities com details
	 */
	public java.util.List<MedicalFacilitiesComDetail>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesComDetail> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities com details where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesComDetailModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities com details
	 * @param end the upper bound of the range of medical facilities com details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities com details
	 */
	public java.util.List<MedicalFacilitiesComDetail>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesComDetail> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first medical facilities com detail in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities com detail
	 * @throws NoSuchMedicalFacilitiesComDetailException if a matching medical facilities com detail could not be found
	 */
	public MedicalFacilitiesComDetail findBygetMedicalFacilitiesById_First(
			long medicalFacilitiesAppId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesComDetail> orderByComparator)
		throws NoSuchMedicalFacilitiesComDetailException;

	/**
	 * Returns the first medical facilities com detail in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities com detail, or <code>null</code> if a matching medical facilities com detail could not be found
	 */
	public MedicalFacilitiesComDetail fetchBygetMedicalFacilitiesById_First(
		long medicalFacilitiesAppId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesComDetail> orderByComparator);

	/**
	 * Returns the last medical facilities com detail in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities com detail
	 * @throws NoSuchMedicalFacilitiesComDetailException if a matching medical facilities com detail could not be found
	 */
	public MedicalFacilitiesComDetail findBygetMedicalFacilitiesById_Last(
			long medicalFacilitiesAppId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesComDetail> orderByComparator)
		throws NoSuchMedicalFacilitiesComDetailException;

	/**
	 * Returns the last medical facilities com detail in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities com detail, or <code>null</code> if a matching medical facilities com detail could not be found
	 */
	public MedicalFacilitiesComDetail fetchBygetMedicalFacilitiesById_Last(
		long medicalFacilitiesAppId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesComDetail> orderByComparator);

	/**
	 * Returns the medical facilities com details before and after the current medical facilities com detail in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesComDetailId the primary key of the current medical facilities com detail
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities com detail
	 * @throws NoSuchMedicalFacilitiesComDetailException if a medical facilities com detail with the primary key could not be found
	 */
	public MedicalFacilitiesComDetail[]
			findBygetMedicalFacilitiesById_PrevAndNext(
				long medicalFacilitiesComDetailId, long medicalFacilitiesAppId,
				com.liferay.portal.kernel.util.OrderByComparator
					<MedicalFacilitiesComDetail> orderByComparator)
		throws NoSuchMedicalFacilitiesComDetailException;

	/**
	 * Removes all the medical facilities com details where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 */
	public void removeBygetMedicalFacilitiesById(long medicalFacilitiesAppId);

	/**
	 * Returns the number of medical facilities com details where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical facilities com details
	 */
	public int countBygetMedicalFacilitiesById(long medicalFacilitiesAppId);

	/**
	 * Caches the medical facilities com detail in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesComDetail the medical facilities com detail
	 */
	public void cacheResult(
		MedicalFacilitiesComDetail medicalFacilitiesComDetail);

	/**
	 * Caches the medical facilities com details in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesComDetails the medical facilities com details
	 */
	public void cacheResult(
		java.util.List<MedicalFacilitiesComDetail> medicalFacilitiesComDetails);

	/**
	 * Creates a new medical facilities com detail with the primary key. Does not add the medical facilities com detail to the database.
	 *
	 * @param medicalFacilitiesComDetailId the primary key for the new medical facilities com detail
	 * @return the new medical facilities com detail
	 */
	public MedicalFacilitiesComDetail create(long medicalFacilitiesComDetailId);

	/**
	 * Removes the medical facilities com detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalFacilitiesComDetailId the primary key of the medical facilities com detail
	 * @return the medical facilities com detail that was removed
	 * @throws NoSuchMedicalFacilitiesComDetailException if a medical facilities com detail with the primary key could not be found
	 */
	public MedicalFacilitiesComDetail remove(long medicalFacilitiesComDetailId)
		throws NoSuchMedicalFacilitiesComDetailException;

	public MedicalFacilitiesComDetail updateImpl(
		MedicalFacilitiesComDetail medicalFacilitiesComDetail);

	/**
	 * Returns the medical facilities com detail with the primary key or throws a <code>NoSuchMedicalFacilitiesComDetailException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesComDetailId the primary key of the medical facilities com detail
	 * @return the medical facilities com detail
	 * @throws NoSuchMedicalFacilitiesComDetailException if a medical facilities com detail with the primary key could not be found
	 */
	public MedicalFacilitiesComDetail findByPrimaryKey(
			long medicalFacilitiesComDetailId)
		throws NoSuchMedicalFacilitiesComDetailException;

	/**
	 * Returns the medical facilities com detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalFacilitiesComDetailId the primary key of the medical facilities com detail
	 * @return the medical facilities com detail, or <code>null</code> if a medical facilities com detail with the primary key could not be found
	 */
	public MedicalFacilitiesComDetail fetchByPrimaryKey(
		long medicalFacilitiesComDetailId);

	/**
	 * Returns all the medical facilities com details.
	 *
	 * @return the medical facilities com details
	 */
	public java.util.List<MedicalFacilitiesComDetail> findAll();

	/**
	 * Returns a range of all the medical facilities com details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesComDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities com details
	 * @param end the upper bound of the range of medical facilities com details (not inclusive)
	 * @return the range of medical facilities com details
	 */
	public java.util.List<MedicalFacilitiesComDetail> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities com details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesComDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities com details
	 * @param end the upper bound of the range of medical facilities com details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical facilities com details
	 */
	public java.util.List<MedicalFacilitiesComDetail> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesComDetail> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities com details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesComDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities com details
	 * @param end the upper bound of the range of medical facilities com details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical facilities com details
	 */
	public java.util.List<MedicalFacilitiesComDetail> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesComDetail> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the medical facilities com details from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of medical facilities com details.
	 *
	 * @return the number of medical facilities com details
	 */
	public int countAll();

}