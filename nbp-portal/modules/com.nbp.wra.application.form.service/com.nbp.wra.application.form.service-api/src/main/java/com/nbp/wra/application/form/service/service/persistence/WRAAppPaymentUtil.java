/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.wra.application.form.service.model.WRAAppPayment;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the wra app payment service. This utility wraps <code>com.nbp.wra.application.form.service.service.persistence.impl.WRAAppPaymentPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WRAAppPaymentPersistence
 * @generated
 */
public class WRAAppPaymentUtil {

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
	public static void clearCache(WRAAppPayment wraAppPayment) {
		getPersistence().clearCache(wraAppPayment);
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
	public static Map<Serializable, WRAAppPayment> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<WRAAppPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<WRAAppPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<WRAAppPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<WRAAppPayment> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static WRAAppPayment update(WRAAppPayment wraAppPayment) {
		return getPersistence().update(wraAppPayment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static WRAAppPayment update(
		WRAAppPayment wraAppPayment, ServiceContext serviceContext) {

		return getPersistence().update(wraAppPayment, serviceContext);
	}

	/**
	 * Returns the wra app payment where wraApplicationId = &#63; or throws a <code>NoSuchWRAAppPaymentException</code> if it could not be found.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra app payment
	 * @throws NoSuchWRAAppPaymentException if a matching wra app payment could not be found
	 */
	public static WRAAppPayment findBygetWRA_By_Id(long wraApplicationId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAAppPaymentException {

		return getPersistence().findBygetWRA_By_Id(wraApplicationId);
	}

	/**
	 * Returns the wra app payment where wraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra app payment, or <code>null</code> if a matching wra app payment could not be found
	 */
	public static WRAAppPayment fetchBygetWRA_By_Id(long wraApplicationId) {
		return getPersistence().fetchBygetWRA_By_Id(wraApplicationId);
	}

	/**
	 * Returns the wra app payment where wraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra app payment, or <code>null</code> if a matching wra app payment could not be found
	 */
	public static WRAAppPayment fetchBygetWRA_By_Id(
		long wraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetWRA_By_Id(
			wraApplicationId, useFinderCache);
	}

	/**
	 * Removes the wra app payment where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the wra app payment that was removed
	 */
	public static WRAAppPayment removeBygetWRA_By_Id(long wraApplicationId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAAppPaymentException {

		return getPersistence().removeBygetWRA_By_Id(wraApplicationId);
	}

	/**
	 * Returns the number of wra app payments where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching wra app payments
	 */
	public static int countBygetWRA_By_Id(long wraApplicationId) {
		return getPersistence().countBygetWRA_By_Id(wraApplicationId);
	}

	/**
	 * Caches the wra app payment in the entity cache if it is enabled.
	 *
	 * @param wraAppPayment the wra app payment
	 */
	public static void cacheResult(WRAAppPayment wraAppPayment) {
		getPersistence().cacheResult(wraAppPayment);
	}

	/**
	 * Caches the wra app payments in the entity cache if it is enabled.
	 *
	 * @param wraAppPayments the wra app payments
	 */
	public static void cacheResult(List<WRAAppPayment> wraAppPayments) {
		getPersistence().cacheResult(wraAppPayments);
	}

	/**
	 * Creates a new wra app payment with the primary key. Does not add the wra app payment to the database.
	 *
	 * @param wraAppPaymentId the primary key for the new wra app payment
	 * @return the new wra app payment
	 */
	public static WRAAppPayment create(long wraAppPaymentId) {
		return getPersistence().create(wraAppPaymentId);
	}

	/**
	 * Removes the wra app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wraAppPaymentId the primary key of the wra app payment
	 * @return the wra app payment that was removed
	 * @throws NoSuchWRAAppPaymentException if a wra app payment with the primary key could not be found
	 */
	public static WRAAppPayment remove(long wraAppPaymentId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAAppPaymentException {

		return getPersistence().remove(wraAppPaymentId);
	}

	public static WRAAppPayment updateImpl(WRAAppPayment wraAppPayment) {
		return getPersistence().updateImpl(wraAppPayment);
	}

	/**
	 * Returns the wra app payment with the primary key or throws a <code>NoSuchWRAAppPaymentException</code> if it could not be found.
	 *
	 * @param wraAppPaymentId the primary key of the wra app payment
	 * @return the wra app payment
	 * @throws NoSuchWRAAppPaymentException if a wra app payment with the primary key could not be found
	 */
	public static WRAAppPayment findByPrimaryKey(long wraAppPaymentId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAAppPaymentException {

		return getPersistence().findByPrimaryKey(wraAppPaymentId);
	}

	/**
	 * Returns the wra app payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wraAppPaymentId the primary key of the wra app payment
	 * @return the wra app payment, or <code>null</code> if a wra app payment with the primary key could not be found
	 */
	public static WRAAppPayment fetchByPrimaryKey(long wraAppPaymentId) {
		return getPersistence().fetchByPrimaryKey(wraAppPaymentId);
	}

	/**
	 * Returns all the wra app payments.
	 *
	 * @return the wra app payments
	 */
	public static List<WRAAppPayment> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the wra app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra app payments
	 * @param end the upper bound of the range of wra app payments (not inclusive)
	 * @return the range of wra app payments
	 */
	public static List<WRAAppPayment> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the wra app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra app payments
	 * @param end the upper bound of the range of wra app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wra app payments
	 */
	public static List<WRAAppPayment> findAll(
		int start, int end,
		OrderByComparator<WRAAppPayment> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the wra app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra app payments
	 * @param end the upper bound of the range of wra app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of wra app payments
	 */
	public static List<WRAAppPayment> findAll(
		int start, int end, OrderByComparator<WRAAppPayment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the wra app payments from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of wra app payments.
	 *
	 * @return the number of wra app payments
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static WRAAppPaymentPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(WRAAppPaymentPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile WRAAppPaymentPersistence _persistence;

}