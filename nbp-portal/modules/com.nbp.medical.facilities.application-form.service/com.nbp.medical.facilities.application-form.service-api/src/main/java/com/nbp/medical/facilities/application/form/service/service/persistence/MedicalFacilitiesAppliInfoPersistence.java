/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.medical.facilities.application.form.service.exception.NoSuchMedicalFacilitiesAppliInfoException;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesAppliInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the medical facilities appli info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesAppliInfoUtil
 * @generated
 */
@ProviderType
public interface MedicalFacilitiesAppliInfoPersistence
	extends BasePersistence<MedicalFacilitiesAppliInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MedicalFacilitiesAppliInfoUtil} to access the medical facilities appli info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the medical facilities appli infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching medical facilities appli infos
	 */
	public java.util.List<MedicalFacilitiesAppliInfo> findByUuid(String uuid);

	/**
	 * Returns a range of all the medical facilities appli infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @return the range of matching medical facilities appli infos
	 */
	public java.util.List<MedicalFacilitiesAppliInfo> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities appli infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities appli infos
	 */
	public java.util.List<MedicalFacilitiesAppliInfo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesAppliInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities appli infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities appli infos
	 */
	public java.util.List<MedicalFacilitiesAppliInfo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesAppliInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first medical facilities appli info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities appli info
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a matching medical facilities appli info could not be found
	 */
	public MedicalFacilitiesAppliInfo findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesAppliInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesAppliInfoException;

	/**
	 * Returns the first medical facilities appli info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities appli info, or <code>null</code> if a matching medical facilities appli info could not be found
	 */
	public MedicalFacilitiesAppliInfo fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesAppliInfo> orderByComparator);

	/**
	 * Returns the last medical facilities appli info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities appli info
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a matching medical facilities appli info could not be found
	 */
	public MedicalFacilitiesAppliInfo findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesAppliInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesAppliInfoException;

	/**
	 * Returns the last medical facilities appli info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities appli info, or <code>null</code> if a matching medical facilities appli info could not be found
	 */
	public MedicalFacilitiesAppliInfo fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesAppliInfo> orderByComparator);

	/**
	 * Returns the medical facilities appli infos before and after the current medical facilities appli info in the ordered set where uuid = &#63;.
	 *
	 * @param medicalFacilitiesAppliId the primary key of the current medical facilities appli info
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities appli info
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a medical facilities appli info with the primary key could not be found
	 */
	public MedicalFacilitiesAppliInfo[] findByUuid_PrevAndNext(
			long medicalFacilitiesAppliId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesAppliInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesAppliInfoException;

	/**
	 * Removes all the medical facilities appli infos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of medical facilities appli infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching medical facilities appli infos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the medical facilities appli info where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMedicalFacilitiesAppliInfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities appli info
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a matching medical facilities appli info could not be found
	 */
	public MedicalFacilitiesAppliInfo findByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalFacilitiesAppliInfoException;

	/**
	 * Returns the medical facilities appli info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities appli info, or <code>null</code> if a matching medical facilities appli info could not be found
	 */
	public MedicalFacilitiesAppliInfo fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the medical facilities appli info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities appli info, or <code>null</code> if a matching medical facilities appli info could not be found
	 */
	public MedicalFacilitiesAppliInfo fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the medical facilities appli info where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the medical facilities appli info that was removed
	 */
	public MedicalFacilitiesAppliInfo removeByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalFacilitiesAppliInfoException;

	/**
	 * Returns the number of medical facilities appli infos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching medical facilities appli infos
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the medical facilities appli infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching medical facilities appli infos
	 */
	public java.util.List<MedicalFacilitiesAppliInfo> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the medical facilities appli infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @return the range of matching medical facilities appli infos
	 */
	public java.util.List<MedicalFacilitiesAppliInfo> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities appli infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities appli infos
	 */
	public java.util.List<MedicalFacilitiesAppliInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesAppliInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities appli infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities appli infos
	 */
	public java.util.List<MedicalFacilitiesAppliInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesAppliInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first medical facilities appli info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities appli info
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a matching medical facilities appli info could not be found
	 */
	public MedicalFacilitiesAppliInfo findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesAppliInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesAppliInfoException;

	/**
	 * Returns the first medical facilities appli info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities appli info, or <code>null</code> if a matching medical facilities appli info could not be found
	 */
	public MedicalFacilitiesAppliInfo fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesAppliInfo> orderByComparator);

	/**
	 * Returns the last medical facilities appli info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities appli info
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a matching medical facilities appli info could not be found
	 */
	public MedicalFacilitiesAppliInfo findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesAppliInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesAppliInfoException;

	/**
	 * Returns the last medical facilities appli info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities appli info, or <code>null</code> if a matching medical facilities appli info could not be found
	 */
	public MedicalFacilitiesAppliInfo fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesAppliInfo> orderByComparator);

	/**
	 * Returns the medical facilities appli infos before and after the current medical facilities appli info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param medicalFacilitiesAppliId the primary key of the current medical facilities appli info
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities appli info
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a medical facilities appli info with the primary key could not be found
	 */
	public MedicalFacilitiesAppliInfo[] findByUuid_C_PrevAndNext(
			long medicalFacilitiesAppliId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesAppliInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesAppliInfoException;

	/**
	 * Removes all the medical facilities appli infos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of medical facilities appli infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching medical facilities appli infos
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the medical facilities appli infos where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities appli infos
	 */
	public java.util.List<MedicalFacilitiesAppliInfo>
		findBygetMedicalFacilitiesById(long medicalFacilitiesAppId);

	/**
	 * Returns a range of all the medical facilities appli infos where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @return the range of matching medical facilities appli infos
	 */
	public java.util.List<MedicalFacilitiesAppliInfo>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities appli infos where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities appli infos
	 */
	public java.util.List<MedicalFacilitiesAppliInfo>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesAppliInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities appli infos where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities appli infos
	 */
	public java.util.List<MedicalFacilitiesAppliInfo>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesAppliInfo> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first medical facilities appli info in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities appli info
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a matching medical facilities appli info could not be found
	 */
	public MedicalFacilitiesAppliInfo findBygetMedicalFacilitiesById_First(
			long medicalFacilitiesAppId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesAppliInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesAppliInfoException;

	/**
	 * Returns the first medical facilities appli info in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities appli info, or <code>null</code> if a matching medical facilities appli info could not be found
	 */
	public MedicalFacilitiesAppliInfo fetchBygetMedicalFacilitiesById_First(
		long medicalFacilitiesAppId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesAppliInfo> orderByComparator);

	/**
	 * Returns the last medical facilities appli info in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities appli info
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a matching medical facilities appli info could not be found
	 */
	public MedicalFacilitiesAppliInfo findBygetMedicalFacilitiesById_Last(
			long medicalFacilitiesAppId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesAppliInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesAppliInfoException;

	/**
	 * Returns the last medical facilities appli info in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities appli info, or <code>null</code> if a matching medical facilities appli info could not be found
	 */
	public MedicalFacilitiesAppliInfo fetchBygetMedicalFacilitiesById_Last(
		long medicalFacilitiesAppId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesAppliInfo> orderByComparator);

	/**
	 * Returns the medical facilities appli infos before and after the current medical facilities appli info in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppliId the primary key of the current medical facilities appli info
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities appli info
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a medical facilities appli info with the primary key could not be found
	 */
	public MedicalFacilitiesAppliInfo[]
			findBygetMedicalFacilitiesById_PrevAndNext(
				long medicalFacilitiesAppliId, long medicalFacilitiesAppId,
				com.liferay.portal.kernel.util.OrderByComparator
					<MedicalFacilitiesAppliInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesAppliInfoException;

	/**
	 * Removes all the medical facilities appli infos where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 */
	public void removeBygetMedicalFacilitiesById(long medicalFacilitiesAppId);

	/**
	 * Returns the number of medical facilities appli infos where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical facilities appli infos
	 */
	public int countBygetMedicalFacilitiesById(long medicalFacilitiesAppId);

	/**
	 * Caches the medical facilities appli info in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesAppliInfo the medical facilities appli info
	 */
	public void cacheResult(
		MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo);

	/**
	 * Caches the medical facilities appli infos in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesAppliInfos the medical facilities appli infos
	 */
	public void cacheResult(
		java.util.List<MedicalFacilitiesAppliInfo> medicalFacilitiesAppliInfos);

	/**
	 * Creates a new medical facilities appli info with the primary key. Does not add the medical facilities appli info to the database.
	 *
	 * @param medicalFacilitiesAppliId the primary key for the new medical facilities appli info
	 * @return the new medical facilities appli info
	 */
	public MedicalFacilitiesAppliInfo create(long medicalFacilitiesAppliId);

	/**
	 * Removes the medical facilities appli info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalFacilitiesAppliId the primary key of the medical facilities appli info
	 * @return the medical facilities appli info that was removed
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a medical facilities appli info with the primary key could not be found
	 */
	public MedicalFacilitiesAppliInfo remove(long medicalFacilitiesAppliId)
		throws NoSuchMedicalFacilitiesAppliInfoException;

	public MedicalFacilitiesAppliInfo updateImpl(
		MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo);

	/**
	 * Returns the medical facilities appli info with the primary key or throws a <code>NoSuchMedicalFacilitiesAppliInfoException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesAppliId the primary key of the medical facilities appli info
	 * @return the medical facilities appli info
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a medical facilities appli info with the primary key could not be found
	 */
	public MedicalFacilitiesAppliInfo findByPrimaryKey(
			long medicalFacilitiesAppliId)
		throws NoSuchMedicalFacilitiesAppliInfoException;

	/**
	 * Returns the medical facilities appli info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalFacilitiesAppliId the primary key of the medical facilities appli info
	 * @return the medical facilities appli info, or <code>null</code> if a medical facilities appli info with the primary key could not be found
	 */
	public MedicalFacilitiesAppliInfo fetchByPrimaryKey(
		long medicalFacilitiesAppliId);

	/**
	 * Returns all the medical facilities appli infos.
	 *
	 * @return the medical facilities appli infos
	 */
	public java.util.List<MedicalFacilitiesAppliInfo> findAll();

	/**
	 * Returns a range of all the medical facilities appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @return the range of medical facilities appli infos
	 */
	public java.util.List<MedicalFacilitiesAppliInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical facilities appli infos
	 */
	public java.util.List<MedicalFacilitiesAppliInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesAppliInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical facilities appli infos
	 */
	public java.util.List<MedicalFacilitiesAppliInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesAppliInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the medical facilities appli infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of medical facilities appli infos.
	 *
	 * @return the number of medical facilities appli infos
	 */
	public int countAll();

}