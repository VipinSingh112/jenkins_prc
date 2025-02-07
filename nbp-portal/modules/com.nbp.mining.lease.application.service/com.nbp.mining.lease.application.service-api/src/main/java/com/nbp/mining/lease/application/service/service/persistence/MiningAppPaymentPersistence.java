/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.mining.lease.application.service.exception.NoSuchMiningAppPaymentException;
import com.nbp.mining.lease.application.service.model.MiningAppPayment;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the mining app payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningAppPaymentUtil
 * @generated
 */
@ProviderType
public interface MiningAppPaymentPersistence
	extends BasePersistence<MiningAppPayment> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MiningAppPaymentUtil} to access the mining app payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the mining app payment where miningLeaseApplicationId = &#63; or throws a <code>NoSuchMiningAppPaymentException</code> if it could not be found.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining app payment
	 * @throws NoSuchMiningAppPaymentException if a matching mining app payment could not be found
	 */
	public MiningAppPayment findBygetMiningById(long miningLeaseApplicationId)
		throws NoSuchMiningAppPaymentException;

	/**
	 * Returns the mining app payment where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining app payment, or <code>null</code> if a matching mining app payment could not be found
	 */
	public MiningAppPayment fetchBygetMiningById(long miningLeaseApplicationId);

	/**
	 * Returns the mining app payment where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining app payment, or <code>null</code> if a matching mining app payment could not be found
	 */
	public MiningAppPayment fetchBygetMiningById(
		long miningLeaseApplicationId, boolean useFinderCache);

	/**
	 * Removes the mining app payment where miningLeaseApplicationId = &#63; from the database.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the mining app payment that was removed
	 */
	public MiningAppPayment removeBygetMiningById(long miningLeaseApplicationId)
		throws NoSuchMiningAppPaymentException;

	/**
	 * Returns the number of mining app payments where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the number of matching mining app payments
	 */
	public int countBygetMiningById(long miningLeaseApplicationId);

	/**
	 * Caches the mining app payment in the entity cache if it is enabled.
	 *
	 * @param miningAppPayment the mining app payment
	 */
	public void cacheResult(MiningAppPayment miningAppPayment);

	/**
	 * Caches the mining app payments in the entity cache if it is enabled.
	 *
	 * @param miningAppPayments the mining app payments
	 */
	public void cacheResult(java.util.List<MiningAppPayment> miningAppPayments);

	/**
	 * Creates a new mining app payment with the primary key. Does not add the mining app payment to the database.
	 *
	 * @param miningAppPaymentId the primary key for the new mining app payment
	 * @return the new mining app payment
	 */
	public MiningAppPayment create(long miningAppPaymentId);

	/**
	 * Removes the mining app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningAppPaymentId the primary key of the mining app payment
	 * @return the mining app payment that was removed
	 * @throws NoSuchMiningAppPaymentException if a mining app payment with the primary key could not be found
	 */
	public MiningAppPayment remove(long miningAppPaymentId)
		throws NoSuchMiningAppPaymentException;

	public MiningAppPayment updateImpl(MiningAppPayment miningAppPayment);

	/**
	 * Returns the mining app payment with the primary key or throws a <code>NoSuchMiningAppPaymentException</code> if it could not be found.
	 *
	 * @param miningAppPaymentId the primary key of the mining app payment
	 * @return the mining app payment
	 * @throws NoSuchMiningAppPaymentException if a mining app payment with the primary key could not be found
	 */
	public MiningAppPayment findByPrimaryKey(long miningAppPaymentId)
		throws NoSuchMiningAppPaymentException;

	/**
	 * Returns the mining app payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningAppPaymentId the primary key of the mining app payment
	 * @return the mining app payment, or <code>null</code> if a mining app payment with the primary key could not be found
	 */
	public MiningAppPayment fetchByPrimaryKey(long miningAppPaymentId);

	/**
	 * Returns all the mining app payments.
	 *
	 * @return the mining app payments
	 */
	public java.util.List<MiningAppPayment> findAll();

	/**
	 * Returns a range of all the mining app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining app payments
	 * @param end the upper bound of the range of mining app payments (not inclusive)
	 * @return the range of mining app payments
	 */
	public java.util.List<MiningAppPayment> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the mining app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining app payments
	 * @param end the upper bound of the range of mining app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining app payments
	 */
	public java.util.List<MiningAppPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiningAppPayment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the mining app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining app payments
	 * @param end the upper bound of the range of mining app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining app payments
	 */
	public java.util.List<MiningAppPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiningAppPayment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the mining app payments from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of mining app payments.
	 *
	 * @return the number of mining app payments
	 */
	public int countAll();

}