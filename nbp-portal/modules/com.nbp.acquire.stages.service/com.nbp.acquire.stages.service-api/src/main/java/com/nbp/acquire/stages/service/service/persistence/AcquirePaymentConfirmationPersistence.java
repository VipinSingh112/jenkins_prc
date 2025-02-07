/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.acquire.stages.service.exception.NoSuchAcquirePaymentConfirmationException;
import com.nbp.acquire.stages.service.model.AcquirePaymentConfirmation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acquire payment confirmation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquirePaymentConfirmationUtil
 * @generated
 */
@ProviderType
public interface AcquirePaymentConfirmationPersistence
	extends BasePersistence<AcquirePaymentConfirmation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AcquirePaymentConfirmationUtil} to access the acquire payment confirmation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the acquire payment confirmation where caseId = &#63; or throws a <code>NoSuchAcquirePaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire payment confirmation
	 * @throws NoSuchAcquirePaymentConfirmationException if a matching acquire payment confirmation could not be found
	 */
	public AcquirePaymentConfirmation findBygetAcquirePaymentConfirmationBy_CI(
			String caseId)
		throws NoSuchAcquirePaymentConfirmationException;

	/**
	 * Returns the acquire payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire payment confirmation, or <code>null</code> if a matching acquire payment confirmation could not be found
	 */
	public AcquirePaymentConfirmation fetchBygetAcquirePaymentConfirmationBy_CI(
		String caseId);

	/**
	 * Returns the acquire payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire payment confirmation, or <code>null</code> if a matching acquire payment confirmation could not be found
	 */
	public AcquirePaymentConfirmation fetchBygetAcquirePaymentConfirmationBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the acquire payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the acquire payment confirmation that was removed
	 */
	public AcquirePaymentConfirmation
			removeBygetAcquirePaymentConfirmationBy_CI(String caseId)
		throws NoSuchAcquirePaymentConfirmationException;

	/**
	 * Returns the number of acquire payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire payment confirmations
	 */
	public int countBygetAcquirePaymentConfirmationBy_CI(String caseId);

	/**
	 * Returns all the acquire payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire payment confirmations
	 */
	public java.util.List<AcquirePaymentConfirmation>
		findBygetAcquirePaymentConfirmations_By_CI(String caseId);

	/**
	 * Returns a range of all the acquire payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of acquire payment confirmations
	 * @param end the upper bound of the range of acquire payment confirmations (not inclusive)
	 * @return the range of matching acquire payment confirmations
	 */
	public java.util.List<AcquirePaymentConfirmation>
		findBygetAcquirePaymentConfirmations_By_CI(
			String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the acquire payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of acquire payment confirmations
	 * @param end the upper bound of the range of acquire payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acquire payment confirmations
	 */
	public java.util.List<AcquirePaymentConfirmation>
		findBygetAcquirePaymentConfirmations_By_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<AcquirePaymentConfirmation> orderByComparator);

	/**
	 * Returns an ordered range of all the acquire payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of acquire payment confirmations
	 * @param end the upper bound of the range of acquire payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acquire payment confirmations
	 */
	public java.util.List<AcquirePaymentConfirmation>
		findBygetAcquirePaymentConfirmations_By_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<AcquirePaymentConfirmation> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first acquire payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire payment confirmation
	 * @throws NoSuchAcquirePaymentConfirmationException if a matching acquire payment confirmation could not be found
	 */
	public AcquirePaymentConfirmation
			findBygetAcquirePaymentConfirmations_By_CI_First(
				String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<AcquirePaymentConfirmation> orderByComparator)
		throws NoSuchAcquirePaymentConfirmationException;

	/**
	 * Returns the first acquire payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire payment confirmation, or <code>null</code> if a matching acquire payment confirmation could not be found
	 */
	public AcquirePaymentConfirmation
		fetchBygetAcquirePaymentConfirmations_By_CI_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AcquirePaymentConfirmation> orderByComparator);

	/**
	 * Returns the last acquire payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire payment confirmation
	 * @throws NoSuchAcquirePaymentConfirmationException if a matching acquire payment confirmation could not be found
	 */
	public AcquirePaymentConfirmation
			findBygetAcquirePaymentConfirmations_By_CI_Last(
				String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<AcquirePaymentConfirmation> orderByComparator)
		throws NoSuchAcquirePaymentConfirmationException;

	/**
	 * Returns the last acquire payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire payment confirmation, or <code>null</code> if a matching acquire payment confirmation could not be found
	 */
	public AcquirePaymentConfirmation
		fetchBygetAcquirePaymentConfirmations_By_CI_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AcquirePaymentConfirmation> orderByComparator);

	/**
	 * Returns the acquire payment confirmations before and after the current acquire payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param acquirePaymentId the primary key of the current acquire payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire payment confirmation
	 * @throws NoSuchAcquirePaymentConfirmationException if a acquire payment confirmation with the primary key could not be found
	 */
	public AcquirePaymentConfirmation[]
			findBygetAcquirePaymentConfirmations_By_CI_PrevAndNext(
				long acquirePaymentId, String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<AcquirePaymentConfirmation> orderByComparator)
		throws NoSuchAcquirePaymentConfirmationException;

	/**
	 * Removes all the acquire payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetAcquirePaymentConfirmations_By_CI(String caseId);

	/**
	 * Returns the number of acquire payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire payment confirmations
	 */
	public int countBygetAcquirePaymentConfirmations_By_CI(String caseId);

	/**
	 * Caches the acquire payment confirmation in the entity cache if it is enabled.
	 *
	 * @param acquirePaymentConfirmation the acquire payment confirmation
	 */
	public void cacheResult(
		AcquirePaymentConfirmation acquirePaymentConfirmation);

	/**
	 * Caches the acquire payment confirmations in the entity cache if it is enabled.
	 *
	 * @param acquirePaymentConfirmations the acquire payment confirmations
	 */
	public void cacheResult(
		java.util.List<AcquirePaymentConfirmation> acquirePaymentConfirmations);

	/**
	 * Creates a new acquire payment confirmation with the primary key. Does not add the acquire payment confirmation to the database.
	 *
	 * @param acquirePaymentId the primary key for the new acquire payment confirmation
	 * @return the new acquire payment confirmation
	 */
	public AcquirePaymentConfirmation create(long acquirePaymentId);

	/**
	 * Removes the acquire payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquirePaymentId the primary key of the acquire payment confirmation
	 * @return the acquire payment confirmation that was removed
	 * @throws NoSuchAcquirePaymentConfirmationException if a acquire payment confirmation with the primary key could not be found
	 */
	public AcquirePaymentConfirmation remove(long acquirePaymentId)
		throws NoSuchAcquirePaymentConfirmationException;

	public AcquirePaymentConfirmation updateImpl(
		AcquirePaymentConfirmation acquirePaymentConfirmation);

	/**
	 * Returns the acquire payment confirmation with the primary key or throws a <code>NoSuchAcquirePaymentConfirmationException</code> if it could not be found.
	 *
	 * @param acquirePaymentId the primary key of the acquire payment confirmation
	 * @return the acquire payment confirmation
	 * @throws NoSuchAcquirePaymentConfirmationException if a acquire payment confirmation with the primary key could not be found
	 */
	public AcquirePaymentConfirmation findByPrimaryKey(long acquirePaymentId)
		throws NoSuchAcquirePaymentConfirmationException;

	/**
	 * Returns the acquire payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquirePaymentId the primary key of the acquire payment confirmation
	 * @return the acquire payment confirmation, or <code>null</code> if a acquire payment confirmation with the primary key could not be found
	 */
	public AcquirePaymentConfirmation fetchByPrimaryKey(long acquirePaymentId);

	/**
	 * Returns all the acquire payment confirmations.
	 *
	 * @return the acquire payment confirmations
	 */
	public java.util.List<AcquirePaymentConfirmation> findAll();

	/**
	 * Returns a range of all the acquire payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire payment confirmations
	 * @param end the upper bound of the range of acquire payment confirmations (not inclusive)
	 * @return the range of acquire payment confirmations
	 */
	public java.util.List<AcquirePaymentConfirmation> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the acquire payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire payment confirmations
	 * @param end the upper bound of the range of acquire payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire payment confirmations
	 */
	public java.util.List<AcquirePaymentConfirmation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AcquirePaymentConfirmation> orderByComparator);

	/**
	 * Returns an ordered range of all the acquire payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire payment confirmations
	 * @param end the upper bound of the range of acquire payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire payment confirmations
	 */
	public java.util.List<AcquirePaymentConfirmation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AcquirePaymentConfirmation> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acquire payment confirmations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acquire payment confirmations.
	 *
	 * @return the number of acquire payment confirmations
	 */
	public int countAll();

}