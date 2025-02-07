/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.npm.cannabis.application.stages.services.exception.NoSuchCannabisApplicationPaymentConfirmationException;
import com.npm.cannabis.application.stages.services.model.CannabisApplicationPaymentConfirmation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the cannabis application payment confirmation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationPaymentConfirmationUtil
 * @generated
 */
@ProviderType
public interface CannabisApplicationPaymentConfirmationPersistence
	extends BasePersistence<CannabisApplicationPaymentConfirmation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CannabisApplicationPaymentConfirmationUtil} to access the cannabis application payment confirmation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the cannabis application payment confirmation where caseId = &#63; or throws a <code>NoSuchCannabisApplicationPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis application payment confirmation
	 * @throws NoSuchCannabisApplicationPaymentConfirmationException if a matching cannabis application payment confirmation could not be found
	 */
	public CannabisApplicationPaymentConfirmation
			findBygetCannabisPaymentByCaseId(String caseId)
		throws NoSuchCannabisApplicationPaymentConfirmationException;

	/**
	 * Returns the cannabis application payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis application payment confirmation, or <code>null</code> if a matching cannabis application payment confirmation could not be found
	 */
	public CannabisApplicationPaymentConfirmation
		fetchBygetCannabisPaymentByCaseId(String caseId);

	/**
	 * Returns the cannabis application payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application payment confirmation, or <code>null</code> if a matching cannabis application payment confirmation could not be found
	 */
	public CannabisApplicationPaymentConfirmation
		fetchBygetCannabisPaymentByCaseId(
			String caseId, boolean useFinderCache);

	/**
	 * Removes the cannabis application payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the cannabis application payment confirmation that was removed
	 */
	public CannabisApplicationPaymentConfirmation
			removeBygetCannabisPaymentByCaseId(String caseId)
		throws NoSuchCannabisApplicationPaymentConfirmationException;

	/**
	 * Returns the number of cannabis application payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis application payment confirmations
	 */
	public int countBygetCannabisPaymentByCaseId(String caseId);

	/**
	 * Returns all the cannabis application payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis application payment confirmations
	 */
	public java.util.List<CannabisApplicationPaymentConfirmation>
		findBygetCA_PC_By_CI(String caseId);

	/**
	 * Returns a range of all the cannabis application payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis application payment confirmations
	 * @param end the upper bound of the range of cannabis application payment confirmations (not inclusive)
	 * @return the range of matching cannabis application payment confirmations
	 */
	public java.util.List<CannabisApplicationPaymentConfirmation>
		findBygetCA_PC_By_CI(String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis application payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis application payment confirmations
	 * @param end the upper bound of the range of cannabis application payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application payment confirmations
	 */
	public java.util.List<CannabisApplicationPaymentConfirmation>
		findBygetCA_PC_By_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationPaymentConfirmation> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis application payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis application payment confirmations
	 * @param end the upper bound of the range of cannabis application payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application payment confirmations
	 */
	public java.util.List<CannabisApplicationPaymentConfirmation>
		findBygetCA_PC_By_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationPaymentConfirmation> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first cannabis application payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application payment confirmation
	 * @throws NoSuchCannabisApplicationPaymentConfirmationException if a matching cannabis application payment confirmation could not be found
	 */
	public CannabisApplicationPaymentConfirmation findBygetCA_PC_By_CI_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationPaymentConfirmation> orderByComparator)
		throws NoSuchCannabisApplicationPaymentConfirmationException;

	/**
	 * Returns the first cannabis application payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application payment confirmation, or <code>null</code> if a matching cannabis application payment confirmation could not be found
	 */
	public CannabisApplicationPaymentConfirmation fetchBygetCA_PC_By_CI_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationPaymentConfirmation> orderByComparator);

	/**
	 * Returns the last cannabis application payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application payment confirmation
	 * @throws NoSuchCannabisApplicationPaymentConfirmationException if a matching cannabis application payment confirmation could not be found
	 */
	public CannabisApplicationPaymentConfirmation findBygetCA_PC_By_CI_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationPaymentConfirmation> orderByComparator)
		throws NoSuchCannabisApplicationPaymentConfirmationException;

	/**
	 * Returns the last cannabis application payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application payment confirmation, or <code>null</code> if a matching cannabis application payment confirmation could not be found
	 */
	public CannabisApplicationPaymentConfirmation fetchBygetCA_PC_By_CI_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationPaymentConfirmation> orderByComparator);

	/**
	 * Returns the cannabis application payment confirmations before and after the current cannabis application payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param cannabisAppliPaymentConfirId the primary key of the current cannabis application payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application payment confirmation
	 * @throws NoSuchCannabisApplicationPaymentConfirmationException if a cannabis application payment confirmation with the primary key could not be found
	 */
	public CannabisApplicationPaymentConfirmation[]
			findBygetCA_PC_By_CI_PrevAndNext(
				long cannabisAppliPaymentConfirId, String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<CannabisApplicationPaymentConfirmation> orderByComparator)
		throws NoSuchCannabisApplicationPaymentConfirmationException;

	/**
	 * Removes all the cannabis application payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetCA_PC_By_CI(String caseId);

	/**
	 * Returns the number of cannabis application payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis application payment confirmations
	 */
	public int countBygetCA_PC_By_CI(String caseId);

	/**
	 * Caches the cannabis application payment confirmation in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationPaymentConfirmation the cannabis application payment confirmation
	 */
	public void cacheResult(
		CannabisApplicationPaymentConfirmation
			cannabisApplicationPaymentConfirmation);

	/**
	 * Caches the cannabis application payment confirmations in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationPaymentConfirmations the cannabis application payment confirmations
	 */
	public void cacheResult(
		java.util.List<CannabisApplicationPaymentConfirmation>
			cannabisApplicationPaymentConfirmations);

	/**
	 * Creates a new cannabis application payment confirmation with the primary key. Does not add the cannabis application payment confirmation to the database.
	 *
	 * @param cannabisAppliPaymentConfirId the primary key for the new cannabis application payment confirmation
	 * @return the new cannabis application payment confirmation
	 */
	public CannabisApplicationPaymentConfirmation create(
		long cannabisAppliPaymentConfirId);

	/**
	 * Removes the cannabis application payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisAppliPaymentConfirId the primary key of the cannabis application payment confirmation
	 * @return the cannabis application payment confirmation that was removed
	 * @throws NoSuchCannabisApplicationPaymentConfirmationException if a cannabis application payment confirmation with the primary key could not be found
	 */
	public CannabisApplicationPaymentConfirmation remove(
			long cannabisAppliPaymentConfirId)
		throws NoSuchCannabisApplicationPaymentConfirmationException;

	public CannabisApplicationPaymentConfirmation updateImpl(
		CannabisApplicationPaymentConfirmation
			cannabisApplicationPaymentConfirmation);

	/**
	 * Returns the cannabis application payment confirmation with the primary key or throws a <code>NoSuchCannabisApplicationPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param cannabisAppliPaymentConfirId the primary key of the cannabis application payment confirmation
	 * @return the cannabis application payment confirmation
	 * @throws NoSuchCannabisApplicationPaymentConfirmationException if a cannabis application payment confirmation with the primary key could not be found
	 */
	public CannabisApplicationPaymentConfirmation findByPrimaryKey(
			long cannabisAppliPaymentConfirId)
		throws NoSuchCannabisApplicationPaymentConfirmationException;

	/**
	 * Returns the cannabis application payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisAppliPaymentConfirId the primary key of the cannabis application payment confirmation
	 * @return the cannabis application payment confirmation, or <code>null</code> if a cannabis application payment confirmation with the primary key could not be found
	 */
	public CannabisApplicationPaymentConfirmation fetchByPrimaryKey(
		long cannabisAppliPaymentConfirId);

	/**
	 * Returns all the cannabis application payment confirmations.
	 *
	 * @return the cannabis application payment confirmations
	 */
	public java.util.List<CannabisApplicationPaymentConfirmation> findAll();

	/**
	 * Returns a range of all the cannabis application payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application payment confirmations
	 * @param end the upper bound of the range of cannabis application payment confirmations (not inclusive)
	 * @return the range of cannabis application payment confirmations
	 */
	public java.util.List<CannabisApplicationPaymentConfirmation> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the cannabis application payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application payment confirmations
	 * @param end the upper bound of the range of cannabis application payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis application payment confirmations
	 */
	public java.util.List<CannabisApplicationPaymentConfirmation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationPaymentConfirmation> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis application payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application payment confirmations
	 * @param end the upper bound of the range of cannabis application payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis application payment confirmations
	 */
	public java.util.List<CannabisApplicationPaymentConfirmation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationPaymentConfirmation> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the cannabis application payment confirmations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of cannabis application payment confirmations.
	 *
	 * @return the number of cannabis application payment confirmations
	 */
	public int countAll();

}