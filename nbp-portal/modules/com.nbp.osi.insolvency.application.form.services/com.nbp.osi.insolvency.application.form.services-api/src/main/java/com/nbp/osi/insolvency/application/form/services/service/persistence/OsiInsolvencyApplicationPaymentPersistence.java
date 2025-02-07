/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchOsiInsolvencyApplicationPaymentException;
import com.nbp.osi.insolvency.application.form.services.model.OsiInsolvencyApplicationPayment;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi insolvency application payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvencyApplicationPaymentUtil
 * @generated
 */
@ProviderType
public interface OsiInsolvencyApplicationPaymentPersistence
	extends BasePersistence<OsiInsolvencyApplicationPayment> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OsiInsolvencyApplicationPaymentUtil} to access the osi insolvency application payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the osi insolvency application payment where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiInsolvencyApplicationPaymentException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolvency application payment
	 * @throws NoSuchOsiInsolvencyApplicationPaymentException if a matching osi insolvency application payment could not be found
	 */
	public OsiInsolvencyApplicationPayment findBygetOIP_OII(
			long osiInsolvencyId)
		throws NoSuchOsiInsolvencyApplicationPaymentException;

	/**
	 * Returns the osi insolvency application payment where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolvency application payment, or <code>null</code> if a matching osi insolvency application payment could not be found
	 */
	public OsiInsolvencyApplicationPayment fetchBygetOIP_OII(
		long osiInsolvencyId);

	/**
	 * Returns the osi insolvency application payment where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency application payment, or <code>null</code> if a matching osi insolvency application payment could not be found
	 */
	public OsiInsolvencyApplicationPayment fetchBygetOIP_OII(
		long osiInsolvencyId, boolean useFinderCache);

	/**
	 * Removes the osi insolvency application payment where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi insolvency application payment that was removed
	 */
	public OsiInsolvencyApplicationPayment removeBygetOIP_OII(
			long osiInsolvencyId)
		throws NoSuchOsiInsolvencyApplicationPaymentException;

	/**
	 * Returns the number of osi insolvency application payments where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi insolvency application payments
	 */
	public int countBygetOIP_OII(long osiInsolvencyId);

	/**
	 * Caches the osi insolvency application payment in the entity cache if it is enabled.
	 *
	 * @param osiInsolvencyApplicationPayment the osi insolvency application payment
	 */
	public void cacheResult(
		OsiInsolvencyApplicationPayment osiInsolvencyApplicationPayment);

	/**
	 * Caches the osi insolvency application payments in the entity cache if it is enabled.
	 *
	 * @param osiInsolvencyApplicationPayments the osi insolvency application payments
	 */
	public void cacheResult(
		java.util.List<OsiInsolvencyApplicationPayment>
			osiInsolvencyApplicationPayments);

	/**
	 * Creates a new osi insolvency application payment with the primary key. Does not add the osi insolvency application payment to the database.
	 *
	 * @param osiInsolveApplicationPaymentId the primary key for the new osi insolvency application payment
	 * @return the new osi insolvency application payment
	 */
	public OsiInsolvencyApplicationPayment create(
		long osiInsolveApplicationPaymentId);

	/**
	 * Removes the osi insolvency application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiInsolveApplicationPaymentId the primary key of the osi insolvency application payment
	 * @return the osi insolvency application payment that was removed
	 * @throws NoSuchOsiInsolvencyApplicationPaymentException if a osi insolvency application payment with the primary key could not be found
	 */
	public OsiInsolvencyApplicationPayment remove(
			long osiInsolveApplicationPaymentId)
		throws NoSuchOsiInsolvencyApplicationPaymentException;

	public OsiInsolvencyApplicationPayment updateImpl(
		OsiInsolvencyApplicationPayment osiInsolvencyApplicationPayment);

	/**
	 * Returns the osi insolvency application payment with the primary key or throws a <code>NoSuchOsiInsolvencyApplicationPaymentException</code> if it could not be found.
	 *
	 * @param osiInsolveApplicationPaymentId the primary key of the osi insolvency application payment
	 * @return the osi insolvency application payment
	 * @throws NoSuchOsiInsolvencyApplicationPaymentException if a osi insolvency application payment with the primary key could not be found
	 */
	public OsiInsolvencyApplicationPayment findByPrimaryKey(
			long osiInsolveApplicationPaymentId)
		throws NoSuchOsiInsolvencyApplicationPaymentException;

	/**
	 * Returns the osi insolvency application payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiInsolveApplicationPaymentId the primary key of the osi insolvency application payment
	 * @return the osi insolvency application payment, or <code>null</code> if a osi insolvency application payment with the primary key could not be found
	 */
	public OsiInsolvencyApplicationPayment fetchByPrimaryKey(
		long osiInsolveApplicationPaymentId);

	/**
	 * Returns all the osi insolvency application payments.
	 *
	 * @return the osi insolvency application payments
	 */
	public java.util.List<OsiInsolvencyApplicationPayment> findAll();

	/**
	 * Returns a range of all the osi insolvency application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency application payments
	 * @param end the upper bound of the range of osi insolvency application payments (not inclusive)
	 * @return the range of osi insolvency application payments
	 */
	public java.util.List<OsiInsolvencyApplicationPayment> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the osi insolvency application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency application payments
	 * @param end the upper bound of the range of osi insolvency application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi insolvency application payments
	 */
	public java.util.List<OsiInsolvencyApplicationPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolvencyApplicationPayment> orderByComparator);

	/**
	 * Returns an ordered range of all the osi insolvency application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency application payments
	 * @param end the upper bound of the range of osi insolvency application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi insolvency application payments
	 */
	public java.util.List<OsiInsolvencyApplicationPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolvencyApplicationPayment> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi insolvency application payments from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi insolvency application payments.
	 *
	 * @return the number of osi insolvency application payments
	 */
	public int countAll();

}