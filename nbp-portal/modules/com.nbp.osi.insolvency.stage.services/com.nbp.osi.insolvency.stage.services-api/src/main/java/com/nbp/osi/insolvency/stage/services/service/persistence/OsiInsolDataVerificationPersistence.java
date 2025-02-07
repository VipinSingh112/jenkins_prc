/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.stage.services.exception.NoSuchOsiInsolDataVerificationException;
import com.nbp.osi.insolvency.stage.services.model.OsiInsolDataVerification;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi insol data verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolDataVerificationUtil
 * @generated
 */
@ProviderType
public interface OsiInsolDataVerificationPersistence
	extends BasePersistence<OsiInsolDataVerification> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OsiInsolDataVerificationUtil} to access the osi insol data verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the osi insol data verification where caseId = &#63; or throws a <code>NoSuchOsiInsolDataVerificationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching osi insol data verification
	 * @throws NoSuchOsiInsolDataVerificationException if a matching osi insol data verification could not be found
	 */
	public OsiInsolDataVerification findBygetOSIIRDataVerificationBy_CI(
			String caseId)
		throws NoSuchOsiInsolDataVerificationException;

	/**
	 * Returns the osi insol data verification where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching osi insol data verification, or <code>null</code> if a matching osi insol data verification could not be found
	 */
	public OsiInsolDataVerification fetchBygetOSIIRDataVerificationBy_CI(
		String caseId);

	/**
	 * Returns the osi insol data verification where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insol data verification, or <code>null</code> if a matching osi insol data verification could not be found
	 */
	public OsiInsolDataVerification fetchBygetOSIIRDataVerificationBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the osi insol data verification where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the osi insol data verification that was removed
	 */
	public OsiInsolDataVerification removeBygetOSIIRDataVerificationBy_CI(
			String caseId)
		throws NoSuchOsiInsolDataVerificationException;

	/**
	 * Returns the number of osi insol data verifications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi insol data verifications
	 */
	public int countBygetOSIIRDataVerificationBy_CI(String caseId);

	/**
	 * Caches the osi insol data verification in the entity cache if it is enabled.
	 *
	 * @param osiInsolDataVerification the osi insol data verification
	 */
	public void cacheResult(OsiInsolDataVerification osiInsolDataVerification);

	/**
	 * Caches the osi insol data verifications in the entity cache if it is enabled.
	 *
	 * @param osiInsolDataVerifications the osi insol data verifications
	 */
	public void cacheResult(
		java.util.List<OsiInsolDataVerification> osiInsolDataVerifications);

	/**
	 * Creates a new osi insol data verification with the primary key. Does not add the osi insol data verification to the database.
	 *
	 * @param osiInsolDataVerificationId the primary key for the new osi insol data verification
	 * @return the new osi insol data verification
	 */
	public OsiInsolDataVerification create(long osiInsolDataVerificationId);

	/**
	 * Removes the osi insol data verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiInsolDataVerificationId the primary key of the osi insol data verification
	 * @return the osi insol data verification that was removed
	 * @throws NoSuchOsiInsolDataVerificationException if a osi insol data verification with the primary key could not be found
	 */
	public OsiInsolDataVerification remove(long osiInsolDataVerificationId)
		throws NoSuchOsiInsolDataVerificationException;

	public OsiInsolDataVerification updateImpl(
		OsiInsolDataVerification osiInsolDataVerification);

	/**
	 * Returns the osi insol data verification with the primary key or throws a <code>NoSuchOsiInsolDataVerificationException</code> if it could not be found.
	 *
	 * @param osiInsolDataVerificationId the primary key of the osi insol data verification
	 * @return the osi insol data verification
	 * @throws NoSuchOsiInsolDataVerificationException if a osi insol data verification with the primary key could not be found
	 */
	public OsiInsolDataVerification findByPrimaryKey(
			long osiInsolDataVerificationId)
		throws NoSuchOsiInsolDataVerificationException;

	/**
	 * Returns the osi insol data verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiInsolDataVerificationId the primary key of the osi insol data verification
	 * @return the osi insol data verification, or <code>null</code> if a osi insol data verification with the primary key could not be found
	 */
	public OsiInsolDataVerification fetchByPrimaryKey(
		long osiInsolDataVerificationId);

	/**
	 * Returns all the osi insol data verifications.
	 *
	 * @return the osi insol data verifications
	 */
	public java.util.List<OsiInsolDataVerification> findAll();

	/**
	 * Returns a range of all the osi insol data verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolDataVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insol data verifications
	 * @param end the upper bound of the range of osi insol data verifications (not inclusive)
	 * @return the range of osi insol data verifications
	 */
	public java.util.List<OsiInsolDataVerification> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the osi insol data verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolDataVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insol data verifications
	 * @param end the upper bound of the range of osi insol data verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi insol data verifications
	 */
	public java.util.List<OsiInsolDataVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolDataVerification> orderByComparator);

	/**
	 * Returns an ordered range of all the osi insol data verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolDataVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insol data verifications
	 * @param end the upper bound of the range of osi insol data verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi insol data verifications
	 */
	public java.util.List<OsiInsolDataVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolDataVerification> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi insol data verifications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi insol data verifications.
	 *
	 * @return the number of osi insol data verifications
	 */
	public int countAll();

}