/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.cannabis.application.form.services.exception.NoSuchCannabisApplicationPaymentException;
import com.nbp.cannabis.application.form.services.model.CannabisApplicationPayment;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the cannabis application payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationPaymentUtil
 * @generated
 */
@ProviderType
public interface CannabisApplicationPaymentPersistence
	extends BasePersistence<CannabisApplicationPayment> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CannabisApplicationPaymentUtil} to access the cannabis application payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the cannabis application payment where cannabisApplicationId = &#63; or throws a <code>NoSuchCannabisApplicationPaymentException</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application payment
	 * @throws NoSuchCannabisApplicationPaymentException if a matching cannabis application payment could not be found
	 */
	public CannabisApplicationPayment findBygetCAP_CAI(
			long cannabisApplicationId)
		throws NoSuchCannabisApplicationPaymentException;

	/**
	 * Returns the cannabis application payment where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application payment, or <code>null</code> if a matching cannabis application payment could not be found
	 */
	public CannabisApplicationPayment fetchBygetCAP_CAI(
		long cannabisApplicationId);

	/**
	 * Returns the cannabis application payment where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application payment, or <code>null</code> if a matching cannabis application payment could not be found
	 */
	public CannabisApplicationPayment fetchBygetCAP_CAI(
		long cannabisApplicationId, boolean useFinderCache);

	/**
	 * Removes the cannabis application payment where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the cannabis application payment that was removed
	 */
	public CannabisApplicationPayment removeBygetCAP_CAI(
			long cannabisApplicationId)
		throws NoSuchCannabisApplicationPaymentException;

	/**
	 * Returns the number of cannabis application payments where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis application payments
	 */
	public int countBygetCAP_CAI(long cannabisApplicationId);

	/**
	 * Caches the cannabis application payment in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationPayment the cannabis application payment
	 */
	public void cacheResult(
		CannabisApplicationPayment cannabisApplicationPayment);

	/**
	 * Caches the cannabis application payments in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationPayments the cannabis application payments
	 */
	public void cacheResult(
		java.util.List<CannabisApplicationPayment> cannabisApplicationPayments);

	/**
	 * Creates a new cannabis application payment with the primary key. Does not add the cannabis application payment to the database.
	 *
	 * @param cannabisApplicationPaymentId the primary key for the new cannabis application payment
	 * @return the new cannabis application payment
	 */
	public CannabisApplicationPayment create(long cannabisApplicationPaymentId);

	/**
	 * Removes the cannabis application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisApplicationPaymentId the primary key of the cannabis application payment
	 * @return the cannabis application payment that was removed
	 * @throws NoSuchCannabisApplicationPaymentException if a cannabis application payment with the primary key could not be found
	 */
	public CannabisApplicationPayment remove(long cannabisApplicationPaymentId)
		throws NoSuchCannabisApplicationPaymentException;

	public CannabisApplicationPayment updateImpl(
		CannabisApplicationPayment cannabisApplicationPayment);

	/**
	 * Returns the cannabis application payment with the primary key or throws a <code>NoSuchCannabisApplicationPaymentException</code> if it could not be found.
	 *
	 * @param cannabisApplicationPaymentId the primary key of the cannabis application payment
	 * @return the cannabis application payment
	 * @throws NoSuchCannabisApplicationPaymentException if a cannabis application payment with the primary key could not be found
	 */
	public CannabisApplicationPayment findByPrimaryKey(
			long cannabisApplicationPaymentId)
		throws NoSuchCannabisApplicationPaymentException;

	/**
	 * Returns the cannabis application payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisApplicationPaymentId the primary key of the cannabis application payment
	 * @return the cannabis application payment, or <code>null</code> if a cannabis application payment with the primary key could not be found
	 */
	public CannabisApplicationPayment fetchByPrimaryKey(
		long cannabisApplicationPaymentId);

	/**
	 * Returns all the cannabis application payments.
	 *
	 * @return the cannabis application payments
	 */
	public java.util.List<CannabisApplicationPayment> findAll();

	/**
	 * Returns a range of all the cannabis application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application payments
	 * @param end the upper bound of the range of cannabis application payments (not inclusive)
	 * @return the range of cannabis application payments
	 */
	public java.util.List<CannabisApplicationPayment> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the cannabis application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application payments
	 * @param end the upper bound of the range of cannabis application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis application payments
	 */
	public java.util.List<CannabisApplicationPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationPayment> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application payments
	 * @param end the upper bound of the range of cannabis application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis application payments
	 */
	public java.util.List<CannabisApplicationPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationPayment> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the cannabis application payments from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of cannabis application payments.
	 *
	 * @return the number of cannabis application payments
	 */
	public int countAll();

}