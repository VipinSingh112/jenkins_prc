/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.npm.cannabis.application.stages.services.exception.NoSuchCannabisLicenseException;
import com.npm.cannabis.application.stages.services.model.CannabisLicense;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the cannabis license service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisLicenseUtil
 * @generated
 */
@ProviderType
public interface CannabisLicensePersistence
	extends BasePersistence<CannabisLicense> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CannabisLicenseUtil} to access the cannabis license persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the cannabis license where cannabisApplicationId = &#63; or throws a <code>NoSuchCannabisLicenseException</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis license
	 * @throws NoSuchCannabisLicenseException if a matching cannabis license could not be found
	 */
	public CannabisLicense findBygetCL_CAI(long cannabisApplicationId)
		throws NoSuchCannabisLicenseException;

	/**
	 * Returns the cannabis license where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis license, or <code>null</code> if a matching cannabis license could not be found
	 */
	public CannabisLicense fetchBygetCL_CAI(long cannabisApplicationId);

	/**
	 * Returns the cannabis license where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis license, or <code>null</code> if a matching cannabis license could not be found
	 */
	public CannabisLicense fetchBygetCL_CAI(
		long cannabisApplicationId, boolean useFinderCache);

	/**
	 * Removes the cannabis license where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the cannabis license that was removed
	 */
	public CannabisLicense removeBygetCL_CAI(long cannabisApplicationId)
		throws NoSuchCannabisLicenseException;

	/**
	 * Returns the number of cannabis licenses where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis licenses
	 */
	public int countBygetCL_CAI(long cannabisApplicationId);

	/**
	 * Returns the cannabis license where caseId = &#63; or throws a <code>NoSuchCannabisLicenseException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis license
	 * @throws NoSuchCannabisLicenseException if a matching cannabis license could not be found
	 */
	public CannabisLicense findBygetCL_CaseId(String caseId)
		throws NoSuchCannabisLicenseException;

	/**
	 * Returns the cannabis license where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis license, or <code>null</code> if a matching cannabis license could not be found
	 */
	public CannabisLicense fetchBygetCL_CaseId(String caseId);

	/**
	 * Returns the cannabis license where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis license, or <code>null</code> if a matching cannabis license could not be found
	 */
	public CannabisLicense fetchBygetCL_CaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the cannabis license where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the cannabis license that was removed
	 */
	public CannabisLicense removeBygetCL_CaseId(String caseId)
		throws NoSuchCannabisLicenseException;

	/**
	 * Returns the number of cannabis licenses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis licenses
	 */
	public int countBygetCL_CaseId(String caseId);

	/**
	 * Returns the cannabis license where licenseNumber = &#63; or throws a <code>NoSuchCannabisLicenseException</code> if it could not be found.
	 *
	 * @param licenseNumber the license number
	 * @return the matching cannabis license
	 * @throws NoSuchCannabisLicenseException if a matching cannabis license could not be found
	 */
	public CannabisLicense findBygetCL_LN(String licenseNumber)
		throws NoSuchCannabisLicenseException;

	/**
	 * Returns the cannabis license where licenseNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param licenseNumber the license number
	 * @return the matching cannabis license, or <code>null</code> if a matching cannabis license could not be found
	 */
	public CannabisLicense fetchBygetCL_LN(String licenseNumber);

	/**
	 * Returns the cannabis license where licenseNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param licenseNumber the license number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis license, or <code>null</code> if a matching cannabis license could not be found
	 */
	public CannabisLicense fetchBygetCL_LN(
		String licenseNumber, boolean useFinderCache);

	/**
	 * Removes the cannabis license where licenseNumber = &#63; from the database.
	 *
	 * @param licenseNumber the license number
	 * @return the cannabis license that was removed
	 */
	public CannabisLicense removeBygetCL_LN(String licenseNumber)
		throws NoSuchCannabisLicenseException;

	/**
	 * Returns the number of cannabis licenses where licenseNumber = &#63;.
	 *
	 * @param licenseNumber the license number
	 * @return the number of matching cannabis licenses
	 */
	public int countBygetCL_LN(String licenseNumber);

	/**
	 * Caches the cannabis license in the entity cache if it is enabled.
	 *
	 * @param cannabisLicense the cannabis license
	 */
	public void cacheResult(CannabisLicense cannabisLicense);

	/**
	 * Caches the cannabis licenses in the entity cache if it is enabled.
	 *
	 * @param cannabisLicenses the cannabis licenses
	 */
	public void cacheResult(java.util.List<CannabisLicense> cannabisLicenses);

	/**
	 * Creates a new cannabis license with the primary key. Does not add the cannabis license to the database.
	 *
	 * @param cannabisLicenseId the primary key for the new cannabis license
	 * @return the new cannabis license
	 */
	public CannabisLicense create(long cannabisLicenseId);

	/**
	 * Removes the cannabis license with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisLicenseId the primary key of the cannabis license
	 * @return the cannabis license that was removed
	 * @throws NoSuchCannabisLicenseException if a cannabis license with the primary key could not be found
	 */
	public CannabisLicense remove(long cannabisLicenseId)
		throws NoSuchCannabisLicenseException;

	public CannabisLicense updateImpl(CannabisLicense cannabisLicense);

	/**
	 * Returns the cannabis license with the primary key or throws a <code>NoSuchCannabisLicenseException</code> if it could not be found.
	 *
	 * @param cannabisLicenseId the primary key of the cannabis license
	 * @return the cannabis license
	 * @throws NoSuchCannabisLicenseException if a cannabis license with the primary key could not be found
	 */
	public CannabisLicense findByPrimaryKey(long cannabisLicenseId)
		throws NoSuchCannabisLicenseException;

	/**
	 * Returns the cannabis license with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisLicenseId the primary key of the cannabis license
	 * @return the cannabis license, or <code>null</code> if a cannabis license with the primary key could not be found
	 */
	public CannabisLicense fetchByPrimaryKey(long cannabisLicenseId);

	/**
	 * Returns all the cannabis licenses.
	 *
	 * @return the cannabis licenses
	 */
	public java.util.List<CannabisLicense> findAll();

	/**
	 * Returns a range of all the cannabis licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis licenses
	 * @param end the upper bound of the range of cannabis licenses (not inclusive)
	 * @return the range of cannabis licenses
	 */
	public java.util.List<CannabisLicense> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the cannabis licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis licenses
	 * @param end the upper bound of the range of cannabis licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis licenses
	 */
	public java.util.List<CannabisLicense> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisLicense>
			orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis licenses
	 * @param end the upper bound of the range of cannabis licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis licenses
	 */
	public java.util.List<CannabisLicense> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisLicense>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the cannabis licenses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of cannabis licenses.
	 *
	 * @return the number of cannabis licenses
	 */
	public int countAll();

}