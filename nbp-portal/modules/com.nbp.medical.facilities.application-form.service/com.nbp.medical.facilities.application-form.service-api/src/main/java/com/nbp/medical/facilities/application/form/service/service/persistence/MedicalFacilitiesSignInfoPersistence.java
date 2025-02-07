/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.medical.facilities.application.form.service.exception.NoSuchMedicalFacilitiesSignInfoException;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesSignInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the medical facilities sign info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesSignInfoUtil
 * @generated
 */
@ProviderType
public interface MedicalFacilitiesSignInfoPersistence
	extends BasePersistence<MedicalFacilitiesSignInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MedicalFacilitiesSignInfoUtil} to access the medical facilities sign info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the medical facilities sign infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching medical facilities sign infos
	 */
	public java.util.List<MedicalFacilitiesSignInfo> findByUuid(String uuid);

	/**
	 * Returns a range of all the medical facilities sign infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities sign infos
	 * @param end the upper bound of the range of medical facilities sign infos (not inclusive)
	 * @return the range of matching medical facilities sign infos
	 */
	public java.util.List<MedicalFacilitiesSignInfo> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities sign infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities sign infos
	 * @param end the upper bound of the range of medical facilities sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities sign infos
	 */
	public java.util.List<MedicalFacilitiesSignInfo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesSignInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities sign infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities sign infos
	 * @param end the upper bound of the range of medical facilities sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities sign infos
	 */
	public java.util.List<MedicalFacilitiesSignInfo> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesSignInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first medical facilities sign info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities sign info
	 * @throws NoSuchMedicalFacilitiesSignInfoException if a matching medical facilities sign info could not be found
	 */
	public MedicalFacilitiesSignInfo findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesSignInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesSignInfoException;

	/**
	 * Returns the first medical facilities sign info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities sign info, or <code>null</code> if a matching medical facilities sign info could not be found
	 */
	public MedicalFacilitiesSignInfo fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesSignInfo> orderByComparator);

	/**
	 * Returns the last medical facilities sign info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities sign info
	 * @throws NoSuchMedicalFacilitiesSignInfoException if a matching medical facilities sign info could not be found
	 */
	public MedicalFacilitiesSignInfo findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesSignInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesSignInfoException;

	/**
	 * Returns the last medical facilities sign info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities sign info, or <code>null</code> if a matching medical facilities sign info could not be found
	 */
	public MedicalFacilitiesSignInfo fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesSignInfo> orderByComparator);

	/**
	 * Returns the medical facilities sign infos before and after the current medical facilities sign info in the ordered set where uuid = &#63;.
	 *
	 * @param medicalFacilitiesSignInfoId the primary key of the current medical facilities sign info
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities sign info
	 * @throws NoSuchMedicalFacilitiesSignInfoException if a medical facilities sign info with the primary key could not be found
	 */
	public MedicalFacilitiesSignInfo[] findByUuid_PrevAndNext(
			long medicalFacilitiesSignInfoId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesSignInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesSignInfoException;

	/**
	 * Removes all the medical facilities sign infos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of medical facilities sign infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching medical facilities sign infos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the medical facilities sign info where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMedicalFacilitiesSignInfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities sign info
	 * @throws NoSuchMedicalFacilitiesSignInfoException if a matching medical facilities sign info could not be found
	 */
	public MedicalFacilitiesSignInfo findByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalFacilitiesSignInfoException;

	/**
	 * Returns the medical facilities sign info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities sign info, or <code>null</code> if a matching medical facilities sign info could not be found
	 */
	public MedicalFacilitiesSignInfo fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the medical facilities sign info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities sign info, or <code>null</code> if a matching medical facilities sign info could not be found
	 */
	public MedicalFacilitiesSignInfo fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the medical facilities sign info where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the medical facilities sign info that was removed
	 */
	public MedicalFacilitiesSignInfo removeByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalFacilitiesSignInfoException;

	/**
	 * Returns the number of medical facilities sign infos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching medical facilities sign infos
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the medical facilities sign infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching medical facilities sign infos
	 */
	public java.util.List<MedicalFacilitiesSignInfo> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the medical facilities sign infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities sign infos
	 * @param end the upper bound of the range of medical facilities sign infos (not inclusive)
	 * @return the range of matching medical facilities sign infos
	 */
	public java.util.List<MedicalFacilitiesSignInfo> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities sign infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities sign infos
	 * @param end the upper bound of the range of medical facilities sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities sign infos
	 */
	public java.util.List<MedicalFacilitiesSignInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesSignInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities sign infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities sign infos
	 * @param end the upper bound of the range of medical facilities sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities sign infos
	 */
	public java.util.List<MedicalFacilitiesSignInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesSignInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first medical facilities sign info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities sign info
	 * @throws NoSuchMedicalFacilitiesSignInfoException if a matching medical facilities sign info could not be found
	 */
	public MedicalFacilitiesSignInfo findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesSignInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesSignInfoException;

	/**
	 * Returns the first medical facilities sign info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities sign info, or <code>null</code> if a matching medical facilities sign info could not be found
	 */
	public MedicalFacilitiesSignInfo fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesSignInfo> orderByComparator);

	/**
	 * Returns the last medical facilities sign info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities sign info
	 * @throws NoSuchMedicalFacilitiesSignInfoException if a matching medical facilities sign info could not be found
	 */
	public MedicalFacilitiesSignInfo findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesSignInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesSignInfoException;

	/**
	 * Returns the last medical facilities sign info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities sign info, or <code>null</code> if a matching medical facilities sign info could not be found
	 */
	public MedicalFacilitiesSignInfo fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesSignInfo> orderByComparator);

	/**
	 * Returns the medical facilities sign infos before and after the current medical facilities sign info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param medicalFacilitiesSignInfoId the primary key of the current medical facilities sign info
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities sign info
	 * @throws NoSuchMedicalFacilitiesSignInfoException if a medical facilities sign info with the primary key could not be found
	 */
	public MedicalFacilitiesSignInfo[] findByUuid_C_PrevAndNext(
			long medicalFacilitiesSignInfoId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesSignInfo> orderByComparator)
		throws NoSuchMedicalFacilitiesSignInfoException;

	/**
	 * Removes all the medical facilities sign infos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of medical facilities sign infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching medical facilities sign infos
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the medical facilities sign info where medicalFacilitiesAppId = &#63; or throws a <code>NoSuchMedicalFacilitiesSignInfoException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities sign info
	 * @throws NoSuchMedicalFacilitiesSignInfoException if a matching medical facilities sign info could not be found
	 */
	public MedicalFacilitiesSignInfo findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId)
		throws NoSuchMedicalFacilitiesSignInfoException;

	/**
	 * Returns the medical facilities sign info where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities sign info, or <code>null</code> if a matching medical facilities sign info could not be found
	 */
	public MedicalFacilitiesSignInfo fetchBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId);

	/**
	 * Returns the medical facilities sign info where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities sign info, or <code>null</code> if a matching medical facilities sign info could not be found
	 */
	public MedicalFacilitiesSignInfo fetchBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId, boolean useFinderCache);

	/**
	 * Removes the medical facilities sign info where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the medical facilities sign info that was removed
	 */
	public MedicalFacilitiesSignInfo removeBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId)
		throws NoSuchMedicalFacilitiesSignInfoException;

	/**
	 * Returns the number of medical facilities sign infos where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical facilities sign infos
	 */
	public int countBygetMedicalFacilitiesById(long medicalFacilitiesAppId);

	/**
	 * Caches the medical facilities sign info in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesSignInfo the medical facilities sign info
	 */
	public void cacheResult(
		MedicalFacilitiesSignInfo medicalFacilitiesSignInfo);

	/**
	 * Caches the medical facilities sign infos in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesSignInfos the medical facilities sign infos
	 */
	public void cacheResult(
		java.util.List<MedicalFacilitiesSignInfo> medicalFacilitiesSignInfos);

	/**
	 * Creates a new medical facilities sign info with the primary key. Does not add the medical facilities sign info to the database.
	 *
	 * @param medicalFacilitiesSignInfoId the primary key for the new medical facilities sign info
	 * @return the new medical facilities sign info
	 */
	public MedicalFacilitiesSignInfo create(long medicalFacilitiesSignInfoId);

	/**
	 * Removes the medical facilities sign info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalFacilitiesSignInfoId the primary key of the medical facilities sign info
	 * @return the medical facilities sign info that was removed
	 * @throws NoSuchMedicalFacilitiesSignInfoException if a medical facilities sign info with the primary key could not be found
	 */
	public MedicalFacilitiesSignInfo remove(long medicalFacilitiesSignInfoId)
		throws NoSuchMedicalFacilitiesSignInfoException;

	public MedicalFacilitiesSignInfo updateImpl(
		MedicalFacilitiesSignInfo medicalFacilitiesSignInfo);

	/**
	 * Returns the medical facilities sign info with the primary key or throws a <code>NoSuchMedicalFacilitiesSignInfoException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesSignInfoId the primary key of the medical facilities sign info
	 * @return the medical facilities sign info
	 * @throws NoSuchMedicalFacilitiesSignInfoException if a medical facilities sign info with the primary key could not be found
	 */
	public MedicalFacilitiesSignInfo findByPrimaryKey(
			long medicalFacilitiesSignInfoId)
		throws NoSuchMedicalFacilitiesSignInfoException;

	/**
	 * Returns the medical facilities sign info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalFacilitiesSignInfoId the primary key of the medical facilities sign info
	 * @return the medical facilities sign info, or <code>null</code> if a medical facilities sign info with the primary key could not be found
	 */
	public MedicalFacilitiesSignInfo fetchByPrimaryKey(
		long medicalFacilitiesSignInfoId);

	/**
	 * Returns all the medical facilities sign infos.
	 *
	 * @return the medical facilities sign infos
	 */
	public java.util.List<MedicalFacilitiesSignInfo> findAll();

	/**
	 * Returns a range of all the medical facilities sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities sign infos
	 * @param end the upper bound of the range of medical facilities sign infos (not inclusive)
	 * @return the range of medical facilities sign infos
	 */
	public java.util.List<MedicalFacilitiesSignInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities sign infos
	 * @param end the upper bound of the range of medical facilities sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical facilities sign infos
	 */
	public java.util.List<MedicalFacilitiesSignInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesSignInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities sign infos
	 * @param end the upper bound of the range of medical facilities sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical facilities sign infos
	 */
	public java.util.List<MedicalFacilitiesSignInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesSignInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the medical facilities sign infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of medical facilities sign infos.
	 *
	 * @return the number of medical facilities sign infos
	 */
	public int countAll();

}