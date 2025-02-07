/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.wra.stage.service.exception.NoSuchWraCertificateIssuanceException;
import com.nbp.wra.stage.service.model.WraCertificateIssuance;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the wra certificate issuance service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WraCertificateIssuanceUtil
 * @generated
 */
@ProviderType
public interface WraCertificateIssuancePersistence
	extends BasePersistence<WraCertificateIssuance> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link WraCertificateIssuanceUtil} to access the wra certificate issuance persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the wra certificate issuance where caseId = &#63; or throws a <code>NoSuchWraCertificateIssuanceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching wra certificate issuance
	 * @throws NoSuchWraCertificateIssuanceException if a matching wra certificate issuance could not be found
	 */
	public WraCertificateIssuance findBygetWra_Issuance_By_CI(String caseId)
		throws NoSuchWraCertificateIssuanceException;

	/**
	 * Returns the wra certificate issuance where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching wra certificate issuance, or <code>null</code> if a matching wra certificate issuance could not be found
	 */
	public WraCertificateIssuance fetchBygetWra_Issuance_By_CI(String caseId);

	/**
	 * Returns the wra certificate issuance where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra certificate issuance, or <code>null</code> if a matching wra certificate issuance could not be found
	 */
	public WraCertificateIssuance fetchBygetWra_Issuance_By_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the wra certificate issuance where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the wra certificate issuance that was removed
	 */
	public WraCertificateIssuance removeBygetWra_Issuance_By_CI(String caseId)
		throws NoSuchWraCertificateIssuanceException;

	/**
	 * Returns the number of wra certificate issuances where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching wra certificate issuances
	 */
	public int countBygetWra_Issuance_By_CI(String caseId);

	/**
	 * Caches the wra certificate issuance in the entity cache if it is enabled.
	 *
	 * @param wraCertificateIssuance the wra certificate issuance
	 */
	public void cacheResult(WraCertificateIssuance wraCertificateIssuance);

	/**
	 * Caches the wra certificate issuances in the entity cache if it is enabled.
	 *
	 * @param wraCertificateIssuances the wra certificate issuances
	 */
	public void cacheResult(
		java.util.List<WraCertificateIssuance> wraCertificateIssuances);

	/**
	 * Creates a new wra certificate issuance with the primary key. Does not add the wra certificate issuance to the database.
	 *
	 * @param wraCertificateIssuanceId the primary key for the new wra certificate issuance
	 * @return the new wra certificate issuance
	 */
	public WraCertificateIssuance create(long wraCertificateIssuanceId);

	/**
	 * Removes the wra certificate issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wraCertificateIssuanceId the primary key of the wra certificate issuance
	 * @return the wra certificate issuance that was removed
	 * @throws NoSuchWraCertificateIssuanceException if a wra certificate issuance with the primary key could not be found
	 */
	public WraCertificateIssuance remove(long wraCertificateIssuanceId)
		throws NoSuchWraCertificateIssuanceException;

	public WraCertificateIssuance updateImpl(
		WraCertificateIssuance wraCertificateIssuance);

	/**
	 * Returns the wra certificate issuance with the primary key or throws a <code>NoSuchWraCertificateIssuanceException</code> if it could not be found.
	 *
	 * @param wraCertificateIssuanceId the primary key of the wra certificate issuance
	 * @return the wra certificate issuance
	 * @throws NoSuchWraCertificateIssuanceException if a wra certificate issuance with the primary key could not be found
	 */
	public WraCertificateIssuance findByPrimaryKey(
			long wraCertificateIssuanceId)
		throws NoSuchWraCertificateIssuanceException;

	/**
	 * Returns the wra certificate issuance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wraCertificateIssuanceId the primary key of the wra certificate issuance
	 * @return the wra certificate issuance, or <code>null</code> if a wra certificate issuance with the primary key could not be found
	 */
	public WraCertificateIssuance fetchByPrimaryKey(
		long wraCertificateIssuanceId);

	/**
	 * Returns all the wra certificate issuances.
	 *
	 * @return the wra certificate issuances
	 */
	public java.util.List<WraCertificateIssuance> findAll();

	/**
	 * Returns a range of all the wra certificate issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra certificate issuances
	 * @param end the upper bound of the range of wra certificate issuances (not inclusive)
	 * @return the range of wra certificate issuances
	 */
	public java.util.List<WraCertificateIssuance> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the wra certificate issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra certificate issuances
	 * @param end the upper bound of the range of wra certificate issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wra certificate issuances
	 */
	public java.util.List<WraCertificateIssuance> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WraCertificateIssuance>
			orderByComparator);

	/**
	 * Returns an ordered range of all the wra certificate issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra certificate issuances
	 * @param end the upper bound of the range of wra certificate issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of wra certificate issuances
	 */
	public java.util.List<WraCertificateIssuance> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WraCertificateIssuance>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the wra certificate issuances from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of wra certificate issuances.
	 *
	 * @return the number of wra certificate issuances
	 */
	public int countAll();

}