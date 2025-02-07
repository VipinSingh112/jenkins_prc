/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.medical.facilities.application.form.service.exception.NoSuchMedicalFacilitiesHomeTwoException;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesHomeTwo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the medical facilities home two service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesHomeTwoUtil
 * @generated
 */
@ProviderType
public interface MedicalFacilitiesHomeTwoPersistence
	extends BasePersistence<MedicalFacilitiesHomeTwo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MedicalFacilitiesHomeTwoUtil} to access the medical facilities home two persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the medical facilities home twos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching medical facilities home twos
	 */
	public java.util.List<MedicalFacilitiesHomeTwo> findByUuid(String uuid);

	/**
	 * Returns a range of all the medical facilities home twos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeTwoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities home twos
	 * @param end the upper bound of the range of medical facilities home twos (not inclusive)
	 * @return the range of matching medical facilities home twos
	 */
	public java.util.List<MedicalFacilitiesHomeTwo> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities home twos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeTwoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities home twos
	 * @param end the upper bound of the range of medical facilities home twos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities home twos
	 */
	public java.util.List<MedicalFacilitiesHomeTwo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesHomeTwo> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities home twos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeTwoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities home twos
	 * @param end the upper bound of the range of medical facilities home twos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities home twos
	 */
	public java.util.List<MedicalFacilitiesHomeTwo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesHomeTwo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first medical facilities home two in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities home two
	 * @throws NoSuchMedicalFacilitiesHomeTwoException if a matching medical facilities home two could not be found
	 */
	public MedicalFacilitiesHomeTwo findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesHomeTwo> orderByComparator)
		throws NoSuchMedicalFacilitiesHomeTwoException;

	/**
	 * Returns the first medical facilities home two in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities home two, or <code>null</code> if a matching medical facilities home two could not be found
	 */
	public MedicalFacilitiesHomeTwo fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesHomeTwo> orderByComparator);

	/**
	 * Returns the last medical facilities home two in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities home two
	 * @throws NoSuchMedicalFacilitiesHomeTwoException if a matching medical facilities home two could not be found
	 */
	public MedicalFacilitiesHomeTwo findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesHomeTwo> orderByComparator)
		throws NoSuchMedicalFacilitiesHomeTwoException;

	/**
	 * Returns the last medical facilities home two in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities home two, or <code>null</code> if a matching medical facilities home two could not be found
	 */
	public MedicalFacilitiesHomeTwo fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesHomeTwo> orderByComparator);

	/**
	 * Returns the medical facilities home twos before and after the current medical facilities home two in the ordered set where uuid = &#63;.
	 *
	 * @param medicalFacilitiesHomeTwoId the primary key of the current medical facilities home two
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities home two
	 * @throws NoSuchMedicalFacilitiesHomeTwoException if a medical facilities home two with the primary key could not be found
	 */
	public MedicalFacilitiesHomeTwo[] findByUuid_PrevAndNext(
			long medicalFacilitiesHomeTwoId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesHomeTwo> orderByComparator)
		throws NoSuchMedicalFacilitiesHomeTwoException;

	/**
	 * Removes all the medical facilities home twos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of medical facilities home twos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching medical facilities home twos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the medical facilities home two where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMedicalFacilitiesHomeTwoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities home two
	 * @throws NoSuchMedicalFacilitiesHomeTwoException if a matching medical facilities home two could not be found
	 */
	public MedicalFacilitiesHomeTwo findByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalFacilitiesHomeTwoException;

	/**
	 * Returns the medical facilities home two where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities home two, or <code>null</code> if a matching medical facilities home two could not be found
	 */
	public MedicalFacilitiesHomeTwo fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the medical facilities home two where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities home two, or <code>null</code> if a matching medical facilities home two could not be found
	 */
	public MedicalFacilitiesHomeTwo fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the medical facilities home two where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the medical facilities home two that was removed
	 */
	public MedicalFacilitiesHomeTwo removeByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalFacilitiesHomeTwoException;

	/**
	 * Returns the number of medical facilities home twos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching medical facilities home twos
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the medical facilities home twos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching medical facilities home twos
	 */
	public java.util.List<MedicalFacilitiesHomeTwo> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the medical facilities home twos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeTwoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities home twos
	 * @param end the upper bound of the range of medical facilities home twos (not inclusive)
	 * @return the range of matching medical facilities home twos
	 */
	public java.util.List<MedicalFacilitiesHomeTwo> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities home twos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeTwoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities home twos
	 * @param end the upper bound of the range of medical facilities home twos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities home twos
	 */
	public java.util.List<MedicalFacilitiesHomeTwo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesHomeTwo> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities home twos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeTwoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities home twos
	 * @param end the upper bound of the range of medical facilities home twos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities home twos
	 */
	public java.util.List<MedicalFacilitiesHomeTwo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesHomeTwo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first medical facilities home two in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities home two
	 * @throws NoSuchMedicalFacilitiesHomeTwoException if a matching medical facilities home two could not be found
	 */
	public MedicalFacilitiesHomeTwo findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesHomeTwo> orderByComparator)
		throws NoSuchMedicalFacilitiesHomeTwoException;

	/**
	 * Returns the first medical facilities home two in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities home two, or <code>null</code> if a matching medical facilities home two could not be found
	 */
	public MedicalFacilitiesHomeTwo fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesHomeTwo> orderByComparator);

	/**
	 * Returns the last medical facilities home two in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities home two
	 * @throws NoSuchMedicalFacilitiesHomeTwoException if a matching medical facilities home two could not be found
	 */
	public MedicalFacilitiesHomeTwo findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesHomeTwo> orderByComparator)
		throws NoSuchMedicalFacilitiesHomeTwoException;

	/**
	 * Returns the last medical facilities home two in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities home two, or <code>null</code> if a matching medical facilities home two could not be found
	 */
	public MedicalFacilitiesHomeTwo fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesHomeTwo> orderByComparator);

	/**
	 * Returns the medical facilities home twos before and after the current medical facilities home two in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param medicalFacilitiesHomeTwoId the primary key of the current medical facilities home two
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities home two
	 * @throws NoSuchMedicalFacilitiesHomeTwoException if a medical facilities home two with the primary key could not be found
	 */
	public MedicalFacilitiesHomeTwo[] findByUuid_C_PrevAndNext(
			long medicalFacilitiesHomeTwoId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesHomeTwo> orderByComparator)
		throws NoSuchMedicalFacilitiesHomeTwoException;

	/**
	 * Removes all the medical facilities home twos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of medical facilities home twos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching medical facilities home twos
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the medical facilities home twos where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities home twos
	 */
	public java.util.List<MedicalFacilitiesHomeTwo>
		findBygetMedicalFacilitiesById(long medicalFacilitiesAppId);

	/**
	 * Returns a range of all the medical facilities home twos where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeTwoModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities home twos
	 * @param end the upper bound of the range of medical facilities home twos (not inclusive)
	 * @return the range of matching medical facilities home twos
	 */
	public java.util.List<MedicalFacilitiesHomeTwo>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities home twos where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeTwoModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities home twos
	 * @param end the upper bound of the range of medical facilities home twos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities home twos
	 */
	public java.util.List<MedicalFacilitiesHomeTwo>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesHomeTwo> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities home twos where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeTwoModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities home twos
	 * @param end the upper bound of the range of medical facilities home twos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities home twos
	 */
	public java.util.List<MedicalFacilitiesHomeTwo>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesHomeTwo> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first medical facilities home two in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities home two
	 * @throws NoSuchMedicalFacilitiesHomeTwoException if a matching medical facilities home two could not be found
	 */
	public MedicalFacilitiesHomeTwo findBygetMedicalFacilitiesById_First(
			long medicalFacilitiesAppId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesHomeTwo> orderByComparator)
		throws NoSuchMedicalFacilitiesHomeTwoException;

	/**
	 * Returns the first medical facilities home two in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities home two, or <code>null</code> if a matching medical facilities home two could not be found
	 */
	public MedicalFacilitiesHomeTwo fetchBygetMedicalFacilitiesById_First(
		long medicalFacilitiesAppId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesHomeTwo> orderByComparator);

	/**
	 * Returns the last medical facilities home two in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities home two
	 * @throws NoSuchMedicalFacilitiesHomeTwoException if a matching medical facilities home two could not be found
	 */
	public MedicalFacilitiesHomeTwo findBygetMedicalFacilitiesById_Last(
			long medicalFacilitiesAppId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesHomeTwo> orderByComparator)
		throws NoSuchMedicalFacilitiesHomeTwoException;

	/**
	 * Returns the last medical facilities home two in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities home two, or <code>null</code> if a matching medical facilities home two could not be found
	 */
	public MedicalFacilitiesHomeTwo fetchBygetMedicalFacilitiesById_Last(
		long medicalFacilitiesAppId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesHomeTwo> orderByComparator);

	/**
	 * Returns the medical facilities home twos before and after the current medical facilities home two in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesHomeTwoId the primary key of the current medical facilities home two
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities home two
	 * @throws NoSuchMedicalFacilitiesHomeTwoException if a medical facilities home two with the primary key could not be found
	 */
	public MedicalFacilitiesHomeTwo[]
			findBygetMedicalFacilitiesById_PrevAndNext(
				long medicalFacilitiesHomeTwoId, long medicalFacilitiesAppId,
				com.liferay.portal.kernel.util.OrderByComparator
					<MedicalFacilitiesHomeTwo> orderByComparator)
		throws NoSuchMedicalFacilitiesHomeTwoException;

	/**
	 * Removes all the medical facilities home twos where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 */
	public void removeBygetMedicalFacilitiesById(long medicalFacilitiesAppId);

	/**
	 * Returns the number of medical facilities home twos where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical facilities home twos
	 */
	public int countBygetMedicalFacilitiesById(long medicalFacilitiesAppId);

	/**
	 * Returns the medical facilities home two where medicalFacilitiesAppId = &#63; or throws a <code>NoSuchMedicalFacilitiesHomeTwoException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities home two
	 * @throws NoSuchMedicalFacilitiesHomeTwoException if a matching medical facilities home two could not be found
	 */
	public MedicalFacilitiesHomeTwo findBygetMedicalFacilities_ByAppId(
			long medicalFacilitiesAppId)
		throws NoSuchMedicalFacilitiesHomeTwoException;

	/**
	 * Returns the medical facilities home two where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities home two, or <code>null</code> if a matching medical facilities home two could not be found
	 */
	public MedicalFacilitiesHomeTwo fetchBygetMedicalFacilities_ByAppId(
		long medicalFacilitiesAppId);

	/**
	 * Returns the medical facilities home two where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities home two, or <code>null</code> if a matching medical facilities home two could not be found
	 */
	public MedicalFacilitiesHomeTwo fetchBygetMedicalFacilities_ByAppId(
		long medicalFacilitiesAppId, boolean useFinderCache);

	/**
	 * Removes the medical facilities home two where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the medical facilities home two that was removed
	 */
	public MedicalFacilitiesHomeTwo removeBygetMedicalFacilities_ByAppId(
			long medicalFacilitiesAppId)
		throws NoSuchMedicalFacilitiesHomeTwoException;

	/**
	 * Returns the number of medical facilities home twos where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical facilities home twos
	 */
	public int countBygetMedicalFacilities_ByAppId(long medicalFacilitiesAppId);

	/**
	 * Caches the medical facilities home two in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesHomeTwo the medical facilities home two
	 */
	public void cacheResult(MedicalFacilitiesHomeTwo medicalFacilitiesHomeTwo);

	/**
	 * Caches the medical facilities home twos in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesHomeTwos the medical facilities home twos
	 */
	public void cacheResult(
		java.util.List<MedicalFacilitiesHomeTwo> medicalFacilitiesHomeTwos);

	/**
	 * Creates a new medical facilities home two with the primary key. Does not add the medical facilities home two to the database.
	 *
	 * @param medicalFacilitiesHomeTwoId the primary key for the new medical facilities home two
	 * @return the new medical facilities home two
	 */
	public MedicalFacilitiesHomeTwo create(long medicalFacilitiesHomeTwoId);

	/**
	 * Removes the medical facilities home two with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalFacilitiesHomeTwoId the primary key of the medical facilities home two
	 * @return the medical facilities home two that was removed
	 * @throws NoSuchMedicalFacilitiesHomeTwoException if a medical facilities home two with the primary key could not be found
	 */
	public MedicalFacilitiesHomeTwo remove(long medicalFacilitiesHomeTwoId)
		throws NoSuchMedicalFacilitiesHomeTwoException;

	public MedicalFacilitiesHomeTwo updateImpl(
		MedicalFacilitiesHomeTwo medicalFacilitiesHomeTwo);

	/**
	 * Returns the medical facilities home two with the primary key or throws a <code>NoSuchMedicalFacilitiesHomeTwoException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesHomeTwoId the primary key of the medical facilities home two
	 * @return the medical facilities home two
	 * @throws NoSuchMedicalFacilitiesHomeTwoException if a medical facilities home two with the primary key could not be found
	 */
	public MedicalFacilitiesHomeTwo findByPrimaryKey(
			long medicalFacilitiesHomeTwoId)
		throws NoSuchMedicalFacilitiesHomeTwoException;

	/**
	 * Returns the medical facilities home two with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalFacilitiesHomeTwoId the primary key of the medical facilities home two
	 * @return the medical facilities home two, or <code>null</code> if a medical facilities home two with the primary key could not be found
	 */
	public MedicalFacilitiesHomeTwo fetchByPrimaryKey(
		long medicalFacilitiesHomeTwoId);

	/**
	 * Returns all the medical facilities home twos.
	 *
	 * @return the medical facilities home twos
	 */
	public java.util.List<MedicalFacilitiesHomeTwo> findAll();

	/**
	 * Returns a range of all the medical facilities home twos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeTwoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities home twos
	 * @param end the upper bound of the range of medical facilities home twos (not inclusive)
	 * @return the range of medical facilities home twos
	 */
	public java.util.List<MedicalFacilitiesHomeTwo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities home twos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeTwoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities home twos
	 * @param end the upper bound of the range of medical facilities home twos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical facilities home twos
	 */
	public java.util.List<MedicalFacilitiesHomeTwo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesHomeTwo> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities home twos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeTwoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities home twos
	 * @param end the upper bound of the range of medical facilities home twos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical facilities home twos
	 */
	public java.util.List<MedicalFacilitiesHomeTwo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesHomeTwo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the medical facilities home twos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of medical facilities home twos.
	 *
	 * @return the number of medical facilities home twos
	 */
	public int countAll();

}