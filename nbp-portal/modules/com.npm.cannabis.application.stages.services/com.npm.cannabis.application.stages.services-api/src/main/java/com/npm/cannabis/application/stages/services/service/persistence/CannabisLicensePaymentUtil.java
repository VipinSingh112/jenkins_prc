/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.npm.cannabis.application.stages.services.model.CannabisLicensePayment;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the cannabis license payment service. This utility wraps <code>com.npm.cannabis.application.stages.services.service.persistence.impl.CannabisLicensePaymentPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisLicensePaymentPersistence
 * @generated
 */
public class CannabisLicensePaymentUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(
		CannabisLicensePayment cannabisLicensePayment) {

		getPersistence().clearCache(cannabisLicensePayment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, CannabisLicensePayment> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CannabisLicensePayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CannabisLicensePayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CannabisLicensePayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CannabisLicensePayment> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CannabisLicensePayment update(
		CannabisLicensePayment cannabisLicensePayment) {

		return getPersistence().update(cannabisLicensePayment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CannabisLicensePayment update(
		CannabisLicensePayment cannabisLicensePayment,
		ServiceContext serviceContext) {

		return getPersistence().update(cannabisLicensePayment, serviceContext);
	}

	/**
	 * Returns the cannabis license payment where cannabisApplicationId = &#63; or throws a <code>NoSuchCannabisLicensePaymentException</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis license payment
	 * @throws NoSuchCannabisLicensePaymentException if a matching cannabis license payment could not be found
	 */
	public static CannabisLicensePayment findBygetCLP_CAI(
			long cannabisApplicationId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisLicensePaymentException {

		return getPersistence().findBygetCLP_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the cannabis license payment where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis license payment, or <code>null</code> if a matching cannabis license payment could not be found
	 */
	public static CannabisLicensePayment fetchBygetCLP_CAI(
		long cannabisApplicationId) {

		return getPersistence().fetchBygetCLP_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the cannabis license payment where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis license payment, or <code>null</code> if a matching cannabis license payment could not be found
	 */
	public static CannabisLicensePayment fetchBygetCLP_CAI(
		long cannabisApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetCLP_CAI(
			cannabisApplicationId, useFinderCache);
	}

	/**
	 * Removes the cannabis license payment where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the cannabis license payment that was removed
	 */
	public static CannabisLicensePayment removeBygetCLP_CAI(
			long cannabisApplicationId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisLicensePaymentException {

		return getPersistence().removeBygetCLP_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the number of cannabis license payments where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis license payments
	 */
	public static int countBygetCLP_CAI(long cannabisApplicationId) {
		return getPersistence().countBygetCLP_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the cannabis license payment where caseId = &#63; or throws a <code>NoSuchCannabisLicensePaymentException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis license payment
	 * @throws NoSuchCannabisLicensePaymentException if a matching cannabis license payment could not be found
	 */
	public static CannabisLicensePayment findBygetCADD_CaseId(String caseId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisLicensePaymentException {

		return getPersistence().findBygetCADD_CaseId(caseId);
	}

	/**
	 * Returns the cannabis license payment where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis license payment, or <code>null</code> if a matching cannabis license payment could not be found
	 */
	public static CannabisLicensePayment fetchBygetCADD_CaseId(String caseId) {
		return getPersistence().fetchBygetCADD_CaseId(caseId);
	}

	/**
	 * Returns the cannabis license payment where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis license payment, or <code>null</code> if a matching cannabis license payment could not be found
	 */
	public static CannabisLicensePayment fetchBygetCADD_CaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetCADD_CaseId(caseId, useFinderCache);
	}

	/**
	 * Removes the cannabis license payment where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the cannabis license payment that was removed
	 */
	public static CannabisLicensePayment removeBygetCADD_CaseId(String caseId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisLicensePaymentException {

		return getPersistence().removeBygetCADD_CaseId(caseId);
	}

	/**
	 * Returns the number of cannabis license payments where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis license payments
	 */
	public static int countBygetCADD_CaseId(String caseId) {
		return getPersistence().countBygetCADD_CaseId(caseId);
	}

	/**
	 * Caches the cannabis license payment in the entity cache if it is enabled.
	 *
	 * @param cannabisLicensePayment the cannabis license payment
	 */
	public static void cacheResult(
		CannabisLicensePayment cannabisLicensePayment) {

		getPersistence().cacheResult(cannabisLicensePayment);
	}

	/**
	 * Caches the cannabis license payments in the entity cache if it is enabled.
	 *
	 * @param cannabisLicensePayments the cannabis license payments
	 */
	public static void cacheResult(
		List<CannabisLicensePayment> cannabisLicensePayments) {

		getPersistence().cacheResult(cannabisLicensePayments);
	}

	/**
	 * Creates a new cannabis license payment with the primary key. Does not add the cannabis license payment to the database.
	 *
	 * @param cannabisLicensePaymentId the primary key for the new cannabis license payment
	 * @return the new cannabis license payment
	 */
	public static CannabisLicensePayment create(long cannabisLicensePaymentId) {
		return getPersistence().create(cannabisLicensePaymentId);
	}

	/**
	 * Removes the cannabis license payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisLicensePaymentId the primary key of the cannabis license payment
	 * @return the cannabis license payment that was removed
	 * @throws NoSuchCannabisLicensePaymentException if a cannabis license payment with the primary key could not be found
	 */
	public static CannabisLicensePayment remove(long cannabisLicensePaymentId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisLicensePaymentException {

		return getPersistence().remove(cannabisLicensePaymentId);
	}

	public static CannabisLicensePayment updateImpl(
		CannabisLicensePayment cannabisLicensePayment) {

		return getPersistence().updateImpl(cannabisLicensePayment);
	}

	/**
	 * Returns the cannabis license payment with the primary key or throws a <code>NoSuchCannabisLicensePaymentException</code> if it could not be found.
	 *
	 * @param cannabisLicensePaymentId the primary key of the cannabis license payment
	 * @return the cannabis license payment
	 * @throws NoSuchCannabisLicensePaymentException if a cannabis license payment with the primary key could not be found
	 */
	public static CannabisLicensePayment findByPrimaryKey(
			long cannabisLicensePaymentId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisLicensePaymentException {

		return getPersistence().findByPrimaryKey(cannabisLicensePaymentId);
	}

	/**
	 * Returns the cannabis license payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisLicensePaymentId the primary key of the cannabis license payment
	 * @return the cannabis license payment, or <code>null</code> if a cannabis license payment with the primary key could not be found
	 */
	public static CannabisLicensePayment fetchByPrimaryKey(
		long cannabisLicensePaymentId) {

		return getPersistence().fetchByPrimaryKey(cannabisLicensePaymentId);
	}

	/**
	 * Returns all the cannabis license payments.
	 *
	 * @return the cannabis license payments
	 */
	public static List<CannabisLicensePayment> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<CannabisLicensePayment> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<CannabisLicensePayment> findAll(
		int start, int end,
		OrderByComparator<CannabisLicensePayment> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<CannabisLicensePayment> findAll(
		int start, int end,
		OrderByComparator<CannabisLicensePayment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the cannabis license payments from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of cannabis license payments.
	 *
	 * @return the number of cannabis license payments
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CannabisLicensePaymentPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CannabisLicensePaymentPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CannabisLicensePaymentPersistence _persistence;

}