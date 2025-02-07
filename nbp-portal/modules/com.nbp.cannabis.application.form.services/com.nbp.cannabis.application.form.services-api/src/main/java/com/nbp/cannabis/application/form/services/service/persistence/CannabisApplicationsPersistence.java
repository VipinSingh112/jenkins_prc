/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.cannabis.application.form.services.exception.NoSuchCannabisApplicationsException;
import com.nbp.cannabis.application.form.services.model.CannabisApplications;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the cannabis applications service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationsUtil
 * @generated
 */
@ProviderType
public interface CannabisApplicationsPersistence
	extends BasePersistence<CannabisApplications> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CannabisApplicationsUtil} to access the cannabis applications persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the cannabis applicationses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cannabis applicationses
	 */
	public java.util.List<CannabisApplications> findByUuid(String uuid);

	/**
	 * Returns a range of all the cannabis applicationses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @return the range of matching cannabis applicationses
	 */
	public java.util.List<CannabisApplications> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis applicationses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis applicationses
	 */
	public java.util.List<CannabisApplications> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisApplications>
			orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis applicationses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis applicationses
	 */
	public java.util.List<CannabisApplications> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisApplications>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis applications in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public CannabisApplications findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException;

	/**
	 * Returns the first cannabis applications in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public CannabisApplications fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisApplications>
			orderByComparator);

	/**
	 * Returns the last cannabis applications in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public CannabisApplications findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException;

	/**
	 * Returns the last cannabis applications in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public CannabisApplications fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisApplications>
			orderByComparator);

	/**
	 * Returns the cannabis applicationses before and after the current cannabis applications in the ordered set where uuid = &#63;.
	 *
	 * @param cannabisApplicationId the primary key of the current cannabis applications
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a cannabis applications with the primary key could not be found
	 */
	public CannabisApplications[] findByUuid_PrevAndNext(
			long cannabisApplicationId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException;

	/**
	 * Removes all the cannabis applicationses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of cannabis applicationses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cannabis applicationses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the cannabis applications where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCannabisApplicationsException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public CannabisApplications findByUUID_G(String uuid, long groupId)
		throws NoSuchCannabisApplicationsException;

	/**
	 * Returns the cannabis applications where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public CannabisApplications fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the cannabis applications where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public CannabisApplications fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the cannabis applications where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the cannabis applications that was removed
	 */
	public CannabisApplications removeByUUID_G(String uuid, long groupId)
		throws NoSuchCannabisApplicationsException;

	/**
	 * Returns the number of cannabis applicationses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cannabis applicationses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the cannabis applicationses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cannabis applicationses
	 */
	public java.util.List<CannabisApplications> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the cannabis applicationses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @return the range of matching cannabis applicationses
	 */
	public java.util.List<CannabisApplications> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis applicationses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis applicationses
	 */
	public java.util.List<CannabisApplications> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisApplications>
			orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis applicationses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis applicationses
	 */
	public java.util.List<CannabisApplications> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisApplications>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis applications in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public CannabisApplications findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException;

	/**
	 * Returns the first cannabis applications in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public CannabisApplications fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisApplications>
			orderByComparator);

	/**
	 * Returns the last cannabis applications in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public CannabisApplications findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException;

	/**
	 * Returns the last cannabis applications in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public CannabisApplications fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisApplications>
			orderByComparator);

	/**
	 * Returns the cannabis applicationses before and after the current cannabis applications in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param cannabisApplicationId the primary key of the current cannabis applications
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a cannabis applications with the primary key could not be found
	 */
	public CannabisApplications[] findByUuid_C_PrevAndNext(
			long cannabisApplicationId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException;

	/**
	 * Removes all the cannabis applicationses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of cannabis applicationses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cannabis applicationses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the cannabis applicationses where status = &#63; and licenseCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseCategory the license category
	 * @return the matching cannabis applicationses
	 */
	public java.util.List<CannabisApplications>
		findBygetCannabisApplicationsByLicenseCategory(
			int status, String licenseCategory);

	/**
	 * Returns a range of all the cannabis applicationses where status = &#63; and licenseCategory = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param licenseCategory the license category
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @return the range of matching cannabis applicationses
	 */
	public java.util.List<CannabisApplications>
		findBygetCannabisApplicationsByLicenseCategory(
			int status, String licenseCategory, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis applicationses where status = &#63; and licenseCategory = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param licenseCategory the license category
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis applicationses
	 */
	public java.util.List<CannabisApplications>
		findBygetCannabisApplicationsByLicenseCategory(
			int status, String licenseCategory, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplications> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis applicationses where status = &#63; and licenseCategory = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param licenseCategory the license category
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis applicationses
	 */
	public java.util.List<CannabisApplications>
		findBygetCannabisApplicationsByLicenseCategory(
			int status, String licenseCategory, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplications> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first cannabis applications in the ordered set where status = &#63; and licenseCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseCategory the license category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public CannabisApplications
			findBygetCannabisApplicationsByLicenseCategory_First(
				int status, String licenseCategory,
				com.liferay.portal.kernel.util.OrderByComparator
					<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException;

	/**
	 * Returns the first cannabis applications in the ordered set where status = &#63; and licenseCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseCategory the license category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public CannabisApplications
		fetchBygetCannabisApplicationsByLicenseCategory_First(
			int status, String licenseCategory,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplications> orderByComparator);

	/**
	 * Returns the last cannabis applications in the ordered set where status = &#63; and licenseCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseCategory the license category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public CannabisApplications
			findBygetCannabisApplicationsByLicenseCategory_Last(
				int status, String licenseCategory,
				com.liferay.portal.kernel.util.OrderByComparator
					<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException;

	/**
	 * Returns the last cannabis applications in the ordered set where status = &#63; and licenseCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseCategory the license category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public CannabisApplications
		fetchBygetCannabisApplicationsByLicenseCategory_Last(
			int status, String licenseCategory,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplications> orderByComparator);

	/**
	 * Returns the cannabis applicationses before and after the current cannabis applications in the ordered set where status = &#63; and licenseCategory = &#63;.
	 *
	 * @param cannabisApplicationId the primary key of the current cannabis applications
	 * @param status the status
	 * @param licenseCategory the license category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a cannabis applications with the primary key could not be found
	 */
	public CannabisApplications[]
			findBygetCannabisApplicationsByLicenseCategory_PrevAndNext(
				long cannabisApplicationId, int status, String licenseCategory,
				com.liferay.portal.kernel.util.OrderByComparator
					<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException;

	/**
	 * Removes all the cannabis applicationses where status = &#63; and licenseCategory = &#63; from the database.
	 *
	 * @param status the status
	 * @param licenseCategory the license category
	 */
	public void removeBygetCannabisApplicationsByLicenseCategory(
		int status, String licenseCategory);

	/**
	 * Returns the number of cannabis applicationses where status = &#63; and licenseCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseCategory the license category
	 * @return the number of matching cannabis applicationses
	 */
	public int countBygetCannabisApplicationsByLicenseCategory(
		int status, String licenseCategory);

	/**
	 * Returns all the cannabis applicationses where status = &#63; and licenseSubCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseSubCategory the license sub category
	 * @return the matching cannabis applicationses
	 */
	public java.util.List<CannabisApplications>
		findBygetCannabisApplicationsByLicenseSubCategory(
			int status, String licenseSubCategory);

	/**
	 * Returns a range of all the cannabis applicationses where status = &#63; and licenseSubCategory = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param licenseSubCategory the license sub category
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @return the range of matching cannabis applicationses
	 */
	public java.util.List<CannabisApplications>
		findBygetCannabisApplicationsByLicenseSubCategory(
			int status, String licenseSubCategory, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis applicationses where status = &#63; and licenseSubCategory = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param licenseSubCategory the license sub category
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis applicationses
	 */
	public java.util.List<CannabisApplications>
		findBygetCannabisApplicationsByLicenseSubCategory(
			int status, String licenseSubCategory, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplications> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis applicationses where status = &#63; and licenseSubCategory = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param licenseSubCategory the license sub category
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis applicationses
	 */
	public java.util.List<CannabisApplications>
		findBygetCannabisApplicationsByLicenseSubCategory(
			int status, String licenseSubCategory, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplications> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first cannabis applications in the ordered set where status = &#63; and licenseSubCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseSubCategory the license sub category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public CannabisApplications
			findBygetCannabisApplicationsByLicenseSubCategory_First(
				int status, String licenseSubCategory,
				com.liferay.portal.kernel.util.OrderByComparator
					<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException;

	/**
	 * Returns the first cannabis applications in the ordered set where status = &#63; and licenseSubCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseSubCategory the license sub category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public CannabisApplications
		fetchBygetCannabisApplicationsByLicenseSubCategory_First(
			int status, String licenseSubCategory,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplications> orderByComparator);

	/**
	 * Returns the last cannabis applications in the ordered set where status = &#63; and licenseSubCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseSubCategory the license sub category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public CannabisApplications
			findBygetCannabisApplicationsByLicenseSubCategory_Last(
				int status, String licenseSubCategory,
				com.liferay.portal.kernel.util.OrderByComparator
					<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException;

	/**
	 * Returns the last cannabis applications in the ordered set where status = &#63; and licenseSubCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseSubCategory the license sub category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public CannabisApplications
		fetchBygetCannabisApplicationsByLicenseSubCategory_Last(
			int status, String licenseSubCategory,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplications> orderByComparator);

	/**
	 * Returns the cannabis applicationses before and after the current cannabis applications in the ordered set where status = &#63; and licenseSubCategory = &#63;.
	 *
	 * @param cannabisApplicationId the primary key of the current cannabis applications
	 * @param status the status
	 * @param licenseSubCategory the license sub category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a cannabis applications with the primary key could not be found
	 */
	public CannabisApplications[]
			findBygetCannabisApplicationsByLicenseSubCategory_PrevAndNext(
				long cannabisApplicationId, int status,
				String licenseSubCategory,
				com.liferay.portal.kernel.util.OrderByComparator
					<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException;

	/**
	 * Removes all the cannabis applicationses where status = &#63; and licenseSubCategory = &#63; from the database.
	 *
	 * @param status the status
	 * @param licenseSubCategory the license sub category
	 */
	public void removeBygetCannabisApplicationsByLicenseSubCategory(
		int status, String licenseSubCategory);

	/**
	 * Returns the number of cannabis applicationses where status = &#63; and licenseSubCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseSubCategory the license sub category
	 * @return the number of matching cannabis applicationses
	 */
	public int countBygetCannabisApplicationsByLicenseSubCategory(
		int status, String licenseSubCategory);

	/**
	 * Returns the cannabis applications where requestType = &#63; and expiredLicenseAppNo = &#63; or throws a <code>NoSuchCannabisApplicationsException</code> if it could not be found.
	 *
	 * @param requestType the request type
	 * @param expiredLicenseAppNo the expired license app no
	 * @return the matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public CannabisApplications findBygetCannabisApplicationsByRT_ExpiredAppNo(
			String requestType, String expiredLicenseAppNo)
		throws NoSuchCannabisApplicationsException;

	/**
	 * Returns the cannabis applications where requestType = &#63; and expiredLicenseAppNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param requestType the request type
	 * @param expiredLicenseAppNo the expired license app no
	 * @return the matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public CannabisApplications fetchBygetCannabisApplicationsByRT_ExpiredAppNo(
		String requestType, String expiredLicenseAppNo);

	/**
	 * Returns the cannabis applications where requestType = &#63; and expiredLicenseAppNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param requestType the request type
	 * @param expiredLicenseAppNo the expired license app no
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public CannabisApplications fetchBygetCannabisApplicationsByRT_ExpiredAppNo(
		String requestType, String expiredLicenseAppNo, boolean useFinderCache);

	/**
	 * Removes the cannabis applications where requestType = &#63; and expiredLicenseAppNo = &#63; from the database.
	 *
	 * @param requestType the request type
	 * @param expiredLicenseAppNo the expired license app no
	 * @return the cannabis applications that was removed
	 */
	public CannabisApplications
			removeBygetCannabisApplicationsByRT_ExpiredAppNo(
				String requestType, String expiredLicenseAppNo)
		throws NoSuchCannabisApplicationsException;

	/**
	 * Returns the number of cannabis applicationses where requestType = &#63; and expiredLicenseAppNo = &#63;.
	 *
	 * @param requestType the request type
	 * @param expiredLicenseAppNo the expired license app no
	 * @return the number of matching cannabis applicationses
	 */
	public int countBygetCannabisApplicationsByRT_ExpiredAppNo(
		String requestType, String expiredLicenseAppNo);

	/**
	 * Returns all the cannabis applicationses where status = &#63; and requestType = &#63;.
	 *
	 * @param status the status
	 * @param requestType the request type
	 * @return the matching cannabis applicationses
	 */
	public java.util.List<CannabisApplications>
		findBygetCannabisApplicationsByRequestType(
			int status, String requestType);

	/**
	 * Returns a range of all the cannabis applicationses where status = &#63; and requestType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param requestType the request type
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @return the range of matching cannabis applicationses
	 */
	public java.util.List<CannabisApplications>
		findBygetCannabisApplicationsByRequestType(
			int status, String requestType, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis applicationses where status = &#63; and requestType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param requestType the request type
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis applicationses
	 */
	public java.util.List<CannabisApplications>
		findBygetCannabisApplicationsByRequestType(
			int status, String requestType, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplications> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis applicationses where status = &#63; and requestType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param requestType the request type
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis applicationses
	 */
	public java.util.List<CannabisApplications>
		findBygetCannabisApplicationsByRequestType(
			int status, String requestType, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplications> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first cannabis applications in the ordered set where status = &#63; and requestType = &#63;.
	 *
	 * @param status the status
	 * @param requestType the request type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public CannabisApplications
			findBygetCannabisApplicationsByRequestType_First(
				int status, String requestType,
				com.liferay.portal.kernel.util.OrderByComparator
					<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException;

	/**
	 * Returns the first cannabis applications in the ordered set where status = &#63; and requestType = &#63;.
	 *
	 * @param status the status
	 * @param requestType the request type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public CannabisApplications
		fetchBygetCannabisApplicationsByRequestType_First(
			int status, String requestType,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplications> orderByComparator);

	/**
	 * Returns the last cannabis applications in the ordered set where status = &#63; and requestType = &#63;.
	 *
	 * @param status the status
	 * @param requestType the request type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public CannabisApplications findBygetCannabisApplicationsByRequestType_Last(
			int status, String requestType,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException;

	/**
	 * Returns the last cannabis applications in the ordered set where status = &#63; and requestType = &#63;.
	 *
	 * @param status the status
	 * @param requestType the request type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public CannabisApplications
		fetchBygetCannabisApplicationsByRequestType_Last(
			int status, String requestType,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplications> orderByComparator);

	/**
	 * Returns the cannabis applicationses before and after the current cannabis applications in the ordered set where status = &#63; and requestType = &#63;.
	 *
	 * @param cannabisApplicationId the primary key of the current cannabis applications
	 * @param status the status
	 * @param requestType the request type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a cannabis applications with the primary key could not be found
	 */
	public CannabisApplications[]
			findBygetCannabisApplicationsByRequestType_PrevAndNext(
				long cannabisApplicationId, int status, String requestType,
				com.liferay.portal.kernel.util.OrderByComparator
					<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException;

	/**
	 * Removes all the cannabis applicationses where status = &#63; and requestType = &#63; from the database.
	 *
	 * @param status the status
	 * @param requestType the request type
	 */
	public void removeBygetCannabisApplicationsByRequestType(
		int status, String requestType);

	/**
	 * Returns the number of cannabis applicationses where status = &#63; and requestType = &#63;.
	 *
	 * @param status the status
	 * @param requestType the request type
	 * @return the number of matching cannabis applicationses
	 */
	public int countBygetCannabisApplicationsByRequestType(
		int status, String requestType);

	/**
	 * Returns all the cannabis applicationses where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching cannabis applicationses
	 */
	public java.util.List<CannabisApplications>
		findBygetCannabisApplicationsByStatus(int status);

	/**
	 * Returns a range of all the cannabis applicationses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @return the range of matching cannabis applicationses
	 */
	public java.util.List<CannabisApplications>
		findBygetCannabisApplicationsByStatus(int status, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis applicationses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis applicationses
	 */
	public java.util.List<CannabisApplications>
		findBygetCannabisApplicationsByStatus(
			int status, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplications> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis applicationses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis applicationses
	 */
	public java.util.List<CannabisApplications>
		findBygetCannabisApplicationsByStatus(
			int status, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplications> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first cannabis applications in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public CannabisApplications findBygetCannabisApplicationsByStatus_First(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException;

	/**
	 * Returns the first cannabis applications in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public CannabisApplications fetchBygetCannabisApplicationsByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisApplications>
			orderByComparator);

	/**
	 * Returns the last cannabis applications in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public CannabisApplications findBygetCannabisApplicationsByStatus_Last(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException;

	/**
	 * Returns the last cannabis applications in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public CannabisApplications fetchBygetCannabisApplicationsByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisApplications>
			orderByComparator);

	/**
	 * Returns the cannabis applicationses before and after the current cannabis applications in the ordered set where status = &#63;.
	 *
	 * @param cannabisApplicationId the primary key of the current cannabis applications
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a cannabis applications with the primary key could not be found
	 */
	public CannabisApplications[]
			findBygetCannabisApplicationsByStatus_PrevAndNext(
				long cannabisApplicationId, int status,
				com.liferay.portal.kernel.util.OrderByComparator
					<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException;

	/**
	 * Removes all the cannabis applicationses where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetCannabisApplicationsByStatus(int status);

	/**
	 * Returns the number of cannabis applicationses where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching cannabis applicationses
	 */
	public int countBygetCannabisApplicationsByStatus(int status);

	/**
	 * Returns all the cannabis applicationses where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching cannabis applicationses
	 */
	public java.util.List<CannabisApplications>
		findBygetCannabisApplicationsByStatusUser(int status, long userId);

	/**
	 * Returns a range of all the cannabis applicationses where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @return the range of matching cannabis applicationses
	 */
	public java.util.List<CannabisApplications>
		findBygetCannabisApplicationsByStatusUser(
			int status, long userId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis applicationses where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis applicationses
	 */
	public java.util.List<CannabisApplications>
		findBygetCannabisApplicationsByStatusUser(
			int status, long userId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplications> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis applicationses where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis applicationses
	 */
	public java.util.List<CannabisApplications>
		findBygetCannabisApplicationsByStatusUser(
			int status, long userId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplications> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first cannabis applications in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public CannabisApplications findBygetCannabisApplicationsByStatusUser_First(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException;

	/**
	 * Returns the first cannabis applications in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public CannabisApplications
		fetchBygetCannabisApplicationsByStatusUser_First(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplications> orderByComparator);

	/**
	 * Returns the last cannabis applications in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public CannabisApplications findBygetCannabisApplicationsByStatusUser_Last(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException;

	/**
	 * Returns the last cannabis applications in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public CannabisApplications fetchBygetCannabisApplicationsByStatusUser_Last(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisApplications>
			orderByComparator);

	/**
	 * Returns the cannabis applicationses before and after the current cannabis applications in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param cannabisApplicationId the primary key of the current cannabis applications
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a cannabis applications with the primary key could not be found
	 */
	public CannabisApplications[]
			findBygetCannabisApplicationsByStatusUser_PrevAndNext(
				long cannabisApplicationId, int status, long userId,
				com.liferay.portal.kernel.util.OrderByComparator
					<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException;

	/**
	 * Removes all the cannabis applicationses where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public void removeBygetCannabisApplicationsByStatusUser(
		int status, long userId);

	/**
	 * Returns the number of cannabis applicationses where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching cannabis applicationses
	 */
	public int countBygetCannabisApplicationsByStatusUser(
		int status, long userId);

	/**
	 * Returns all the cannabis applicationses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching cannabis applicationses
	 */
	public java.util.List<CannabisApplications>
		findBygetCannabisApplicationsByUser(long userId);

	/**
	 * Returns a range of all the cannabis applicationses where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @return the range of matching cannabis applicationses
	 */
	public java.util.List<CannabisApplications>
		findBygetCannabisApplicationsByUser(long userId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis applicationses where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis applicationses
	 */
	public java.util.List<CannabisApplications>
		findBygetCannabisApplicationsByUser(
			long userId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplications> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis applicationses where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis applicationses
	 */
	public java.util.List<CannabisApplications>
		findBygetCannabisApplicationsByUser(
			long userId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplications> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first cannabis applications in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public CannabisApplications findBygetCannabisApplicationsByUser_First(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException;

	/**
	 * Returns the first cannabis applications in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public CannabisApplications fetchBygetCannabisApplicationsByUser_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisApplications>
			orderByComparator);

	/**
	 * Returns the last cannabis applications in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public CannabisApplications findBygetCannabisApplicationsByUser_Last(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException;

	/**
	 * Returns the last cannabis applications in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public CannabisApplications fetchBygetCannabisApplicationsByUser_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisApplications>
			orderByComparator);

	/**
	 * Returns the cannabis applicationses before and after the current cannabis applications in the ordered set where userId = &#63;.
	 *
	 * @param cannabisApplicationId the primary key of the current cannabis applications
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a cannabis applications with the primary key could not be found
	 */
	public CannabisApplications[]
			findBygetCannabisApplicationsByUser_PrevAndNext(
				long cannabisApplicationId, long userId,
				com.liferay.portal.kernel.util.OrderByComparator
					<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException;

	/**
	 * Removes all the cannabis applicationses where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public void removeBygetCannabisApplicationsByUser(long userId);

	/**
	 * Returns the number of cannabis applicationses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching cannabis applicationses
	 */
	public int countBygetCannabisApplicationsByUser(long userId);

	/**
	 * Returns the cannabis applications where applicationNumber = &#63; or throws a <code>NoSuchCannabisApplicationsException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public CannabisApplications findBygetCannabisApplicationsAppNo(
			String applicationNumber)
		throws NoSuchCannabisApplicationsException;

	/**
	 * Returns the cannabis applications where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public CannabisApplications fetchBygetCannabisApplicationsAppNo(
		String applicationNumber);

	/**
	 * Returns the cannabis applications where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public CannabisApplications fetchBygetCannabisApplicationsAppNo(
		String applicationNumber, boolean useFinderCache);

	/**
	 * Removes the cannabis applications where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the cannabis applications that was removed
	 */
	public CannabisApplications removeBygetCannabisApplicationsAppNo(
			String applicationNumber)
		throws NoSuchCannabisApplicationsException;

	/**
	 * Returns the number of cannabis applicationses where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching cannabis applicationses
	 */
	public int countBygetCannabisApplicationsAppNo(String applicationNumber);

	/**
	 * Returns the cannabis applications where caseId = &#63; or throws a <code>NoSuchCannabisApplicationsException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public CannabisApplications findBycannabisApplicationByCaseId(String caseId)
		throws NoSuchCannabisApplicationsException;

	/**
	 * Returns the cannabis applications where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public CannabisApplications fetchBycannabisApplicationByCaseId(
		String caseId);

	/**
	 * Returns the cannabis applications where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public CannabisApplications fetchBycannabisApplicationByCaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the cannabis applications where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the cannabis applications that was removed
	 */
	public CannabisApplications removeBycannabisApplicationByCaseId(
			String caseId)
		throws NoSuchCannabisApplicationsException;

	/**
	 * Returns the number of cannabis applicationses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis applicationses
	 */
	public int countBycannabisApplicationByCaseId(String caseId);

	/**
	 * Caches the cannabis applications in the entity cache if it is enabled.
	 *
	 * @param cannabisApplications the cannabis applications
	 */
	public void cacheResult(CannabisApplications cannabisApplications);

	/**
	 * Caches the cannabis applicationses in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationses the cannabis applicationses
	 */
	public void cacheResult(
		java.util.List<CannabisApplications> cannabisApplicationses);

	/**
	 * Creates a new cannabis applications with the primary key. Does not add the cannabis applications to the database.
	 *
	 * @param cannabisApplicationId the primary key for the new cannabis applications
	 * @return the new cannabis applications
	 */
	public CannabisApplications create(long cannabisApplicationId);

	/**
	 * Removes the cannabis applications with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisApplicationId the primary key of the cannabis applications
	 * @return the cannabis applications that was removed
	 * @throws NoSuchCannabisApplicationsException if a cannabis applications with the primary key could not be found
	 */
	public CannabisApplications remove(long cannabisApplicationId)
		throws NoSuchCannabisApplicationsException;

	public CannabisApplications updateImpl(
		CannabisApplications cannabisApplications);

	/**
	 * Returns the cannabis applications with the primary key or throws a <code>NoSuchCannabisApplicationsException</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the primary key of the cannabis applications
	 * @return the cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a cannabis applications with the primary key could not be found
	 */
	public CannabisApplications findByPrimaryKey(long cannabisApplicationId)
		throws NoSuchCannabisApplicationsException;

	/**
	 * Returns the cannabis applications with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the primary key of the cannabis applications
	 * @return the cannabis applications, or <code>null</code> if a cannabis applications with the primary key could not be found
	 */
	public CannabisApplications fetchByPrimaryKey(long cannabisApplicationId);

	/**
	 * Returns all the cannabis applicationses.
	 *
	 * @return the cannabis applicationses
	 */
	public java.util.List<CannabisApplications> findAll();

	/**
	 * Returns a range of all the cannabis applicationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @return the range of cannabis applicationses
	 */
	public java.util.List<CannabisApplications> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the cannabis applicationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis applicationses
	 */
	public java.util.List<CannabisApplications> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisApplications>
			orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis applicationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis applicationses
	 */
	public java.util.List<CannabisApplications> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisApplications>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the cannabis applicationses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of cannabis applicationses.
	 *
	 * @return the number of cannabis applicationses
	 */
	public int countAll();

}