/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.quary.application.form.service.exception.NoSuchQuarryApplicationPaymentException;
import com.nbp.quary.application.form.service.model.QuarryApplicationPayment;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the quarry application payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryApplicationPaymentUtil
 * @generated
 */
@ProviderType
public interface QuarryApplicationPaymentPersistence
	extends BasePersistence<QuarryApplicationPayment> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QuarryApplicationPaymentUtil} to access the quarry application payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the quarry application payment where quarryApplicationId = &#63; or throws a <code>NoSuchQuarryApplicationPaymentException</code> if it could not be found.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry application payment
	 * @throws NoSuchQuarryApplicationPaymentException if a matching quarry application payment could not be found
	 */
	public QuarryApplicationPayment findBygetQuarry_Pay_AppId(
			long quarryApplicationId)
		throws NoSuchQuarryApplicationPaymentException;

	/**
	 * Returns the quarry application payment where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry application payment, or <code>null</code> if a matching quarry application payment could not be found
	 */
	public QuarryApplicationPayment fetchBygetQuarry_Pay_AppId(
		long quarryApplicationId);

	/**
	 * Returns the quarry application payment where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application payment, or <code>null</code> if a matching quarry application payment could not be found
	 */
	public QuarryApplicationPayment fetchBygetQuarry_Pay_AppId(
		long quarryApplicationId, boolean useFinderCache);

	/**
	 * Removes the quarry application payment where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the quarry application payment that was removed
	 */
	public QuarryApplicationPayment removeBygetQuarry_Pay_AppId(
			long quarryApplicationId)
		throws NoSuchQuarryApplicationPaymentException;

	/**
	 * Returns the number of quarry application payments where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry application payments
	 */
	public int countBygetQuarry_Pay_AppId(long quarryApplicationId);

	/**
	 * Caches the quarry application payment in the entity cache if it is enabled.
	 *
	 * @param quarryApplicationPayment the quarry application payment
	 */
	public void cacheResult(QuarryApplicationPayment quarryApplicationPayment);

	/**
	 * Caches the quarry application payments in the entity cache if it is enabled.
	 *
	 * @param quarryApplicationPayments the quarry application payments
	 */
	public void cacheResult(
		java.util.List<QuarryApplicationPayment> quarryApplicationPayments);

	/**
	 * Creates a new quarry application payment with the primary key. Does not add the quarry application payment to the database.
	 *
	 * @param quarryApplicationPaymentId the primary key for the new quarry application payment
	 * @return the new quarry application payment
	 */
	public QuarryApplicationPayment create(long quarryApplicationPaymentId);

	/**
	 * Removes the quarry application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param quarryApplicationPaymentId the primary key of the quarry application payment
	 * @return the quarry application payment that was removed
	 * @throws NoSuchQuarryApplicationPaymentException if a quarry application payment with the primary key could not be found
	 */
	public QuarryApplicationPayment remove(long quarryApplicationPaymentId)
		throws NoSuchQuarryApplicationPaymentException;

	public QuarryApplicationPayment updateImpl(
		QuarryApplicationPayment quarryApplicationPayment);

	/**
	 * Returns the quarry application payment with the primary key or throws a <code>NoSuchQuarryApplicationPaymentException</code> if it could not be found.
	 *
	 * @param quarryApplicationPaymentId the primary key of the quarry application payment
	 * @return the quarry application payment
	 * @throws NoSuchQuarryApplicationPaymentException if a quarry application payment with the primary key could not be found
	 */
	public QuarryApplicationPayment findByPrimaryKey(
			long quarryApplicationPaymentId)
		throws NoSuchQuarryApplicationPaymentException;

	/**
	 * Returns the quarry application payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param quarryApplicationPaymentId the primary key of the quarry application payment
	 * @return the quarry application payment, or <code>null</code> if a quarry application payment with the primary key could not be found
	 */
	public QuarryApplicationPayment fetchByPrimaryKey(
		long quarryApplicationPaymentId);

	/**
	 * Returns all the quarry application payments.
	 *
	 * @return the quarry application payments
	 */
	public java.util.List<QuarryApplicationPayment> findAll();

	/**
	 * Returns a range of all the quarry application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry application payments
	 * @param end the upper bound of the range of quarry application payments (not inclusive)
	 * @return the range of quarry application payments
	 */
	public java.util.List<QuarryApplicationPayment> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the quarry application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry application payments
	 * @param end the upper bound of the range of quarry application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry application payments
	 */
	public java.util.List<QuarryApplicationPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryApplicationPayment> orderByComparator);

	/**
	 * Returns an ordered range of all the quarry application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry application payments
	 * @param end the upper bound of the range of quarry application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry application payments
	 */
	public java.util.List<QuarryApplicationPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryApplicationPayment> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the quarry application payments from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of quarry application payments.
	 *
	 * @return the number of quarry application payments
	 */
	public int countAll();

}