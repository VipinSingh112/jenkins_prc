/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.medical.facilities.application.form.service.exception.NoSuchMedicalFacilitiesMaterHomeException;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesMaterHome;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the medical facilities mater home service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesMaterHomeUtil
 * @generated
 */
@ProviderType
public interface MedicalFacilitiesMaterHomePersistence
	extends BasePersistence<MedicalFacilitiesMaterHome> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MedicalFacilitiesMaterHomeUtil} to access the medical facilities mater home persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the medical facilities mater homes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching medical facilities mater homes
	 */
	public java.util.List<MedicalFacilitiesMaterHome> findByUuid(String uuid);

	/**
	 * Returns a range of all the medical facilities mater homes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @return the range of matching medical facilities mater homes
	 */
	public java.util.List<MedicalFacilitiesMaterHome> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities mater homes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities mater homes
	 */
	public java.util.List<MedicalFacilitiesMaterHome> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesMaterHome> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities mater homes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities mater homes
	 */
	public java.util.List<MedicalFacilitiesMaterHome> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesMaterHome> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first medical facilities mater home in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities mater home
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a matching medical facilities mater home could not be found
	 */
	public MedicalFacilitiesMaterHome findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesMaterHome> orderByComparator)
		throws NoSuchMedicalFacilitiesMaterHomeException;

	/**
	 * Returns the first medical facilities mater home in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities mater home, or <code>null</code> if a matching medical facilities mater home could not be found
	 */
	public MedicalFacilitiesMaterHome fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesMaterHome> orderByComparator);

	/**
	 * Returns the last medical facilities mater home in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities mater home
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a matching medical facilities mater home could not be found
	 */
	public MedicalFacilitiesMaterHome findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesMaterHome> orderByComparator)
		throws NoSuchMedicalFacilitiesMaterHomeException;

	/**
	 * Returns the last medical facilities mater home in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities mater home, or <code>null</code> if a matching medical facilities mater home could not be found
	 */
	public MedicalFacilitiesMaterHome fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesMaterHome> orderByComparator);

	/**
	 * Returns the medical facilities mater homes before and after the current medical facilities mater home in the ordered set where uuid = &#63;.
	 *
	 * @param medicalFacilitiesMaterHomeId the primary key of the current medical facilities mater home
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities mater home
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a medical facilities mater home with the primary key could not be found
	 */
	public MedicalFacilitiesMaterHome[] findByUuid_PrevAndNext(
			long medicalFacilitiesMaterHomeId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesMaterHome> orderByComparator)
		throws NoSuchMedicalFacilitiesMaterHomeException;

	/**
	 * Removes all the medical facilities mater homes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of medical facilities mater homes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching medical facilities mater homes
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the medical facilities mater home where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMedicalFacilitiesMaterHomeException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities mater home
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a matching medical facilities mater home could not be found
	 */
	public MedicalFacilitiesMaterHome findByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalFacilitiesMaterHomeException;

	/**
	 * Returns the medical facilities mater home where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities mater home, or <code>null</code> if a matching medical facilities mater home could not be found
	 */
	public MedicalFacilitiesMaterHome fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the medical facilities mater home where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities mater home, or <code>null</code> if a matching medical facilities mater home could not be found
	 */
	public MedicalFacilitiesMaterHome fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the medical facilities mater home where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the medical facilities mater home that was removed
	 */
	public MedicalFacilitiesMaterHome removeByUUID_G(String uuid, long groupId)
		throws NoSuchMedicalFacilitiesMaterHomeException;

	/**
	 * Returns the number of medical facilities mater homes where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching medical facilities mater homes
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the medical facilities mater homes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching medical facilities mater homes
	 */
	public java.util.List<MedicalFacilitiesMaterHome> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the medical facilities mater homes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @return the range of matching medical facilities mater homes
	 */
	public java.util.List<MedicalFacilitiesMaterHome> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities mater homes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities mater homes
	 */
	public java.util.List<MedicalFacilitiesMaterHome> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesMaterHome> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities mater homes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities mater homes
	 */
	public java.util.List<MedicalFacilitiesMaterHome> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesMaterHome> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first medical facilities mater home in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities mater home
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a matching medical facilities mater home could not be found
	 */
	public MedicalFacilitiesMaterHome findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesMaterHome> orderByComparator)
		throws NoSuchMedicalFacilitiesMaterHomeException;

	/**
	 * Returns the first medical facilities mater home in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities mater home, or <code>null</code> if a matching medical facilities mater home could not be found
	 */
	public MedicalFacilitiesMaterHome fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesMaterHome> orderByComparator);

	/**
	 * Returns the last medical facilities mater home in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities mater home
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a matching medical facilities mater home could not be found
	 */
	public MedicalFacilitiesMaterHome findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesMaterHome> orderByComparator)
		throws NoSuchMedicalFacilitiesMaterHomeException;

	/**
	 * Returns the last medical facilities mater home in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities mater home, or <code>null</code> if a matching medical facilities mater home could not be found
	 */
	public MedicalFacilitiesMaterHome fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesMaterHome> orderByComparator);

	/**
	 * Returns the medical facilities mater homes before and after the current medical facilities mater home in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param medicalFacilitiesMaterHomeId the primary key of the current medical facilities mater home
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities mater home
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a medical facilities mater home with the primary key could not be found
	 */
	public MedicalFacilitiesMaterHome[] findByUuid_C_PrevAndNext(
			long medicalFacilitiesMaterHomeId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesMaterHome> orderByComparator)
		throws NoSuchMedicalFacilitiesMaterHomeException;

	/**
	 * Removes all the medical facilities mater homes where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of medical facilities mater homes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching medical facilities mater homes
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the medical facilities mater homes where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities mater homes
	 */
	public java.util.List<MedicalFacilitiesMaterHome>
		findBygetMedicalFacilitiesById(long medicalFacilitiesAppId);

	/**
	 * Returns a range of all the medical facilities mater homes where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @return the range of matching medical facilities mater homes
	 */
	public java.util.List<MedicalFacilitiesMaterHome>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities mater homes where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities mater homes
	 */
	public java.util.List<MedicalFacilitiesMaterHome>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesMaterHome> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities mater homes where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities mater homes
	 */
	public java.util.List<MedicalFacilitiesMaterHome>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesMaterHome> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first medical facilities mater home in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities mater home
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a matching medical facilities mater home could not be found
	 */
	public MedicalFacilitiesMaterHome findBygetMedicalFacilitiesById_First(
			long medicalFacilitiesAppId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesMaterHome> orderByComparator)
		throws NoSuchMedicalFacilitiesMaterHomeException;

	/**
	 * Returns the first medical facilities mater home in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities mater home, or <code>null</code> if a matching medical facilities mater home could not be found
	 */
	public MedicalFacilitiesMaterHome fetchBygetMedicalFacilitiesById_First(
		long medicalFacilitiesAppId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesMaterHome> orderByComparator);

	/**
	 * Returns the last medical facilities mater home in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities mater home
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a matching medical facilities mater home could not be found
	 */
	public MedicalFacilitiesMaterHome findBygetMedicalFacilitiesById_Last(
			long medicalFacilitiesAppId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesMaterHome> orderByComparator)
		throws NoSuchMedicalFacilitiesMaterHomeException;

	/**
	 * Returns the last medical facilities mater home in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities mater home, or <code>null</code> if a matching medical facilities mater home could not be found
	 */
	public MedicalFacilitiesMaterHome fetchBygetMedicalFacilitiesById_Last(
		long medicalFacilitiesAppId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesMaterHome> orderByComparator);

	/**
	 * Returns the medical facilities mater homes before and after the current medical facilities mater home in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesMaterHomeId the primary key of the current medical facilities mater home
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities mater home
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a medical facilities mater home with the primary key could not be found
	 */
	public MedicalFacilitiesMaterHome[]
			findBygetMedicalFacilitiesById_PrevAndNext(
				long medicalFacilitiesMaterHomeId, long medicalFacilitiesAppId,
				com.liferay.portal.kernel.util.OrderByComparator
					<MedicalFacilitiesMaterHome> orderByComparator)
		throws NoSuchMedicalFacilitiesMaterHomeException;

	/**
	 * Removes all the medical facilities mater homes where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 */
	public void removeBygetMedicalFacilitiesById(long medicalFacilitiesAppId);

	/**
	 * Returns the number of medical facilities mater homes where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical facilities mater homes
	 */
	public int countBygetMedicalFacilitiesById(long medicalFacilitiesAppId);

	/**
	 * Caches the medical facilities mater home in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesMaterHome the medical facilities mater home
	 */
	public void cacheResult(
		MedicalFacilitiesMaterHome medicalFacilitiesMaterHome);

	/**
	 * Caches the medical facilities mater homes in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesMaterHomes the medical facilities mater homes
	 */
	public void cacheResult(
		java.util.List<MedicalFacilitiesMaterHome> medicalFacilitiesMaterHomes);

	/**
	 * Creates a new medical facilities mater home with the primary key. Does not add the medical facilities mater home to the database.
	 *
	 * @param medicalFacilitiesMaterHomeId the primary key for the new medical facilities mater home
	 * @return the new medical facilities mater home
	 */
	public MedicalFacilitiesMaterHome create(long medicalFacilitiesMaterHomeId);

	/**
	 * Removes the medical facilities mater home with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalFacilitiesMaterHomeId the primary key of the medical facilities mater home
	 * @return the medical facilities mater home that was removed
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a medical facilities mater home with the primary key could not be found
	 */
	public MedicalFacilitiesMaterHome remove(long medicalFacilitiesMaterHomeId)
		throws NoSuchMedicalFacilitiesMaterHomeException;

	public MedicalFacilitiesMaterHome updateImpl(
		MedicalFacilitiesMaterHome medicalFacilitiesMaterHome);

	/**
	 * Returns the medical facilities mater home with the primary key or throws a <code>NoSuchMedicalFacilitiesMaterHomeException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesMaterHomeId the primary key of the medical facilities mater home
	 * @return the medical facilities mater home
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a medical facilities mater home with the primary key could not be found
	 */
	public MedicalFacilitiesMaterHome findByPrimaryKey(
			long medicalFacilitiesMaterHomeId)
		throws NoSuchMedicalFacilitiesMaterHomeException;

	/**
	 * Returns the medical facilities mater home with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalFacilitiesMaterHomeId the primary key of the medical facilities mater home
	 * @return the medical facilities mater home, or <code>null</code> if a medical facilities mater home with the primary key could not be found
	 */
	public MedicalFacilitiesMaterHome fetchByPrimaryKey(
		long medicalFacilitiesMaterHomeId);

	/**
	 * Returns all the medical facilities mater homes.
	 *
	 * @return the medical facilities mater homes
	 */
	public java.util.List<MedicalFacilitiesMaterHome> findAll();

	/**
	 * Returns a range of all the medical facilities mater homes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @return the range of medical facilities mater homes
	 */
	public java.util.List<MedicalFacilitiesMaterHome> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities mater homes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical facilities mater homes
	 */
	public java.util.List<MedicalFacilitiesMaterHome> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesMaterHome> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities mater homes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical facilities mater homes
	 */
	public java.util.List<MedicalFacilitiesMaterHome> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesMaterHome> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the medical facilities mater homes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of medical facilities mater homes.
	 *
	 * @return the number of medical facilities mater homes
	 */
	public int countAll();

}