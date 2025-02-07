/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.factories.registration.application.form.services.exception.NoSuchFactoriesAppPaymentException;
import com.nbp.factories.registration.application.form.services.model.FactoriesAppPayment;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the factories app payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesAppPaymentUtil
 * @generated
 */
@ProviderType
public interface FactoriesAppPaymentPersistence
	extends BasePersistence<FactoriesAppPayment> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FactoriesAppPaymentUtil} to access the factories app payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the factories app payment where factoriesApplicationId = &#63; or throws a <code>NoSuchFactoriesAppPaymentException</code> if it could not be found.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories app payment
	 * @throws NoSuchFactoriesAppPaymentException if a matching factories app payment could not be found
	 */
	public FactoriesAppPayment findBygetMiningById(long factoriesApplicationId)
		throws NoSuchFactoriesAppPaymentException;

	/**
	 * Returns the factories app payment where factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories app payment, or <code>null</code> if a matching factories app payment could not be found
	 */
	public FactoriesAppPayment fetchBygetMiningById(
		long factoriesApplicationId);

	/**
	 * Returns the factories app payment where factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories app payment, or <code>null</code> if a matching factories app payment could not be found
	 */
	public FactoriesAppPayment fetchBygetMiningById(
		long factoriesApplicationId, boolean useFinderCache);

	/**
	 * Removes the factories app payment where factoriesApplicationId = &#63; from the database.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the factories app payment that was removed
	 */
	public FactoriesAppPayment removeBygetMiningById(
			long factoriesApplicationId)
		throws NoSuchFactoriesAppPaymentException;

	/**
	 * Returns the number of factories app payments where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the number of matching factories app payments
	 */
	public int countBygetMiningById(long factoriesApplicationId);

	/**
	 * Caches the factories app payment in the entity cache if it is enabled.
	 *
	 * @param factoriesAppPayment the factories app payment
	 */
	public void cacheResult(FactoriesAppPayment factoriesAppPayment);

	/**
	 * Caches the factories app payments in the entity cache if it is enabled.
	 *
	 * @param factoriesAppPayments the factories app payments
	 */
	public void cacheResult(
		java.util.List<FactoriesAppPayment> factoriesAppPayments);

	/**
	 * Creates a new factories app payment with the primary key. Does not add the factories app payment to the database.
	 *
	 * @param factoriesAppPaymentId the primary key for the new factories app payment
	 * @return the new factories app payment
	 */
	public FactoriesAppPayment create(long factoriesAppPaymentId);

	/**
	 * Removes the factories app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param factoriesAppPaymentId the primary key of the factories app payment
	 * @return the factories app payment that was removed
	 * @throws NoSuchFactoriesAppPaymentException if a factories app payment with the primary key could not be found
	 */
	public FactoriesAppPayment remove(long factoriesAppPaymentId)
		throws NoSuchFactoriesAppPaymentException;

	public FactoriesAppPayment updateImpl(
		FactoriesAppPayment factoriesAppPayment);

	/**
	 * Returns the factories app payment with the primary key or throws a <code>NoSuchFactoriesAppPaymentException</code> if it could not be found.
	 *
	 * @param factoriesAppPaymentId the primary key of the factories app payment
	 * @return the factories app payment
	 * @throws NoSuchFactoriesAppPaymentException if a factories app payment with the primary key could not be found
	 */
	public FactoriesAppPayment findByPrimaryKey(long factoriesAppPaymentId)
		throws NoSuchFactoriesAppPaymentException;

	/**
	 * Returns the factories app payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param factoriesAppPaymentId the primary key of the factories app payment
	 * @return the factories app payment, or <code>null</code> if a factories app payment with the primary key could not be found
	 */
	public FactoriesAppPayment fetchByPrimaryKey(long factoriesAppPaymentId);

	/**
	 * Returns all the factories app payments.
	 *
	 * @return the factories app payments
	 */
	public java.util.List<FactoriesAppPayment> findAll();

	/**
	 * Returns a range of all the factories app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories app payments
	 * @param end the upper bound of the range of factories app payments (not inclusive)
	 * @return the range of factories app payments
	 */
	public java.util.List<FactoriesAppPayment> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the factories app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories app payments
	 * @param end the upper bound of the range of factories app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of factories app payments
	 */
	public java.util.List<FactoriesAppPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FactoriesAppPayment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the factories app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories app payments
	 * @param end the upper bound of the range of factories app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of factories app payments
	 */
	public java.util.List<FactoriesAppPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FactoriesAppPayment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the factories app payments from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of factories app payments.
	 *
	 * @return the number of factories app payments
	 */
	public int countAll();

}