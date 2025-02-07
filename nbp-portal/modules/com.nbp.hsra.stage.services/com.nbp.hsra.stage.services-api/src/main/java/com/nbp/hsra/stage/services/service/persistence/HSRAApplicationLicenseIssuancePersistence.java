/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.stage.services.exception.NoSuchHSRAApplicationLicenseIssuanceException;
import com.nbp.hsra.stage.services.model.HSRAApplicationLicenseIssuance;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the hsra application license issuance service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HSRAApplicationLicenseIssuanceUtil
 * @generated
 */
@ProviderType
public interface HSRAApplicationLicenseIssuancePersistence
	extends BasePersistence<HSRAApplicationLicenseIssuance> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HSRAApplicationLicenseIssuanceUtil} to access the hsra application license issuance persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the hsra application license issuance where caseId = &#63; or throws a <code>NoSuchHSRAApplicationLicenseIssuanceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra application license issuance
	 * @throws NoSuchHSRAApplicationLicenseIssuanceException if a matching hsra application license issuance could not be found
	 */
	public HSRAApplicationLicenseIssuance findBygetHSRA_lic_iss_By_CI(
			String caseId)
		throws NoSuchHSRAApplicationLicenseIssuanceException;

	/**
	 * Returns the hsra application license issuance where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra application license issuance, or <code>null</code> if a matching hsra application license issuance could not be found
	 */
	public HSRAApplicationLicenseIssuance fetchBygetHSRA_lic_iss_By_CI(
		String caseId);

	/**
	 * Returns the hsra application license issuance where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application license issuance, or <code>null</code> if a matching hsra application license issuance could not be found
	 */
	public HSRAApplicationLicenseIssuance fetchBygetHSRA_lic_iss_By_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the hsra application license issuance where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the hsra application license issuance that was removed
	 */
	public HSRAApplicationLicenseIssuance removeBygetHSRA_lic_iss_By_CI(
			String caseId)
		throws NoSuchHSRAApplicationLicenseIssuanceException;

	/**
	 * Returns the number of hsra application license issuances where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching hsra application license issuances
	 */
	public int countBygetHSRA_lic_iss_By_CI(String caseId);

	/**
	 * Returns all the hsra application license issuances where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra application license issuances
	 */
	public java.util.List<HSRAApplicationLicenseIssuance>
		findBygetHSRA_lic_iss_By_CID(String caseId);

	/**
	 * Returns a range of all the hsra application license issuances where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra application license issuances
	 * @param end the upper bound of the range of hsra application license issuances (not inclusive)
	 * @return the range of matching hsra application license issuances
	 */
	public java.util.List<HSRAApplicationLicenseIssuance>
		findBygetHSRA_lic_iss_By_CID(String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the hsra application license issuances where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra application license issuances
	 * @param end the upper bound of the range of hsra application license issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra application license issuances
	 */
	public java.util.List<HSRAApplicationLicenseIssuance>
		findBygetHSRA_lic_iss_By_CID(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<HSRAApplicationLicenseIssuance> orderByComparator);

	/**
	 * Returns an ordered range of all the hsra application license issuances where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra application license issuances
	 * @param end the upper bound of the range of hsra application license issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra application license issuances
	 */
	public java.util.List<HSRAApplicationLicenseIssuance>
		findBygetHSRA_lic_iss_By_CID(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<HSRAApplicationLicenseIssuance> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first hsra application license issuance in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application license issuance
	 * @throws NoSuchHSRAApplicationLicenseIssuanceException if a matching hsra application license issuance could not be found
	 */
	public HSRAApplicationLicenseIssuance findBygetHSRA_lic_iss_By_CID_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<HSRAApplicationLicenseIssuance> orderByComparator)
		throws NoSuchHSRAApplicationLicenseIssuanceException;

	/**
	 * Returns the first hsra application license issuance in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application license issuance, or <code>null</code> if a matching hsra application license issuance could not be found
	 */
	public HSRAApplicationLicenseIssuance fetchBygetHSRA_lic_iss_By_CID_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<HSRAApplicationLicenseIssuance> orderByComparator);

	/**
	 * Returns the last hsra application license issuance in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application license issuance
	 * @throws NoSuchHSRAApplicationLicenseIssuanceException if a matching hsra application license issuance could not be found
	 */
	public HSRAApplicationLicenseIssuance findBygetHSRA_lic_iss_By_CID_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<HSRAApplicationLicenseIssuance> orderByComparator)
		throws NoSuchHSRAApplicationLicenseIssuanceException;

	/**
	 * Returns the last hsra application license issuance in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application license issuance, or <code>null</code> if a matching hsra application license issuance could not be found
	 */
	public HSRAApplicationLicenseIssuance fetchBygetHSRA_lic_iss_By_CID_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<HSRAApplicationLicenseIssuance> orderByComparator);

	/**
	 * Returns the hsra application license issuances before and after the current hsra application license issuance in the ordered set where caseId = &#63;.
	 *
	 * @param hsraFullLicenseId the primary key of the current hsra application license issuance
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application license issuance
	 * @throws NoSuchHSRAApplicationLicenseIssuanceException if a hsra application license issuance with the primary key could not be found
	 */
	public HSRAApplicationLicenseIssuance[]
			findBygetHSRA_lic_iss_By_CID_PrevAndNext(
				long hsraFullLicenseId, String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<HSRAApplicationLicenseIssuance> orderByComparator)
		throws NoSuchHSRAApplicationLicenseIssuanceException;

	/**
	 * Removes all the hsra application license issuances where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetHSRA_lic_iss_By_CID(String caseId);

	/**
	 * Returns the number of hsra application license issuances where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching hsra application license issuances
	 */
	public int countBygetHSRA_lic_iss_By_CID(String caseId);

	/**
	 * Returns the hsra application license issuance where licenseNumber = &#63; or throws a <code>NoSuchHSRAApplicationLicenseIssuanceException</code> if it could not be found.
	 *
	 * @param licenseNumber the license number
	 * @return the matching hsra application license issuance
	 * @throws NoSuchHSRAApplicationLicenseIssuanceException if a matching hsra application license issuance could not be found
	 */
	public HSRAApplicationLicenseIssuance findBygetHSRA_lic_iss_By_LN(
			String licenseNumber)
		throws NoSuchHSRAApplicationLicenseIssuanceException;

	/**
	 * Returns the hsra application license issuance where licenseNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param licenseNumber the license number
	 * @return the matching hsra application license issuance, or <code>null</code> if a matching hsra application license issuance could not be found
	 */
	public HSRAApplicationLicenseIssuance fetchBygetHSRA_lic_iss_By_LN(
		String licenseNumber);

	/**
	 * Returns the hsra application license issuance where licenseNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param licenseNumber the license number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application license issuance, or <code>null</code> if a matching hsra application license issuance could not be found
	 */
	public HSRAApplicationLicenseIssuance fetchBygetHSRA_lic_iss_By_LN(
		String licenseNumber, boolean useFinderCache);

	/**
	 * Removes the hsra application license issuance where licenseNumber = &#63; from the database.
	 *
	 * @param licenseNumber the license number
	 * @return the hsra application license issuance that was removed
	 */
	public HSRAApplicationLicenseIssuance removeBygetHSRA_lic_iss_By_LN(
			String licenseNumber)
		throws NoSuchHSRAApplicationLicenseIssuanceException;

	/**
	 * Returns the number of hsra application license issuances where licenseNumber = &#63;.
	 *
	 * @param licenseNumber the license number
	 * @return the number of matching hsra application license issuances
	 */
	public int countBygetHSRA_lic_iss_By_LN(String licenseNumber);

	/**
	 * Caches the hsra application license issuance in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationLicenseIssuance the hsra application license issuance
	 */
	public void cacheResult(
		HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance);

	/**
	 * Caches the hsra application license issuances in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationLicenseIssuances the hsra application license issuances
	 */
	public void cacheResult(
		java.util.List<HSRAApplicationLicenseIssuance>
			hsraApplicationLicenseIssuances);

	/**
	 * Creates a new hsra application license issuance with the primary key. Does not add the hsra application license issuance to the database.
	 *
	 * @param hsraFullLicenseId the primary key for the new hsra application license issuance
	 * @return the new hsra application license issuance
	 */
	public HSRAApplicationLicenseIssuance create(long hsraFullLicenseId);

	/**
	 * Removes the hsra application license issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param hsraFullLicenseId the primary key of the hsra application license issuance
	 * @return the hsra application license issuance that was removed
	 * @throws NoSuchHSRAApplicationLicenseIssuanceException if a hsra application license issuance with the primary key could not be found
	 */
	public HSRAApplicationLicenseIssuance remove(long hsraFullLicenseId)
		throws NoSuchHSRAApplicationLicenseIssuanceException;

	public HSRAApplicationLicenseIssuance updateImpl(
		HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance);

	/**
	 * Returns the hsra application license issuance with the primary key or throws a <code>NoSuchHSRAApplicationLicenseIssuanceException</code> if it could not be found.
	 *
	 * @param hsraFullLicenseId the primary key of the hsra application license issuance
	 * @return the hsra application license issuance
	 * @throws NoSuchHSRAApplicationLicenseIssuanceException if a hsra application license issuance with the primary key could not be found
	 */
	public HSRAApplicationLicenseIssuance findByPrimaryKey(
			long hsraFullLicenseId)
		throws NoSuchHSRAApplicationLicenseIssuanceException;

	/**
	 * Returns the hsra application license issuance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param hsraFullLicenseId the primary key of the hsra application license issuance
	 * @return the hsra application license issuance, or <code>null</code> if a hsra application license issuance with the primary key could not be found
	 */
	public HSRAApplicationLicenseIssuance fetchByPrimaryKey(
		long hsraFullLicenseId);

	/**
	 * Returns all the hsra application license issuances.
	 *
	 * @return the hsra application license issuances
	 */
	public java.util.List<HSRAApplicationLicenseIssuance> findAll();

	/**
	 * Returns a range of all the hsra application license issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application license issuances
	 * @param end the upper bound of the range of hsra application license issuances (not inclusive)
	 * @return the range of hsra application license issuances
	 */
	public java.util.List<HSRAApplicationLicenseIssuance> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the hsra application license issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application license issuances
	 * @param end the upper bound of the range of hsra application license issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of hsra application license issuances
	 */
	public java.util.List<HSRAApplicationLicenseIssuance> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HSRAApplicationLicenseIssuance> orderByComparator);

	/**
	 * Returns an ordered range of all the hsra application license issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application license issuances
	 * @param end the upper bound of the range of hsra application license issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of hsra application license issuances
	 */
	public java.util.List<HSRAApplicationLicenseIssuance> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HSRAApplicationLicenseIssuance> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the hsra application license issuances from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of hsra application license issuances.
	 *
	 * @return the number of hsra application license issuances
	 */
	public int countAll();

}