/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezStatusAppPaymentException;
import com.nbp.sez.status.application.form.service.model.SezStatusAppPayment;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez status app payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusAppPaymentUtil
 * @generated
 */
@ProviderType
public interface SezStatusAppPaymentPersistence
	extends BasePersistence<SezStatusAppPayment> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezStatusAppPaymentUtil} to access the sez status app payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the sez status app payment where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezStatusAppPaymentException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status app payment
	 * @throws NoSuchSezStatusAppPaymentException if a matching sez status app payment could not be found
	 */
	public SezStatusAppPayment findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezStatusAppPaymentException;

	/**
	 * Returns the sez status app payment where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status app payment, or <code>null</code> if a matching sez status app payment could not be found
	 */
	public SezStatusAppPayment fetchBygetSezStatusByAppId(
		long sezStatusApplicationId);

	/**
	 * Returns the sez status app payment where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status app payment, or <code>null</code> if a matching sez status app payment could not be found
	 */
	public SezStatusAppPayment fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache);

	/**
	 * Removes the sez status app payment where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez status app payment that was removed
	 */
	public SezStatusAppPayment removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezStatusAppPaymentException;

	/**
	 * Returns the number of sez status app payments where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez status app payments
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez status app payment in the entity cache if it is enabled.
	 *
	 * @param sezStatusAppPayment the sez status app payment
	 */
	public void cacheResult(SezStatusAppPayment sezStatusAppPayment);

	/**
	 * Caches the sez status app payments in the entity cache if it is enabled.
	 *
	 * @param sezStatusAppPayments the sez status app payments
	 */
	public void cacheResult(
		java.util.List<SezStatusAppPayment> sezStatusAppPayments);

	/**
	 * Creates a new sez status app payment with the primary key. Does not add the sez status app payment to the database.
	 *
	 * @param sezStatusAppPaymentId the primary key for the new sez status app payment
	 * @return the new sez status app payment
	 */
	public SezStatusAppPayment create(long sezStatusAppPaymentId);

	/**
	 * Removes the sez status app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezStatusAppPaymentId the primary key of the sez status app payment
	 * @return the sez status app payment that was removed
	 * @throws NoSuchSezStatusAppPaymentException if a sez status app payment with the primary key could not be found
	 */
	public SezStatusAppPayment remove(long sezStatusAppPaymentId)
		throws NoSuchSezStatusAppPaymentException;

	public SezStatusAppPayment updateImpl(
		SezStatusAppPayment sezStatusAppPayment);

	/**
	 * Returns the sez status app payment with the primary key or throws a <code>NoSuchSezStatusAppPaymentException</code> if it could not be found.
	 *
	 * @param sezStatusAppPaymentId the primary key of the sez status app payment
	 * @return the sez status app payment
	 * @throws NoSuchSezStatusAppPaymentException if a sez status app payment with the primary key could not be found
	 */
	public SezStatusAppPayment findByPrimaryKey(long sezStatusAppPaymentId)
		throws NoSuchSezStatusAppPaymentException;

	/**
	 * Returns the sez status app payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezStatusAppPaymentId the primary key of the sez status app payment
	 * @return the sez status app payment, or <code>null</code> if a sez status app payment with the primary key could not be found
	 */
	public SezStatusAppPayment fetchByPrimaryKey(long sezStatusAppPaymentId);

	/**
	 * Returns all the sez status app payments.
	 *
	 * @return the sez status app payments
	 */
	public java.util.List<SezStatusAppPayment> findAll();

	/**
	 * Returns a range of all the sez status app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status app payments
	 * @param end the upper bound of the range of sez status app payments (not inclusive)
	 * @return the range of sez status app payments
	 */
	public java.util.List<SezStatusAppPayment> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the sez status app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status app payments
	 * @param end the upper bound of the range of sez status app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status app payments
	 */
	public java.util.List<SezStatusAppPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusAppPayment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sez status app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status app payments
	 * @param end the upper bound of the range of sez status app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status app payments
	 */
	public java.util.List<SezStatusAppPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusAppPayment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez status app payments from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez status app payments.
	 *
	 * @return the number of sez status app payments
	 */
	public int countAll();

}