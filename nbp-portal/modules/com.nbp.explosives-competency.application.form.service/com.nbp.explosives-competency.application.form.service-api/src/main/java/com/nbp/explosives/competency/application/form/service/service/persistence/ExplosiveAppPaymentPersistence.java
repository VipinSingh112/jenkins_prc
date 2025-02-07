/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.explosives.competency.application.form.service.exception.NoSuchExplosiveAppPaymentException;
import com.nbp.explosives.competency.application.form.service.model.ExplosiveAppPayment;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the explosive app payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveAppPaymentUtil
 * @generated
 */
@ProviderType
public interface ExplosiveAppPaymentPersistence
	extends BasePersistence<ExplosiveAppPayment> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ExplosiveAppPaymentUtil} to access the explosive app payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the explosive app payment where explosivesApplicationId = &#63; or throws a <code>NoSuchExplosiveAppPaymentException</code> if it could not be found.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the matching explosive app payment
	 * @throws NoSuchExplosiveAppPaymentException if a matching explosive app payment could not be found
	 */
	public ExplosiveAppPayment findBygetExplosiveById(
			long explosivesApplicationId)
		throws NoSuchExplosiveAppPaymentException;

	/**
	 * Returns the explosive app payment where explosivesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the matching explosive app payment, or <code>null</code> if a matching explosive app payment could not be found
	 */
	public ExplosiveAppPayment fetchBygetExplosiveById(
		long explosivesApplicationId);

	/**
	 * Returns the explosive app payment where explosivesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive app payment, or <code>null</code> if a matching explosive app payment could not be found
	 */
	public ExplosiveAppPayment fetchBygetExplosiveById(
		long explosivesApplicationId, boolean useFinderCache);

	/**
	 * Removes the explosive app payment where explosivesApplicationId = &#63; from the database.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the explosive app payment that was removed
	 */
	public ExplosiveAppPayment removeBygetExplosiveById(
			long explosivesApplicationId)
		throws NoSuchExplosiveAppPaymentException;

	/**
	 * Returns the number of explosive app payments where explosivesApplicationId = &#63;.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the number of matching explosive app payments
	 */
	public int countBygetExplosiveById(long explosivesApplicationId);

	/**
	 * Caches the explosive app payment in the entity cache if it is enabled.
	 *
	 * @param explosiveAppPayment the explosive app payment
	 */
	public void cacheResult(ExplosiveAppPayment explosiveAppPayment);

	/**
	 * Caches the explosive app payments in the entity cache if it is enabled.
	 *
	 * @param explosiveAppPayments the explosive app payments
	 */
	public void cacheResult(
		java.util.List<ExplosiveAppPayment> explosiveAppPayments);

	/**
	 * Creates a new explosive app payment with the primary key. Does not add the explosive app payment to the database.
	 *
	 * @param explosiveAppPaymentId the primary key for the new explosive app payment
	 * @return the new explosive app payment
	 */
	public ExplosiveAppPayment create(long explosiveAppPaymentId);

	/**
	 * Removes the explosive app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param explosiveAppPaymentId the primary key of the explosive app payment
	 * @return the explosive app payment that was removed
	 * @throws NoSuchExplosiveAppPaymentException if a explosive app payment with the primary key could not be found
	 */
	public ExplosiveAppPayment remove(long explosiveAppPaymentId)
		throws NoSuchExplosiveAppPaymentException;

	public ExplosiveAppPayment updateImpl(
		ExplosiveAppPayment explosiveAppPayment);

	/**
	 * Returns the explosive app payment with the primary key or throws a <code>NoSuchExplosiveAppPaymentException</code> if it could not be found.
	 *
	 * @param explosiveAppPaymentId the primary key of the explosive app payment
	 * @return the explosive app payment
	 * @throws NoSuchExplosiveAppPaymentException if a explosive app payment with the primary key could not be found
	 */
	public ExplosiveAppPayment findByPrimaryKey(long explosiveAppPaymentId)
		throws NoSuchExplosiveAppPaymentException;

	/**
	 * Returns the explosive app payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param explosiveAppPaymentId the primary key of the explosive app payment
	 * @return the explosive app payment, or <code>null</code> if a explosive app payment with the primary key could not be found
	 */
	public ExplosiveAppPayment fetchByPrimaryKey(long explosiveAppPaymentId);

	/**
	 * Returns all the explosive app payments.
	 *
	 * @return the explosive app payments
	 */
	public java.util.List<ExplosiveAppPayment> findAll();

	/**
	 * Returns a range of all the explosive app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive app payments
	 * @param end the upper bound of the range of explosive app payments (not inclusive)
	 * @return the range of explosive app payments
	 */
	public java.util.List<ExplosiveAppPayment> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the explosive app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive app payments
	 * @param end the upper bound of the range of explosive app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of explosive app payments
	 */
	public java.util.List<ExplosiveAppPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExplosiveAppPayment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the explosive app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive app payments
	 * @param end the upper bound of the range of explosive app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of explosive app payments
	 */
	public java.util.List<ExplosiveAppPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ExplosiveAppPayment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the explosive app payments from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of explosive app payments.
	 *
	 * @return the number of explosive app payments
	 */
	public int countAll();

}