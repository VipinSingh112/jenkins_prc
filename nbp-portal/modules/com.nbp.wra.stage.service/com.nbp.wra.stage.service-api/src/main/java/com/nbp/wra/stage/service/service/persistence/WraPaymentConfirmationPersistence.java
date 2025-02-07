/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.wra.stage.service.exception.NoSuchWraPaymentConfirmationException;
import com.nbp.wra.stage.service.model.WraPaymentConfirmation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the wra payment confirmation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WraPaymentConfirmationUtil
 * @generated
 */
@ProviderType
public interface WraPaymentConfirmationPersistence
	extends BasePersistence<WraPaymentConfirmation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link WraPaymentConfirmationUtil} to access the wra payment confirmation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the wra payment confirmation where caseId = &#63; or throws a <code>NoSuchWraPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching wra payment confirmation
	 * @throws NoSuchWraPaymentConfirmationException if a matching wra payment confirmation could not be found
	 */
	public WraPaymentConfirmation findBygetWraPaymentConfBy_CI(String caseId)
		throws NoSuchWraPaymentConfirmationException;

	/**
	 * Returns the wra payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching wra payment confirmation, or <code>null</code> if a matching wra payment confirmation could not be found
	 */
	public WraPaymentConfirmation fetchBygetWraPaymentConfBy_CI(String caseId);

	/**
	 * Returns the wra payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra payment confirmation, or <code>null</code> if a matching wra payment confirmation could not be found
	 */
	public WraPaymentConfirmation fetchBygetWraPaymentConfBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the wra payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the wra payment confirmation that was removed
	 */
	public WraPaymentConfirmation removeBygetWraPaymentConfBy_CI(String caseId)
		throws NoSuchWraPaymentConfirmationException;

	/**
	 * Returns the number of wra payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching wra payment confirmations
	 */
	public int countBygetWraPaymentConfBy_CI(String caseId);

	/**
	 * Returns all the wra payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching wra payment confirmations
	 */
	public java.util.List<WraPaymentConfirmation> findBygetWraPayConfBy_CI(
		String caseId);

	/**
	 * Returns a range of all the wra payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra payment confirmations
	 * @param end the upper bound of the range of wra payment confirmations (not inclusive)
	 * @return the range of matching wra payment confirmations
	 */
	public java.util.List<WraPaymentConfirmation> findBygetWraPayConfBy_CI(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the wra payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra payment confirmations
	 * @param end the upper bound of the range of wra payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra payment confirmations
	 */
	public java.util.List<WraPaymentConfirmation> findBygetWraPayConfBy_CI(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WraPaymentConfirmation>
			orderByComparator);

	/**
	 * Returns an ordered range of all the wra payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra payment confirmations
	 * @param end the upper bound of the range of wra payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra payment confirmations
	 */
	public java.util.List<WraPaymentConfirmation> findBygetWraPayConfBy_CI(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WraPaymentConfirmation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first wra payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra payment confirmation
	 * @throws NoSuchWraPaymentConfirmationException if a matching wra payment confirmation could not be found
	 */
	public WraPaymentConfirmation findBygetWraPayConfBy_CI_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<WraPaymentConfirmation> orderByComparator)
		throws NoSuchWraPaymentConfirmationException;

	/**
	 * Returns the first wra payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra payment confirmation, or <code>null</code> if a matching wra payment confirmation could not be found
	 */
	public WraPaymentConfirmation fetchBygetWraPayConfBy_CI_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<WraPaymentConfirmation>
			orderByComparator);

	/**
	 * Returns the last wra payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra payment confirmation
	 * @throws NoSuchWraPaymentConfirmationException if a matching wra payment confirmation could not be found
	 */
	public WraPaymentConfirmation findBygetWraPayConfBy_CI_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<WraPaymentConfirmation> orderByComparator)
		throws NoSuchWraPaymentConfirmationException;

	/**
	 * Returns the last wra payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra payment confirmation, or <code>null</code> if a matching wra payment confirmation could not be found
	 */
	public WraPaymentConfirmation fetchBygetWraPayConfBy_CI_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<WraPaymentConfirmation>
			orderByComparator);

	/**
	 * Returns the wra payment confirmations before and after the current wra payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param wraPaymentConfirmationId the primary key of the current wra payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra payment confirmation
	 * @throws NoSuchWraPaymentConfirmationException if a wra payment confirmation with the primary key could not be found
	 */
	public WraPaymentConfirmation[] findBygetWraPayConfBy_CI_PrevAndNext(
			long wraPaymentConfirmationId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<WraPaymentConfirmation> orderByComparator)
		throws NoSuchWraPaymentConfirmationException;

	/**
	 * Removes all the wra payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetWraPayConfBy_CI(String caseId);

	/**
	 * Returns the number of wra payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching wra payment confirmations
	 */
	public int countBygetWraPayConfBy_CI(String caseId);

	/**
	 * Caches the wra payment confirmation in the entity cache if it is enabled.
	 *
	 * @param wraPaymentConfirmation the wra payment confirmation
	 */
	public void cacheResult(WraPaymentConfirmation wraPaymentConfirmation);

	/**
	 * Caches the wra payment confirmations in the entity cache if it is enabled.
	 *
	 * @param wraPaymentConfirmations the wra payment confirmations
	 */
	public void cacheResult(
		java.util.List<WraPaymentConfirmation> wraPaymentConfirmations);

	/**
	 * Creates a new wra payment confirmation with the primary key. Does not add the wra payment confirmation to the database.
	 *
	 * @param wraPaymentConfirmationId the primary key for the new wra payment confirmation
	 * @return the new wra payment confirmation
	 */
	public WraPaymentConfirmation create(long wraPaymentConfirmationId);

	/**
	 * Removes the wra payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wraPaymentConfirmationId the primary key of the wra payment confirmation
	 * @return the wra payment confirmation that was removed
	 * @throws NoSuchWraPaymentConfirmationException if a wra payment confirmation with the primary key could not be found
	 */
	public WraPaymentConfirmation remove(long wraPaymentConfirmationId)
		throws NoSuchWraPaymentConfirmationException;

	public WraPaymentConfirmation updateImpl(
		WraPaymentConfirmation wraPaymentConfirmation);

	/**
	 * Returns the wra payment confirmation with the primary key or throws a <code>NoSuchWraPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param wraPaymentConfirmationId the primary key of the wra payment confirmation
	 * @return the wra payment confirmation
	 * @throws NoSuchWraPaymentConfirmationException if a wra payment confirmation with the primary key could not be found
	 */
	public WraPaymentConfirmation findByPrimaryKey(
			long wraPaymentConfirmationId)
		throws NoSuchWraPaymentConfirmationException;

	/**
	 * Returns the wra payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wraPaymentConfirmationId the primary key of the wra payment confirmation
	 * @return the wra payment confirmation, or <code>null</code> if a wra payment confirmation with the primary key could not be found
	 */
	public WraPaymentConfirmation fetchByPrimaryKey(
		long wraPaymentConfirmationId);

	/**
	 * Returns all the wra payment confirmations.
	 *
	 * @return the wra payment confirmations
	 */
	public java.util.List<WraPaymentConfirmation> findAll();

	/**
	 * Returns a range of all the wra payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra payment confirmations
	 * @param end the upper bound of the range of wra payment confirmations (not inclusive)
	 * @return the range of wra payment confirmations
	 */
	public java.util.List<WraPaymentConfirmation> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the wra payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra payment confirmations
	 * @param end the upper bound of the range of wra payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wra payment confirmations
	 */
	public java.util.List<WraPaymentConfirmation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WraPaymentConfirmation>
			orderByComparator);

	/**
	 * Returns an ordered range of all the wra payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra payment confirmations
	 * @param end the upper bound of the range of wra payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of wra payment confirmations
	 */
	public java.util.List<WraPaymentConfirmation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WraPaymentConfirmation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the wra payment confirmations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of wra payment confirmations.
	 *
	 * @return the number of wra payment confirmations
	 */
	public int countAll();

}