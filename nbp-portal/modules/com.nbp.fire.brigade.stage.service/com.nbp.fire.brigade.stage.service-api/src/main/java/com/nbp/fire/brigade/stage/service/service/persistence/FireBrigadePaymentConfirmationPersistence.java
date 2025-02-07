/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.fire.brigade.stage.service.exception.NoSuchFireBrigadePaymentConfirmationException;
import com.nbp.fire.brigade.stage.service.model.FireBrigadePaymentConfirmation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the fire brigade payment confirmation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadePaymentConfirmationUtil
 * @generated
 */
@ProviderType
public interface FireBrigadePaymentConfirmationPersistence
	extends BasePersistence<FireBrigadePaymentConfirmation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FireBrigadePaymentConfirmationUtil} to access the fire brigade payment confirmation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the fire brigade payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade payment confirmations
	 */
	public java.util.List<FireBrigadePaymentConfirmation>
		findBygetFBA_PC_By_FBI(String caseId);

	/**
	 * Returns a range of all the fire brigade payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade payment confirmations
	 * @param end the upper bound of the range of fire brigade payment confirmations (not inclusive)
	 * @return the range of matching fire brigade payment confirmations
	 */
	public java.util.List<FireBrigadePaymentConfirmation>
		findBygetFBA_PC_By_FBI(String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the fire brigade payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade payment confirmations
	 * @param end the upper bound of the range of fire brigade payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade payment confirmations
	 */
	public java.util.List<FireBrigadePaymentConfirmation>
		findBygetFBA_PC_By_FBI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadePaymentConfirmation> orderByComparator);

	/**
	 * Returns an ordered range of all the fire brigade payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade payment confirmations
	 * @param end the upper bound of the range of fire brigade payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade payment confirmations
	 */
	public java.util.List<FireBrigadePaymentConfirmation>
		findBygetFBA_PC_By_FBI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadePaymentConfirmation> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first fire brigade payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade payment confirmation
	 * @throws NoSuchFireBrigadePaymentConfirmationException if a matching fire brigade payment confirmation could not be found
	 */
	public FireBrigadePaymentConfirmation findBygetFBA_PC_By_FBI_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadePaymentConfirmation> orderByComparator)
		throws NoSuchFireBrigadePaymentConfirmationException;

	/**
	 * Returns the first fire brigade payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade payment confirmation, or <code>null</code> if a matching fire brigade payment confirmation could not be found
	 */
	public FireBrigadePaymentConfirmation fetchBygetFBA_PC_By_FBI_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadePaymentConfirmation> orderByComparator);

	/**
	 * Returns the last fire brigade payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade payment confirmation
	 * @throws NoSuchFireBrigadePaymentConfirmationException if a matching fire brigade payment confirmation could not be found
	 */
	public FireBrigadePaymentConfirmation findBygetFBA_PC_By_FBI_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadePaymentConfirmation> orderByComparator)
		throws NoSuchFireBrigadePaymentConfirmationException;

	/**
	 * Returns the last fire brigade payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade payment confirmation, or <code>null</code> if a matching fire brigade payment confirmation could not be found
	 */
	public FireBrigadePaymentConfirmation fetchBygetFBA_PC_By_FBI_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadePaymentConfirmation> orderByComparator);

	/**
	 * Returns the fire brigade payment confirmations before and after the current fire brigade payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param fireBrigadePaymentConfirId the primary key of the current fire brigade payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade payment confirmation
	 * @throws NoSuchFireBrigadePaymentConfirmationException if a fire brigade payment confirmation with the primary key could not be found
	 */
	public FireBrigadePaymentConfirmation[] findBygetFBA_PC_By_FBI_PrevAndNext(
			long fireBrigadePaymentConfirId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadePaymentConfirmation> orderByComparator)
		throws NoSuchFireBrigadePaymentConfirmationException;

	/**
	 * Removes all the fire brigade payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetFBA_PC_By_FBI(String caseId);

	/**
	 * Returns the number of fire brigade payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching fire brigade payment confirmations
	 */
	public int countBygetFBA_PC_By_FBI(String caseId);

	/**
	 * Returns the fire brigade payment confirmation where caseId = &#63; or throws a <code>NoSuchFireBrigadePaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade payment confirmation
	 * @throws NoSuchFireBrigadePaymentConfirmationException if a matching fire brigade payment confirmation could not be found
	 */
	public FireBrigadePaymentConfirmation findBygetFireBrigadePaymentByCaseId(
			String caseId)
		throws NoSuchFireBrigadePaymentConfirmationException;

	/**
	 * Returns the fire brigade payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade payment confirmation, or <code>null</code> if a matching fire brigade payment confirmation could not be found
	 */
	public FireBrigadePaymentConfirmation fetchBygetFireBrigadePaymentByCaseId(
		String caseId);

	/**
	 * Returns the fire brigade payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade payment confirmation, or <code>null</code> if a matching fire brigade payment confirmation could not be found
	 */
	public FireBrigadePaymentConfirmation fetchBygetFireBrigadePaymentByCaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the fire brigade payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the fire brigade payment confirmation that was removed
	 */
	public FireBrigadePaymentConfirmation removeBygetFireBrigadePaymentByCaseId(
			String caseId)
		throws NoSuchFireBrigadePaymentConfirmationException;

	/**
	 * Returns the number of fire brigade payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching fire brigade payment confirmations
	 */
	public int countBygetFireBrigadePaymentByCaseId(String caseId);

	/**
	 * Caches the fire brigade payment confirmation in the entity cache if it is enabled.
	 *
	 * @param fireBrigadePaymentConfirmation the fire brigade payment confirmation
	 */
	public void cacheResult(
		FireBrigadePaymentConfirmation fireBrigadePaymentConfirmation);

	/**
	 * Caches the fire brigade payment confirmations in the entity cache if it is enabled.
	 *
	 * @param fireBrigadePaymentConfirmations the fire brigade payment confirmations
	 */
	public void cacheResult(
		java.util.List<FireBrigadePaymentConfirmation>
			fireBrigadePaymentConfirmations);

	/**
	 * Creates a new fire brigade payment confirmation with the primary key. Does not add the fire brigade payment confirmation to the database.
	 *
	 * @param fireBrigadePaymentConfirId the primary key for the new fire brigade payment confirmation
	 * @return the new fire brigade payment confirmation
	 */
	public FireBrigadePaymentConfirmation create(
		long fireBrigadePaymentConfirId);

	/**
	 * Removes the fire brigade payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadePaymentConfirId the primary key of the fire brigade payment confirmation
	 * @return the fire brigade payment confirmation that was removed
	 * @throws NoSuchFireBrigadePaymentConfirmationException if a fire brigade payment confirmation with the primary key could not be found
	 */
	public FireBrigadePaymentConfirmation remove(
			long fireBrigadePaymentConfirId)
		throws NoSuchFireBrigadePaymentConfirmationException;

	public FireBrigadePaymentConfirmation updateImpl(
		FireBrigadePaymentConfirmation fireBrigadePaymentConfirmation);

	/**
	 * Returns the fire brigade payment confirmation with the primary key or throws a <code>NoSuchFireBrigadePaymentConfirmationException</code> if it could not be found.
	 *
	 * @param fireBrigadePaymentConfirId the primary key of the fire brigade payment confirmation
	 * @return the fire brigade payment confirmation
	 * @throws NoSuchFireBrigadePaymentConfirmationException if a fire brigade payment confirmation with the primary key could not be found
	 */
	public FireBrigadePaymentConfirmation findByPrimaryKey(
			long fireBrigadePaymentConfirId)
		throws NoSuchFireBrigadePaymentConfirmationException;

	/**
	 * Returns the fire brigade payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadePaymentConfirId the primary key of the fire brigade payment confirmation
	 * @return the fire brigade payment confirmation, or <code>null</code> if a fire brigade payment confirmation with the primary key could not be found
	 */
	public FireBrigadePaymentConfirmation fetchByPrimaryKey(
		long fireBrigadePaymentConfirId);

	/**
	 * Returns all the fire brigade payment confirmations.
	 *
	 * @return the fire brigade payment confirmations
	 */
	public java.util.List<FireBrigadePaymentConfirmation> findAll();

	/**
	 * Returns a range of all the fire brigade payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade payment confirmations
	 * @param end the upper bound of the range of fire brigade payment confirmations (not inclusive)
	 * @return the range of fire brigade payment confirmations
	 */
	public java.util.List<FireBrigadePaymentConfirmation> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the fire brigade payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade payment confirmations
	 * @param end the upper bound of the range of fire brigade payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade payment confirmations
	 */
	public java.util.List<FireBrigadePaymentConfirmation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadePaymentConfirmation> orderByComparator);

	/**
	 * Returns an ordered range of all the fire brigade payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadePaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade payment confirmations
	 * @param end the upper bound of the range of fire brigade payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade payment confirmations
	 */
	public java.util.List<FireBrigadePaymentConfirmation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadePaymentConfirmation> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the fire brigade payment confirmations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of fire brigade payment confirmations.
	 *
	 * @return the number of fire brigade payment confirmations
	 */
	public int countAll();

}