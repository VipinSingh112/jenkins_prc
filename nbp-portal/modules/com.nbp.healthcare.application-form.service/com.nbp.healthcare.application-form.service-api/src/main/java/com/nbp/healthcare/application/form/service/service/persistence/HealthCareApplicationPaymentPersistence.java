/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.healthcare.application.form.service.exception.NoSuchHealthCareApplicationPaymentException;
import com.nbp.healthcare.application.form.service.model.HealthCareApplicationPayment;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the health care application payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareApplicationPaymentUtil
 * @generated
 */
@ProviderType
public interface HealthCareApplicationPaymentPersistence
	extends BasePersistence<HealthCareApplicationPayment> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HealthCareApplicationPaymentUtil} to access the health care application payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the health care application payment where healthCareApplicationId = &#63; or throws a <code>NoSuchHealthCareApplicationPaymentException</code> if it could not be found.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care application payment
	 * @throws NoSuchHealthCareApplicationPaymentException if a matching health care application payment could not be found
	 */
	public HealthCareApplicationPayment findBygetHAP_HAI(
			long healthCareApplicationId)
		throws NoSuchHealthCareApplicationPaymentException;

	/**
	 * Returns the health care application payment where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care application payment, or <code>null</code> if a matching health care application payment could not be found
	 */
	public HealthCareApplicationPayment fetchBygetHAP_HAI(
		long healthCareApplicationId);

	/**
	 * Returns the health care application payment where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care application payment, or <code>null</code> if a matching health care application payment could not be found
	 */
	public HealthCareApplicationPayment fetchBygetHAP_HAI(
		long healthCareApplicationId, boolean useFinderCache);

	/**
	 * Removes the health care application payment where healthCareApplicationId = &#63; from the database.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the health care application payment that was removed
	 */
	public HealthCareApplicationPayment removeBygetHAP_HAI(
			long healthCareApplicationId)
		throws NoSuchHealthCareApplicationPaymentException;

	/**
	 * Returns the number of health care application payments where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the number of matching health care application payments
	 */
	public int countBygetHAP_HAI(long healthCareApplicationId);

	/**
	 * Caches the health care application payment in the entity cache if it is enabled.
	 *
	 * @param healthCareApplicationPayment the health care application payment
	 */
	public void cacheResult(
		HealthCareApplicationPayment healthCareApplicationPayment);

	/**
	 * Caches the health care application payments in the entity cache if it is enabled.
	 *
	 * @param healthCareApplicationPayments the health care application payments
	 */
	public void cacheResult(
		java.util.List<HealthCareApplicationPayment>
			healthCareApplicationPayments);

	/**
	 * Creates a new health care application payment with the primary key. Does not add the health care application payment to the database.
	 *
	 * @param healthCareApplicationPaymentId the primary key for the new health care application payment
	 * @return the new health care application payment
	 */
	public HealthCareApplicationPayment create(
		long healthCareApplicationPaymentId);

	/**
	 * Removes the health care application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthCareApplicationPaymentId the primary key of the health care application payment
	 * @return the health care application payment that was removed
	 * @throws NoSuchHealthCareApplicationPaymentException if a health care application payment with the primary key could not be found
	 */
	public HealthCareApplicationPayment remove(
			long healthCareApplicationPaymentId)
		throws NoSuchHealthCareApplicationPaymentException;

	public HealthCareApplicationPayment updateImpl(
		HealthCareApplicationPayment healthCareApplicationPayment);

	/**
	 * Returns the health care application payment with the primary key or throws a <code>NoSuchHealthCareApplicationPaymentException</code> if it could not be found.
	 *
	 * @param healthCareApplicationPaymentId the primary key of the health care application payment
	 * @return the health care application payment
	 * @throws NoSuchHealthCareApplicationPaymentException if a health care application payment with the primary key could not be found
	 */
	public HealthCareApplicationPayment findByPrimaryKey(
			long healthCareApplicationPaymentId)
		throws NoSuchHealthCareApplicationPaymentException;

	/**
	 * Returns the health care application payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthCareApplicationPaymentId the primary key of the health care application payment
	 * @return the health care application payment, or <code>null</code> if a health care application payment with the primary key could not be found
	 */
	public HealthCareApplicationPayment fetchByPrimaryKey(
		long healthCareApplicationPaymentId);

	/**
	 * Returns all the health care application payments.
	 *
	 * @return the health care application payments
	 */
	public java.util.List<HealthCareApplicationPayment> findAll();

	/**
	 * Returns a range of all the health care application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care application payments
	 * @param end the upper bound of the range of health care application payments (not inclusive)
	 * @return the range of health care application payments
	 */
	public java.util.List<HealthCareApplicationPayment> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the health care application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care application payments
	 * @param end the upper bound of the range of health care application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health care application payments
	 */
	public java.util.List<HealthCareApplicationPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthCareApplicationPayment> orderByComparator);

	/**
	 * Returns an ordered range of all the health care application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care application payments
	 * @param end the upper bound of the range of health care application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health care application payments
	 */
	public java.util.List<HealthCareApplicationPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthCareApplicationPayment> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the health care application payments from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of health care application payments.
	 *
	 * @return the number of health care application payments
	 */
	public int countAll();

}