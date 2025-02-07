/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.fire.brigade.application.form.service.model.FireBrigadeAppPayment;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the fire brigade app payment service. This utility wraps <code>com.nbp.fire.brigade.application.form.service.service.persistence.impl.FireBrigadeAppPaymentPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeAppPaymentPersistence
 * @generated
 */
public class FireBrigadeAppPaymentUtil {

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
	public static void clearCache(FireBrigadeAppPayment fireBrigadeAppPayment) {
		getPersistence().clearCache(fireBrigadeAppPayment);
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
	public static Map<Serializable, FireBrigadeAppPayment> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FireBrigadeAppPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FireBrigadeAppPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FireBrigadeAppPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FireBrigadeAppPayment> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FireBrigadeAppPayment update(
		FireBrigadeAppPayment fireBrigadeAppPayment) {

		return getPersistence().update(fireBrigadeAppPayment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FireBrigadeAppPayment update(
		FireBrigadeAppPayment fireBrigadeAppPayment,
		ServiceContext serviceContext) {

		return getPersistence().update(fireBrigadeAppPayment, serviceContext);
	}

	/**
	 * Returns the fire brigade app payment where fireBrigadeApplicationId = &#63; or throws a <code>NoSuchFireBrigadeAppPaymentException</code> if it could not be found.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade app payment
	 * @throws NoSuchFireBrigadeAppPaymentException if a matching fire brigade app payment could not be found
	 */
	public static FireBrigadeAppPayment findByfireBrigadeApplicationId(
			long fireBrigadeApplicationId)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeAppPaymentException {

		return getPersistence().findByfireBrigadeApplicationId(
			fireBrigadeApplicationId);
	}

	/**
	 * Returns the fire brigade app payment where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade app payment, or <code>null</code> if a matching fire brigade app payment could not be found
	 */
	public static FireBrigadeAppPayment fetchByfireBrigadeApplicationId(
		long fireBrigadeApplicationId) {

		return getPersistence().fetchByfireBrigadeApplicationId(
			fireBrigadeApplicationId);
	}

	/**
	 * Returns the fire brigade app payment where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade app payment, or <code>null</code> if a matching fire brigade app payment could not be found
	 */
	public static FireBrigadeAppPayment fetchByfireBrigadeApplicationId(
		long fireBrigadeApplicationId, boolean useFinderCache) {

		return getPersistence().fetchByfireBrigadeApplicationId(
			fireBrigadeApplicationId, useFinderCache);
	}

	/**
	 * Removes the fire brigade app payment where fireBrigadeApplicationId = &#63; from the database.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the fire brigade app payment that was removed
	 */
	public static FireBrigadeAppPayment removeByfireBrigadeApplicationId(
			long fireBrigadeApplicationId)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeAppPaymentException {

		return getPersistence().removeByfireBrigadeApplicationId(
			fireBrigadeApplicationId);
	}

	/**
	 * Returns the number of fire brigade app payments where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the number of matching fire brigade app payments
	 */
	public static int countByfireBrigadeApplicationId(
		long fireBrigadeApplicationId) {

		return getPersistence().countByfireBrigadeApplicationId(
			fireBrigadeApplicationId);
	}

	/**
	 * Caches the fire brigade app payment in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeAppPayment the fire brigade app payment
	 */
	public static void cacheResult(
		FireBrigadeAppPayment fireBrigadeAppPayment) {

		getPersistence().cacheResult(fireBrigadeAppPayment);
	}

	/**
	 * Caches the fire brigade app payments in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeAppPayments the fire brigade app payments
	 */
	public static void cacheResult(
		List<FireBrigadeAppPayment> fireBrigadeAppPayments) {

		getPersistence().cacheResult(fireBrigadeAppPayments);
	}

	/**
	 * Creates a new fire brigade app payment with the primary key. Does not add the fire brigade app payment to the database.
	 *
	 * @param fireBrigadeAppPaymentId the primary key for the new fire brigade app payment
	 * @return the new fire brigade app payment
	 */
	public static FireBrigadeAppPayment create(long fireBrigadeAppPaymentId) {
		return getPersistence().create(fireBrigadeAppPaymentId);
	}

	/**
	 * Removes the fire brigade app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadeAppPaymentId the primary key of the fire brigade app payment
	 * @return the fire brigade app payment that was removed
	 * @throws NoSuchFireBrigadeAppPaymentException if a fire brigade app payment with the primary key could not be found
	 */
	public static FireBrigadeAppPayment remove(long fireBrigadeAppPaymentId)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeAppPaymentException {

		return getPersistence().remove(fireBrigadeAppPaymentId);
	}

	public static FireBrigadeAppPayment updateImpl(
		FireBrigadeAppPayment fireBrigadeAppPayment) {

		return getPersistence().updateImpl(fireBrigadeAppPayment);
	}

	/**
	 * Returns the fire brigade app payment with the primary key or throws a <code>NoSuchFireBrigadeAppPaymentException</code> if it could not be found.
	 *
	 * @param fireBrigadeAppPaymentId the primary key of the fire brigade app payment
	 * @return the fire brigade app payment
	 * @throws NoSuchFireBrigadeAppPaymentException if a fire brigade app payment with the primary key could not be found
	 */
	public static FireBrigadeAppPayment findByPrimaryKey(
			long fireBrigadeAppPaymentId)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeAppPaymentException {

		return getPersistence().findByPrimaryKey(fireBrigadeAppPaymentId);
	}

	/**
	 * Returns the fire brigade app payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadeAppPaymentId the primary key of the fire brigade app payment
	 * @return the fire brigade app payment, or <code>null</code> if a fire brigade app payment with the primary key could not be found
	 */
	public static FireBrigadeAppPayment fetchByPrimaryKey(
		long fireBrigadeAppPaymentId) {

		return getPersistence().fetchByPrimaryKey(fireBrigadeAppPaymentId);
	}

	/**
	 * Returns all the fire brigade app payments.
	 *
	 * @return the fire brigade app payments
	 */
	public static List<FireBrigadeAppPayment> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the fire brigade app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade app payments
	 * @param end the upper bound of the range of fire brigade app payments (not inclusive)
	 * @return the range of fire brigade app payments
	 */
	public static List<FireBrigadeAppPayment> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the fire brigade app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade app payments
	 * @param end the upper bound of the range of fire brigade app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade app payments
	 */
	public static List<FireBrigadeAppPayment> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeAppPayment> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the fire brigade app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade app payments
	 * @param end the upper bound of the range of fire brigade app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade app payments
	 */
	public static List<FireBrigadeAppPayment> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeAppPayment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the fire brigade app payments from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of fire brigade app payments.
	 *
	 * @return the number of fire brigade app payments
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FireBrigadeAppPaymentPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FireBrigadeAppPaymentPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FireBrigadeAppPaymentPersistence _persistence;

}