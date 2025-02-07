/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.quarry.stage.service.exception.NoSuchQuarryPaymentConfirmationException;
import com.nbp.quarry.stage.service.model.QuarryPaymentConfirmation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the quarry payment confirmation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryPaymentConfirmationUtil
 * @generated
 */
@ProviderType
public interface QuarryPaymentConfirmationPersistence
	extends BasePersistence<QuarryPaymentConfirmation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QuarryPaymentConfirmationUtil} to access the quarry payment confirmation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the quarry payment confirmation where caseId = &#63; or throws a <code>NoSuchQuarryPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry payment confirmation
	 * @throws NoSuchQuarryPaymentConfirmationException if a matching quarry payment confirmation could not be found
	 */
	public QuarryPaymentConfirmation findBygetQuarryPaymentConfBy_CI(
			String caseId)
		throws NoSuchQuarryPaymentConfirmationException;

	/**
	 * Returns the quarry payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry payment confirmation, or <code>null</code> if a matching quarry payment confirmation could not be found
	 */
	public QuarryPaymentConfirmation fetchBygetQuarryPaymentConfBy_CI(
		String caseId);

	/**
	 * Returns the quarry payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry payment confirmation, or <code>null</code> if a matching quarry payment confirmation could not be found
	 */
	public QuarryPaymentConfirmation fetchBygetQuarryPaymentConfBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the quarry payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the quarry payment confirmation that was removed
	 */
	public QuarryPaymentConfirmation removeBygetQuarryPaymentConfBy_CI(
			String caseId)
		throws NoSuchQuarryPaymentConfirmationException;

	/**
	 * Returns the number of quarry payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching quarry payment confirmations
	 */
	public int countBygetQuarryPaymentConfBy_CI(String caseId);

	/**
	 * Returns all the quarry payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry payment confirmations
	 */
	public java.util.List<QuarryPaymentConfirmation>
		findBygetQuarryPayConfBy_CI(String caseId);

	/**
	 * Returns a range of all the quarry payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry payment confirmations
	 * @param end the upper bound of the range of quarry payment confirmations (not inclusive)
	 * @return the range of matching quarry payment confirmations
	 */
	public java.util.List<QuarryPaymentConfirmation>
		findBygetQuarryPayConfBy_CI(String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the quarry payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry payment confirmations
	 * @param end the upper bound of the range of quarry payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry payment confirmations
	 */
	public java.util.List<QuarryPaymentConfirmation>
		findBygetQuarryPayConfBy_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryPaymentConfirmation> orderByComparator);

	/**
	 * Returns an ordered range of all the quarry payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry payment confirmations
	 * @param end the upper bound of the range of quarry payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry payment confirmations
	 */
	public java.util.List<QuarryPaymentConfirmation>
		findBygetQuarryPayConfBy_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryPaymentConfirmation> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first quarry payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry payment confirmation
	 * @throws NoSuchQuarryPaymentConfirmationException if a matching quarry payment confirmation could not be found
	 */
	public QuarryPaymentConfirmation findBygetQuarryPayConfBy_CI_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryPaymentConfirmation> orderByComparator)
		throws NoSuchQuarryPaymentConfirmationException;

	/**
	 * Returns the first quarry payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry payment confirmation, or <code>null</code> if a matching quarry payment confirmation could not be found
	 */
	public QuarryPaymentConfirmation fetchBygetQuarryPayConfBy_CI_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryPaymentConfirmation> orderByComparator);

	/**
	 * Returns the last quarry payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry payment confirmation
	 * @throws NoSuchQuarryPaymentConfirmationException if a matching quarry payment confirmation could not be found
	 */
	public QuarryPaymentConfirmation findBygetQuarryPayConfBy_CI_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryPaymentConfirmation> orderByComparator)
		throws NoSuchQuarryPaymentConfirmationException;

	/**
	 * Returns the last quarry payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry payment confirmation, or <code>null</code> if a matching quarry payment confirmation could not be found
	 */
	public QuarryPaymentConfirmation fetchBygetQuarryPayConfBy_CI_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryPaymentConfirmation> orderByComparator);

	/**
	 * Returns the quarry payment confirmations before and after the current quarry payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param quarryPaymentConfirmationId the primary key of the current quarry payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry payment confirmation
	 * @throws NoSuchQuarryPaymentConfirmationException if a quarry payment confirmation with the primary key could not be found
	 */
	public QuarryPaymentConfirmation[] findBygetQuarryPayConfBy_CI_PrevAndNext(
			long quarryPaymentConfirmationId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryPaymentConfirmation> orderByComparator)
		throws NoSuchQuarryPaymentConfirmationException;

	/**
	 * Removes all the quarry payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetQuarryPayConfBy_CI(String caseId);

	/**
	 * Returns the number of quarry payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching quarry payment confirmations
	 */
	public int countBygetQuarryPayConfBy_CI(String caseId);

	/**
	 * Caches the quarry payment confirmation in the entity cache if it is enabled.
	 *
	 * @param quarryPaymentConfirmation the quarry payment confirmation
	 */
	public void cacheResult(
		QuarryPaymentConfirmation quarryPaymentConfirmation);

	/**
	 * Caches the quarry payment confirmations in the entity cache if it is enabled.
	 *
	 * @param quarryPaymentConfirmations the quarry payment confirmations
	 */
	public void cacheResult(
		java.util.List<QuarryPaymentConfirmation> quarryPaymentConfirmations);

	/**
	 * Creates a new quarry payment confirmation with the primary key. Does not add the quarry payment confirmation to the database.
	 *
	 * @param quarryPaymentConfirmationId the primary key for the new quarry payment confirmation
	 * @return the new quarry payment confirmation
	 */
	public QuarryPaymentConfirmation create(long quarryPaymentConfirmationId);

	/**
	 * Removes the quarry payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param quarryPaymentConfirmationId the primary key of the quarry payment confirmation
	 * @return the quarry payment confirmation that was removed
	 * @throws NoSuchQuarryPaymentConfirmationException if a quarry payment confirmation with the primary key could not be found
	 */
	public QuarryPaymentConfirmation remove(long quarryPaymentConfirmationId)
		throws NoSuchQuarryPaymentConfirmationException;

	public QuarryPaymentConfirmation updateImpl(
		QuarryPaymentConfirmation quarryPaymentConfirmation);

	/**
	 * Returns the quarry payment confirmation with the primary key or throws a <code>NoSuchQuarryPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param quarryPaymentConfirmationId the primary key of the quarry payment confirmation
	 * @return the quarry payment confirmation
	 * @throws NoSuchQuarryPaymentConfirmationException if a quarry payment confirmation with the primary key could not be found
	 */
	public QuarryPaymentConfirmation findByPrimaryKey(
			long quarryPaymentConfirmationId)
		throws NoSuchQuarryPaymentConfirmationException;

	/**
	 * Returns the quarry payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param quarryPaymentConfirmationId the primary key of the quarry payment confirmation
	 * @return the quarry payment confirmation, or <code>null</code> if a quarry payment confirmation with the primary key could not be found
	 */
	public QuarryPaymentConfirmation fetchByPrimaryKey(
		long quarryPaymentConfirmationId);

	/**
	 * Returns all the quarry payment confirmations.
	 *
	 * @return the quarry payment confirmations
	 */
	public java.util.List<QuarryPaymentConfirmation> findAll();

	/**
	 * Returns a range of all the quarry payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry payment confirmations
	 * @param end the upper bound of the range of quarry payment confirmations (not inclusive)
	 * @return the range of quarry payment confirmations
	 */
	public java.util.List<QuarryPaymentConfirmation> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the quarry payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry payment confirmations
	 * @param end the upper bound of the range of quarry payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry payment confirmations
	 */
	public java.util.List<QuarryPaymentConfirmation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryPaymentConfirmation> orderByComparator);

	/**
	 * Returns an ordered range of all the quarry payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry payment confirmations
	 * @param end the upper bound of the range of quarry payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry payment confirmations
	 */
	public java.util.List<QuarryPaymentConfirmation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryPaymentConfirmation> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the quarry payment confirmations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of quarry payment confirmations.
	 *
	 * @return the number of quarry payment confirmations
	 */
	public int countAll();

}