/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezStatusAppPayment;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez status app payment service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezStatusAppPaymentPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusAppPaymentPersistence
 * @generated
 */
public class SezStatusAppPaymentUtil {

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
	public static void clearCache(SezStatusAppPayment sezStatusAppPayment) {
		getPersistence().clearCache(sezStatusAppPayment);
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
	public static Map<Serializable, SezStatusAppPayment> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezStatusAppPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezStatusAppPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezStatusAppPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezStatusAppPayment> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezStatusAppPayment update(
		SezStatusAppPayment sezStatusAppPayment) {

		return getPersistence().update(sezStatusAppPayment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezStatusAppPayment update(
		SezStatusAppPayment sezStatusAppPayment,
		ServiceContext serviceContext) {

		return getPersistence().update(sezStatusAppPayment, serviceContext);
	}

	/**
	 * Returns the sez status app payment where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezStatusAppPaymentException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status app payment
	 * @throws NoSuchSezStatusAppPaymentException if a matching sez status app payment could not be found
	 */
	public static SezStatusAppPayment findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusAppPaymentException {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez status app payment where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status app payment, or <code>null</code> if a matching sez status app payment could not be found
	 */
	public static SezStatusAppPayment fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez status app payment where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status app payment, or <code>null</code> if a matching sez status app payment could not be found
	 */
	public static SezStatusAppPayment fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId, useFinderCache);
	}

	/**
	 * Removes the sez status app payment where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez status app payment that was removed
	 */
	public static SezStatusAppPayment removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusAppPaymentException {

		return getPersistence().removeBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez status app payments where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez status app payments
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez status app payment in the entity cache if it is enabled.
	 *
	 * @param sezStatusAppPayment the sez status app payment
	 */
	public static void cacheResult(SezStatusAppPayment sezStatusAppPayment) {
		getPersistence().cacheResult(sezStatusAppPayment);
	}

	/**
	 * Caches the sez status app payments in the entity cache if it is enabled.
	 *
	 * @param sezStatusAppPayments the sez status app payments
	 */
	public static void cacheResult(
		List<SezStatusAppPayment> sezStatusAppPayments) {

		getPersistence().cacheResult(sezStatusAppPayments);
	}

	/**
	 * Creates a new sez status app payment with the primary key. Does not add the sez status app payment to the database.
	 *
	 * @param sezStatusAppPaymentId the primary key for the new sez status app payment
	 * @return the new sez status app payment
	 */
	public static SezStatusAppPayment create(long sezStatusAppPaymentId) {
		return getPersistence().create(sezStatusAppPaymentId);
	}

	/**
	 * Removes the sez status app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezStatusAppPaymentId the primary key of the sez status app payment
	 * @return the sez status app payment that was removed
	 * @throws NoSuchSezStatusAppPaymentException if a sez status app payment with the primary key could not be found
	 */
	public static SezStatusAppPayment remove(long sezStatusAppPaymentId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusAppPaymentException {

		return getPersistence().remove(sezStatusAppPaymentId);
	}

	public static SezStatusAppPayment updateImpl(
		SezStatusAppPayment sezStatusAppPayment) {

		return getPersistence().updateImpl(sezStatusAppPayment);
	}

	/**
	 * Returns the sez status app payment with the primary key or throws a <code>NoSuchSezStatusAppPaymentException</code> if it could not be found.
	 *
	 * @param sezStatusAppPaymentId the primary key of the sez status app payment
	 * @return the sez status app payment
	 * @throws NoSuchSezStatusAppPaymentException if a sez status app payment with the primary key could not be found
	 */
	public static SezStatusAppPayment findByPrimaryKey(
			long sezStatusAppPaymentId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusAppPaymentException {

		return getPersistence().findByPrimaryKey(sezStatusAppPaymentId);
	}

	/**
	 * Returns the sez status app payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezStatusAppPaymentId the primary key of the sez status app payment
	 * @return the sez status app payment, or <code>null</code> if a sez status app payment with the primary key could not be found
	 */
	public static SezStatusAppPayment fetchByPrimaryKey(
		long sezStatusAppPaymentId) {

		return getPersistence().fetchByPrimaryKey(sezStatusAppPaymentId);
	}

	/**
	 * Returns all the sez status app payments.
	 *
	 * @return the sez status app payments
	 */
	public static List<SezStatusAppPayment> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez status app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status app payments
	 * @param end the upper bound of the range of sez status app payments (not inclusive)
	 * @return the range of sez status app payments
	 */
	public static List<SezStatusAppPayment> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez status app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status app payments
	 * @param end the upper bound of the range of sez status app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status app payments
	 */
	public static List<SezStatusAppPayment> findAll(
		int start, int end,
		OrderByComparator<SezStatusAppPayment> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status app payments
	 * @param end the upper bound of the range of sez status app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status app payments
	 */
	public static List<SezStatusAppPayment> findAll(
		int start, int end,
		OrderByComparator<SezStatusAppPayment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez status app payments from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez status app payments.
	 *
	 * @return the number of sez status app payments
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezStatusAppPaymentPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezStatusAppPaymentPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezStatusAppPaymentPersistence _persistence;

}