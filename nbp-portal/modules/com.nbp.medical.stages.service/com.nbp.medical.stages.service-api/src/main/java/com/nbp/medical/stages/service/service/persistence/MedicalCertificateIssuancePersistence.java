/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.stages.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.medical.stages.service.exception.NoSuchMedicalCertificateIssuanceException;
import com.nbp.medical.stages.service.model.MedicalCertificateIssuance;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the medical certificate issuance service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalCertificateIssuanceUtil
 * @generated
 */
@ProviderType
public interface MedicalCertificateIssuancePersistence
	extends BasePersistence<MedicalCertificateIssuance> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MedicalCertificateIssuanceUtil} to access the medical certificate issuance persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the medical certificate issuance where caseId = &#63; or throws a <code>NoSuchMedicalCertificateIssuanceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching medical certificate issuance
	 * @throws NoSuchMedicalCertificateIssuanceException if a matching medical certificate issuance could not be found
	 */
	public MedicalCertificateIssuance findBygetMedical_Issuance_By_CI(
			String caseId)
		throws NoSuchMedicalCertificateIssuanceException;

	/**
	 * Returns the medical certificate issuance where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching medical certificate issuance, or <code>null</code> if a matching medical certificate issuance could not be found
	 */
	public MedicalCertificateIssuance fetchBygetMedical_Issuance_By_CI(
		String caseId);

	/**
	 * Returns the medical certificate issuance where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical certificate issuance, or <code>null</code> if a matching medical certificate issuance could not be found
	 */
	public MedicalCertificateIssuance fetchBygetMedical_Issuance_By_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the medical certificate issuance where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the medical certificate issuance that was removed
	 */
	public MedicalCertificateIssuance removeBygetMedical_Issuance_By_CI(
			String caseId)
		throws NoSuchMedicalCertificateIssuanceException;

	/**
	 * Returns the number of medical certificate issuances where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching medical certificate issuances
	 */
	public int countBygetMedical_Issuance_By_CI(String caseId);

	/**
	 * Caches the medical certificate issuance in the entity cache if it is enabled.
	 *
	 * @param medicalCertificateIssuance the medical certificate issuance
	 */
	public void cacheResult(
		MedicalCertificateIssuance medicalCertificateIssuance);

	/**
	 * Caches the medical certificate issuances in the entity cache if it is enabled.
	 *
	 * @param medicalCertificateIssuances the medical certificate issuances
	 */
	public void cacheResult(
		java.util.List<MedicalCertificateIssuance> medicalCertificateIssuances);

	/**
	 * Creates a new medical certificate issuance with the primary key. Does not add the medical certificate issuance to the database.
	 *
	 * @param medicalCertificateIssuanceId the primary key for the new medical certificate issuance
	 * @return the new medical certificate issuance
	 */
	public MedicalCertificateIssuance create(long medicalCertificateIssuanceId);

	/**
	 * Removes the medical certificate issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalCertificateIssuanceId the primary key of the medical certificate issuance
	 * @return the medical certificate issuance that was removed
	 * @throws NoSuchMedicalCertificateIssuanceException if a medical certificate issuance with the primary key could not be found
	 */
	public MedicalCertificateIssuance remove(long medicalCertificateIssuanceId)
		throws NoSuchMedicalCertificateIssuanceException;

	public MedicalCertificateIssuance updateImpl(
		MedicalCertificateIssuance medicalCertificateIssuance);

	/**
	 * Returns the medical certificate issuance with the primary key or throws a <code>NoSuchMedicalCertificateIssuanceException</code> if it could not be found.
	 *
	 * @param medicalCertificateIssuanceId the primary key of the medical certificate issuance
	 * @return the medical certificate issuance
	 * @throws NoSuchMedicalCertificateIssuanceException if a medical certificate issuance with the primary key could not be found
	 */
	public MedicalCertificateIssuance findByPrimaryKey(
			long medicalCertificateIssuanceId)
		throws NoSuchMedicalCertificateIssuanceException;

	/**
	 * Returns the medical certificate issuance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalCertificateIssuanceId the primary key of the medical certificate issuance
	 * @return the medical certificate issuance, or <code>null</code> if a medical certificate issuance with the primary key could not be found
	 */
	public MedicalCertificateIssuance fetchByPrimaryKey(
		long medicalCertificateIssuanceId);

	/**
	 * Returns all the medical certificate issuances.
	 *
	 * @return the medical certificate issuances
	 */
	public java.util.List<MedicalCertificateIssuance> findAll();

	/**
	 * Returns a range of all the medical certificate issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical certificate issuances
	 * @param end the upper bound of the range of medical certificate issuances (not inclusive)
	 * @return the range of medical certificate issuances
	 */
	public java.util.List<MedicalCertificateIssuance> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the medical certificate issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical certificate issuances
	 * @param end the upper bound of the range of medical certificate issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical certificate issuances
	 */
	public java.util.List<MedicalCertificateIssuance> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalCertificateIssuance> orderByComparator);

	/**
	 * Returns an ordered range of all the medical certificate issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical certificate issuances
	 * @param end the upper bound of the range of medical certificate issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical certificate issuances
	 */
	public java.util.List<MedicalCertificateIssuance> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalCertificateIssuance> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the medical certificate issuances from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of medical certificate issuances.
	 *
	 * @return the number of medical certificate issuances
	 */
	public int countAll();

}