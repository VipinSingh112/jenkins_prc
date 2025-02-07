/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.services.application.form.service.exception.NoSuchOsiServicesAppPaymentException;
import com.nbp.osi.services.application.form.service.model.OsiServicesAppPayment;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi services app payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesAppPaymentUtil
 * @generated
 */
@ProviderType
public interface OsiServicesAppPaymentPersistence
	extends BasePersistence<OsiServicesAppPayment> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OsiServicesAppPaymentUtil} to access the osi services app payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the osi services app payment where osiServicesApplicationId = &#63; or throws a <code>NoSuchOsiServicesAppPaymentException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services app payment
	 * @throws NoSuchOsiServicesAppPaymentException if a matching osi services app payment could not be found
	 */
	public OsiServicesAppPayment findBygetOsiServiceAppPaymentById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesAppPaymentException;

	/**
	 * Returns the osi services app payment where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services app payment, or <code>null</code> if a matching osi services app payment could not be found
	 */
	public OsiServicesAppPayment fetchBygetOsiServiceAppPaymentById(
		long osiServicesApplicationId);

	/**
	 * Returns the osi services app payment where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services app payment, or <code>null</code> if a matching osi services app payment could not be found
	 */
	public OsiServicesAppPayment fetchBygetOsiServiceAppPaymentById(
		long osiServicesApplicationId, boolean useFinderCache);

	/**
	 * Removes the osi services app payment where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the osi services app payment that was removed
	 */
	public OsiServicesAppPayment removeBygetOsiServiceAppPaymentById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesAppPaymentException;

	/**
	 * Returns the number of osi services app payments where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi services app payments
	 */
	public int countBygetOsiServiceAppPaymentById(
		long osiServicesApplicationId);

	/**
	 * Caches the osi services app payment in the entity cache if it is enabled.
	 *
	 * @param osiServicesAppPayment the osi services app payment
	 */
	public void cacheResult(OsiServicesAppPayment osiServicesAppPayment);

	/**
	 * Caches the osi services app payments in the entity cache if it is enabled.
	 *
	 * @param osiServicesAppPayments the osi services app payments
	 */
	public void cacheResult(
		java.util.List<OsiServicesAppPayment> osiServicesAppPayments);

	/**
	 * Creates a new osi services app payment with the primary key. Does not add the osi services app payment to the database.
	 *
	 * @param osiServicesAppPaymentId the primary key for the new osi services app payment
	 * @return the new osi services app payment
	 */
	public OsiServicesAppPayment create(long osiServicesAppPaymentId);

	/**
	 * Removes the osi services app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiServicesAppPaymentId the primary key of the osi services app payment
	 * @return the osi services app payment that was removed
	 * @throws NoSuchOsiServicesAppPaymentException if a osi services app payment with the primary key could not be found
	 */
	public OsiServicesAppPayment remove(long osiServicesAppPaymentId)
		throws NoSuchOsiServicesAppPaymentException;

	public OsiServicesAppPayment updateImpl(
		OsiServicesAppPayment osiServicesAppPayment);

	/**
	 * Returns the osi services app payment with the primary key or throws a <code>NoSuchOsiServicesAppPaymentException</code> if it could not be found.
	 *
	 * @param osiServicesAppPaymentId the primary key of the osi services app payment
	 * @return the osi services app payment
	 * @throws NoSuchOsiServicesAppPaymentException if a osi services app payment with the primary key could not be found
	 */
	public OsiServicesAppPayment findByPrimaryKey(long osiServicesAppPaymentId)
		throws NoSuchOsiServicesAppPaymentException;

	/**
	 * Returns the osi services app payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiServicesAppPaymentId the primary key of the osi services app payment
	 * @return the osi services app payment, or <code>null</code> if a osi services app payment with the primary key could not be found
	 */
	public OsiServicesAppPayment fetchByPrimaryKey(
		long osiServicesAppPaymentId);

	/**
	 * Returns all the osi services app payments.
	 *
	 * @return the osi services app payments
	 */
	public java.util.List<OsiServicesAppPayment> findAll();

	/**
	 * Returns a range of all the osi services app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services app payments
	 * @param end the upper bound of the range of osi services app payments (not inclusive)
	 * @return the range of osi services app payments
	 */
	public java.util.List<OsiServicesAppPayment> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the osi services app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services app payments
	 * @param end the upper bound of the range of osi services app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi services app payments
	 */
	public java.util.List<OsiServicesAppPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiServicesAppPayment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi services app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services app payments
	 * @param end the upper bound of the range of osi services app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi services app payments
	 */
	public java.util.List<OsiServicesAppPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiServicesAppPayment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi services app payments from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi services app payments.
	 *
	 * @return the number of osi services app payments
	 */
	public int countAll();

}