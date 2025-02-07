/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.cannabis.application.form.services.exception.NoSuchCannabisOccupationaLicenseException;
import com.nbp.cannabis.application.form.services.model.CannabisOccupationaLicense;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the cannabis occupationa license service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisOccupationaLicenseUtil
 * @generated
 */
@ProviderType
public interface CannabisOccupationaLicensePersistence
	extends BasePersistence<CannabisOccupationaLicense> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CannabisOccupationaLicenseUtil} to access the cannabis occupationa license persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the cannabis occupationa licenses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cannabis occupationa licenses
	 */
	public java.util.List<CannabisOccupationaLicense> findByUuid(String uuid);

	/**
	 * Returns a range of all the cannabis occupationa licenses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @return the range of matching cannabis occupationa licenses
	 */
	public java.util.List<CannabisOccupationaLicense> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis occupationa licenses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis occupationa licenses
	 */
	public java.util.List<CannabisOccupationaLicense> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisOccupationaLicense> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis occupationa licenses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis occupationa licenses
	 */
	public java.util.List<CannabisOccupationaLicense> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisOccupationaLicense> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis occupationa license in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis occupationa license
	 * @throws NoSuchCannabisOccupationaLicenseException if a matching cannabis occupationa license could not be found
	 */
	public CannabisOccupationaLicense findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisOccupationaLicense> orderByComparator)
		throws NoSuchCannabisOccupationaLicenseException;

	/**
	 * Returns the first cannabis occupationa license in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis occupationa license, or <code>null</code> if a matching cannabis occupationa license could not be found
	 */
	public CannabisOccupationaLicense fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisOccupationaLicense> orderByComparator);

	/**
	 * Returns the last cannabis occupationa license in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis occupationa license
	 * @throws NoSuchCannabisOccupationaLicenseException if a matching cannabis occupationa license could not be found
	 */
	public CannabisOccupationaLicense findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisOccupationaLicense> orderByComparator)
		throws NoSuchCannabisOccupationaLicenseException;

	/**
	 * Returns the last cannabis occupationa license in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis occupationa license, or <code>null</code> if a matching cannabis occupationa license could not be found
	 */
	public CannabisOccupationaLicense fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisOccupationaLicense> orderByComparator);

	/**
	 * Returns the cannabis occupationa licenses before and after the current cannabis occupationa license in the ordered set where uuid = &#63;.
	 *
	 * @param cannabisOccupationaLicenseId the primary key of the current cannabis occupationa license
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis occupationa license
	 * @throws NoSuchCannabisOccupationaLicenseException if a cannabis occupationa license with the primary key could not be found
	 */
	public CannabisOccupationaLicense[] findByUuid_PrevAndNext(
			long cannabisOccupationaLicenseId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisOccupationaLicense> orderByComparator)
		throws NoSuchCannabisOccupationaLicenseException;

	/**
	 * Removes all the cannabis occupationa licenses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of cannabis occupationa licenses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cannabis occupationa licenses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the cannabis occupationa license where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCannabisOccupationaLicenseException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis occupationa license
	 * @throws NoSuchCannabisOccupationaLicenseException if a matching cannabis occupationa license could not be found
	 */
	public CannabisOccupationaLicense findByUUID_G(String uuid, long groupId)
		throws NoSuchCannabisOccupationaLicenseException;

	/**
	 * Returns the cannabis occupationa license where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis occupationa license, or <code>null</code> if a matching cannabis occupationa license could not be found
	 */
	public CannabisOccupationaLicense fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the cannabis occupationa license where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis occupationa license, or <code>null</code> if a matching cannabis occupationa license could not be found
	 */
	public CannabisOccupationaLicense fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the cannabis occupationa license where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the cannabis occupationa license that was removed
	 */
	public CannabisOccupationaLicense removeByUUID_G(String uuid, long groupId)
		throws NoSuchCannabisOccupationaLicenseException;

	/**
	 * Returns the number of cannabis occupationa licenses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cannabis occupationa licenses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the cannabis occupationa licenses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cannabis occupationa licenses
	 */
	public java.util.List<CannabisOccupationaLicense> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the cannabis occupationa licenses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @return the range of matching cannabis occupationa licenses
	 */
	public java.util.List<CannabisOccupationaLicense> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis occupationa licenses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis occupationa licenses
	 */
	public java.util.List<CannabisOccupationaLicense> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisOccupationaLicense> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis occupationa licenses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis occupationa licenses
	 */
	public java.util.List<CannabisOccupationaLicense> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisOccupationaLicense> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis occupationa license in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis occupationa license
	 * @throws NoSuchCannabisOccupationaLicenseException if a matching cannabis occupationa license could not be found
	 */
	public CannabisOccupationaLicense findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisOccupationaLicense> orderByComparator)
		throws NoSuchCannabisOccupationaLicenseException;

	/**
	 * Returns the first cannabis occupationa license in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis occupationa license, or <code>null</code> if a matching cannabis occupationa license could not be found
	 */
	public CannabisOccupationaLicense fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisOccupationaLicense> orderByComparator);

	/**
	 * Returns the last cannabis occupationa license in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis occupationa license
	 * @throws NoSuchCannabisOccupationaLicenseException if a matching cannabis occupationa license could not be found
	 */
	public CannabisOccupationaLicense findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisOccupationaLicense> orderByComparator)
		throws NoSuchCannabisOccupationaLicenseException;

	/**
	 * Returns the last cannabis occupationa license in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis occupationa license, or <code>null</code> if a matching cannabis occupationa license could not be found
	 */
	public CannabisOccupationaLicense fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisOccupationaLicense> orderByComparator);

	/**
	 * Returns the cannabis occupationa licenses before and after the current cannabis occupationa license in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param cannabisOccupationaLicenseId the primary key of the current cannabis occupationa license
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis occupationa license
	 * @throws NoSuchCannabisOccupationaLicenseException if a cannabis occupationa license with the primary key could not be found
	 */
	public CannabisOccupationaLicense[] findByUuid_C_PrevAndNext(
			long cannabisOccupationaLicenseId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisOccupationaLicense> orderByComparator)
		throws NoSuchCannabisOccupationaLicenseException;

	/**
	 * Removes all the cannabis occupationa licenses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of cannabis occupationa licenses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cannabis occupationa licenses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the cannabis occupationa licenses where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis occupationa licenses
	 */
	public java.util.List<CannabisOccupationaLicense> findBygetCA_OL_CAI(
		long cannabisApplicationId);

	/**
	 * Returns a range of all the cannabis occupationa licenses where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @return the range of matching cannabis occupationa licenses
	 */
	public java.util.List<CannabisOccupationaLicense> findBygetCA_OL_CAI(
		long cannabisApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis occupationa licenses where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis occupationa licenses
	 */
	public java.util.List<CannabisOccupationaLicense> findBygetCA_OL_CAI(
		long cannabisApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisOccupationaLicense> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis occupationa licenses where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis occupationa licenses
	 */
	public java.util.List<CannabisOccupationaLicense> findBygetCA_OL_CAI(
		long cannabisApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisOccupationaLicense> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis occupationa license in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis occupationa license
	 * @throws NoSuchCannabisOccupationaLicenseException if a matching cannabis occupationa license could not be found
	 */
	public CannabisOccupationaLicense findBygetCA_OL_CAI_First(
			long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisOccupationaLicense> orderByComparator)
		throws NoSuchCannabisOccupationaLicenseException;

	/**
	 * Returns the first cannabis occupationa license in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis occupationa license, or <code>null</code> if a matching cannabis occupationa license could not be found
	 */
	public CannabisOccupationaLicense fetchBygetCA_OL_CAI_First(
		long cannabisApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisOccupationaLicense> orderByComparator);

	/**
	 * Returns the last cannabis occupationa license in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis occupationa license
	 * @throws NoSuchCannabisOccupationaLicenseException if a matching cannabis occupationa license could not be found
	 */
	public CannabisOccupationaLicense findBygetCA_OL_CAI_Last(
			long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisOccupationaLicense> orderByComparator)
		throws NoSuchCannabisOccupationaLicenseException;

	/**
	 * Returns the last cannabis occupationa license in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis occupationa license, or <code>null</code> if a matching cannabis occupationa license could not be found
	 */
	public CannabisOccupationaLicense fetchBygetCA_OL_CAI_Last(
		long cannabisApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisOccupationaLicense> orderByComparator);

	/**
	 * Returns the cannabis occupationa licenses before and after the current cannabis occupationa license in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisOccupationaLicenseId the primary key of the current cannabis occupationa license
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis occupationa license
	 * @throws NoSuchCannabisOccupationaLicenseException if a cannabis occupationa license with the primary key could not be found
	 */
	public CannabisOccupationaLicense[] findBygetCA_OL_CAI_PrevAndNext(
			long cannabisOccupationaLicenseId, long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisOccupationaLicense> orderByComparator)
		throws NoSuchCannabisOccupationaLicenseException;

	/**
	 * Removes all the cannabis occupationa licenses where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	public void removeBygetCA_OL_CAI(long cannabisApplicationId);

	/**
	 * Returns the number of cannabis occupationa licenses where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis occupationa licenses
	 */
	public int countBygetCA_OL_CAI(long cannabisApplicationId);

	/**
	 * Caches the cannabis occupationa license in the entity cache if it is enabled.
	 *
	 * @param cannabisOccupationaLicense the cannabis occupationa license
	 */
	public void cacheResult(
		CannabisOccupationaLicense cannabisOccupationaLicense);

	/**
	 * Caches the cannabis occupationa licenses in the entity cache if it is enabled.
	 *
	 * @param cannabisOccupationaLicenses the cannabis occupationa licenses
	 */
	public void cacheResult(
		java.util.List<CannabisOccupationaLicense> cannabisOccupationaLicenses);

	/**
	 * Creates a new cannabis occupationa license with the primary key. Does not add the cannabis occupationa license to the database.
	 *
	 * @param cannabisOccupationaLicenseId the primary key for the new cannabis occupationa license
	 * @return the new cannabis occupationa license
	 */
	public CannabisOccupationaLicense create(long cannabisOccupationaLicenseId);

	/**
	 * Removes the cannabis occupationa license with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisOccupationaLicenseId the primary key of the cannabis occupationa license
	 * @return the cannabis occupationa license that was removed
	 * @throws NoSuchCannabisOccupationaLicenseException if a cannabis occupationa license with the primary key could not be found
	 */
	public CannabisOccupationaLicense remove(long cannabisOccupationaLicenseId)
		throws NoSuchCannabisOccupationaLicenseException;

	public CannabisOccupationaLicense updateImpl(
		CannabisOccupationaLicense cannabisOccupationaLicense);

	/**
	 * Returns the cannabis occupationa license with the primary key or throws a <code>NoSuchCannabisOccupationaLicenseException</code> if it could not be found.
	 *
	 * @param cannabisOccupationaLicenseId the primary key of the cannabis occupationa license
	 * @return the cannabis occupationa license
	 * @throws NoSuchCannabisOccupationaLicenseException if a cannabis occupationa license with the primary key could not be found
	 */
	public CannabisOccupationaLicense findByPrimaryKey(
			long cannabisOccupationaLicenseId)
		throws NoSuchCannabisOccupationaLicenseException;

	/**
	 * Returns the cannabis occupationa license with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisOccupationaLicenseId the primary key of the cannabis occupationa license
	 * @return the cannabis occupationa license, or <code>null</code> if a cannabis occupationa license with the primary key could not be found
	 */
	public CannabisOccupationaLicense fetchByPrimaryKey(
		long cannabisOccupationaLicenseId);

	/**
	 * Returns all the cannabis occupationa licenses.
	 *
	 * @return the cannabis occupationa licenses
	 */
	public java.util.List<CannabisOccupationaLicense> findAll();

	/**
	 * Returns a range of all the cannabis occupationa licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @return the range of cannabis occupationa licenses
	 */
	public java.util.List<CannabisOccupationaLicense> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the cannabis occupationa licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis occupationa licenses
	 */
	public java.util.List<CannabisOccupationaLicense> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisOccupationaLicense> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis occupationa licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis occupationa licenses
	 */
	public java.util.List<CannabisOccupationaLicense> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisOccupationaLicense> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the cannabis occupationa licenses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of cannabis occupationa licenses.
	 *
	 * @return the number of cannabis occupationa licenses
	 */
	public int countAll();

}