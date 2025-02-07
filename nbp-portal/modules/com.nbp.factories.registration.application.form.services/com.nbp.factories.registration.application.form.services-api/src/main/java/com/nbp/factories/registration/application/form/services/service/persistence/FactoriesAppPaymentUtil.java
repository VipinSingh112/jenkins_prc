/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.factories.registration.application.form.services.model.FactoriesAppPayment;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the factories app payment service. This utility wraps <code>com.nbp.factories.registration.application.form.services.service.persistence.impl.FactoriesAppPaymentPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesAppPaymentPersistence
 * @generated
 */
public class FactoriesAppPaymentUtil {

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
	public static void clearCache(FactoriesAppPayment factoriesAppPayment) {
		getPersistence().clearCache(factoriesAppPayment);
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
	public static Map<Serializable, FactoriesAppPayment> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FactoriesAppPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FactoriesAppPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FactoriesAppPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FactoriesAppPayment> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FactoriesAppPayment update(
		FactoriesAppPayment factoriesAppPayment) {

		return getPersistence().update(factoriesAppPayment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FactoriesAppPayment update(
		FactoriesAppPayment factoriesAppPayment,
		ServiceContext serviceContext) {

		return getPersistence().update(factoriesAppPayment, serviceContext);
	}

	/**
	 * Returns the factories app payment where factoriesApplicationId = &#63; or throws a <code>NoSuchFactoriesAppPaymentException</code> if it could not be found.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories app payment
	 * @throws NoSuchFactoriesAppPaymentException if a matching factories app payment could not be found
	 */
	public static FactoriesAppPayment findBygetMiningById(
			long factoriesApplicationId)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesAppPaymentException {

		return getPersistence().findBygetMiningById(factoriesApplicationId);
	}

	/**
	 * Returns the factories app payment where factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories app payment, or <code>null</code> if a matching factories app payment could not be found
	 */
	public static FactoriesAppPayment fetchBygetMiningById(
		long factoriesApplicationId) {

		return getPersistence().fetchBygetMiningById(factoriesApplicationId);
	}

	/**
	 * Returns the factories app payment where factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories app payment, or <code>null</code> if a matching factories app payment could not be found
	 */
	public static FactoriesAppPayment fetchBygetMiningById(
		long factoriesApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetMiningById(
			factoriesApplicationId, useFinderCache);
	}

	/**
	 * Removes the factories app payment where factoriesApplicationId = &#63; from the database.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the factories app payment that was removed
	 */
	public static FactoriesAppPayment removeBygetMiningById(
			long factoriesApplicationId)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesAppPaymentException {

		return getPersistence().removeBygetMiningById(factoriesApplicationId);
	}

	/**
	 * Returns the number of factories app payments where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the number of matching factories app payments
	 */
	public static int countBygetMiningById(long factoriesApplicationId) {
		return getPersistence().countBygetMiningById(factoriesApplicationId);
	}

	/**
	 * Caches the factories app payment in the entity cache if it is enabled.
	 *
	 * @param factoriesAppPayment the factories app payment
	 */
	public static void cacheResult(FactoriesAppPayment factoriesAppPayment) {
		getPersistence().cacheResult(factoriesAppPayment);
	}

	/**
	 * Caches the factories app payments in the entity cache if it is enabled.
	 *
	 * @param factoriesAppPayments the factories app payments
	 */
	public static void cacheResult(
		List<FactoriesAppPayment> factoriesAppPayments) {

		getPersistence().cacheResult(factoriesAppPayments);
	}

	/**
	 * Creates a new factories app payment with the primary key. Does not add the factories app payment to the database.
	 *
	 * @param factoriesAppPaymentId the primary key for the new factories app payment
	 * @return the new factories app payment
	 */
	public static FactoriesAppPayment create(long factoriesAppPaymentId) {
		return getPersistence().create(factoriesAppPaymentId);
	}

	/**
	 * Removes the factories app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param factoriesAppPaymentId the primary key of the factories app payment
	 * @return the factories app payment that was removed
	 * @throws NoSuchFactoriesAppPaymentException if a factories app payment with the primary key could not be found
	 */
	public static FactoriesAppPayment remove(long factoriesAppPaymentId)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesAppPaymentException {

		return getPersistence().remove(factoriesAppPaymentId);
	}

	public static FactoriesAppPayment updateImpl(
		FactoriesAppPayment factoriesAppPayment) {

		return getPersistence().updateImpl(factoriesAppPayment);
	}

	/**
	 * Returns the factories app payment with the primary key or throws a <code>NoSuchFactoriesAppPaymentException</code> if it could not be found.
	 *
	 * @param factoriesAppPaymentId the primary key of the factories app payment
	 * @return the factories app payment
	 * @throws NoSuchFactoriesAppPaymentException if a factories app payment with the primary key could not be found
	 */
	public static FactoriesAppPayment findByPrimaryKey(
			long factoriesAppPaymentId)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesAppPaymentException {

		return getPersistence().findByPrimaryKey(factoriesAppPaymentId);
	}

	/**
	 * Returns the factories app payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param factoriesAppPaymentId the primary key of the factories app payment
	 * @return the factories app payment, or <code>null</code> if a factories app payment with the primary key could not be found
	 */
	public static FactoriesAppPayment fetchByPrimaryKey(
		long factoriesAppPaymentId) {

		return getPersistence().fetchByPrimaryKey(factoriesAppPaymentId);
	}

	/**
	 * Returns all the factories app payments.
	 *
	 * @return the factories app payments
	 */
	public static List<FactoriesAppPayment> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the factories app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories app payments
	 * @param end the upper bound of the range of factories app payments (not inclusive)
	 * @return the range of factories app payments
	 */
	public static List<FactoriesAppPayment> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the factories app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories app payments
	 * @param end the upper bound of the range of factories app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of factories app payments
	 */
	public static List<FactoriesAppPayment> findAll(
		int start, int end,
		OrderByComparator<FactoriesAppPayment> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the factories app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories app payments
	 * @param end the upper bound of the range of factories app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of factories app payments
	 */
	public static List<FactoriesAppPayment> findAll(
		int start, int end,
		OrderByComparator<FactoriesAppPayment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the factories app payments from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of factories app payments.
	 *
	 * @return the number of factories app payments
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FactoriesAppPaymentPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FactoriesAppPaymentPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FactoriesAppPaymentPersistence _persistence;

}