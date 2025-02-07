/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.stage.services.exception.NoSuchOsiInsolvencyPaymentConfirmationException;
import com.nbp.osi.insolvency.stage.services.model.OsiInsolvencyPaymentConfirmation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi insolvency payment confirmation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvencyPaymentConfirmationUtil
 * @generated
 */
@ProviderType
public interface OsiInsolvencyPaymentConfirmationPersistence
	extends BasePersistence<OsiInsolvencyPaymentConfirmation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OsiInsolvencyPaymentConfirmationUtil} to access the osi insolvency payment confirmation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the osi insolvency payment confirmation where caseId = &#63; or throws a <code>NoSuchOsiInsolvencyPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching osi insolvency payment confirmation
	 * @throws NoSuchOsiInsolvencyPaymentConfirmationException if a matching osi insolvency payment confirmation could not be found
	 */
	public OsiInsolvencyPaymentConfirmation
			findBygetOSIIRPaymentConfirmationBy_CI(String caseId)
		throws NoSuchOsiInsolvencyPaymentConfirmationException;

	/**
	 * Returns the osi insolvency payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching osi insolvency payment confirmation, or <code>null</code> if a matching osi insolvency payment confirmation could not be found
	 */
	public OsiInsolvencyPaymentConfirmation
		fetchBygetOSIIRPaymentConfirmationBy_CI(String caseId);

	/**
	 * Returns the osi insolvency payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency payment confirmation, or <code>null</code> if a matching osi insolvency payment confirmation could not be found
	 */
	public OsiInsolvencyPaymentConfirmation
		fetchBygetOSIIRPaymentConfirmationBy_CI(
			String caseId, boolean useFinderCache);

	/**
	 * Removes the osi insolvency payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the osi insolvency payment confirmation that was removed
	 */
	public OsiInsolvencyPaymentConfirmation
			removeBygetOSIIRPaymentConfirmationBy_CI(String caseId)
		throws NoSuchOsiInsolvencyPaymentConfirmationException;

	/**
	 * Returns the number of osi insolvency payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi insolvency payment confirmations
	 */
	public int countBygetOSIIRPaymentConfirmationBy_CI(String caseId);

	/**
	 * Returns all the osi insolvency payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching osi insolvency payment confirmations
	 */
	public java.util.List<OsiInsolvencyPaymentConfirmation>
		findBygetOSIIRPaymentConfirmations_By_CI(String caseId);

	/**
	 * Returns a range of all the osi insolvency payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi insolvency payment confirmations
	 * @param end the upper bound of the range of osi insolvency payment confirmations (not inclusive)
	 * @return the range of matching osi insolvency payment confirmations
	 */
	public java.util.List<OsiInsolvencyPaymentConfirmation>
		findBygetOSIIRPaymentConfirmations_By_CI(
			String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the osi insolvency payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi insolvency payment confirmations
	 * @param end the upper bound of the range of osi insolvency payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi insolvency payment confirmations
	 */
	public java.util.List<OsiInsolvencyPaymentConfirmation>
		findBygetOSIIRPaymentConfirmations_By_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyPaymentConfirmation> orderByComparator);

	/**
	 * Returns an ordered range of all the osi insolvency payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi insolvency payment confirmations
	 * @param end the upper bound of the range of osi insolvency payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi insolvency payment confirmations
	 */
	public java.util.List<OsiInsolvencyPaymentConfirmation>
		findBygetOSIIRPaymentConfirmations_By_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyPaymentConfirmation> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first osi insolvency payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency payment confirmation
	 * @throws NoSuchOsiInsolvencyPaymentConfirmationException if a matching osi insolvency payment confirmation could not be found
	 */
	public OsiInsolvencyPaymentConfirmation
			findBygetOSIIRPaymentConfirmations_By_CI_First(
				String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<OsiInsolvencyPaymentConfirmation> orderByComparator)
		throws NoSuchOsiInsolvencyPaymentConfirmationException;

	/**
	 * Returns the first osi insolvency payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency payment confirmation, or <code>null</code> if a matching osi insolvency payment confirmation could not be found
	 */
	public OsiInsolvencyPaymentConfirmation
		fetchBygetOSIIRPaymentConfirmations_By_CI_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyPaymentConfirmation> orderByComparator);

	/**
	 * Returns the last osi insolvency payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency payment confirmation
	 * @throws NoSuchOsiInsolvencyPaymentConfirmationException if a matching osi insolvency payment confirmation could not be found
	 */
	public OsiInsolvencyPaymentConfirmation
			findBygetOSIIRPaymentConfirmations_By_CI_Last(
				String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<OsiInsolvencyPaymentConfirmation> orderByComparator)
		throws NoSuchOsiInsolvencyPaymentConfirmationException;

	/**
	 * Returns the last osi insolvency payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency payment confirmation, or <code>null</code> if a matching osi insolvency payment confirmation could not be found
	 */
	public OsiInsolvencyPaymentConfirmation
		fetchBygetOSIIRPaymentConfirmations_By_CI_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyPaymentConfirmation> orderByComparator);

	/**
	 * Returns the osi insolvency payment confirmations before and after the current osi insolvency payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param osiIRPaymentId the primary key of the current osi insolvency payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi insolvency payment confirmation
	 * @throws NoSuchOsiInsolvencyPaymentConfirmationException if a osi insolvency payment confirmation with the primary key could not be found
	 */
	public OsiInsolvencyPaymentConfirmation[]
			findBygetOSIIRPaymentConfirmations_By_CI_PrevAndNext(
				long osiIRPaymentId, String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<OsiInsolvencyPaymentConfirmation> orderByComparator)
		throws NoSuchOsiInsolvencyPaymentConfirmationException;

	/**
	 * Removes all the osi insolvency payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetOSIIRPaymentConfirmations_By_CI(String caseId);

	/**
	 * Returns the number of osi insolvency payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi insolvency payment confirmations
	 */
	public int countBygetOSIIRPaymentConfirmations_By_CI(String caseId);

	/**
	 * Caches the osi insolvency payment confirmation in the entity cache if it is enabled.
	 *
	 * @param osiInsolvencyPaymentConfirmation the osi insolvency payment confirmation
	 */
	public void cacheResult(
		OsiInsolvencyPaymentConfirmation osiInsolvencyPaymentConfirmation);

	/**
	 * Caches the osi insolvency payment confirmations in the entity cache if it is enabled.
	 *
	 * @param osiInsolvencyPaymentConfirmations the osi insolvency payment confirmations
	 */
	public void cacheResult(
		java.util.List<OsiInsolvencyPaymentConfirmation>
			osiInsolvencyPaymentConfirmations);

	/**
	 * Creates a new osi insolvency payment confirmation with the primary key. Does not add the osi insolvency payment confirmation to the database.
	 *
	 * @param osiIRPaymentId the primary key for the new osi insolvency payment confirmation
	 * @return the new osi insolvency payment confirmation
	 */
	public OsiInsolvencyPaymentConfirmation create(long osiIRPaymentId);

	/**
	 * Removes the osi insolvency payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiIRPaymentId the primary key of the osi insolvency payment confirmation
	 * @return the osi insolvency payment confirmation that was removed
	 * @throws NoSuchOsiInsolvencyPaymentConfirmationException if a osi insolvency payment confirmation with the primary key could not be found
	 */
	public OsiInsolvencyPaymentConfirmation remove(long osiIRPaymentId)
		throws NoSuchOsiInsolvencyPaymentConfirmationException;

	public OsiInsolvencyPaymentConfirmation updateImpl(
		OsiInsolvencyPaymentConfirmation osiInsolvencyPaymentConfirmation);

	/**
	 * Returns the osi insolvency payment confirmation with the primary key or throws a <code>NoSuchOsiInsolvencyPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param osiIRPaymentId the primary key of the osi insolvency payment confirmation
	 * @return the osi insolvency payment confirmation
	 * @throws NoSuchOsiInsolvencyPaymentConfirmationException if a osi insolvency payment confirmation with the primary key could not be found
	 */
	public OsiInsolvencyPaymentConfirmation findByPrimaryKey(
			long osiIRPaymentId)
		throws NoSuchOsiInsolvencyPaymentConfirmationException;

	/**
	 * Returns the osi insolvency payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiIRPaymentId the primary key of the osi insolvency payment confirmation
	 * @return the osi insolvency payment confirmation, or <code>null</code> if a osi insolvency payment confirmation with the primary key could not be found
	 */
	public OsiInsolvencyPaymentConfirmation fetchByPrimaryKey(
		long osiIRPaymentId);

	/**
	 * Returns all the osi insolvency payment confirmations.
	 *
	 * @return the osi insolvency payment confirmations
	 */
	public java.util.List<OsiInsolvencyPaymentConfirmation> findAll();

	/**
	 * Returns a range of all the osi insolvency payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency payment confirmations
	 * @param end the upper bound of the range of osi insolvency payment confirmations (not inclusive)
	 * @return the range of osi insolvency payment confirmations
	 */
	public java.util.List<OsiInsolvencyPaymentConfirmation> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the osi insolvency payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency payment confirmations
	 * @param end the upper bound of the range of osi insolvency payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi insolvency payment confirmations
	 */
	public java.util.List<OsiInsolvencyPaymentConfirmation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolvencyPaymentConfirmation> orderByComparator);

	/**
	 * Returns an ordered range of all the osi insolvency payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency payment confirmations
	 * @param end the upper bound of the range of osi insolvency payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi insolvency payment confirmations
	 */
	public java.util.List<OsiInsolvencyPaymentConfirmation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolvencyPaymentConfirmation> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi insolvency payment confirmations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi insolvency payment confirmations.
	 *
	 * @return the number of osi insolvency payment confirmations
	 */
	public int countAll();

}