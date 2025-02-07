/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.miic.application.form.services.exception.NoSuchMiicPaymentException;
import com.nbp.miic.application.form.services.model.MiicPayment;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the miic payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiicPaymentUtil
 * @generated
 */
@ProviderType
public interface MiicPaymentPersistence extends BasePersistence<MiicPayment> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MiicPaymentUtil} to access the miic payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the miic payment in the entity cache if it is enabled.
	 *
	 * @param miicPayment the miic payment
	 */
	public void cacheResult(MiicPayment miicPayment);

	/**
	 * Caches the miic payments in the entity cache if it is enabled.
	 *
	 * @param miicPayments the miic payments
	 */
	public void cacheResult(java.util.List<MiicPayment> miicPayments);

	/**
	 * Creates a new miic payment with the primary key. Does not add the miic payment to the database.
	 *
	 * @param miicPaymentId the primary key for the new miic payment
	 * @return the new miic payment
	 */
	public MiicPayment create(long miicPaymentId);

	/**
	 * Removes the miic payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miicPaymentId the primary key of the miic payment
	 * @return the miic payment that was removed
	 * @throws NoSuchMiicPaymentException if a miic payment with the primary key could not be found
	 */
	public MiicPayment remove(long miicPaymentId)
		throws NoSuchMiicPaymentException;

	public MiicPayment updateImpl(MiicPayment miicPayment);

	/**
	 * Returns the miic payment with the primary key or throws a <code>NoSuchMiicPaymentException</code> if it could not be found.
	 *
	 * @param miicPaymentId the primary key of the miic payment
	 * @return the miic payment
	 * @throws NoSuchMiicPaymentException if a miic payment with the primary key could not be found
	 */
	public MiicPayment findByPrimaryKey(long miicPaymentId)
		throws NoSuchMiicPaymentException;

	/**
	 * Returns the miic payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miicPaymentId the primary key of the miic payment
	 * @return the miic payment, or <code>null</code> if a miic payment with the primary key could not be found
	 */
	public MiicPayment fetchByPrimaryKey(long miicPaymentId);

	/**
	 * Returns all the miic payments.
	 *
	 * @return the miic payments
	 */
	public java.util.List<MiicPayment> findAll();

	/**
	 * Returns a range of all the miic payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic payments
	 * @param end the upper bound of the range of miic payments (not inclusive)
	 * @return the range of miic payments
	 */
	public java.util.List<MiicPayment> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the miic payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic payments
	 * @param end the upper bound of the range of miic payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of miic payments
	 */
	public java.util.List<MiicPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicPayment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the miic payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic payments
	 * @param end the upper bound of the range of miic payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of miic payments
	 */
	public java.util.List<MiicPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiicPayment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the miic payments from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of miic payments.
	 *
	 * @return the number of miic payments
	 */
	public int countAll();

}