/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchOsiAssessmentSignatureException;
import com.nbp.osi.insolvency.application.form.services.model.OsiAssessmentSignature;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi assessment signature service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiAssessmentSignatureUtil
 * @generated
 */
@ProviderType
public interface OsiAssessmentSignaturePersistence
	extends BasePersistence<OsiAssessmentSignature> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OsiAssessmentSignatureUtil} to access the osi assessment signature persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the osi assessment signature where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiAssessmentSignatureException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi assessment signature
	 * @throws NoSuchOsiAssessmentSignatureException if a matching osi assessment signature could not be found
	 */
	public OsiAssessmentSignature findBygetOsiById(long osiInsolvencyId)
		throws NoSuchOsiAssessmentSignatureException;

	/**
	 * Returns the osi assessment signature where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi assessment signature, or <code>null</code> if a matching osi assessment signature could not be found
	 */
	public OsiAssessmentSignature fetchBygetOsiById(long osiInsolvencyId);

	/**
	 * Returns the osi assessment signature where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi assessment signature, or <code>null</code> if a matching osi assessment signature could not be found
	 */
	public OsiAssessmentSignature fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache);

	/**
	 * Removes the osi assessment signature where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi assessment signature that was removed
	 */
	public OsiAssessmentSignature removeBygetOsiById(long osiInsolvencyId)
		throws NoSuchOsiAssessmentSignatureException;

	/**
	 * Returns the number of osi assessment signatures where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi assessment signatures
	 */
	public int countBygetOsiById(long osiInsolvencyId);

	/**
	 * Caches the osi assessment signature in the entity cache if it is enabled.
	 *
	 * @param osiAssessmentSignature the osi assessment signature
	 */
	public void cacheResult(OsiAssessmentSignature osiAssessmentSignature);

	/**
	 * Caches the osi assessment signatures in the entity cache if it is enabled.
	 *
	 * @param osiAssessmentSignatures the osi assessment signatures
	 */
	public void cacheResult(
		java.util.List<OsiAssessmentSignature> osiAssessmentSignatures);

	/**
	 * Creates a new osi assessment signature with the primary key. Does not add the osi assessment signature to the database.
	 *
	 * @param osiAssessmentSignatureId the primary key for the new osi assessment signature
	 * @return the new osi assessment signature
	 */
	public OsiAssessmentSignature create(long osiAssessmentSignatureId);

	/**
	 * Removes the osi assessment signature with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiAssessmentSignatureId the primary key of the osi assessment signature
	 * @return the osi assessment signature that was removed
	 * @throws NoSuchOsiAssessmentSignatureException if a osi assessment signature with the primary key could not be found
	 */
	public OsiAssessmentSignature remove(long osiAssessmentSignatureId)
		throws NoSuchOsiAssessmentSignatureException;

	public OsiAssessmentSignature updateImpl(
		OsiAssessmentSignature osiAssessmentSignature);

	/**
	 * Returns the osi assessment signature with the primary key or throws a <code>NoSuchOsiAssessmentSignatureException</code> if it could not be found.
	 *
	 * @param osiAssessmentSignatureId the primary key of the osi assessment signature
	 * @return the osi assessment signature
	 * @throws NoSuchOsiAssessmentSignatureException if a osi assessment signature with the primary key could not be found
	 */
	public OsiAssessmentSignature findByPrimaryKey(
			long osiAssessmentSignatureId)
		throws NoSuchOsiAssessmentSignatureException;

	/**
	 * Returns the osi assessment signature with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiAssessmentSignatureId the primary key of the osi assessment signature
	 * @return the osi assessment signature, or <code>null</code> if a osi assessment signature with the primary key could not be found
	 */
	public OsiAssessmentSignature fetchByPrimaryKey(
		long osiAssessmentSignatureId);

	/**
	 * Returns all the osi assessment signatures.
	 *
	 * @return the osi assessment signatures
	 */
	public java.util.List<OsiAssessmentSignature> findAll();

	/**
	 * Returns a range of all the osi assessment signatures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiAssessmentSignatureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi assessment signatures
	 * @param end the upper bound of the range of osi assessment signatures (not inclusive)
	 * @return the range of osi assessment signatures
	 */
	public java.util.List<OsiAssessmentSignature> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the osi assessment signatures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiAssessmentSignatureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi assessment signatures
	 * @param end the upper bound of the range of osi assessment signatures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi assessment signatures
	 */
	public java.util.List<OsiAssessmentSignature> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiAssessmentSignature>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi assessment signatures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiAssessmentSignatureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi assessment signatures
	 * @param end the upper bound of the range of osi assessment signatures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi assessment signatures
	 */
	public java.util.List<OsiAssessmentSignature> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiAssessmentSignature>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi assessment signatures from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi assessment signatures.
	 *
	 * @return the number of osi assessment signatures
	 */
	public int countAll();

}