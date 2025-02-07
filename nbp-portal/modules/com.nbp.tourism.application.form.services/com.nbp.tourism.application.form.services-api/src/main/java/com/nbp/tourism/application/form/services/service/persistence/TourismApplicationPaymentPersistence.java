/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismApplicationPaymentException;
import com.nbp.tourism.application.form.services.model.TourismApplicationPayment;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism application payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismApplicationPaymentUtil
 * @generated
 */
@ProviderType
public interface TourismApplicationPaymentPersistence
	extends BasePersistence<TourismApplicationPayment> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismApplicationPaymentUtil} to access the tourism application payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism application payment where tourismApplicationId = &#63; or throws a <code>NoSuchTourismApplicationPaymentException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism application payment
	 * @throws NoSuchTourismApplicationPaymentException if a matching tourism application payment could not be found
	 */
	public TourismApplicationPayment findBygetTAP_TAI(long tourismApplicationId)
		throws NoSuchTourismApplicationPaymentException;

	/**
	 * Returns the tourism application payment where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism application payment, or <code>null</code> if a matching tourism application payment could not be found
	 */
	public TourismApplicationPayment fetchBygetTAP_TAI(
		long tourismApplicationId);

	/**
	 * Returns the tourism application payment where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism application payment, or <code>null</code> if a matching tourism application payment could not be found
	 */
	public TourismApplicationPayment fetchBygetTAP_TAI(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism application payment where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism application payment that was removed
	 */
	public TourismApplicationPayment removeBygetTAP_TAI(
			long tourismApplicationId)
		throws NoSuchTourismApplicationPaymentException;

	/**
	 * Returns the number of tourism application payments where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism application payments
	 */
	public int countBygetTAP_TAI(long tourismApplicationId);

	/**
	 * Caches the tourism application payment in the entity cache if it is enabled.
	 *
	 * @param tourismApplicationPayment the tourism application payment
	 */
	public void cacheResult(
		TourismApplicationPayment tourismApplicationPayment);

	/**
	 * Caches the tourism application payments in the entity cache if it is enabled.
	 *
	 * @param tourismApplicationPayments the tourism application payments
	 */
	public void cacheResult(
		java.util.List<TourismApplicationPayment> tourismApplicationPayments);

	/**
	 * Creates a new tourism application payment with the primary key. Does not add the tourism application payment to the database.
	 *
	 * @param TourismApplicationPaymentId the primary key for the new tourism application payment
	 * @return the new tourism application payment
	 */
	public TourismApplicationPayment create(long TourismApplicationPaymentId);

	/**
	 * Removes the tourism application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param TourismApplicationPaymentId the primary key of the tourism application payment
	 * @return the tourism application payment that was removed
	 * @throws NoSuchTourismApplicationPaymentException if a tourism application payment with the primary key could not be found
	 */
	public TourismApplicationPayment remove(long TourismApplicationPaymentId)
		throws NoSuchTourismApplicationPaymentException;

	public TourismApplicationPayment updateImpl(
		TourismApplicationPayment tourismApplicationPayment);

	/**
	 * Returns the tourism application payment with the primary key or throws a <code>NoSuchTourismApplicationPaymentException</code> if it could not be found.
	 *
	 * @param TourismApplicationPaymentId the primary key of the tourism application payment
	 * @return the tourism application payment
	 * @throws NoSuchTourismApplicationPaymentException if a tourism application payment with the primary key could not be found
	 */
	public TourismApplicationPayment findByPrimaryKey(
			long TourismApplicationPaymentId)
		throws NoSuchTourismApplicationPaymentException;

	/**
	 * Returns the tourism application payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param TourismApplicationPaymentId the primary key of the tourism application payment
	 * @return the tourism application payment, or <code>null</code> if a tourism application payment with the primary key could not be found
	 */
	public TourismApplicationPayment fetchByPrimaryKey(
		long TourismApplicationPaymentId);

	/**
	 * Returns all the tourism application payments.
	 *
	 * @return the tourism application payments
	 */
	public java.util.List<TourismApplicationPayment> findAll();

	/**
	 * Returns a range of all the tourism application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism application payments
	 * @param end the upper bound of the range of tourism application payments (not inclusive)
	 * @return the range of tourism application payments
	 */
	public java.util.List<TourismApplicationPayment> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the tourism application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism application payments
	 * @param end the upper bound of the range of tourism application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism application payments
	 */
	public java.util.List<TourismApplicationPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismApplicationPayment> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism application payments
	 * @param end the upper bound of the range of tourism application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism application payments
	 */
	public java.util.List<TourismApplicationPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismApplicationPayment> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism application payments from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism application payments.
	 *
	 * @return the number of tourism application payments
	 */
	public int countAll();

}