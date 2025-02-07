/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.npm.cannabis.application.stages.services.exception.NoSuchCannabisConditionalLicenseException;
import com.npm.cannabis.application.stages.services.model.CannabisConditionalLicense;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the cannabis conditional license service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisConditionalLicenseUtil
 * @generated
 */
@ProviderType
public interface CannabisConditionalLicensePersistence
	extends BasePersistence<CannabisConditionalLicense> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CannabisConditionalLicenseUtil} to access the cannabis conditional license persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the cannabis conditional license where cannabisApplicationId = &#63; or throws a <code>NoSuchCannabisConditionalLicenseException</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis conditional license
	 * @throws NoSuchCannabisConditionalLicenseException if a matching cannabis conditional license could not be found
	 */
	public CannabisConditionalLicense findBygetCCL_CAI(
			long cannabisApplicationId)
		throws NoSuchCannabisConditionalLicenseException;

	/**
	 * Returns the cannabis conditional license where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis conditional license, or <code>null</code> if a matching cannabis conditional license could not be found
	 */
	public CannabisConditionalLicense fetchBygetCCL_CAI(
		long cannabisApplicationId);

	/**
	 * Returns the cannabis conditional license where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis conditional license, or <code>null</code> if a matching cannabis conditional license could not be found
	 */
	public CannabisConditionalLicense fetchBygetCCL_CAI(
		long cannabisApplicationId, boolean useFinderCache);

	/**
	 * Removes the cannabis conditional license where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the cannabis conditional license that was removed
	 */
	public CannabisConditionalLicense removeBygetCCL_CAI(
			long cannabisApplicationId)
		throws NoSuchCannabisConditionalLicenseException;

	/**
	 * Returns the number of cannabis conditional licenses where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis conditional licenses
	 */
	public int countBygetCCL_CAI(long cannabisApplicationId);

	/**
	 * Returns the cannabis conditional license where caseId = &#63; or throws a <code>NoSuchCannabisConditionalLicenseException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis conditional license
	 * @throws NoSuchCannabisConditionalLicenseException if a matching cannabis conditional license could not be found
	 */
	public CannabisConditionalLicense findBygetCCL_CaseId(String caseId)
		throws NoSuchCannabisConditionalLicenseException;

	/**
	 * Returns the cannabis conditional license where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis conditional license, or <code>null</code> if a matching cannabis conditional license could not be found
	 */
	public CannabisConditionalLicense fetchBygetCCL_CaseId(String caseId);

	/**
	 * Returns the cannabis conditional license where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis conditional license, or <code>null</code> if a matching cannabis conditional license could not be found
	 */
	public CannabisConditionalLicense fetchBygetCCL_CaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the cannabis conditional license where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the cannabis conditional license that was removed
	 */
	public CannabisConditionalLicense removeBygetCCL_CaseId(String caseId)
		throws NoSuchCannabisConditionalLicenseException;

	/**
	 * Returns the number of cannabis conditional licenses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis conditional licenses
	 */
	public int countBygetCCL_CaseId(String caseId);

	/**
	 * Returns all the cannabis conditional licenses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis conditional licenses
	 */
	public java.util.List<CannabisConditionalLicense> findBygetCCL_BycaseId(
		String caseId);

	/**
	 * Returns a range of all the cannabis conditional licenses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis conditional licenses
	 * @param end the upper bound of the range of cannabis conditional licenses (not inclusive)
	 * @return the range of matching cannabis conditional licenses
	 */
	public java.util.List<CannabisConditionalLicense> findBygetCCL_BycaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis conditional licenses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis conditional licenses
	 * @param end the upper bound of the range of cannabis conditional licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis conditional licenses
	 */
	public java.util.List<CannabisConditionalLicense> findBygetCCL_BycaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisConditionalLicense> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis conditional licenses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis conditional licenses
	 * @param end the upper bound of the range of cannabis conditional licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis conditional licenses
	 */
	public java.util.List<CannabisConditionalLicense> findBygetCCL_BycaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisConditionalLicense> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis conditional license in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license
	 * @throws NoSuchCannabisConditionalLicenseException if a matching cannabis conditional license could not be found
	 */
	public CannabisConditionalLicense findBygetCCL_BycaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisConditionalLicense> orderByComparator)
		throws NoSuchCannabisConditionalLicenseException;

	/**
	 * Returns the first cannabis conditional license in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license, or <code>null</code> if a matching cannabis conditional license could not be found
	 */
	public CannabisConditionalLicense fetchBygetCCL_BycaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisConditionalLicense> orderByComparator);

	/**
	 * Returns the last cannabis conditional license in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license
	 * @throws NoSuchCannabisConditionalLicenseException if a matching cannabis conditional license could not be found
	 */
	public CannabisConditionalLicense findBygetCCL_BycaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisConditionalLicense> orderByComparator)
		throws NoSuchCannabisConditionalLicenseException;

	/**
	 * Returns the last cannabis conditional license in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license, or <code>null</code> if a matching cannabis conditional license could not be found
	 */
	public CannabisConditionalLicense fetchBygetCCL_BycaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisConditionalLicense> orderByComparator);

	/**
	 * Returns the cannabis conditional licenses before and after the current cannabis conditional license in the ordered set where caseId = &#63;.
	 *
	 * @param cannabisConditonalLicenseId the primary key of the current cannabis conditional license
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis conditional license
	 * @throws NoSuchCannabisConditionalLicenseException if a cannabis conditional license with the primary key could not be found
	 */
	public CannabisConditionalLicense[] findBygetCCL_BycaseId_PrevAndNext(
			long cannabisConditonalLicenseId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisConditionalLicense> orderByComparator)
		throws NoSuchCannabisConditionalLicenseException;

	/**
	 * Removes all the cannabis conditional licenses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetCCL_BycaseId(String caseId);

	/**
	 * Returns the number of cannabis conditional licenses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis conditional licenses
	 */
	public int countBygetCCL_BycaseId(String caseId);

	/**
	 * Caches the cannabis conditional license in the entity cache if it is enabled.
	 *
	 * @param cannabisConditionalLicense the cannabis conditional license
	 */
	public void cacheResult(
		CannabisConditionalLicense cannabisConditionalLicense);

	/**
	 * Caches the cannabis conditional licenses in the entity cache if it is enabled.
	 *
	 * @param cannabisConditionalLicenses the cannabis conditional licenses
	 */
	public void cacheResult(
		java.util.List<CannabisConditionalLicense> cannabisConditionalLicenses);

	/**
	 * Creates a new cannabis conditional license with the primary key. Does not add the cannabis conditional license to the database.
	 *
	 * @param cannabisConditonalLicenseId the primary key for the new cannabis conditional license
	 * @return the new cannabis conditional license
	 */
	public CannabisConditionalLicense create(long cannabisConditonalLicenseId);

	/**
	 * Removes the cannabis conditional license with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisConditonalLicenseId the primary key of the cannabis conditional license
	 * @return the cannabis conditional license that was removed
	 * @throws NoSuchCannabisConditionalLicenseException if a cannabis conditional license with the primary key could not be found
	 */
	public CannabisConditionalLicense remove(long cannabisConditonalLicenseId)
		throws NoSuchCannabisConditionalLicenseException;

	public CannabisConditionalLicense updateImpl(
		CannabisConditionalLicense cannabisConditionalLicense);

	/**
	 * Returns the cannabis conditional license with the primary key or throws a <code>NoSuchCannabisConditionalLicenseException</code> if it could not be found.
	 *
	 * @param cannabisConditonalLicenseId the primary key of the cannabis conditional license
	 * @return the cannabis conditional license
	 * @throws NoSuchCannabisConditionalLicenseException if a cannabis conditional license with the primary key could not be found
	 */
	public CannabisConditionalLicense findByPrimaryKey(
			long cannabisConditonalLicenseId)
		throws NoSuchCannabisConditionalLicenseException;

	/**
	 * Returns the cannabis conditional license with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisConditonalLicenseId the primary key of the cannabis conditional license
	 * @return the cannabis conditional license, or <code>null</code> if a cannabis conditional license with the primary key could not be found
	 */
	public CannabisConditionalLicense fetchByPrimaryKey(
		long cannabisConditonalLicenseId);

	/**
	 * Returns all the cannabis conditional licenses.
	 *
	 * @return the cannabis conditional licenses
	 */
	public java.util.List<CannabisConditionalLicense> findAll();

	/**
	 * Returns a range of all the cannabis conditional licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis conditional licenses
	 * @param end the upper bound of the range of cannabis conditional licenses (not inclusive)
	 * @return the range of cannabis conditional licenses
	 */
	public java.util.List<CannabisConditionalLicense> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the cannabis conditional licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis conditional licenses
	 * @param end the upper bound of the range of cannabis conditional licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis conditional licenses
	 */
	public java.util.List<CannabisConditionalLicense> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisConditionalLicense> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis conditional licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis conditional licenses
	 * @param end the upper bound of the range of cannabis conditional licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis conditional licenses
	 */
	public java.util.List<CannabisConditionalLicense> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisConditionalLicense> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the cannabis conditional licenses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of cannabis conditional licenses.
	 *
	 * @return the number of cannabis conditional licenses
	 */
	public int countAll();

}