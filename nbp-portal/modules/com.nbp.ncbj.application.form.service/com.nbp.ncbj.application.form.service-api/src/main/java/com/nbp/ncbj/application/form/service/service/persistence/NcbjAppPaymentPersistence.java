/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjAppPaymentException;
import com.nbp.ncbj.application.form.service.model.NcbjAppPayment;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncbj app payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjAppPaymentUtil
 * @generated
 */
@ProviderType
public interface NcbjAppPaymentPersistence
	extends BasePersistence<NcbjAppPayment> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcbjAppPaymentUtil} to access the ncbj app payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the ncbj app payment where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjAppPaymentException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj app payment
	 * @throws NoSuchNcbjAppPaymentException if a matching ncbj app payment could not be found
	 */
	public NcbjAppPayment findBygetNcbjAppById(long ncbjApplicationId)
		throws NoSuchNcbjAppPaymentException;

	/**
	 * Returns the ncbj app payment where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj app payment, or <code>null</code> if a matching ncbj app payment could not be found
	 */
	public NcbjAppPayment fetchBygetNcbjAppById(long ncbjApplicationId);

	/**
	 * Returns the ncbj app payment where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj app payment, or <code>null</code> if a matching ncbj app payment could not be found
	 */
	public NcbjAppPayment fetchBygetNcbjAppById(
		long ncbjApplicationId, boolean useFinderCache);

	/**
	 * Removes the ncbj app payment where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj app payment that was removed
	 */
	public NcbjAppPayment removeBygetNcbjAppById(long ncbjApplicationId)
		throws NoSuchNcbjAppPaymentException;

	/**
	 * Returns the number of ncbj app payments where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj app payments
	 */
	public int countBygetNcbjAppById(long ncbjApplicationId);

	/**
	 * Caches the ncbj app payment in the entity cache if it is enabled.
	 *
	 * @param ncbjAppPayment the ncbj app payment
	 */
	public void cacheResult(NcbjAppPayment ncbjAppPayment);

	/**
	 * Caches the ncbj app payments in the entity cache if it is enabled.
	 *
	 * @param ncbjAppPayments the ncbj app payments
	 */
	public void cacheResult(java.util.List<NcbjAppPayment> ncbjAppPayments);

	/**
	 * Creates a new ncbj app payment with the primary key. Does not add the ncbj app payment to the database.
	 *
	 * @param ncbjAppPaymentId the primary key for the new ncbj app payment
	 * @return the new ncbj app payment
	 */
	public NcbjAppPayment create(long ncbjAppPaymentId);

	/**
	 * Removes the ncbj app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjAppPaymentId the primary key of the ncbj app payment
	 * @return the ncbj app payment that was removed
	 * @throws NoSuchNcbjAppPaymentException if a ncbj app payment with the primary key could not be found
	 */
	public NcbjAppPayment remove(long ncbjAppPaymentId)
		throws NoSuchNcbjAppPaymentException;

	public NcbjAppPayment updateImpl(NcbjAppPayment ncbjAppPayment);

	/**
	 * Returns the ncbj app payment with the primary key or throws a <code>NoSuchNcbjAppPaymentException</code> if it could not be found.
	 *
	 * @param ncbjAppPaymentId the primary key of the ncbj app payment
	 * @return the ncbj app payment
	 * @throws NoSuchNcbjAppPaymentException if a ncbj app payment with the primary key could not be found
	 */
	public NcbjAppPayment findByPrimaryKey(long ncbjAppPaymentId)
		throws NoSuchNcbjAppPaymentException;

	/**
	 * Returns the ncbj app payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjAppPaymentId the primary key of the ncbj app payment
	 * @return the ncbj app payment, or <code>null</code> if a ncbj app payment with the primary key could not be found
	 */
	public NcbjAppPayment fetchByPrimaryKey(long ncbjAppPaymentId);

	/**
	 * Returns all the ncbj app payments.
	 *
	 * @return the ncbj app payments
	 */
	public java.util.List<NcbjAppPayment> findAll();

	/**
	 * Returns a range of all the ncbj app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj app payments
	 * @param end the upper bound of the range of ncbj app payments (not inclusive)
	 * @return the range of ncbj app payments
	 */
	public java.util.List<NcbjAppPayment> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ncbj app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj app payments
	 * @param end the upper bound of the range of ncbj app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj app payments
	 */
	public java.util.List<NcbjAppPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjAppPayment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj app payments
	 * @param end the upper bound of the range of ncbj app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj app payments
	 */
	public java.util.List<NcbjAppPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjAppPayment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncbj app payments from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncbj app payments.
	 *
	 * @return the number of ncbj app payments
	 */
	public int countAll();

}