/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.cannabis.application.form.services.model.CannabisApplicationPayment;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the cannabis application payment service. This utility wraps <code>com.nbp.cannabis.application.form.services.service.persistence.impl.CannabisApplicationPaymentPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationPaymentPersistence
 * @generated
 */
public class CannabisApplicationPaymentUtil {

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
		CannabisApplicationPayment cannabisApplicationPayment) {

		getPersistence().clearCache(cannabisApplicationPayment);
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
	public static Map<Serializable, CannabisApplicationPayment>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CannabisApplicationPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CannabisApplicationPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CannabisApplicationPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CannabisApplicationPayment> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CannabisApplicationPayment update(
		CannabisApplicationPayment cannabisApplicationPayment) {

		return getPersistence().update(cannabisApplicationPayment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CannabisApplicationPayment update(
		CannabisApplicationPayment cannabisApplicationPayment,
		ServiceContext serviceContext) {

		return getPersistence().update(
			cannabisApplicationPayment, serviceContext);
	}

	/**
	 * Returns the cannabis application payment where cannabisApplicationId = &#63; or throws a <code>NoSuchCannabisApplicationPaymentException</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application payment
	 * @throws NoSuchCannabisApplicationPaymentException if a matching cannabis application payment could not be found
	 */
	public static CannabisApplicationPayment findBygetCAP_CAI(
			long cannabisApplicationId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationPaymentException {

		return getPersistence().findBygetCAP_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the cannabis application payment where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application payment, or <code>null</code> if a matching cannabis application payment could not be found
	 */
	public static CannabisApplicationPayment fetchBygetCAP_CAI(
		long cannabisApplicationId) {

		return getPersistence().fetchBygetCAP_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the cannabis application payment where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application payment, or <code>null</code> if a matching cannabis application payment could not be found
	 */
	public static CannabisApplicationPayment fetchBygetCAP_CAI(
		long cannabisApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetCAP_CAI(
			cannabisApplicationId, useFinderCache);
	}

	/**
	 * Removes the cannabis application payment where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the cannabis application payment that was removed
	 */
	public static CannabisApplicationPayment removeBygetCAP_CAI(
			long cannabisApplicationId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationPaymentException {

		return getPersistence().removeBygetCAP_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the number of cannabis application payments where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis application payments
	 */
	public static int countBygetCAP_CAI(long cannabisApplicationId) {
		return getPersistence().countBygetCAP_CAI(cannabisApplicationId);
	}

	/**
	 * Caches the cannabis application payment in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationPayment the cannabis application payment
	 */
	public static void cacheResult(
		CannabisApplicationPayment cannabisApplicationPayment) {

		getPersistence().cacheResult(cannabisApplicationPayment);
	}

	/**
	 * Caches the cannabis application payments in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationPayments the cannabis application payments
	 */
	public static void cacheResult(
		List<CannabisApplicationPayment> cannabisApplicationPayments) {

		getPersistence().cacheResult(cannabisApplicationPayments);
	}

	/**
	 * Creates a new cannabis application payment with the primary key. Does not add the cannabis application payment to the database.
	 *
	 * @param cannabisApplicationPaymentId the primary key for the new cannabis application payment
	 * @return the new cannabis application payment
	 */
	public static CannabisApplicationPayment create(
		long cannabisApplicationPaymentId) {

		return getPersistence().create(cannabisApplicationPaymentId);
	}

	/**
	 * Removes the cannabis application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisApplicationPaymentId the primary key of the cannabis application payment
	 * @return the cannabis application payment that was removed
	 * @throws NoSuchCannabisApplicationPaymentException if a cannabis application payment with the primary key could not be found
	 */
	public static CannabisApplicationPayment remove(
			long cannabisApplicationPaymentId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationPaymentException {

		return getPersistence().remove(cannabisApplicationPaymentId);
	}

	public static CannabisApplicationPayment updateImpl(
		CannabisApplicationPayment cannabisApplicationPayment) {

		return getPersistence().updateImpl(cannabisApplicationPayment);
	}

	/**
	 * Returns the cannabis application payment with the primary key or throws a <code>NoSuchCannabisApplicationPaymentException</code> if it could not be found.
	 *
	 * @param cannabisApplicationPaymentId the primary key of the cannabis application payment
	 * @return the cannabis application payment
	 * @throws NoSuchCannabisApplicationPaymentException if a cannabis application payment with the primary key could not be found
	 */
	public static CannabisApplicationPayment findByPrimaryKey(
			long cannabisApplicationPaymentId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationPaymentException {

		return getPersistence().findByPrimaryKey(cannabisApplicationPaymentId);
	}

	/**
	 * Returns the cannabis application payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisApplicationPaymentId the primary key of the cannabis application payment
	 * @return the cannabis application payment, or <code>null</code> if a cannabis application payment with the primary key could not be found
	 */
	public static CannabisApplicationPayment fetchByPrimaryKey(
		long cannabisApplicationPaymentId) {

		return getPersistence().fetchByPrimaryKey(cannabisApplicationPaymentId);
	}

	/**
	 * Returns all the cannabis application payments.
	 *
	 * @return the cannabis application payments
	 */
	public static List<CannabisApplicationPayment> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the cannabis application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application payments
	 * @param end the upper bound of the range of cannabis application payments (not inclusive)
	 * @return the range of cannabis application payments
	 */
	public static List<CannabisApplicationPayment> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application payments
	 * @param end the upper bound of the range of cannabis application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis application payments
	 */
	public static List<CannabisApplicationPayment> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationPayment> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application payments
	 * @param end the upper bound of the range of cannabis application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis application payments
	 */
	public static List<CannabisApplicationPayment> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationPayment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the cannabis application payments from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of cannabis application payments.
	 *
	 * @return the number of cannabis application payments
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CannabisApplicationPaymentPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CannabisApplicationPaymentPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CannabisApplicationPaymentPersistence _persistence;

}