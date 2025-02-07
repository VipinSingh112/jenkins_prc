/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.npm.cannabis.application.stages.services.exception.NoSuchCannabisLicensePaymentException;
import com.npm.cannabis.application.stages.services.model.CannabisLicensePayment;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the cannabis license payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisLicensePaymentUtil
 * @generated
 */
@ProviderType
public interface CannabisLicensePaymentPersistence
	extends BasePersistence<CannabisLicensePayment> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CannabisLicensePaymentUtil} to access the cannabis license payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the cannabis license payment where cannabisApplicationId = &#63; or throws a <code>NoSuchCannabisLicensePaymentException</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis license payment
	 * @throws NoSuchCannabisLicensePaymentException if a matching cannabis license payment could not be found
	 */
	public CannabisLicensePayment findBygetCLP_CAI(long cannabisApplicationId)
		throws NoSuchCannabisLicensePaymentException;

	/**
	 * Returns the cannabis license payment where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis license payment, or <code>null</code> if a matching cannabis license payment could not be found
	 */
	public CannabisLicensePayment fetchBygetCLP_CAI(long cannabisApplicationId);

	/**
	 * Returns the cannabis license payment where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis license payment, or <code>null</code> if a matching cannabis license payment could not be found
	 */
	public CannabisLicensePayment fetchBygetCLP_CAI(
		long cannabisApplicationId, boolean useFinderCache);

	/**
	 * Removes the cannabis license payment where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the cannabis license payment that was removed
	 */
	public CannabisLicensePayment removeBygetCLP_CAI(long cannabisApplicationId)
		throws NoSuchCannabisLicensePaymentException;

	/**
	 * Returns the number of cannabis license payments where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis license payments
	 */
	public int countBygetCLP_CAI(long cannabisApplicationId);

	/**
	 * Returns the cannabis license payment where caseId = &#63; or throws a <code>NoSuchCannabisLicensePaymentException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis license payment
	 * @throws NoSuchCannabisLicensePaymentException if a matching cannabis license payment could not be found
	 */
	public CannabisLicensePayment findBygetCADD_CaseId(String caseId)
		throws NoSuchCannabisLicensePaymentException;

	/**
	 * Returns the cannabis license payment where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis license payment, or <code>null</code> if a matching cannabis license payment could not be found
	 */
	public CannabisLicensePayment fetchBygetCADD_CaseId(String caseId);

	/**
	 * Returns the cannabis license payment where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis license payment, or <code>null</code> if a matching cannabis license payment could not be found
	 */
	public CannabisLicensePayment fetchBygetCADD_CaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the cannabis license payment where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the cannabis license payment that was removed
	 */
	public CannabisLicensePayment removeBygetCADD_CaseId(String caseId)
		throws NoSuchCannabisLicensePaymentException;

	/**
	 * Returns the number of cannabis license payments where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis license payments
	 */
	public int countBygetCADD_CaseId(String caseId);

	/**
	 * Caches the cannabis license payment in the entity cache if it is enabled.
	 *
	 * @param cannabisLicensePayment the cannabis license payment
	 */
	public void cacheResult(CannabisLicensePayment cannabisLicensePayment);

	/**
	 * Caches the cannabis license payments in the entity cache if it is enabled.
	 *
	 * @param cannabisLicensePayments the cannabis license payments
	 */
	public void cacheResult(
		java.util.List<CannabisLicensePayment> cannabisLicensePayments);

	/**
	 * Creates a new cannabis license payment with the primary key. Does not add the cannabis license payment to the database.
	 *
	 * @param cannabisLicensePaymentId the primary key for the new cannabis license payment
	 * @return the new cannabis license payment
	 */
	public CannabisLicensePayment create(long cannabisLicensePaymentId);

	/**
	 * Removes the cannabis license payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisLicensePaymentId the primary key of the cannabis license payment
	 * @return the cannabis license payment that was removed
	 * @throws NoSuchCannabisLicensePaymentException if a cannabis license payment with the primary key could not be found
	 */
	public CannabisLicensePayment remove(long cannabisLicensePaymentId)
		throws NoSuchCannabisLicensePaymentException;

	public CannabisLicensePayment updateImpl(
		CannabisLicensePayment cannabisLicensePayment);

	/**
	 * Returns the cannabis license payment with the primary key or throws a <code>NoSuchCannabisLicensePaymentException</code> if it could not be found.
	 *
	 * @param cannabisLicensePaymentId the primary key of the cannabis license payment
	 * @return the cannabis license payment
	 * @throws NoSuchCannabisLicensePaymentException if a cannabis license payment with the primary key could not be found
	 */
	public CannabisLicensePayment findByPrimaryKey(
			long cannabisLicensePaymentId)
		throws NoSuchCannabisLicensePaymentException;

	/**
	 * Returns the cannabis license payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisLicensePaymentId the primary key of the cannabis license payment
	 * @return the cannabis license payment, or <code>null</code> if a cannabis license payment with the primary key could not be found
	 */
	public CannabisLicensePayment fetchByPrimaryKey(
		long cannabisLicensePaymentId);

	/**
	 * Returns all the cannabis license payments.
	 *
	 * @return the cannabis license payments
	 */
	public java.util.List<CannabisLicensePayment> findAll();

	/**
	 * Returns a range of all the cannabis license payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis license payments
	 * @param end the upper bound of the range of cannabis license payments (not inclusive)
	 * @return the range of cannabis license payments
	 */
	public java.util.List<CannabisLicensePayment> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the cannabis license payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis license payments
	 * @param end the upper bound of the range of cannabis license payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis license payments
	 */
	public java.util.List<CannabisLicensePayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisLicensePayment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis license payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis license payments
	 * @param end the upper bound of the range of cannabis license payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis license payments
	 */
	public java.util.List<CannabisLicensePayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisLicensePayment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the cannabis license payments from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of cannabis license payments.
	 *
	 * @return the number of cannabis license payments
	 */
	public int countAll();

}