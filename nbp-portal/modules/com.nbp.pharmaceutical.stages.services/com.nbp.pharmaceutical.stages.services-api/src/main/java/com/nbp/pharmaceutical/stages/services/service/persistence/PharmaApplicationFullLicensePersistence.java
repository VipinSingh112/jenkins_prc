/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.pharmaceutical.stages.services.exception.NoSuchPharmaApplicationFullLicenseException;
import com.nbp.pharmaceutical.stages.services.model.PharmaApplicationFullLicense;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the pharma application full license service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationFullLicenseUtil
 * @generated
 */
@ProviderType
public interface PharmaApplicationFullLicensePersistence
	extends BasePersistence<PharmaApplicationFullLicense> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PharmaApplicationFullLicenseUtil} to access the pharma application full license persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the pharma application full license where caseId = &#63; or throws a <code>NoSuchPharmaApplicationFullLicenseException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching pharma application full license
	 * @throws NoSuchPharmaApplicationFullLicenseException if a matching pharma application full license could not be found
	 */
	public PharmaApplicationFullLicense findBygetPharmaFullLic_By_CI(
			String caseId)
		throws NoSuchPharmaApplicationFullLicenseException;

	/**
	 * Returns the pharma application full license where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching pharma application full license, or <code>null</code> if a matching pharma application full license could not be found
	 */
	public PharmaApplicationFullLicense fetchBygetPharmaFullLic_By_CI(
		String caseId);

	/**
	 * Returns the pharma application full license where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application full license, or <code>null</code> if a matching pharma application full license could not be found
	 */
	public PharmaApplicationFullLicense fetchBygetPharmaFullLic_By_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the pharma application full license where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the pharma application full license that was removed
	 */
	public PharmaApplicationFullLicense removeBygetPharmaFullLic_By_CI(
			String caseId)
		throws NoSuchPharmaApplicationFullLicenseException;

	/**
	 * Returns the number of pharma application full licenses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching pharma application full licenses
	 */
	public int countBygetPharmaFullLic_By_CI(String caseId);

	/**
	 * Returns all the pharma application full licenses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching pharma application full licenses
	 */
	public java.util.List<PharmaApplicationFullLicense>
		findBygetPharmaFullLic_By_CID(String caseId);

	/**
	 * Returns a range of all the pharma application full licenses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationFullLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma application full licenses
	 * @param end the upper bound of the range of pharma application full licenses (not inclusive)
	 * @return the range of matching pharma application full licenses
	 */
	public java.util.List<PharmaApplicationFullLicense>
		findBygetPharmaFullLic_By_CID(String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the pharma application full licenses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationFullLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma application full licenses
	 * @param end the upper bound of the range of pharma application full licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma application full licenses
	 */
	public java.util.List<PharmaApplicationFullLicense>
		findBygetPharmaFullLic_By_CID(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaApplicationFullLicense> orderByComparator);

	/**
	 * Returns an ordered range of all the pharma application full licenses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationFullLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma application full licenses
	 * @param end the upper bound of the range of pharma application full licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma application full licenses
	 */
	public java.util.List<PharmaApplicationFullLicense>
		findBygetPharmaFullLic_By_CID(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaApplicationFullLicense> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first pharma application full license in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application full license
	 * @throws NoSuchPharmaApplicationFullLicenseException if a matching pharma application full license could not be found
	 */
	public PharmaApplicationFullLicense findBygetPharmaFullLic_By_CID_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaApplicationFullLicense> orderByComparator)
		throws NoSuchPharmaApplicationFullLicenseException;

	/**
	 * Returns the first pharma application full license in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application full license, or <code>null</code> if a matching pharma application full license could not be found
	 */
	public PharmaApplicationFullLicense fetchBygetPharmaFullLic_By_CID_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaApplicationFullLicense> orderByComparator);

	/**
	 * Returns the last pharma application full license in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application full license
	 * @throws NoSuchPharmaApplicationFullLicenseException if a matching pharma application full license could not be found
	 */
	public PharmaApplicationFullLicense findBygetPharmaFullLic_By_CID_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaApplicationFullLicense> orderByComparator)
		throws NoSuchPharmaApplicationFullLicenseException;

	/**
	 * Returns the last pharma application full license in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application full license, or <code>null</code> if a matching pharma application full license could not be found
	 */
	public PharmaApplicationFullLicense fetchBygetPharmaFullLic_By_CID_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaApplicationFullLicense> orderByComparator);

	/**
	 * Returns the pharma application full licenses before and after the current pharma application full license in the ordered set where caseId = &#63;.
	 *
	 * @param pharmaFullLicenseId the primary key of the current pharma application full license
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma application full license
	 * @throws NoSuchPharmaApplicationFullLicenseException if a pharma application full license with the primary key could not be found
	 */
	public PharmaApplicationFullLicense[]
			findBygetPharmaFullLic_By_CID_PrevAndNext(
				long pharmaFullLicenseId, String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<PharmaApplicationFullLicense> orderByComparator)
		throws NoSuchPharmaApplicationFullLicenseException;

	/**
	 * Removes all the pharma application full licenses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetPharmaFullLic_By_CID(String caseId);

	/**
	 * Returns the number of pharma application full licenses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching pharma application full licenses
	 */
	public int countBygetPharmaFullLic_By_CID(String caseId);

	/**
	 * Returns the pharma application full license where licenseNumber = &#63; or throws a <code>NoSuchPharmaApplicationFullLicenseException</code> if it could not be found.
	 *
	 * @param licenseNumber the license number
	 * @return the matching pharma application full license
	 * @throws NoSuchPharmaApplicationFullLicenseException if a matching pharma application full license could not be found
	 */
	public PharmaApplicationFullLicense findBygetPharmaFullLic_By_LN(
			String licenseNumber)
		throws NoSuchPharmaApplicationFullLicenseException;

	/**
	 * Returns the pharma application full license where licenseNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param licenseNumber the license number
	 * @return the matching pharma application full license, or <code>null</code> if a matching pharma application full license could not be found
	 */
	public PharmaApplicationFullLicense fetchBygetPharmaFullLic_By_LN(
		String licenseNumber);

	/**
	 * Returns the pharma application full license where licenseNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param licenseNumber the license number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application full license, or <code>null</code> if a matching pharma application full license could not be found
	 */
	public PharmaApplicationFullLicense fetchBygetPharmaFullLic_By_LN(
		String licenseNumber, boolean useFinderCache);

	/**
	 * Removes the pharma application full license where licenseNumber = &#63; from the database.
	 *
	 * @param licenseNumber the license number
	 * @return the pharma application full license that was removed
	 */
	public PharmaApplicationFullLicense removeBygetPharmaFullLic_By_LN(
			String licenseNumber)
		throws NoSuchPharmaApplicationFullLicenseException;

	/**
	 * Returns the number of pharma application full licenses where licenseNumber = &#63;.
	 *
	 * @param licenseNumber the license number
	 * @return the number of matching pharma application full licenses
	 */
	public int countBygetPharmaFullLic_By_LN(String licenseNumber);

	/**
	 * Caches the pharma application full license in the entity cache if it is enabled.
	 *
	 * @param pharmaApplicationFullLicense the pharma application full license
	 */
	public void cacheResult(
		PharmaApplicationFullLicense pharmaApplicationFullLicense);

	/**
	 * Caches the pharma application full licenses in the entity cache if it is enabled.
	 *
	 * @param pharmaApplicationFullLicenses the pharma application full licenses
	 */
	public void cacheResult(
		java.util.List<PharmaApplicationFullLicense>
			pharmaApplicationFullLicenses);

	/**
	 * Creates a new pharma application full license with the primary key. Does not add the pharma application full license to the database.
	 *
	 * @param pharmaFullLicenseId the primary key for the new pharma application full license
	 * @return the new pharma application full license
	 */
	public PharmaApplicationFullLicense create(long pharmaFullLicenseId);

	/**
	 * Removes the pharma application full license with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaFullLicenseId the primary key of the pharma application full license
	 * @return the pharma application full license that was removed
	 * @throws NoSuchPharmaApplicationFullLicenseException if a pharma application full license with the primary key could not be found
	 */
	public PharmaApplicationFullLicense remove(long pharmaFullLicenseId)
		throws NoSuchPharmaApplicationFullLicenseException;

	public PharmaApplicationFullLicense updateImpl(
		PharmaApplicationFullLicense pharmaApplicationFullLicense);

	/**
	 * Returns the pharma application full license with the primary key or throws a <code>NoSuchPharmaApplicationFullLicenseException</code> if it could not be found.
	 *
	 * @param pharmaFullLicenseId the primary key of the pharma application full license
	 * @return the pharma application full license
	 * @throws NoSuchPharmaApplicationFullLicenseException if a pharma application full license with the primary key could not be found
	 */
	public PharmaApplicationFullLicense findByPrimaryKey(
			long pharmaFullLicenseId)
		throws NoSuchPharmaApplicationFullLicenseException;

	/**
	 * Returns the pharma application full license with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaFullLicenseId the primary key of the pharma application full license
	 * @return the pharma application full license, or <code>null</code> if a pharma application full license with the primary key could not be found
	 */
	public PharmaApplicationFullLicense fetchByPrimaryKey(
		long pharmaFullLicenseId);

	/**
	 * Returns all the pharma application full licenses.
	 *
	 * @return the pharma application full licenses
	 */
	public java.util.List<PharmaApplicationFullLicense> findAll();

	/**
	 * Returns a range of all the pharma application full licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationFullLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application full licenses
	 * @param end the upper bound of the range of pharma application full licenses (not inclusive)
	 * @return the range of pharma application full licenses
	 */
	public java.util.List<PharmaApplicationFullLicense> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the pharma application full licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationFullLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application full licenses
	 * @param end the upper bound of the range of pharma application full licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma application full licenses
	 */
	public java.util.List<PharmaApplicationFullLicense> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaApplicationFullLicense> orderByComparator);

	/**
	 * Returns an ordered range of all the pharma application full licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationFullLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application full licenses
	 * @param end the upper bound of the range of pharma application full licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma application full licenses
	 */
	public java.util.List<PharmaApplicationFullLicense> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaApplicationFullLicense> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the pharma application full licenses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of pharma application full licenses.
	 *
	 * @return the number of pharma application full licenses
	 */
	public int countAll();

}