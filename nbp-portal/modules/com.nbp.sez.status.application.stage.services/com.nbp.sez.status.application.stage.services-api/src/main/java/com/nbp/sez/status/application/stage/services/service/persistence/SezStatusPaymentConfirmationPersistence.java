/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.stage.services.exception.NoSuchSezStatusPaymentConfirmationException;
import com.nbp.sez.status.application.stage.services.model.SezStatusPaymentConfirmation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez status payment confirmation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusPaymentConfirmationUtil
 * @generated
 */
@ProviderType
public interface SezStatusPaymentConfirmationPersistence
	extends BasePersistence<SezStatusPaymentConfirmation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezStatusPaymentConfirmationUtil} to access the sez status payment confirmation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the sez status payment confirmation where caseId = &#63; or throws a <code>NoSuchSezStatusPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status payment confirmation
	 * @throws NoSuchSezStatusPaymentConfirmationException if a matching sez status payment confirmation could not be found
	 */
	public SezStatusPaymentConfirmation findBygetPaymentConfirmationBy_CI(
			String caseId)
		throws NoSuchSezStatusPaymentConfirmationException;

	/**
	 * Returns the sez status payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status payment confirmation, or <code>null</code> if a matching sez status payment confirmation could not be found
	 */
	public SezStatusPaymentConfirmation fetchBygetPaymentConfirmationBy_CI(
		String caseId);

	/**
	 * Returns the sez status payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status payment confirmation, or <code>null</code> if a matching sez status payment confirmation could not be found
	 */
	public SezStatusPaymentConfirmation fetchBygetPaymentConfirmationBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the sez status payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the sez status payment confirmation that was removed
	 */
	public SezStatusPaymentConfirmation removeBygetPaymentConfirmationBy_CI(
			String caseId)
		throws NoSuchSezStatusPaymentConfirmationException;

	/**
	 * Returns the number of sez status payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching sez status payment confirmations
	 */
	public int countBygetPaymentConfirmationBy_CI(String caseId);

	/**
	 * Returns all the sez status payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status payment confirmations
	 */
	public java.util.List<SezStatusPaymentConfirmation>
		findBygetPaymentConfirmation_By_CI(String caseId);

	/**
	 * Returns a range of all the sez status payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of sez status payment confirmations
	 * @param end the upper bound of the range of sez status payment confirmations (not inclusive)
	 * @return the range of matching sez status payment confirmations
	 */
	public java.util.List<SezStatusPaymentConfirmation>
		findBygetPaymentConfirmation_By_CI(String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the sez status payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of sez status payment confirmations
	 * @param end the upper bound of the range of sez status payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status payment confirmations
	 */
	public java.util.List<SezStatusPaymentConfirmation>
		findBygetPaymentConfirmation_By_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusPaymentConfirmation> orderByComparator);

	/**
	 * Returns an ordered range of all the sez status payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of sez status payment confirmations
	 * @param end the upper bound of the range of sez status payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status payment confirmations
	 */
	public java.util.List<SezStatusPaymentConfirmation>
		findBygetPaymentConfirmation_By_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusPaymentConfirmation> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first sez status payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status payment confirmation
	 * @throws NoSuchSezStatusPaymentConfirmationException if a matching sez status payment confirmation could not be found
	 */
	public SezStatusPaymentConfirmation
			findBygetPaymentConfirmation_By_CI_First(
				String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<SezStatusPaymentConfirmation> orderByComparator)
		throws NoSuchSezStatusPaymentConfirmationException;

	/**
	 * Returns the first sez status payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status payment confirmation, or <code>null</code> if a matching sez status payment confirmation could not be found
	 */
	public SezStatusPaymentConfirmation
		fetchBygetPaymentConfirmation_By_CI_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusPaymentConfirmation> orderByComparator);

	/**
	 * Returns the last sez status payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status payment confirmation
	 * @throws NoSuchSezStatusPaymentConfirmationException if a matching sez status payment confirmation could not be found
	 */
	public SezStatusPaymentConfirmation findBygetPaymentConfirmation_By_CI_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusPaymentConfirmation> orderByComparator)
		throws NoSuchSezStatusPaymentConfirmationException;

	/**
	 * Returns the last sez status payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status payment confirmation, or <code>null</code> if a matching sez status payment confirmation could not be found
	 */
	public SezStatusPaymentConfirmation
		fetchBygetPaymentConfirmation_By_CI_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusPaymentConfirmation> orderByComparator);

	/**
	 * Returns the sez status payment confirmations before and after the current sez status payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param sezPaymentId the primary key of the current sez status payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status payment confirmation
	 * @throws NoSuchSezStatusPaymentConfirmationException if a sez status payment confirmation with the primary key could not be found
	 */
	public SezStatusPaymentConfirmation[]
			findBygetPaymentConfirmation_By_CI_PrevAndNext(
				long sezPaymentId, String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<SezStatusPaymentConfirmation> orderByComparator)
		throws NoSuchSezStatusPaymentConfirmationException;

	/**
	 * Removes all the sez status payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetPaymentConfirmation_By_CI(String caseId);

	/**
	 * Returns the number of sez status payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching sez status payment confirmations
	 */
	public int countBygetPaymentConfirmation_By_CI(String caseId);

	/**
	 * Caches the sez status payment confirmation in the entity cache if it is enabled.
	 *
	 * @param sezStatusPaymentConfirmation the sez status payment confirmation
	 */
	public void cacheResult(
		SezStatusPaymentConfirmation sezStatusPaymentConfirmation);

	/**
	 * Caches the sez status payment confirmations in the entity cache if it is enabled.
	 *
	 * @param sezStatusPaymentConfirmations the sez status payment confirmations
	 */
	public void cacheResult(
		java.util.List<SezStatusPaymentConfirmation>
			sezStatusPaymentConfirmations);

	/**
	 * Creates a new sez status payment confirmation with the primary key. Does not add the sez status payment confirmation to the database.
	 *
	 * @param sezPaymentId the primary key for the new sez status payment confirmation
	 * @return the new sez status payment confirmation
	 */
	public SezStatusPaymentConfirmation create(long sezPaymentId);

	/**
	 * Removes the sez status payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezPaymentId the primary key of the sez status payment confirmation
	 * @return the sez status payment confirmation that was removed
	 * @throws NoSuchSezStatusPaymentConfirmationException if a sez status payment confirmation with the primary key could not be found
	 */
	public SezStatusPaymentConfirmation remove(long sezPaymentId)
		throws NoSuchSezStatusPaymentConfirmationException;

	public SezStatusPaymentConfirmation updateImpl(
		SezStatusPaymentConfirmation sezStatusPaymentConfirmation);

	/**
	 * Returns the sez status payment confirmation with the primary key or throws a <code>NoSuchSezStatusPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param sezPaymentId the primary key of the sez status payment confirmation
	 * @return the sez status payment confirmation
	 * @throws NoSuchSezStatusPaymentConfirmationException if a sez status payment confirmation with the primary key could not be found
	 */
	public SezStatusPaymentConfirmation findByPrimaryKey(long sezPaymentId)
		throws NoSuchSezStatusPaymentConfirmationException;

	/**
	 * Returns the sez status payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezPaymentId the primary key of the sez status payment confirmation
	 * @return the sez status payment confirmation, or <code>null</code> if a sez status payment confirmation with the primary key could not be found
	 */
	public SezStatusPaymentConfirmation fetchByPrimaryKey(long sezPaymentId);

	/**
	 * Returns all the sez status payment confirmations.
	 *
	 * @return the sez status payment confirmations
	 */
	public java.util.List<SezStatusPaymentConfirmation> findAll();

	/**
	 * Returns a range of all the sez status payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status payment confirmations
	 * @param end the upper bound of the range of sez status payment confirmations (not inclusive)
	 * @return the range of sez status payment confirmations
	 */
	public java.util.List<SezStatusPaymentConfirmation> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the sez status payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status payment confirmations
	 * @param end the upper bound of the range of sez status payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status payment confirmations
	 */
	public java.util.List<SezStatusPaymentConfirmation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusPaymentConfirmation> orderByComparator);

	/**
	 * Returns an ordered range of all the sez status payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status payment confirmations
	 * @param end the upper bound of the range of sez status payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status payment confirmations
	 */
	public java.util.List<SezStatusPaymentConfirmation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusPaymentConfirmation> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez status payment confirmations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez status payment confirmations.
	 *
	 * @return the number of sez status payment confirmations
	 */
	public int countAll();

}