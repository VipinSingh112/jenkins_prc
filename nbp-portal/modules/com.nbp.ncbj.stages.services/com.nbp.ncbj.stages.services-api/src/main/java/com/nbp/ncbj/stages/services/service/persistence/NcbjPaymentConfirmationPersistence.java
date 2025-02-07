/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncbj.stages.services.exception.NoSuchNcbjPaymentConfirmationException;
import com.nbp.ncbj.stages.services.model.NcbjPaymentConfirmation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncbj payment confirmation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjPaymentConfirmationUtil
 * @generated
 */
@ProviderType
public interface NcbjPaymentConfirmationPersistence
	extends BasePersistence<NcbjPaymentConfirmation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcbjPaymentConfirmationUtil} to access the ncbj payment confirmation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the ncbj payment confirmation where caseId = &#63; or throws a <code>NoSuchNcbjPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj payment confirmation
	 * @throws NoSuchNcbjPaymentConfirmationException if a matching ncbj payment confirmation could not be found
	 */
	public NcbjPaymentConfirmation findBygetNcbjPaymentConfBy_CI(String caseId)
		throws NoSuchNcbjPaymentConfirmationException;

	/**
	 * Returns the ncbj payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj payment confirmation, or <code>null</code> if a matching ncbj payment confirmation could not be found
	 */
	public NcbjPaymentConfirmation fetchBygetNcbjPaymentConfBy_CI(
		String caseId);

	/**
	 * Returns the ncbj payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj payment confirmation, or <code>null</code> if a matching ncbj payment confirmation could not be found
	 */
	public NcbjPaymentConfirmation fetchBygetNcbjPaymentConfBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the ncbj payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ncbj payment confirmation that was removed
	 */
	public NcbjPaymentConfirmation removeBygetNcbjPaymentConfBy_CI(
			String caseId)
		throws NoSuchNcbjPaymentConfirmationException;

	/**
	 * Returns the number of ncbj payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncbj payment confirmations
	 */
	public int countBygetNcbjPaymentConfBy_CI(String caseId);

	/**
	 * Returns all the ncbj payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj payment confirmations
	 */
	public java.util.List<NcbjPaymentConfirmation> findBygetNcbjPayConfBy_CI(
		String caseId);

	/**
	 * Returns a range of all the ncbj payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj payment confirmations
	 * @param end the upper bound of the range of ncbj payment confirmations (not inclusive)
	 * @return the range of matching ncbj payment confirmations
	 */
	public java.util.List<NcbjPaymentConfirmation> findBygetNcbjPayConfBy_CI(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the ncbj payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj payment confirmations
	 * @param end the upper bound of the range of ncbj payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj payment confirmations
	 */
	public java.util.List<NcbjPaymentConfirmation> findBygetNcbjPayConfBy_CI(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<NcbjPaymentConfirmation> orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj payment confirmations
	 * @param end the upper bound of the range of ncbj payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj payment confirmations
	 */
	public java.util.List<NcbjPaymentConfirmation> findBygetNcbjPayConfBy_CI(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<NcbjPaymentConfirmation> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncbj payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj payment confirmation
	 * @throws NoSuchNcbjPaymentConfirmationException if a matching ncbj payment confirmation could not be found
	 */
	public NcbjPaymentConfirmation findBygetNcbjPayConfBy_CI_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjPaymentConfirmation> orderByComparator)
		throws NoSuchNcbjPaymentConfirmationException;

	/**
	 * Returns the first ncbj payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj payment confirmation, or <code>null</code> if a matching ncbj payment confirmation could not be found
	 */
	public NcbjPaymentConfirmation fetchBygetNcbjPayConfBy_CI_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<NcbjPaymentConfirmation> orderByComparator);

	/**
	 * Returns the last ncbj payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj payment confirmation
	 * @throws NoSuchNcbjPaymentConfirmationException if a matching ncbj payment confirmation could not be found
	 */
	public NcbjPaymentConfirmation findBygetNcbjPayConfBy_CI_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjPaymentConfirmation> orderByComparator)
		throws NoSuchNcbjPaymentConfirmationException;

	/**
	 * Returns the last ncbj payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj payment confirmation, or <code>null</code> if a matching ncbj payment confirmation could not be found
	 */
	public NcbjPaymentConfirmation fetchBygetNcbjPayConfBy_CI_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<NcbjPaymentConfirmation> orderByComparator);

	/**
	 * Returns the ncbj payment confirmations before and after the current ncbj payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param ncbjPaymentConfirmationId the primary key of the current ncbj payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj payment confirmation
	 * @throws NoSuchNcbjPaymentConfirmationException if a ncbj payment confirmation with the primary key could not be found
	 */
	public NcbjPaymentConfirmation[] findBygetNcbjPayConfBy_CI_PrevAndNext(
			long ncbjPaymentConfirmationId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjPaymentConfirmation> orderByComparator)
		throws NoSuchNcbjPaymentConfirmationException;

	/**
	 * Removes all the ncbj payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetNcbjPayConfBy_CI(String caseId);

	/**
	 * Returns the number of ncbj payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncbj payment confirmations
	 */
	public int countBygetNcbjPayConfBy_CI(String caseId);

	/**
	 * Caches the ncbj payment confirmation in the entity cache if it is enabled.
	 *
	 * @param ncbjPaymentConfirmation the ncbj payment confirmation
	 */
	public void cacheResult(NcbjPaymentConfirmation ncbjPaymentConfirmation);

	/**
	 * Caches the ncbj payment confirmations in the entity cache if it is enabled.
	 *
	 * @param ncbjPaymentConfirmations the ncbj payment confirmations
	 */
	public void cacheResult(
		java.util.List<NcbjPaymentConfirmation> ncbjPaymentConfirmations);

	/**
	 * Creates a new ncbj payment confirmation with the primary key. Does not add the ncbj payment confirmation to the database.
	 *
	 * @param ncbjPaymentConfirmationId the primary key for the new ncbj payment confirmation
	 * @return the new ncbj payment confirmation
	 */
	public NcbjPaymentConfirmation create(long ncbjPaymentConfirmationId);

	/**
	 * Removes the ncbj payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjPaymentConfirmationId the primary key of the ncbj payment confirmation
	 * @return the ncbj payment confirmation that was removed
	 * @throws NoSuchNcbjPaymentConfirmationException if a ncbj payment confirmation with the primary key could not be found
	 */
	public NcbjPaymentConfirmation remove(long ncbjPaymentConfirmationId)
		throws NoSuchNcbjPaymentConfirmationException;

	public NcbjPaymentConfirmation updateImpl(
		NcbjPaymentConfirmation ncbjPaymentConfirmation);

	/**
	 * Returns the ncbj payment confirmation with the primary key or throws a <code>NoSuchNcbjPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param ncbjPaymentConfirmationId the primary key of the ncbj payment confirmation
	 * @return the ncbj payment confirmation
	 * @throws NoSuchNcbjPaymentConfirmationException if a ncbj payment confirmation with the primary key could not be found
	 */
	public NcbjPaymentConfirmation findByPrimaryKey(
			long ncbjPaymentConfirmationId)
		throws NoSuchNcbjPaymentConfirmationException;

	/**
	 * Returns the ncbj payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjPaymentConfirmationId the primary key of the ncbj payment confirmation
	 * @return the ncbj payment confirmation, or <code>null</code> if a ncbj payment confirmation with the primary key could not be found
	 */
	public NcbjPaymentConfirmation fetchByPrimaryKey(
		long ncbjPaymentConfirmationId);

	/**
	 * Returns all the ncbj payment confirmations.
	 *
	 * @return the ncbj payment confirmations
	 */
	public java.util.List<NcbjPaymentConfirmation> findAll();

	/**
	 * Returns a range of all the ncbj payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj payment confirmations
	 * @param end the upper bound of the range of ncbj payment confirmations (not inclusive)
	 * @return the range of ncbj payment confirmations
	 */
	public java.util.List<NcbjPaymentConfirmation> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ncbj payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj payment confirmations
	 * @param end the upper bound of the range of ncbj payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj payment confirmations
	 */
	public java.util.List<NcbjPaymentConfirmation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<NcbjPaymentConfirmation> orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj payment confirmations
	 * @param end the upper bound of the range of ncbj payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj payment confirmations
	 */
	public java.util.List<NcbjPaymentConfirmation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<NcbjPaymentConfirmation> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncbj payment confirmations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncbj payment confirmations.
	 *
	 * @return the number of ncbj payment confirmations
	 */
	public int countAll();

}