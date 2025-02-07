/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.fire.brigade.application.form.service.exception.NoSuchFireBrigadeAppPaymentException;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeAppPayment;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the fire brigade app payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeAppPaymentUtil
 * @generated
 */
@ProviderType
public interface FireBrigadeAppPaymentPersistence
	extends BasePersistence<FireBrigadeAppPayment> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FireBrigadeAppPaymentUtil} to access the fire brigade app payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the fire brigade app payment where fireBrigadeApplicationId = &#63; or throws a <code>NoSuchFireBrigadeAppPaymentException</code> if it could not be found.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade app payment
	 * @throws NoSuchFireBrigadeAppPaymentException if a matching fire brigade app payment could not be found
	 */
	public FireBrigadeAppPayment findByfireBrigadeApplicationId(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeAppPaymentException;

	/**
	 * Returns the fire brigade app payment where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade app payment, or <code>null</code> if a matching fire brigade app payment could not be found
	 */
	public FireBrigadeAppPayment fetchByfireBrigadeApplicationId(
		long fireBrigadeApplicationId);

	/**
	 * Returns the fire brigade app payment where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade app payment, or <code>null</code> if a matching fire brigade app payment could not be found
	 */
	public FireBrigadeAppPayment fetchByfireBrigadeApplicationId(
		long fireBrigadeApplicationId, boolean useFinderCache);

	/**
	 * Removes the fire brigade app payment where fireBrigadeApplicationId = &#63; from the database.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the fire brigade app payment that was removed
	 */
	public FireBrigadeAppPayment removeByfireBrigadeApplicationId(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeAppPaymentException;

	/**
	 * Returns the number of fire brigade app payments where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the number of matching fire brigade app payments
	 */
	public int countByfireBrigadeApplicationId(long fireBrigadeApplicationId);

	/**
	 * Caches the fire brigade app payment in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeAppPayment the fire brigade app payment
	 */
	public void cacheResult(FireBrigadeAppPayment fireBrigadeAppPayment);

	/**
	 * Caches the fire brigade app payments in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeAppPayments the fire brigade app payments
	 */
	public void cacheResult(
		java.util.List<FireBrigadeAppPayment> fireBrigadeAppPayments);

	/**
	 * Creates a new fire brigade app payment with the primary key. Does not add the fire brigade app payment to the database.
	 *
	 * @param fireBrigadeAppPaymentId the primary key for the new fire brigade app payment
	 * @return the new fire brigade app payment
	 */
	public FireBrigadeAppPayment create(long fireBrigadeAppPaymentId);

	/**
	 * Removes the fire brigade app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadeAppPaymentId the primary key of the fire brigade app payment
	 * @return the fire brigade app payment that was removed
	 * @throws NoSuchFireBrigadeAppPaymentException if a fire brigade app payment with the primary key could not be found
	 */
	public FireBrigadeAppPayment remove(long fireBrigadeAppPaymentId)
		throws NoSuchFireBrigadeAppPaymentException;

	public FireBrigadeAppPayment updateImpl(
		FireBrigadeAppPayment fireBrigadeAppPayment);

	/**
	 * Returns the fire brigade app payment with the primary key or throws a <code>NoSuchFireBrigadeAppPaymentException</code> if it could not be found.
	 *
	 * @param fireBrigadeAppPaymentId the primary key of the fire brigade app payment
	 * @return the fire brigade app payment
	 * @throws NoSuchFireBrigadeAppPaymentException if a fire brigade app payment with the primary key could not be found
	 */
	public FireBrigadeAppPayment findByPrimaryKey(long fireBrigadeAppPaymentId)
		throws NoSuchFireBrigadeAppPaymentException;

	/**
	 * Returns the fire brigade app payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadeAppPaymentId the primary key of the fire brigade app payment
	 * @return the fire brigade app payment, or <code>null</code> if a fire brigade app payment with the primary key could not be found
	 */
	public FireBrigadeAppPayment fetchByPrimaryKey(
		long fireBrigadeAppPaymentId);

	/**
	 * Returns all the fire brigade app payments.
	 *
	 * @return the fire brigade app payments
	 */
	public java.util.List<FireBrigadeAppPayment> findAll();

	/**
	 * Returns a range of all the fire brigade app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade app payments
	 * @param end the upper bound of the range of fire brigade app payments (not inclusive)
	 * @return the range of fire brigade app payments
	 */
	public java.util.List<FireBrigadeAppPayment> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the fire brigade app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade app payments
	 * @param end the upper bound of the range of fire brigade app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade app payments
	 */
	public java.util.List<FireBrigadeAppPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeAppPayment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the fire brigade app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade app payments
	 * @param end the upper bound of the range of fire brigade app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade app payments
	 */
	public java.util.List<FireBrigadeAppPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeAppPayment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the fire brigade app payments from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of fire brigade app payments.
	 *
	 * @return the number of fire brigade app payments
	 */
	public int countAll();

}