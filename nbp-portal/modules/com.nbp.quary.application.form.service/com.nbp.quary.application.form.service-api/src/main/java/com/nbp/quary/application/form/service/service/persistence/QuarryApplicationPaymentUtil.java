/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.quary.application.form.service.model.QuarryApplicationPayment;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the quarry application payment service. This utility wraps <code>com.nbp.quary.application.form.service.service.persistence.impl.QuarryApplicationPaymentPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryApplicationPaymentPersistence
 * @generated
 */
public class QuarryApplicationPaymentUtil {

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
		QuarryApplicationPayment quarryApplicationPayment) {

		getPersistence().clearCache(quarryApplicationPayment);
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
	public static Map<Serializable, QuarryApplicationPayment>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<QuarryApplicationPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QuarryApplicationPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QuarryApplicationPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<QuarryApplicationPayment> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static QuarryApplicationPayment update(
		QuarryApplicationPayment quarryApplicationPayment) {

		return getPersistence().update(quarryApplicationPayment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static QuarryApplicationPayment update(
		QuarryApplicationPayment quarryApplicationPayment,
		ServiceContext serviceContext) {

		return getPersistence().update(
			quarryApplicationPayment, serviceContext);
	}

	/**
	 * Returns the quarry application payment where quarryApplicationId = &#63; or throws a <code>NoSuchQuarryApplicationPaymentException</code> if it could not be found.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry application payment
	 * @throws NoSuchQuarryApplicationPaymentException if a matching quarry application payment could not be found
	 */
	public static QuarryApplicationPayment findBygetQuarry_Pay_AppId(
			long quarryApplicationId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationPaymentException {

		return getPersistence().findBygetQuarry_Pay_AppId(quarryApplicationId);
	}

	/**
	 * Returns the quarry application payment where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry application payment, or <code>null</code> if a matching quarry application payment could not be found
	 */
	public static QuarryApplicationPayment fetchBygetQuarry_Pay_AppId(
		long quarryApplicationId) {

		return getPersistence().fetchBygetQuarry_Pay_AppId(quarryApplicationId);
	}

	/**
	 * Returns the quarry application payment where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application payment, or <code>null</code> if a matching quarry application payment could not be found
	 */
	public static QuarryApplicationPayment fetchBygetQuarry_Pay_AppId(
		long quarryApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetQuarry_Pay_AppId(
			quarryApplicationId, useFinderCache);
	}

	/**
	 * Removes the quarry application payment where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the quarry application payment that was removed
	 */
	public static QuarryApplicationPayment removeBygetQuarry_Pay_AppId(
			long quarryApplicationId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationPaymentException {

		return getPersistence().removeBygetQuarry_Pay_AppId(
			quarryApplicationId);
	}

	/**
	 * Returns the number of quarry application payments where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry application payments
	 */
	public static int countBygetQuarry_Pay_AppId(long quarryApplicationId) {
		return getPersistence().countBygetQuarry_Pay_AppId(quarryApplicationId);
	}

	/**
	 * Caches the quarry application payment in the entity cache if it is enabled.
	 *
	 * @param quarryApplicationPayment the quarry application payment
	 */
	public static void cacheResult(
		QuarryApplicationPayment quarryApplicationPayment) {

		getPersistence().cacheResult(quarryApplicationPayment);
	}

	/**
	 * Caches the quarry application payments in the entity cache if it is enabled.
	 *
	 * @param quarryApplicationPayments the quarry application payments
	 */
	public static void cacheResult(
		List<QuarryApplicationPayment> quarryApplicationPayments) {

		getPersistence().cacheResult(quarryApplicationPayments);
	}

	/**
	 * Creates a new quarry application payment with the primary key. Does not add the quarry application payment to the database.
	 *
	 * @param quarryApplicationPaymentId the primary key for the new quarry application payment
	 * @return the new quarry application payment
	 */
	public static QuarryApplicationPayment create(
		long quarryApplicationPaymentId) {

		return getPersistence().create(quarryApplicationPaymentId);
	}

	/**
	 * Removes the quarry application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param quarryApplicationPaymentId the primary key of the quarry application payment
	 * @return the quarry application payment that was removed
	 * @throws NoSuchQuarryApplicationPaymentException if a quarry application payment with the primary key could not be found
	 */
	public static QuarryApplicationPayment remove(
			long quarryApplicationPaymentId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationPaymentException {

		return getPersistence().remove(quarryApplicationPaymentId);
	}

	public static QuarryApplicationPayment updateImpl(
		QuarryApplicationPayment quarryApplicationPayment) {

		return getPersistence().updateImpl(quarryApplicationPayment);
	}

	/**
	 * Returns the quarry application payment with the primary key or throws a <code>NoSuchQuarryApplicationPaymentException</code> if it could not be found.
	 *
	 * @param quarryApplicationPaymentId the primary key of the quarry application payment
	 * @return the quarry application payment
	 * @throws NoSuchQuarryApplicationPaymentException if a quarry application payment with the primary key could not be found
	 */
	public static QuarryApplicationPayment findByPrimaryKey(
			long quarryApplicationPaymentId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationPaymentException {

		return getPersistence().findByPrimaryKey(quarryApplicationPaymentId);
	}

	/**
	 * Returns the quarry application payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param quarryApplicationPaymentId the primary key of the quarry application payment
	 * @return the quarry application payment, or <code>null</code> if a quarry application payment with the primary key could not be found
	 */
	public static QuarryApplicationPayment fetchByPrimaryKey(
		long quarryApplicationPaymentId) {

		return getPersistence().fetchByPrimaryKey(quarryApplicationPaymentId);
	}

	/**
	 * Returns all the quarry application payments.
	 *
	 * @return the quarry application payments
	 */
	public static List<QuarryApplicationPayment> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the quarry application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry application payments
	 * @param end the upper bound of the range of quarry application payments (not inclusive)
	 * @return the range of quarry application payments
	 */
	public static List<QuarryApplicationPayment> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the quarry application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry application payments
	 * @param end the upper bound of the range of quarry application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry application payments
	 */
	public static List<QuarryApplicationPayment> findAll(
		int start, int end,
		OrderByComparator<QuarryApplicationPayment> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry application payments
	 * @param end the upper bound of the range of quarry application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry application payments
	 */
	public static List<QuarryApplicationPayment> findAll(
		int start, int end,
		OrderByComparator<QuarryApplicationPayment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the quarry application payments from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of quarry application payments.
	 *
	 * @return the number of quarry application payments
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static QuarryApplicationPaymentPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		QuarryApplicationPaymentPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile QuarryApplicationPaymentPersistence _persistence;

}