/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.pharmaceutical.stages.services.exception.NoSuchPharmaPaymentConfirmationException;
import com.nbp.pharmaceutical.stages.services.model.PharmaPaymentConfirmation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the pharma payment confirmation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaPaymentConfirmationUtil
 * @generated
 */
@ProviderType
public interface PharmaPaymentConfirmationPersistence
	extends BasePersistence<PharmaPaymentConfirmation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PharmaPaymentConfirmationUtil} to access the pharma payment confirmation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the pharma payment confirmation where caseId = &#63; or throws a <code>NoSuchPharmaPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching pharma payment confirmation
	 * @throws NoSuchPharmaPaymentConfirmationException if a matching pharma payment confirmation could not be found
	 */
	public PharmaPaymentConfirmation findBygetPaymentConfirmationBy_CI(
			String caseId)
		throws NoSuchPharmaPaymentConfirmationException;

	/**
	 * Returns the pharma payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching pharma payment confirmation, or <code>null</code> if a matching pharma payment confirmation could not be found
	 */
	public PharmaPaymentConfirmation fetchBygetPaymentConfirmationBy_CI(
		String caseId);

	/**
	 * Returns the pharma payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma payment confirmation, or <code>null</code> if a matching pharma payment confirmation could not be found
	 */
	public PharmaPaymentConfirmation fetchBygetPaymentConfirmationBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the pharma payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the pharma payment confirmation that was removed
	 */
	public PharmaPaymentConfirmation removeBygetPaymentConfirmationBy_CI(
			String caseId)
		throws NoSuchPharmaPaymentConfirmationException;

	/**
	 * Returns the number of pharma payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching pharma payment confirmations
	 */
	public int countBygetPaymentConfirmationBy_CI(String caseId);

	/**
	 * Returns all the pharma payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching pharma payment confirmations
	 */
	public java.util.List<PharmaPaymentConfirmation>
		findBygetPaymentConfirmation_By_CI(String caseId);

	/**
	 * Returns a range of all the pharma payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma payment confirmations
	 * @param end the upper bound of the range of pharma payment confirmations (not inclusive)
	 * @return the range of matching pharma payment confirmations
	 */
	public java.util.List<PharmaPaymentConfirmation>
		findBygetPaymentConfirmation_By_CI(String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the pharma payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma payment confirmations
	 * @param end the upper bound of the range of pharma payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma payment confirmations
	 */
	public java.util.List<PharmaPaymentConfirmation>
		findBygetPaymentConfirmation_By_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaPaymentConfirmation> orderByComparator);

	/**
	 * Returns an ordered range of all the pharma payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma payment confirmations
	 * @param end the upper bound of the range of pharma payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma payment confirmations
	 */
	public java.util.List<PharmaPaymentConfirmation>
		findBygetPaymentConfirmation_By_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaPaymentConfirmation> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first pharma payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma payment confirmation
	 * @throws NoSuchPharmaPaymentConfirmationException if a matching pharma payment confirmation could not be found
	 */
	public PharmaPaymentConfirmation findBygetPaymentConfirmation_By_CI_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaPaymentConfirmation> orderByComparator)
		throws NoSuchPharmaPaymentConfirmationException;

	/**
	 * Returns the first pharma payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma payment confirmation, or <code>null</code> if a matching pharma payment confirmation could not be found
	 */
	public PharmaPaymentConfirmation fetchBygetPaymentConfirmation_By_CI_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaPaymentConfirmation> orderByComparator);

	/**
	 * Returns the last pharma payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma payment confirmation
	 * @throws NoSuchPharmaPaymentConfirmationException if a matching pharma payment confirmation could not be found
	 */
	public PharmaPaymentConfirmation findBygetPaymentConfirmation_By_CI_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaPaymentConfirmation> orderByComparator)
		throws NoSuchPharmaPaymentConfirmationException;

	/**
	 * Returns the last pharma payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma payment confirmation, or <code>null</code> if a matching pharma payment confirmation could not be found
	 */
	public PharmaPaymentConfirmation fetchBygetPaymentConfirmation_By_CI_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaPaymentConfirmation> orderByComparator);

	/**
	 * Returns the pharma payment confirmations before and after the current pharma payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param pharmaPaymentId the primary key of the current pharma payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma payment confirmation
	 * @throws NoSuchPharmaPaymentConfirmationException if a pharma payment confirmation with the primary key could not be found
	 */
	public PharmaPaymentConfirmation[]
			findBygetPaymentConfirmation_By_CI_PrevAndNext(
				long pharmaPaymentId, String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<PharmaPaymentConfirmation> orderByComparator)
		throws NoSuchPharmaPaymentConfirmationException;

	/**
	 * Removes all the pharma payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetPaymentConfirmation_By_CI(String caseId);

	/**
	 * Returns the number of pharma payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching pharma payment confirmations
	 */
	public int countBygetPaymentConfirmation_By_CI(String caseId);

	/**
	 * Caches the pharma payment confirmation in the entity cache if it is enabled.
	 *
	 * @param pharmaPaymentConfirmation the pharma payment confirmation
	 */
	public void cacheResult(
		PharmaPaymentConfirmation pharmaPaymentConfirmation);

	/**
	 * Caches the pharma payment confirmations in the entity cache if it is enabled.
	 *
	 * @param pharmaPaymentConfirmations the pharma payment confirmations
	 */
	public void cacheResult(
		java.util.List<PharmaPaymentConfirmation> pharmaPaymentConfirmations);

	/**
	 * Creates a new pharma payment confirmation with the primary key. Does not add the pharma payment confirmation to the database.
	 *
	 * @param pharmaPaymentId the primary key for the new pharma payment confirmation
	 * @return the new pharma payment confirmation
	 */
	public PharmaPaymentConfirmation create(long pharmaPaymentId);

	/**
	 * Removes the pharma payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaPaymentId the primary key of the pharma payment confirmation
	 * @return the pharma payment confirmation that was removed
	 * @throws NoSuchPharmaPaymentConfirmationException if a pharma payment confirmation with the primary key could not be found
	 */
	public PharmaPaymentConfirmation remove(long pharmaPaymentId)
		throws NoSuchPharmaPaymentConfirmationException;

	public PharmaPaymentConfirmation updateImpl(
		PharmaPaymentConfirmation pharmaPaymentConfirmation);

	/**
	 * Returns the pharma payment confirmation with the primary key or throws a <code>NoSuchPharmaPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param pharmaPaymentId the primary key of the pharma payment confirmation
	 * @return the pharma payment confirmation
	 * @throws NoSuchPharmaPaymentConfirmationException if a pharma payment confirmation with the primary key could not be found
	 */
	public PharmaPaymentConfirmation findByPrimaryKey(long pharmaPaymentId)
		throws NoSuchPharmaPaymentConfirmationException;

	/**
	 * Returns the pharma payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaPaymentId the primary key of the pharma payment confirmation
	 * @return the pharma payment confirmation, or <code>null</code> if a pharma payment confirmation with the primary key could not be found
	 */
	public PharmaPaymentConfirmation fetchByPrimaryKey(long pharmaPaymentId);

	/**
	 * Returns all the pharma payment confirmations.
	 *
	 * @return the pharma payment confirmations
	 */
	public java.util.List<PharmaPaymentConfirmation> findAll();

	/**
	 * Returns a range of all the pharma payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma payment confirmations
	 * @param end the upper bound of the range of pharma payment confirmations (not inclusive)
	 * @return the range of pharma payment confirmations
	 */
	public java.util.List<PharmaPaymentConfirmation> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the pharma payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma payment confirmations
	 * @param end the upper bound of the range of pharma payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma payment confirmations
	 */
	public java.util.List<PharmaPaymentConfirmation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaPaymentConfirmation> orderByComparator);

	/**
	 * Returns an ordered range of all the pharma payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma payment confirmations
	 * @param end the upper bound of the range of pharma payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma payment confirmations
	 */
	public java.util.List<PharmaPaymentConfirmation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaPaymentConfirmation> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the pharma payment confirmations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of pharma payment confirmations.
	 *
	 * @return the number of pharma payment confirmations
	 */
	public int countAll();

}