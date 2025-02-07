/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.healthcare.application.form.service.model.HealthCareApplicationPayment;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the health care application payment service. This utility wraps <code>com.nbp.healthcare.application.form.service.service.persistence.impl.HealthCareApplicationPaymentPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareApplicationPaymentPersistence
 * @generated
 */
public class HealthCareApplicationPaymentUtil {

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
		HealthCareApplicationPayment healthCareApplicationPayment) {

		getPersistence().clearCache(healthCareApplicationPayment);
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
	public static Map<Serializable, HealthCareApplicationPayment>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<HealthCareApplicationPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HealthCareApplicationPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HealthCareApplicationPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<HealthCareApplicationPayment> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static HealthCareApplicationPayment update(
		HealthCareApplicationPayment healthCareApplicationPayment) {

		return getPersistence().update(healthCareApplicationPayment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static HealthCareApplicationPayment update(
		HealthCareApplicationPayment healthCareApplicationPayment,
		ServiceContext serviceContext) {

		return getPersistence().update(
			healthCareApplicationPayment, serviceContext);
	}

	/**
	 * Returns the health care application payment where healthCareApplicationId = &#63; or throws a <code>NoSuchHealthCareApplicationPaymentException</code> if it could not be found.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care application payment
	 * @throws NoSuchHealthCareApplicationPaymentException if a matching health care application payment could not be found
	 */
	public static HealthCareApplicationPayment findBygetHAP_HAI(
			long healthCareApplicationId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareApplicationPaymentException {

		return getPersistence().findBygetHAP_HAI(healthCareApplicationId);
	}

	/**
	 * Returns the health care application payment where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care application payment, or <code>null</code> if a matching health care application payment could not be found
	 */
	public static HealthCareApplicationPayment fetchBygetHAP_HAI(
		long healthCareApplicationId) {

		return getPersistence().fetchBygetHAP_HAI(healthCareApplicationId);
	}

	/**
	 * Returns the health care application payment where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care application payment, or <code>null</code> if a matching health care application payment could not be found
	 */
	public static HealthCareApplicationPayment fetchBygetHAP_HAI(
		long healthCareApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetHAP_HAI(
			healthCareApplicationId, useFinderCache);
	}

	/**
	 * Removes the health care application payment where healthCareApplicationId = &#63; from the database.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the health care application payment that was removed
	 */
	public static HealthCareApplicationPayment removeBygetHAP_HAI(
			long healthCareApplicationId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareApplicationPaymentException {

		return getPersistence().removeBygetHAP_HAI(healthCareApplicationId);
	}

	/**
	 * Returns the number of health care application payments where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the number of matching health care application payments
	 */
	public static int countBygetHAP_HAI(long healthCareApplicationId) {
		return getPersistence().countBygetHAP_HAI(healthCareApplicationId);
	}

	/**
	 * Caches the health care application payment in the entity cache if it is enabled.
	 *
	 * @param healthCareApplicationPayment the health care application payment
	 */
	public static void cacheResult(
		HealthCareApplicationPayment healthCareApplicationPayment) {

		getPersistence().cacheResult(healthCareApplicationPayment);
	}

	/**
	 * Caches the health care application payments in the entity cache if it is enabled.
	 *
	 * @param healthCareApplicationPayments the health care application payments
	 */
	public static void cacheResult(
		List<HealthCareApplicationPayment> healthCareApplicationPayments) {

		getPersistence().cacheResult(healthCareApplicationPayments);
	}

	/**
	 * Creates a new health care application payment with the primary key. Does not add the health care application payment to the database.
	 *
	 * @param healthCareApplicationPaymentId the primary key for the new health care application payment
	 * @return the new health care application payment
	 */
	public static HealthCareApplicationPayment create(
		long healthCareApplicationPaymentId) {

		return getPersistence().create(healthCareApplicationPaymentId);
	}

	/**
	 * Removes the health care application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthCareApplicationPaymentId the primary key of the health care application payment
	 * @return the health care application payment that was removed
	 * @throws NoSuchHealthCareApplicationPaymentException if a health care application payment with the primary key could not be found
	 */
	public static HealthCareApplicationPayment remove(
			long healthCareApplicationPaymentId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareApplicationPaymentException {

		return getPersistence().remove(healthCareApplicationPaymentId);
	}

	public static HealthCareApplicationPayment updateImpl(
		HealthCareApplicationPayment healthCareApplicationPayment) {

		return getPersistence().updateImpl(healthCareApplicationPayment);
	}

	/**
	 * Returns the health care application payment with the primary key or throws a <code>NoSuchHealthCareApplicationPaymentException</code> if it could not be found.
	 *
	 * @param healthCareApplicationPaymentId the primary key of the health care application payment
	 * @return the health care application payment
	 * @throws NoSuchHealthCareApplicationPaymentException if a health care application payment with the primary key could not be found
	 */
	public static HealthCareApplicationPayment findByPrimaryKey(
			long healthCareApplicationPaymentId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareApplicationPaymentException {

		return getPersistence().findByPrimaryKey(
			healthCareApplicationPaymentId);
	}

	/**
	 * Returns the health care application payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthCareApplicationPaymentId the primary key of the health care application payment
	 * @return the health care application payment, or <code>null</code> if a health care application payment with the primary key could not be found
	 */
	public static HealthCareApplicationPayment fetchByPrimaryKey(
		long healthCareApplicationPaymentId) {

		return getPersistence().fetchByPrimaryKey(
			healthCareApplicationPaymentId);
	}

	/**
	 * Returns all the health care application payments.
	 *
	 * @return the health care application payments
	 */
	public static List<HealthCareApplicationPayment> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the health care application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care application payments
	 * @param end the upper bound of the range of health care application payments (not inclusive)
	 * @return the range of health care application payments
	 */
	public static List<HealthCareApplicationPayment> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the health care application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care application payments
	 * @param end the upper bound of the range of health care application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health care application payments
	 */
	public static List<HealthCareApplicationPayment> findAll(
		int start, int end,
		OrderByComparator<HealthCareApplicationPayment> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the health care application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care application payments
	 * @param end the upper bound of the range of health care application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health care application payments
	 */
	public static List<HealthCareApplicationPayment> findAll(
		int start, int end,
		OrderByComparator<HealthCareApplicationPayment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the health care application payments from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of health care application payments.
	 *
	 * @return the number of health care application payments
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static HealthCareApplicationPaymentPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		HealthCareApplicationPaymentPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile HealthCareApplicationPaymentPersistence
		_persistence;

}