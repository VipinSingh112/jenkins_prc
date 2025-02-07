/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.stages.services.exception.NoSuchTourismPaymentConfirmationException;
import com.nbp.tourism.application.stages.services.model.TourismPaymentConfirmation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism payment confirmation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismPaymentConfirmationUtil
 * @generated
 */
@ProviderType
public interface TourismPaymentConfirmationPersistence
	extends BasePersistence<TourismPaymentConfirmation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismPaymentConfirmationUtil} to access the tourism payment confirmation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism payment confirmation where caseId = &#63; or throws a <code>NoSuchTourismPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching tourism payment confirmation
	 * @throws NoSuchTourismPaymentConfirmationException if a matching tourism payment confirmation could not be found
	 */
	public TourismPaymentConfirmation findBygetTourismPaymentConfirmationBy_CI(
			String caseId)
		throws NoSuchTourismPaymentConfirmationException;

	/**
	 * Returns the tourism payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching tourism payment confirmation, or <code>null</code> if a matching tourism payment confirmation could not be found
	 */
	public TourismPaymentConfirmation fetchBygetTourismPaymentConfirmationBy_CI(
		String caseId);

	/**
	 * Returns the tourism payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism payment confirmation, or <code>null</code> if a matching tourism payment confirmation could not be found
	 */
	public TourismPaymentConfirmation fetchBygetTourismPaymentConfirmationBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the tourism payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the tourism payment confirmation that was removed
	 */
	public TourismPaymentConfirmation
			removeBygetTourismPaymentConfirmationBy_CI(String caseId)
		throws NoSuchTourismPaymentConfirmationException;

	/**
	 * Returns the number of tourism payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching tourism payment confirmations
	 */
	public int countBygetTourismPaymentConfirmationBy_CI(String caseId);

	/**
	 * Returns all the tourism payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching tourism payment confirmations
	 */
	public java.util.List<TourismPaymentConfirmation>
		findBygetTourismPaymentConfirmations_By_CI(String caseId);

	/**
	 * Returns a range of all the tourism payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of tourism payment confirmations
	 * @param end the upper bound of the range of tourism payment confirmations (not inclusive)
	 * @return the range of matching tourism payment confirmations
	 */
	public java.util.List<TourismPaymentConfirmation>
		findBygetTourismPaymentConfirmations_By_CI(
			String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the tourism payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of tourism payment confirmations
	 * @param end the upper bound of the range of tourism payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism payment confirmations
	 */
	public java.util.List<TourismPaymentConfirmation>
		findBygetTourismPaymentConfirmations_By_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismPaymentConfirmation> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of tourism payment confirmations
	 * @param end the upper bound of the range of tourism payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism payment confirmations
	 */
	public java.util.List<TourismPaymentConfirmation>
		findBygetTourismPaymentConfirmations_By_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismPaymentConfirmation> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first tourism payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism payment confirmation
	 * @throws NoSuchTourismPaymentConfirmationException if a matching tourism payment confirmation could not be found
	 */
	public TourismPaymentConfirmation
			findBygetTourismPaymentConfirmations_By_CI_First(
				String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<TourismPaymentConfirmation> orderByComparator)
		throws NoSuchTourismPaymentConfirmationException;

	/**
	 * Returns the first tourism payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism payment confirmation, or <code>null</code> if a matching tourism payment confirmation could not be found
	 */
	public TourismPaymentConfirmation
		fetchBygetTourismPaymentConfirmations_By_CI_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismPaymentConfirmation> orderByComparator);

	/**
	 * Returns the last tourism payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism payment confirmation
	 * @throws NoSuchTourismPaymentConfirmationException if a matching tourism payment confirmation could not be found
	 */
	public TourismPaymentConfirmation
			findBygetTourismPaymentConfirmations_By_CI_Last(
				String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<TourismPaymentConfirmation> orderByComparator)
		throws NoSuchTourismPaymentConfirmationException;

	/**
	 * Returns the last tourism payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism payment confirmation, or <code>null</code> if a matching tourism payment confirmation could not be found
	 */
	public TourismPaymentConfirmation
		fetchBygetTourismPaymentConfirmations_By_CI_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismPaymentConfirmation> orderByComparator);

	/**
	 * Returns the tourism payment confirmations before and after the current tourism payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param tourismPaymentId the primary key of the current tourism payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism payment confirmation
	 * @throws NoSuchTourismPaymentConfirmationException if a tourism payment confirmation with the primary key could not be found
	 */
	public TourismPaymentConfirmation[]
			findBygetTourismPaymentConfirmations_By_CI_PrevAndNext(
				long tourismPaymentId, String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<TourismPaymentConfirmation> orderByComparator)
		throws NoSuchTourismPaymentConfirmationException;

	/**
	 * Removes all the tourism payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetTourismPaymentConfirmations_By_CI(String caseId);

	/**
	 * Returns the number of tourism payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching tourism payment confirmations
	 */
	public int countBygetTourismPaymentConfirmations_By_CI(String caseId);

	/**
	 * Caches the tourism payment confirmation in the entity cache if it is enabled.
	 *
	 * @param tourismPaymentConfirmation the tourism payment confirmation
	 */
	public void cacheResult(
		TourismPaymentConfirmation tourismPaymentConfirmation);

	/**
	 * Caches the tourism payment confirmations in the entity cache if it is enabled.
	 *
	 * @param tourismPaymentConfirmations the tourism payment confirmations
	 */
	public void cacheResult(
		java.util.List<TourismPaymentConfirmation> tourismPaymentConfirmations);

	/**
	 * Creates a new tourism payment confirmation with the primary key. Does not add the tourism payment confirmation to the database.
	 *
	 * @param tourismPaymentId the primary key for the new tourism payment confirmation
	 * @return the new tourism payment confirmation
	 */
	public TourismPaymentConfirmation create(long tourismPaymentId);

	/**
	 * Removes the tourism payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismPaymentId the primary key of the tourism payment confirmation
	 * @return the tourism payment confirmation that was removed
	 * @throws NoSuchTourismPaymentConfirmationException if a tourism payment confirmation with the primary key could not be found
	 */
	public TourismPaymentConfirmation remove(long tourismPaymentId)
		throws NoSuchTourismPaymentConfirmationException;

	public TourismPaymentConfirmation updateImpl(
		TourismPaymentConfirmation tourismPaymentConfirmation);

	/**
	 * Returns the tourism payment confirmation with the primary key or throws a <code>NoSuchTourismPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param tourismPaymentId the primary key of the tourism payment confirmation
	 * @return the tourism payment confirmation
	 * @throws NoSuchTourismPaymentConfirmationException if a tourism payment confirmation with the primary key could not be found
	 */
	public TourismPaymentConfirmation findByPrimaryKey(long tourismPaymentId)
		throws NoSuchTourismPaymentConfirmationException;

	/**
	 * Returns the tourism payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismPaymentId the primary key of the tourism payment confirmation
	 * @return the tourism payment confirmation, or <code>null</code> if a tourism payment confirmation with the primary key could not be found
	 */
	public TourismPaymentConfirmation fetchByPrimaryKey(long tourismPaymentId);

	/**
	 * Returns all the tourism payment confirmations.
	 *
	 * @return the tourism payment confirmations
	 */
	public java.util.List<TourismPaymentConfirmation> findAll();

	/**
	 * Returns a range of all the tourism payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism payment confirmations
	 * @param end the upper bound of the range of tourism payment confirmations (not inclusive)
	 * @return the range of tourism payment confirmations
	 */
	public java.util.List<TourismPaymentConfirmation> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the tourism payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism payment confirmations
	 * @param end the upper bound of the range of tourism payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism payment confirmations
	 */
	public java.util.List<TourismPaymentConfirmation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismPaymentConfirmation> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism payment confirmations
	 * @param end the upper bound of the range of tourism payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism payment confirmations
	 */
	public java.util.List<TourismPaymentConfirmation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismPaymentConfirmation> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism payment confirmations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism payment confirmations.
	 *
	 * @return the number of tourism payment confirmations
	 */
	public int countAll();

}