/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.stage.services.exception.NoSuchJtbPaymentConfirmationException;
import com.nbp.jtb.application.stage.services.model.JtbPaymentConfirmation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the jtb payment confirmation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JtbPaymentConfirmationUtil
 * @generated
 */
@ProviderType
public interface JtbPaymentConfirmationPersistence
	extends BasePersistence<JtbPaymentConfirmation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JtbPaymentConfirmationUtil} to access the jtb payment confirmation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the jtb payment confirmation where caseId = &#63; or throws a <code>NoSuchJtbPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb payment confirmation
	 * @throws NoSuchJtbPaymentConfirmationException if a matching jtb payment confirmation could not be found
	 */
	public JtbPaymentConfirmation findBygetJtbPaymentConfBy_CI(String caseId)
		throws NoSuchJtbPaymentConfirmationException;

	/**
	 * Returns the jtb payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb payment confirmation, or <code>null</code> if a matching jtb payment confirmation could not be found
	 */
	public JtbPaymentConfirmation fetchBygetJtbPaymentConfBy_CI(String caseId);

	/**
	 * Returns the jtb payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb payment confirmation, or <code>null</code> if a matching jtb payment confirmation could not be found
	 */
	public JtbPaymentConfirmation fetchBygetJtbPaymentConfBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the jtb payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jtb payment confirmation that was removed
	 */
	public JtbPaymentConfirmation removeBygetJtbPaymentConfBy_CI(String caseId)
		throws NoSuchJtbPaymentConfirmationException;

	/**
	 * Returns the number of jtb payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jtb payment confirmations
	 */
	public int countBygetJtbPaymentConfBy_CI(String caseId);

	/**
	 * Returns all the jtb payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb payment confirmations
	 */
	public java.util.List<JtbPaymentConfirmation> findBygetJtbPayConfBy_CI(
		String caseId);

	/**
	 * Returns a range of all the jtb payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb payment confirmations
	 * @param end the upper bound of the range of jtb payment confirmations (not inclusive)
	 * @return the range of matching jtb payment confirmations
	 */
	public java.util.List<JtbPaymentConfirmation> findBygetJtbPayConfBy_CI(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the jtb payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb payment confirmations
	 * @param end the upper bound of the range of jtb payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb payment confirmations
	 */
	public java.util.List<JtbPaymentConfirmation> findBygetJtbPayConfBy_CI(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbPaymentConfirmation>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jtb payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb payment confirmations
	 * @param end the upper bound of the range of jtb payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb payment confirmations
	 */
	public java.util.List<JtbPaymentConfirmation> findBygetJtbPayConfBy_CI(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbPaymentConfirmation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jtb payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb payment confirmation
	 * @throws NoSuchJtbPaymentConfirmationException if a matching jtb payment confirmation could not be found
	 */
	public JtbPaymentConfirmation findBygetJtbPayConfBy_CI_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbPaymentConfirmation> orderByComparator)
		throws NoSuchJtbPaymentConfirmationException;

	/**
	 * Returns the first jtb payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb payment confirmation, or <code>null</code> if a matching jtb payment confirmation could not be found
	 */
	public JtbPaymentConfirmation fetchBygetJtbPayConfBy_CI_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<JtbPaymentConfirmation>
			orderByComparator);

	/**
	 * Returns the last jtb payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb payment confirmation
	 * @throws NoSuchJtbPaymentConfirmationException if a matching jtb payment confirmation could not be found
	 */
	public JtbPaymentConfirmation findBygetJtbPayConfBy_CI_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbPaymentConfirmation> orderByComparator)
		throws NoSuchJtbPaymentConfirmationException;

	/**
	 * Returns the last jtb payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb payment confirmation, or <code>null</code> if a matching jtb payment confirmation could not be found
	 */
	public JtbPaymentConfirmation fetchBygetJtbPayConfBy_CI_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<JtbPaymentConfirmation>
			orderByComparator);

	/**
	 * Returns the jtb payment confirmations before and after the current jtb payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param jtbPaymentConfirmationId the primary key of the current jtb payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb payment confirmation
	 * @throws NoSuchJtbPaymentConfirmationException if a jtb payment confirmation with the primary key could not be found
	 */
	public JtbPaymentConfirmation[] findBygetJtbPayConfBy_CI_PrevAndNext(
			long jtbPaymentConfirmationId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbPaymentConfirmation> orderByComparator)
		throws NoSuchJtbPaymentConfirmationException;

	/**
	 * Removes all the jtb payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetJtbPayConfBy_CI(String caseId);

	/**
	 * Returns the number of jtb payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jtb payment confirmations
	 */
	public int countBygetJtbPayConfBy_CI(String caseId);

	/**
	 * Caches the jtb payment confirmation in the entity cache if it is enabled.
	 *
	 * @param jtbPaymentConfirmation the jtb payment confirmation
	 */
	public void cacheResult(JtbPaymentConfirmation jtbPaymentConfirmation);

	/**
	 * Caches the jtb payment confirmations in the entity cache if it is enabled.
	 *
	 * @param jtbPaymentConfirmations the jtb payment confirmations
	 */
	public void cacheResult(
		java.util.List<JtbPaymentConfirmation> jtbPaymentConfirmations);

	/**
	 * Creates a new jtb payment confirmation with the primary key. Does not add the jtb payment confirmation to the database.
	 *
	 * @param jtbPaymentConfirmationId the primary key for the new jtb payment confirmation
	 * @return the new jtb payment confirmation
	 */
	public JtbPaymentConfirmation create(long jtbPaymentConfirmationId);

	/**
	 * Removes the jtb payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jtbPaymentConfirmationId the primary key of the jtb payment confirmation
	 * @return the jtb payment confirmation that was removed
	 * @throws NoSuchJtbPaymentConfirmationException if a jtb payment confirmation with the primary key could not be found
	 */
	public JtbPaymentConfirmation remove(long jtbPaymentConfirmationId)
		throws NoSuchJtbPaymentConfirmationException;

	public JtbPaymentConfirmation updateImpl(
		JtbPaymentConfirmation jtbPaymentConfirmation);

	/**
	 * Returns the jtb payment confirmation with the primary key or throws a <code>NoSuchJtbPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param jtbPaymentConfirmationId the primary key of the jtb payment confirmation
	 * @return the jtb payment confirmation
	 * @throws NoSuchJtbPaymentConfirmationException if a jtb payment confirmation with the primary key could not be found
	 */
	public JtbPaymentConfirmation findByPrimaryKey(
			long jtbPaymentConfirmationId)
		throws NoSuchJtbPaymentConfirmationException;

	/**
	 * Returns the jtb payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jtbPaymentConfirmationId the primary key of the jtb payment confirmation
	 * @return the jtb payment confirmation, or <code>null</code> if a jtb payment confirmation with the primary key could not be found
	 */
	public JtbPaymentConfirmation fetchByPrimaryKey(
		long jtbPaymentConfirmationId);

	/**
	 * Returns all the jtb payment confirmations.
	 *
	 * @return the jtb payment confirmations
	 */
	public java.util.List<JtbPaymentConfirmation> findAll();

	/**
	 * Returns a range of all the jtb payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb payment confirmations
	 * @param end the upper bound of the range of jtb payment confirmations (not inclusive)
	 * @return the range of jtb payment confirmations
	 */
	public java.util.List<JtbPaymentConfirmation> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the jtb payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb payment confirmations
	 * @param end the upper bound of the range of jtb payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb payment confirmations
	 */
	public java.util.List<JtbPaymentConfirmation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbPaymentConfirmation>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jtb payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb payment confirmations
	 * @param end the upper bound of the range of jtb payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb payment confirmations
	 */
	public java.util.List<JtbPaymentConfirmation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbPaymentConfirmation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the jtb payment confirmations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of jtb payment confirmations.
	 *
	 * @return the number of jtb payment confirmations
	 */
	public int countAll();

}