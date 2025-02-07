/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.HsraApplicationPayment;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the hsra application payment service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.HsraApplicationPaymentPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HsraApplicationPaymentPersistence
 * @generated
 */
public class HsraApplicationPaymentUtil {

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
		HsraApplicationPayment hsraApplicationPayment) {

		getPersistence().clearCache(hsraApplicationPayment);
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
	public static Map<Serializable, HsraApplicationPayment> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<HsraApplicationPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HsraApplicationPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HsraApplicationPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<HsraApplicationPayment> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static HsraApplicationPayment update(
		HsraApplicationPayment hsraApplicationPayment) {

		return getPersistence().update(hsraApplicationPayment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static HsraApplicationPayment update(
		HsraApplicationPayment hsraApplicationPayment,
		ServiceContext serviceContext) {

		return getPersistence().update(hsraApplicationPayment, serviceContext);
	}

	/**
	 * Returns the hsra application payment where hsraApplicationId = &#63; or throws a <code>NoSuchHsraApplicationPaymentException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra application payment
	 * @throws NoSuchHsraApplicationPaymentException if a matching hsra application payment could not be found
	 */
	public static HsraApplicationPayment findBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationPaymentException {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the hsra application payment where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra application payment, or <code>null</code> if a matching hsra application payment could not be found
	 */
	public static HsraApplicationPayment fetchBygetHsraById(
		long hsraApplicationId) {

		return getPersistence().fetchBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the hsra application payment where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application payment, or <code>null</code> if a matching hsra application payment could not be found
	 */
	public static HsraApplicationPayment fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetHsraById(
			hsraApplicationId, useFinderCache);
	}

	/**
	 * Removes the hsra application payment where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the hsra application payment that was removed
	 */
	public static HsraApplicationPayment removeBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationPaymentException {

		return getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of hsra application payments where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching hsra application payments
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the hsra application payment in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationPayment the hsra application payment
	 */
	public static void cacheResult(
		HsraApplicationPayment hsraApplicationPayment) {

		getPersistence().cacheResult(hsraApplicationPayment);
	}

	/**
	 * Caches the hsra application payments in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationPayments the hsra application payments
	 */
	public static void cacheResult(
		List<HsraApplicationPayment> hsraApplicationPayments) {

		getPersistence().cacheResult(hsraApplicationPayments);
	}

	/**
	 * Creates a new hsra application payment with the primary key. Does not add the hsra application payment to the database.
	 *
	 * @param hsraApplicationPaymentId the primary key for the new hsra application payment
	 * @return the new hsra application payment
	 */
	public static HsraApplicationPayment create(long hsraApplicationPaymentId) {
		return getPersistence().create(hsraApplicationPaymentId);
	}

	/**
	 * Removes the hsra application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param hsraApplicationPaymentId the primary key of the hsra application payment
	 * @return the hsra application payment that was removed
	 * @throws NoSuchHsraApplicationPaymentException if a hsra application payment with the primary key could not be found
	 */
	public static HsraApplicationPayment remove(long hsraApplicationPaymentId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationPaymentException {

		return getPersistence().remove(hsraApplicationPaymentId);
	}

	public static HsraApplicationPayment updateImpl(
		HsraApplicationPayment hsraApplicationPayment) {

		return getPersistence().updateImpl(hsraApplicationPayment);
	}

	/**
	 * Returns the hsra application payment with the primary key or throws a <code>NoSuchHsraApplicationPaymentException</code> if it could not be found.
	 *
	 * @param hsraApplicationPaymentId the primary key of the hsra application payment
	 * @return the hsra application payment
	 * @throws NoSuchHsraApplicationPaymentException if a hsra application payment with the primary key could not be found
	 */
	public static HsraApplicationPayment findByPrimaryKey(
			long hsraApplicationPaymentId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationPaymentException {

		return getPersistence().findByPrimaryKey(hsraApplicationPaymentId);
	}

	/**
	 * Returns the hsra application payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param hsraApplicationPaymentId the primary key of the hsra application payment
	 * @return the hsra application payment, or <code>null</code> if a hsra application payment with the primary key could not be found
	 */
	public static HsraApplicationPayment fetchByPrimaryKey(
		long hsraApplicationPaymentId) {

		return getPersistence().fetchByPrimaryKey(hsraApplicationPaymentId);
	}

	/**
	 * Returns all the hsra application payments.
	 *
	 * @return the hsra application payments
	 */
	public static List<HsraApplicationPayment> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the hsra application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application payments
	 * @param end the upper bound of the range of hsra application payments (not inclusive)
	 * @return the range of hsra application payments
	 */
	public static List<HsraApplicationPayment> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the hsra application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application payments
	 * @param end the upper bound of the range of hsra application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of hsra application payments
	 */
	public static List<HsraApplicationPayment> findAll(
		int start, int end,
		OrderByComparator<HsraApplicationPayment> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the hsra application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application payments
	 * @param end the upper bound of the range of hsra application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of hsra application payments
	 */
	public static List<HsraApplicationPayment> findAll(
		int start, int end,
		OrderByComparator<HsraApplicationPayment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the hsra application payments from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of hsra application payments.
	 *
	 * @return the number of hsra application payments
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static HsraApplicationPaymentPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		HsraApplicationPaymentPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile HsraApplicationPaymentPersistence _persistence;

}