/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.pharmaceutical.application.form.service.exception.NoSuchPharmaApplicationPaymentException;
import com.nbp.pharmaceutical.application.form.service.model.PharmaApplicationPayment;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the pharma application payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationPaymentUtil
 * @generated
 */
@ProviderType
public interface PharmaApplicationPaymentPersistence
	extends BasePersistence<PharmaApplicationPayment> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PharmaApplicationPaymentUtil} to access the pharma application payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the pharma application payment where pharmaApplicationId = &#63; or throws a <code>NoSuchPharmaApplicationPaymentException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma application payment
	 * @throws NoSuchPharmaApplicationPaymentException if a matching pharma application payment could not be found
	 */
	public PharmaApplicationPayment findBygetPAP_PAI(long pharmaApplicationId)
		throws NoSuchPharmaApplicationPaymentException;

	/**
	 * Returns the pharma application payment where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma application payment, or <code>null</code> if a matching pharma application payment could not be found
	 */
	public PharmaApplicationPayment fetchBygetPAP_PAI(long pharmaApplicationId);

	/**
	 * Returns the pharma application payment where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application payment, or <code>null</code> if a matching pharma application payment could not be found
	 */
	public PharmaApplicationPayment fetchBygetPAP_PAI(
		long pharmaApplicationId, boolean useFinderCache);

	/**
	 * Removes the pharma application payment where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the pharma application payment that was removed
	 */
	public PharmaApplicationPayment removeBygetPAP_PAI(long pharmaApplicationId)
		throws NoSuchPharmaApplicationPaymentException;

	/**
	 * Returns the number of pharma application payments where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma application payments
	 */
	public int countBygetPAP_PAI(long pharmaApplicationId);

	/**
	 * Caches the pharma application payment in the entity cache if it is enabled.
	 *
	 * @param pharmaApplicationPayment the pharma application payment
	 */
	public void cacheResult(PharmaApplicationPayment pharmaApplicationPayment);

	/**
	 * Caches the pharma application payments in the entity cache if it is enabled.
	 *
	 * @param pharmaApplicationPayments the pharma application payments
	 */
	public void cacheResult(
		java.util.List<PharmaApplicationPayment> pharmaApplicationPayments);

	/**
	 * Creates a new pharma application payment with the primary key. Does not add the pharma application payment to the database.
	 *
	 * @param pharmaApplicationPaymentId the primary key for the new pharma application payment
	 * @return the new pharma application payment
	 */
	public PharmaApplicationPayment create(long pharmaApplicationPaymentId);

	/**
	 * Removes the pharma application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaApplicationPaymentId the primary key of the pharma application payment
	 * @return the pharma application payment that was removed
	 * @throws NoSuchPharmaApplicationPaymentException if a pharma application payment with the primary key could not be found
	 */
	public PharmaApplicationPayment remove(long pharmaApplicationPaymentId)
		throws NoSuchPharmaApplicationPaymentException;

	public PharmaApplicationPayment updateImpl(
		PharmaApplicationPayment pharmaApplicationPayment);

	/**
	 * Returns the pharma application payment with the primary key or throws a <code>NoSuchPharmaApplicationPaymentException</code> if it could not be found.
	 *
	 * @param pharmaApplicationPaymentId the primary key of the pharma application payment
	 * @return the pharma application payment
	 * @throws NoSuchPharmaApplicationPaymentException if a pharma application payment with the primary key could not be found
	 */
	public PharmaApplicationPayment findByPrimaryKey(
			long pharmaApplicationPaymentId)
		throws NoSuchPharmaApplicationPaymentException;

	/**
	 * Returns the pharma application payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaApplicationPaymentId the primary key of the pharma application payment
	 * @return the pharma application payment, or <code>null</code> if a pharma application payment with the primary key could not be found
	 */
	public PharmaApplicationPayment fetchByPrimaryKey(
		long pharmaApplicationPaymentId);

	/**
	 * Returns all the pharma application payments.
	 *
	 * @return the pharma application payments
	 */
	public java.util.List<PharmaApplicationPayment> findAll();

	/**
	 * Returns a range of all the pharma application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application payments
	 * @param end the upper bound of the range of pharma application payments (not inclusive)
	 * @return the range of pharma application payments
	 */
	public java.util.List<PharmaApplicationPayment> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the pharma application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application payments
	 * @param end the upper bound of the range of pharma application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma application payments
	 */
	public java.util.List<PharmaApplicationPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaApplicationPayment> orderByComparator);

	/**
	 * Returns an ordered range of all the pharma application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application payments
	 * @param end the upper bound of the range of pharma application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma application payments
	 */
	public java.util.List<PharmaApplicationPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaApplicationPayment> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the pharma application payments from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of pharma application payments.
	 *
	 * @return the number of pharma application payments
	 */
	public int countAll();

}