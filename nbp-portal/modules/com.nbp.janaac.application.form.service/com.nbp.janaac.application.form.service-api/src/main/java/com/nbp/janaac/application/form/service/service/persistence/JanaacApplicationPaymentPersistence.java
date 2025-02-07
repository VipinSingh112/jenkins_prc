/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchJanaacApplicationPaymentException;
import com.nbp.janaac.application.form.service.model.JanaacApplicationPayment;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the janaac application payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JanaacApplicationPaymentUtil
 * @generated
 */
@ProviderType
public interface JanaacApplicationPaymentPersistence
	extends BasePersistence<JanaacApplicationPayment> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JanaacApplicationPaymentUtil} to access the janaac application payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the janaac application payment where janaacApplicationId = &#63; or throws a <code>NoSuchJanaacApplicationPaymentException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching janaac application payment
	 * @throws NoSuchJanaacApplicationPaymentException if a matching janaac application payment could not be found
	 */
	public JanaacApplicationPayment findBygetJanaacById(
			long janaacApplicationId)
		throws NoSuchJanaacApplicationPaymentException;

	/**
	 * Returns the janaac application payment where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching janaac application payment, or <code>null</code> if a matching janaac application payment could not be found
	 */
	public JanaacApplicationPayment fetchBygetJanaacById(
		long janaacApplicationId);

	/**
	 * Returns the janaac application payment where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac application payment, or <code>null</code> if a matching janaac application payment could not be found
	 */
	public JanaacApplicationPayment fetchBygetJanaacById(
		long janaacApplicationId, boolean useFinderCache);

	/**
	 * Removes the janaac application payment where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the janaac application payment that was removed
	 */
	public JanaacApplicationPayment removeBygetJanaacById(
			long janaacApplicationId)
		throws NoSuchJanaacApplicationPaymentException;

	/**
	 * Returns the number of janaac application payments where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching janaac application payments
	 */
	public int countBygetJanaacById(long janaacApplicationId);

	/**
	 * Caches the janaac application payment in the entity cache if it is enabled.
	 *
	 * @param janaacApplicationPayment the janaac application payment
	 */
	public void cacheResult(JanaacApplicationPayment janaacApplicationPayment);

	/**
	 * Caches the janaac application payments in the entity cache if it is enabled.
	 *
	 * @param janaacApplicationPayments the janaac application payments
	 */
	public void cacheResult(
		java.util.List<JanaacApplicationPayment> janaacApplicationPayments);

	/**
	 * Creates a new janaac application payment with the primary key. Does not add the janaac application payment to the database.
	 *
	 * @param janaacApplicationPaymentId the primary key for the new janaac application payment
	 * @return the new janaac application payment
	 */
	public JanaacApplicationPayment create(long janaacApplicationPaymentId);

	/**
	 * Removes the janaac application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param janaacApplicationPaymentId the primary key of the janaac application payment
	 * @return the janaac application payment that was removed
	 * @throws NoSuchJanaacApplicationPaymentException if a janaac application payment with the primary key could not be found
	 */
	public JanaacApplicationPayment remove(long janaacApplicationPaymentId)
		throws NoSuchJanaacApplicationPaymentException;

	public JanaacApplicationPayment updateImpl(
		JanaacApplicationPayment janaacApplicationPayment);

	/**
	 * Returns the janaac application payment with the primary key or throws a <code>NoSuchJanaacApplicationPaymentException</code> if it could not be found.
	 *
	 * @param janaacApplicationPaymentId the primary key of the janaac application payment
	 * @return the janaac application payment
	 * @throws NoSuchJanaacApplicationPaymentException if a janaac application payment with the primary key could not be found
	 */
	public JanaacApplicationPayment findByPrimaryKey(
			long janaacApplicationPaymentId)
		throws NoSuchJanaacApplicationPaymentException;

	/**
	 * Returns the janaac application payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param janaacApplicationPaymentId the primary key of the janaac application payment
	 * @return the janaac application payment, or <code>null</code> if a janaac application payment with the primary key could not be found
	 */
	public JanaacApplicationPayment fetchByPrimaryKey(
		long janaacApplicationPaymentId);

	/**
	 * Returns all the janaac application payments.
	 *
	 * @return the janaac application payments
	 */
	public java.util.List<JanaacApplicationPayment> findAll();

	/**
	 * Returns a range of all the janaac application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac application payments
	 * @param end the upper bound of the range of janaac application payments (not inclusive)
	 * @return the range of janaac application payments
	 */
	public java.util.List<JanaacApplicationPayment> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the janaac application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac application payments
	 * @param end the upper bound of the range of janaac application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of janaac application payments
	 */
	public java.util.List<JanaacApplicationPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JanaacApplicationPayment> orderByComparator);

	/**
	 * Returns an ordered range of all the janaac application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac application payments
	 * @param end the upper bound of the range of janaac application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of janaac application payments
	 */
	public java.util.List<JanaacApplicationPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JanaacApplicationPayment> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the janaac application payments from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of janaac application payments.
	 *
	 * @return the number of janaac application payments
	 */
	public int countAll();

}