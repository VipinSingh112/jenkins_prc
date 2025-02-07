/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchHsraApplicationPaymentException;
import com.nbp.hsra.application.service.model.HsraApplicationPayment;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the hsra application payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HsraApplicationPaymentUtil
 * @generated
 */
@ProviderType
public interface HsraApplicationPaymentPersistence
	extends BasePersistence<HsraApplicationPayment> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HsraApplicationPaymentUtil} to access the hsra application payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the hsra application payment where hsraApplicationId = &#63; or throws a <code>NoSuchHsraApplicationPaymentException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra application payment
	 * @throws NoSuchHsraApplicationPaymentException if a matching hsra application payment could not be found
	 */
	public HsraApplicationPayment findBygetHsraById(long hsraApplicationId)
		throws NoSuchHsraApplicationPaymentException;

	/**
	 * Returns the hsra application payment where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra application payment, or <code>null</code> if a matching hsra application payment could not be found
	 */
	public HsraApplicationPayment fetchBygetHsraById(long hsraApplicationId);

	/**
	 * Returns the hsra application payment where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application payment, or <code>null</code> if a matching hsra application payment could not be found
	 */
	public HsraApplicationPayment fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache);

	/**
	 * Removes the hsra application payment where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the hsra application payment that was removed
	 */
	public HsraApplicationPayment removeBygetHsraById(long hsraApplicationId)
		throws NoSuchHsraApplicationPaymentException;

	/**
	 * Returns the number of hsra application payments where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching hsra application payments
	 */
	public int countBygetHsraById(long hsraApplicationId);

	/**
	 * Caches the hsra application payment in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationPayment the hsra application payment
	 */
	public void cacheResult(HsraApplicationPayment hsraApplicationPayment);

	/**
	 * Caches the hsra application payments in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationPayments the hsra application payments
	 */
	public void cacheResult(
		java.util.List<HsraApplicationPayment> hsraApplicationPayments);

	/**
	 * Creates a new hsra application payment with the primary key. Does not add the hsra application payment to the database.
	 *
	 * @param hsraApplicationPaymentId the primary key for the new hsra application payment
	 * @return the new hsra application payment
	 */
	public HsraApplicationPayment create(long hsraApplicationPaymentId);

	/**
	 * Removes the hsra application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param hsraApplicationPaymentId the primary key of the hsra application payment
	 * @return the hsra application payment that was removed
	 * @throws NoSuchHsraApplicationPaymentException if a hsra application payment with the primary key could not be found
	 */
	public HsraApplicationPayment remove(long hsraApplicationPaymentId)
		throws NoSuchHsraApplicationPaymentException;

	public HsraApplicationPayment updateImpl(
		HsraApplicationPayment hsraApplicationPayment);

	/**
	 * Returns the hsra application payment with the primary key or throws a <code>NoSuchHsraApplicationPaymentException</code> if it could not be found.
	 *
	 * @param hsraApplicationPaymentId the primary key of the hsra application payment
	 * @return the hsra application payment
	 * @throws NoSuchHsraApplicationPaymentException if a hsra application payment with the primary key could not be found
	 */
	public HsraApplicationPayment findByPrimaryKey(
			long hsraApplicationPaymentId)
		throws NoSuchHsraApplicationPaymentException;

	/**
	 * Returns the hsra application payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param hsraApplicationPaymentId the primary key of the hsra application payment
	 * @return the hsra application payment, or <code>null</code> if a hsra application payment with the primary key could not be found
	 */
	public HsraApplicationPayment fetchByPrimaryKey(
		long hsraApplicationPaymentId);

	/**
	 * Returns all the hsra application payments.
	 *
	 * @return the hsra application payments
	 */
	public java.util.List<HsraApplicationPayment> findAll();

	/**
	 * Returns a range of all the hsra application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application payments
	 * @param end the upper bound of the range of hsra application payments (not inclusive)
	 * @return the range of hsra application payments
	 */
	public java.util.List<HsraApplicationPayment> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the hsra application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application payments
	 * @param end the upper bound of the range of hsra application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of hsra application payments
	 */
	public java.util.List<HsraApplicationPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplicationPayment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the hsra application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application payments
	 * @param end the upper bound of the range of hsra application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of hsra application payments
	 */
	public java.util.List<HsraApplicationPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplicationPayment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the hsra application payments from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of hsra application payments.
	 *
	 * @return the number of hsra application payments
	 */
	public int countAll();

}