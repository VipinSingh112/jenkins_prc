/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncra.stages.services.exception.NoSuchCertificateOfVerificationException;
import com.nbp.ncra.stages.services.model.CertificateOfVerification;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the certificate of verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CertificateOfVerificationUtil
 * @generated
 */
@ProviderType
public interface CertificateOfVerificationPersistence
	extends BasePersistence<CertificateOfVerification> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CertificateOfVerificationUtil} to access the certificate of verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the certificate of verification where caseId = &#63; or throws a <code>NoSuchCertificateOfVerificationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching certificate of verification
	 * @throws NoSuchCertificateOfVerificationException if a matching certificate of verification could not be found
	 */
	public CertificateOfVerification findBygetNcra_By_CaseId(String caseId)
		throws NoSuchCertificateOfVerificationException;

	/**
	 * Returns the certificate of verification where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching certificate of verification, or <code>null</code> if a matching certificate of verification could not be found
	 */
	public CertificateOfVerification fetchBygetNcra_By_CaseId(String caseId);

	/**
	 * Returns the certificate of verification where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching certificate of verification, or <code>null</code> if a matching certificate of verification could not be found
	 */
	public CertificateOfVerification fetchBygetNcra_By_CaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the certificate of verification where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the certificate of verification that was removed
	 */
	public CertificateOfVerification removeBygetNcra_By_CaseId(String caseId)
		throws NoSuchCertificateOfVerificationException;

	/**
	 * Returns the number of certificate of verifications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching certificate of verifications
	 */
	public int countBygetNcra_By_CaseId(String caseId);

	/**
	 * Caches the certificate of verification in the entity cache if it is enabled.
	 *
	 * @param certificateOfVerification the certificate of verification
	 */
	public void cacheResult(
		CertificateOfVerification certificateOfVerification);

	/**
	 * Caches the certificate of verifications in the entity cache if it is enabled.
	 *
	 * @param certificateOfVerifications the certificate of verifications
	 */
	public void cacheResult(
		java.util.List<CertificateOfVerification> certificateOfVerifications);

	/**
	 * Creates a new certificate of verification with the primary key. Does not add the certificate of verification to the database.
	 *
	 * @param certificateOfVerificationId the primary key for the new certificate of verification
	 * @return the new certificate of verification
	 */
	public CertificateOfVerification create(long certificateOfVerificationId);

	/**
	 * Removes the certificate of verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param certificateOfVerificationId the primary key of the certificate of verification
	 * @return the certificate of verification that was removed
	 * @throws NoSuchCertificateOfVerificationException if a certificate of verification with the primary key could not be found
	 */
	public CertificateOfVerification remove(long certificateOfVerificationId)
		throws NoSuchCertificateOfVerificationException;

	public CertificateOfVerification updateImpl(
		CertificateOfVerification certificateOfVerification);

	/**
	 * Returns the certificate of verification with the primary key or throws a <code>NoSuchCertificateOfVerificationException</code> if it could not be found.
	 *
	 * @param certificateOfVerificationId the primary key of the certificate of verification
	 * @return the certificate of verification
	 * @throws NoSuchCertificateOfVerificationException if a certificate of verification with the primary key could not be found
	 */
	public CertificateOfVerification findByPrimaryKey(
			long certificateOfVerificationId)
		throws NoSuchCertificateOfVerificationException;

	/**
	 * Returns the certificate of verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param certificateOfVerificationId the primary key of the certificate of verification
	 * @return the certificate of verification, or <code>null</code> if a certificate of verification with the primary key could not be found
	 */
	public CertificateOfVerification fetchByPrimaryKey(
		long certificateOfVerificationId);

	/**
	 * Returns all the certificate of verifications.
	 *
	 * @return the certificate of verifications
	 */
	public java.util.List<CertificateOfVerification> findAll();

	/**
	 * Returns a range of all the certificate of verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CertificateOfVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of certificate of verifications
	 * @param end the upper bound of the range of certificate of verifications (not inclusive)
	 * @return the range of certificate of verifications
	 */
	public java.util.List<CertificateOfVerification> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the certificate of verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CertificateOfVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of certificate of verifications
	 * @param end the upper bound of the range of certificate of verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of certificate of verifications
	 */
	public java.util.List<CertificateOfVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CertificateOfVerification> orderByComparator);

	/**
	 * Returns an ordered range of all the certificate of verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CertificateOfVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of certificate of verifications
	 * @param end the upper bound of the range of certificate of verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of certificate of verifications
	 */
	public java.util.List<CertificateOfVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CertificateOfVerification> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the certificate of verifications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of certificate of verifications.
	 *
	 * @return the number of certificate of verifications
	 */
	public int countAll();

}