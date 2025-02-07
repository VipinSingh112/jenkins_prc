/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.medical.facilities.application.form.service.exception.NoSuchMedicalFacilitiesHomeInfoException;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesHomeInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the medical facilities home info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesHomeInfoUtil
 * @generated
 */
@ProviderType
public interface MedicalFacilitiesHomeInfoPersistence
	extends BasePersistence<MedicalFacilitiesHomeInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MedicalFacilitiesHomeInfoUtil} to access the medical facilities home info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the medical facilities home infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching medical facilities home infos
	 */
	public java.util.List<MedicalFacilitiesHomeInfo> findByUuid(String uuid);

	/**
	 * Returns a range of all the medical facilities home infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @return the range of matching medical facilities home infos
	 */
	public java.util.List<MedicalFacilitiesHomeInfo> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities home infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities home infos
	 */
	public java.util.List<MedicalFacilitiesHomeInfo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesHomeInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities home infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities home infos
	 */
	public java.util.List<MedicalFacilitiesHomeInfo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesHomeInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first medical facilities home info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a matching medical facilities home info could not be found
	 */
	public MedicalFacilitiesHomeInfo findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesHomeInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesHomeInfoException;

	/**
	 * Returns the first medical facilities home info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities home info, or <code>null</code> if a matching medical facilities home info could not be found
	 */
	public MedicalFacilitiesHomeInfo fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesHomeInfo> orderByComparator);

	/**
	 * Returns the last medical facilities home info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a matching medical facilities home info could not be found
	 */
	public MedicalFacilitiesHomeInfo findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesHomeInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesHomeInfoException;

	/**
	 * Returns the last medical facilities home info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities home info, or <code>null</code> if a matching medical facilities home info could not be found
	 */
	public MedicalFacilitiesHomeInfo fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesHomeInfo> orderByComparator);

	/**
	 * Returns the medical facilities home infos before and after the current medical facilities home info in the ordered set where uuid = &#63;.
	 *
	 * @param medicalFacilitiesHomeInfoId the primary key of the current medical facilities home info
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a medical facilities home info with the primary key could not be found
	 */
	public MedicalFacilitiesHomeInfo[] findByUuid_PrevAndNext(
			long medicalFacilitiesHomeInfoId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesHomeInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesHomeInfoException;

	/**
	 * Removes all the medical facilities home infos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of medical facilities home infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching medical facilities home infos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the medical facilities home info where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMedicalFacilitiesHomeInfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a matching medical facilities home info could not be found
	 */
	public MedicalFacilitiesHomeInfo findByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalFacilitiesHomeInfoException;

	/**
	 * Returns the medical facilities home info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities home info, or <code>null</code> if a matching medical facilities home info could not be found
	 */
	public MedicalFacilitiesHomeInfo fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the medical facilities home info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities home info, or <code>null</code> if a matching medical facilities home info could not be found
	 */
	public MedicalFacilitiesHomeInfo fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the medical facilities home info where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the medical facilities home info that was removed
	 */
	public MedicalFacilitiesHomeInfo removeByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalFacilitiesHomeInfoException;

	/**
	 * Returns the number of medical facilities home infos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching medical facilities home infos
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the medical facilities home infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching medical facilities home infos
	 */
	public java.util.List<MedicalFacilitiesHomeInfo> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the medical facilities home infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @return the range of matching medical facilities home infos
	 */
	public java.util.List<MedicalFacilitiesHomeInfo> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities home infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities home infos
	 */
	public java.util.List<MedicalFacilitiesHomeInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesHomeInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities home infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities home infos
	 */
	public java.util.List<MedicalFacilitiesHomeInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesHomeInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first medical facilities home info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a matching medical facilities home info could not be found
	 */
	public MedicalFacilitiesHomeInfo findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesHomeInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesHomeInfoException;

	/**
	 * Returns the first medical facilities home info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities home info, or <code>null</code> if a matching medical facilities home info could not be found
	 */
	public MedicalFacilitiesHomeInfo fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesHomeInfo> orderByComparator);

	/**
	 * Returns the last medical facilities home info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a matching medical facilities home info could not be found
	 */
	public MedicalFacilitiesHomeInfo findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesHomeInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesHomeInfoException;

	/**
	 * Returns the last medical facilities home info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities home info, or <code>null</code> if a matching medical facilities home info could not be found
	 */
	public MedicalFacilitiesHomeInfo fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesHomeInfo> orderByComparator);

	/**
	 * Returns the medical facilities home infos before and after the current medical facilities home info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param medicalFacilitiesHomeInfoId the primary key of the current medical facilities home info
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a medical facilities home info with the primary key could not be found
	 */
	public MedicalFacilitiesHomeInfo[] findByUuid_C_PrevAndNext(
			long medicalFacilitiesHomeInfoId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesHomeInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesHomeInfoException;

	/**
	 * Removes all the medical facilities home infos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of medical facilities home infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching medical facilities home infos
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the medical facilities home infos where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities home infos
	 */
	public java.util.List<MedicalFacilitiesHomeInfo>
		findBygetMedicalFacilitiesById(long medicalFacilitiesAppId);

	/**
	 * Returns a range of all the medical facilities home infos where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @return the range of matching medical facilities home infos
	 */
	public java.util.List<MedicalFacilitiesHomeInfo>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities home infos where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities home infos
	 */
	public java.util.List<MedicalFacilitiesHomeInfo>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesHomeInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities home infos where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities home infos
	 */
	public java.util.List<MedicalFacilitiesHomeInfo>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesHomeInfo> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first medical facilities home info in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a matching medical facilities home info could not be found
	 */
	public MedicalFacilitiesHomeInfo findBygetMedicalFacilitiesById_First(
			long medicalFacilitiesAppId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesHomeInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesHomeInfoException;

	/**
	 * Returns the first medical facilities home info in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities home info, or <code>null</code> if a matching medical facilities home info could not be found
	 */
	public MedicalFacilitiesHomeInfo fetchBygetMedicalFacilitiesById_First(
		long medicalFacilitiesAppId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesHomeInfo> orderByComparator);

	/**
	 * Returns the last medical facilities home info in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a matching medical facilities home info could not be found
	 */
	public MedicalFacilitiesHomeInfo findBygetMedicalFacilitiesById_Last(
			long medicalFacilitiesAppId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesHomeInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesHomeInfoException;

	/**
	 * Returns the last medical facilities home info in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities home info, or <code>null</code> if a matching medical facilities home info could not be found
	 */
	public MedicalFacilitiesHomeInfo fetchBygetMedicalFacilitiesById_Last(
		long medicalFacilitiesAppId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesHomeInfo> orderByComparator);

	/**
	 * Returns the medical facilities home infos before and after the current medical facilities home info in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesHomeInfoId the primary key of the current medical facilities home info
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a medical facilities home info with the primary key could not be found
	 */
	public MedicalFacilitiesHomeInfo[]
			findBygetMedicalFacilitiesById_PrevAndNext(
				long medicalFacilitiesHomeInfoId, long medicalFacilitiesAppId,
				com.liferay.portal.kernel.util.OrderByComparator
					<MedicalFacilitiesHomeInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesHomeInfoException;

	/**
	 * Removes all the medical facilities home infos where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 */
	public void removeBygetMedicalFacilitiesById(long medicalFacilitiesAppId);

	/**
	 * Returns the number of medical facilities home infos where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical facilities home infos
	 */
	public int countBygetMedicalFacilitiesById(long medicalFacilitiesAppId);

	/**
	 * Returns the medical facilities home info where medicalFacilitiesAppId = &#63; or throws a <code>NoSuchMedicalFacilitiesHomeInfoException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a matching medical facilities home info could not be found
	 */
	public MedicalFacilitiesHomeInfo findBygetMedicalFacilities_ByAppId(
			long medicalFacilitiesAppId)
		throws NoSuchMedicalFacilitiesHomeInfoException;

	/**
	 * Returns the medical facilities home info where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities home info, or <code>null</code> if a matching medical facilities home info could not be found
	 */
	public MedicalFacilitiesHomeInfo fetchBygetMedicalFacilities_ByAppId(
		long medicalFacilitiesAppId);

	/**
	 * Returns the medical facilities home info where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities home info, or <code>null</code> if a matching medical facilities home info could not be found
	 */
	public MedicalFacilitiesHomeInfo fetchBygetMedicalFacilities_ByAppId(
		long medicalFacilitiesAppId, boolean useFinderCache);

	/**
	 * Removes the medical facilities home info where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the medical facilities home info that was removed
	 */
	public MedicalFacilitiesHomeInfo removeBygetMedicalFacilities_ByAppId(
			long medicalFacilitiesAppId)
		throws NoSuchMedicalFacilitiesHomeInfoException;

	/**
	 * Returns the number of medical facilities home infos where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical facilities home infos
	 */
	public int countBygetMedicalFacilities_ByAppId(long medicalFacilitiesAppId);

	/**
	 * Caches the medical facilities home info in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesHomeInfo the medical facilities home info
	 */
	public void cacheResult(
		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo);

	/**
	 * Caches the medical facilities home infos in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesHomeInfos the medical facilities home infos
	 */
	public void cacheResult(
		java.util.List<MedicalFacilitiesHomeInfo> medicalFacilitiesHomeInfos);

	/**
	 * Creates a new medical facilities home info with the primary key. Does not add the medical facilities home info to the database.
	 *
	 * @param medicalFacilitiesHomeInfoId the primary key for the new medical facilities home info
	 * @return the new medical facilities home info
	 */
	public MedicalFacilitiesHomeInfo create(long medicalFacilitiesHomeInfoId);

	/**
	 * Removes the medical facilities home info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalFacilitiesHomeInfoId the primary key of the medical facilities home info
	 * @return the medical facilities home info that was removed
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a medical facilities home info with the primary key could not be found
	 */
	public MedicalFacilitiesHomeInfo remove(long medicalFacilitiesHomeInfoId)
		throws NoSuchMedicalFacilitiesHomeInfoException;

	public MedicalFacilitiesHomeInfo updateImpl(
		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo);

	/**
	 * Returns the medical facilities home info with the primary key or throws a <code>NoSuchMedicalFacilitiesHomeInfoException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesHomeInfoId the primary key of the medical facilities home info
	 * @return the medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a medical facilities home info with the primary key could not be found
	 */
	public MedicalFacilitiesHomeInfo findByPrimaryKey(
			long medicalFacilitiesHomeInfoId)
		throws NoSuchMedicalFacilitiesHomeInfoException;

	/**
	 * Returns the medical facilities home info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalFacilitiesHomeInfoId the primary key of the medical facilities home info
	 * @return the medical facilities home info, or <code>null</code> if a medical facilities home info with the primary key could not be found
	 */
	public MedicalFacilitiesHomeInfo fetchByPrimaryKey(
		long medicalFacilitiesHomeInfoId);

	/**
	 * Returns all the medical facilities home infos.
	 *
	 * @return the medical facilities home infos
	 */
	public java.util.List<MedicalFacilitiesHomeInfo> findAll();

	/**
	 * Returns a range of all the medical facilities home infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @return the range of medical facilities home infos
	 */
	public java.util.List<MedicalFacilitiesHomeInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities home infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical facilities home infos
	 */
	public java.util.List<MedicalFacilitiesHomeInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesHomeInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities home infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical facilities home infos
	 */
	public java.util.List<MedicalFacilitiesHomeInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesHomeInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the medical facilities home infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of medical facilities home infos.
	 *
	 * @return the number of medical facilities home infos
	 */
	public int countAll();

}