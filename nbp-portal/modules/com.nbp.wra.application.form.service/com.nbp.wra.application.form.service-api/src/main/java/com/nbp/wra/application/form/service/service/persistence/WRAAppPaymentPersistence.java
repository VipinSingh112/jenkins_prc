/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.wra.application.form.service.exception.NoSuchWRAAppPaymentException;
import com.nbp.wra.application.form.service.model.WRAAppPayment;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the wra app payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WRAAppPaymentUtil
 * @generated
 */
@ProviderType
public interface WRAAppPaymentPersistence
	extends BasePersistence<WRAAppPayment> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link WRAAppPaymentUtil} to access the wra app payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the wra app payment where wraApplicationId = &#63; or throws a <code>NoSuchWRAAppPaymentException</code> if it could not be found.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra app payment
	 * @throws NoSuchWRAAppPaymentException if a matching wra app payment could not be found
	 */
	public WRAAppPayment findBygetWRA_By_Id(long wraApplicationId)
		throws NoSuchWRAAppPaymentException;

	/**
	 * Returns the wra app payment where wraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra app payment, or <code>null</code> if a matching wra app payment could not be found
	 */
	public WRAAppPayment fetchBygetWRA_By_Id(long wraApplicationId);

	/**
	 * Returns the wra app payment where wraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra app payment, or <code>null</code> if a matching wra app payment could not be found
	 */
	public WRAAppPayment fetchBygetWRA_By_Id(
		long wraApplicationId, boolean useFinderCache);

	/**
	 * Removes the wra app payment where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the wra app payment that was removed
	 */
	public WRAAppPayment removeBygetWRA_By_Id(long wraApplicationId)
		throws NoSuchWRAAppPaymentException;

	/**
	 * Returns the number of wra app payments where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching wra app payments
	 */
	public int countBygetWRA_By_Id(long wraApplicationId);

	/**
	 * Caches the wra app payment in the entity cache if it is enabled.
	 *
	 * @param wraAppPayment the wra app payment
	 */
	public void cacheResult(WRAAppPayment wraAppPayment);

	/**
	 * Caches the wra app payments in the entity cache if it is enabled.
	 *
	 * @param wraAppPayments the wra app payments
	 */
	public void cacheResult(java.util.List<WRAAppPayment> wraAppPayments);

	/**
	 * Creates a new wra app payment with the primary key. Does not add the wra app payment to the database.
	 *
	 * @param wraAppPaymentId the primary key for the new wra app payment
	 * @return the new wra app payment
	 */
	public WRAAppPayment create(long wraAppPaymentId);

	/**
	 * Removes the wra app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wraAppPaymentId the primary key of the wra app payment
	 * @return the wra app payment that was removed
	 * @throws NoSuchWRAAppPaymentException if a wra app payment with the primary key could not be found
	 */
	public WRAAppPayment remove(long wraAppPaymentId)
		throws NoSuchWRAAppPaymentException;

	public WRAAppPayment updateImpl(WRAAppPayment wraAppPayment);

	/**
	 * Returns the wra app payment with the primary key or throws a <code>NoSuchWRAAppPaymentException</code> if it could not be found.
	 *
	 * @param wraAppPaymentId the primary key of the wra app payment
	 * @return the wra app payment
	 * @throws NoSuchWRAAppPaymentException if a wra app payment with the primary key could not be found
	 */
	public WRAAppPayment findByPrimaryKey(long wraAppPaymentId)
		throws NoSuchWRAAppPaymentException;

	/**
	 * Returns the wra app payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wraAppPaymentId the primary key of the wra app payment
	 * @return the wra app payment, or <code>null</code> if a wra app payment with the primary key could not be found
	 */
	public WRAAppPayment fetchByPrimaryKey(long wraAppPaymentId);

	/**
	 * Returns all the wra app payments.
	 *
	 * @return the wra app payments
	 */
	public java.util.List<WRAAppPayment> findAll();

	/**
	 * Returns a range of all the wra app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra app payments
	 * @param end the upper bound of the range of wra app payments (not inclusive)
	 * @return the range of wra app payments
	 */
	public java.util.List<WRAAppPayment> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the wra app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra app payments
	 * @param end the upper bound of the range of wra app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wra app payments
	 */
	public java.util.List<WRAAppPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WRAAppPayment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the wra app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra app payments
	 * @param end the upper bound of the range of wra app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of wra app payments
	 */
	public java.util.List<WRAAppPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WRAAppPayment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the wra app payments from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of wra app payments.
	 *
	 * @return the number of wra app payments
	 */
	public int countAll();

}