/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.stage.services.exception.NoSuchHSRAPaymentConfirmationException;
import com.nbp.hsra.stage.services.model.HSRAPaymentConfirmation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the hsra payment confirmation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HSRAPaymentConfirmationUtil
 * @generated
 */
@ProviderType
public interface HSRAPaymentConfirmationPersistence
	extends BasePersistence<HSRAPaymentConfirmation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HSRAPaymentConfirmationUtil} to access the hsra payment confirmation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the hsra payment confirmation where caseId = &#63; or throws a <code>NoSuchHSRAPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra payment confirmation
	 * @throws NoSuchHSRAPaymentConfirmationException if a matching hsra payment confirmation could not be found
	 */
	public HSRAPaymentConfirmation findBygetPaymentConfirmationBy_CI(
			String caseId)
		throws NoSuchHSRAPaymentConfirmationException;

	/**
	 * Returns the hsra payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra payment confirmation, or <code>null</code> if a matching hsra payment confirmation could not be found
	 */
	public HSRAPaymentConfirmation fetchBygetPaymentConfirmationBy_CI(
		String caseId);

	/**
	 * Returns the hsra payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra payment confirmation, or <code>null</code> if a matching hsra payment confirmation could not be found
	 */
	public HSRAPaymentConfirmation fetchBygetPaymentConfirmationBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the hsra payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the hsra payment confirmation that was removed
	 */
	public HSRAPaymentConfirmation removeBygetPaymentConfirmationBy_CI(
			String caseId)
		throws NoSuchHSRAPaymentConfirmationException;

	/**
	 * Returns the number of hsra payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching hsra payment confirmations
	 */
	public int countBygetPaymentConfirmationBy_CI(String caseId);

	/**
	 * Returns all the hsra payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra payment confirmations
	 */
	public java.util.List<HSRAPaymentConfirmation>
		findBygetPaymentConfirmation_By_CI(String caseId);

	/**
	 * Returns a range of all the hsra payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra payment confirmations
	 * @param end the upper bound of the range of hsra payment confirmations (not inclusive)
	 * @return the range of matching hsra payment confirmations
	 */
	public java.util.List<HSRAPaymentConfirmation>
		findBygetPaymentConfirmation_By_CI(String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the hsra payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra payment confirmations
	 * @param end the upper bound of the range of hsra payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra payment confirmations
	 */
	public java.util.List<HSRAPaymentConfirmation>
		findBygetPaymentConfirmation_By_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<HSRAPaymentConfirmation> orderByComparator);

	/**
	 * Returns an ordered range of all the hsra payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra payment confirmations
	 * @param end the upper bound of the range of hsra payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra payment confirmations
	 */
	public java.util.List<HSRAPaymentConfirmation>
		findBygetPaymentConfirmation_By_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<HSRAPaymentConfirmation> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first hsra payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra payment confirmation
	 * @throws NoSuchHSRAPaymentConfirmationException if a matching hsra payment confirmation could not be found
	 */
	public HSRAPaymentConfirmation findBygetPaymentConfirmation_By_CI_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<HSRAPaymentConfirmation> orderByComparator)
		throws NoSuchHSRAPaymentConfirmationException;

	/**
	 * Returns the first hsra payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra payment confirmation, or <code>null</code> if a matching hsra payment confirmation could not be found
	 */
	public HSRAPaymentConfirmation fetchBygetPaymentConfirmation_By_CI_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<HSRAPaymentConfirmation> orderByComparator);

	/**
	 * Returns the last hsra payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra payment confirmation
	 * @throws NoSuchHSRAPaymentConfirmationException if a matching hsra payment confirmation could not be found
	 */
	public HSRAPaymentConfirmation findBygetPaymentConfirmation_By_CI_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<HSRAPaymentConfirmation> orderByComparator)
		throws NoSuchHSRAPaymentConfirmationException;

	/**
	 * Returns the last hsra payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra payment confirmation, or <code>null</code> if a matching hsra payment confirmation could not be found
	 */
	public HSRAPaymentConfirmation fetchBygetPaymentConfirmation_By_CI_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<HSRAPaymentConfirmation> orderByComparator);

	/**
	 * Returns the hsra payment confirmations before and after the current hsra payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param hsraPaymentId the primary key of the current hsra payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra payment confirmation
	 * @throws NoSuchHSRAPaymentConfirmationException if a hsra payment confirmation with the primary key could not be found
	 */
	public HSRAPaymentConfirmation[]
			findBygetPaymentConfirmation_By_CI_PrevAndNext(
				long hsraPaymentId, String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<HSRAPaymentConfirmation> orderByComparator)
		throws NoSuchHSRAPaymentConfirmationException;

	/**
	 * Removes all the hsra payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetPaymentConfirmation_By_CI(String caseId);

	/**
	 * Returns the number of hsra payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching hsra payment confirmations
	 */
	public int countBygetPaymentConfirmation_By_CI(String caseId);

	/**
	 * Caches the hsra payment confirmation in the entity cache if it is enabled.
	 *
	 * @param hsraPaymentConfirmation the hsra payment confirmation
	 */
	public void cacheResult(HSRAPaymentConfirmation hsraPaymentConfirmation);

	/**
	 * Caches the hsra payment confirmations in the entity cache if it is enabled.
	 *
	 * @param hsraPaymentConfirmations the hsra payment confirmations
	 */
	public void cacheResult(
		java.util.List<HSRAPaymentConfirmation> hsraPaymentConfirmations);

	/**
	 * Creates a new hsra payment confirmation with the primary key. Does not add the hsra payment confirmation to the database.
	 *
	 * @param hsraPaymentId the primary key for the new hsra payment confirmation
	 * @return the new hsra payment confirmation
	 */
	public HSRAPaymentConfirmation create(long hsraPaymentId);

	/**
	 * Removes the hsra payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param hsraPaymentId the primary key of the hsra payment confirmation
	 * @return the hsra payment confirmation that was removed
	 * @throws NoSuchHSRAPaymentConfirmationException if a hsra payment confirmation with the primary key could not be found
	 */
	public HSRAPaymentConfirmation remove(long hsraPaymentId)
		throws NoSuchHSRAPaymentConfirmationException;

	public HSRAPaymentConfirmation updateImpl(
		HSRAPaymentConfirmation hsraPaymentConfirmation);

	/**
	 * Returns the hsra payment confirmation with the primary key or throws a <code>NoSuchHSRAPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param hsraPaymentId the primary key of the hsra payment confirmation
	 * @return the hsra payment confirmation
	 * @throws NoSuchHSRAPaymentConfirmationException if a hsra payment confirmation with the primary key could not be found
	 */
	public HSRAPaymentConfirmation findByPrimaryKey(long hsraPaymentId)
		throws NoSuchHSRAPaymentConfirmationException;

	/**
	 * Returns the hsra payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param hsraPaymentId the primary key of the hsra payment confirmation
	 * @return the hsra payment confirmation, or <code>null</code> if a hsra payment confirmation with the primary key could not be found
	 */
	public HSRAPaymentConfirmation fetchByPrimaryKey(long hsraPaymentId);

	/**
	 * Returns all the hsra payment confirmations.
	 *
	 * @return the hsra payment confirmations
	 */
	public java.util.List<HSRAPaymentConfirmation> findAll();

	/**
	 * Returns a range of all the hsra payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra payment confirmations
	 * @param end the upper bound of the range of hsra payment confirmations (not inclusive)
	 * @return the range of hsra payment confirmations
	 */
	public java.util.List<HSRAPaymentConfirmation> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the hsra payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra payment confirmations
	 * @param end the upper bound of the range of hsra payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of hsra payment confirmations
	 */
	public java.util.List<HSRAPaymentConfirmation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HSRAPaymentConfirmation> orderByComparator);

	/**
	 * Returns an ordered range of all the hsra payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra payment confirmations
	 * @param end the upper bound of the range of hsra payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of hsra payment confirmations
	 */
	public java.util.List<HSRAPaymentConfirmation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HSRAPaymentConfirmation> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the hsra payment confirmations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of hsra payment confirmations.
	 *
	 * @return the number of hsra payment confirmations
	 */
	public int countAll();

}