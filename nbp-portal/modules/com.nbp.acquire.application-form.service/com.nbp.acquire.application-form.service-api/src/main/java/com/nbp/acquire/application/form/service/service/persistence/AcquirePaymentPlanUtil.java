/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.acquire.application.form.service.model.AcquirePaymentPlan;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acquire payment plan service. This utility wraps <code>com.nbp.acquire.application.form.service.service.persistence.impl.AcquirePaymentPlanPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquirePaymentPlanPersistence
 * @generated
 */
public class AcquirePaymentPlanUtil {

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
	public static void clearCache(AcquirePaymentPlan acquirePaymentPlan) {
		getPersistence().clearCache(acquirePaymentPlan);
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
	public static Map<Serializable, AcquirePaymentPlan> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AcquirePaymentPlan> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AcquirePaymentPlan> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AcquirePaymentPlan> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AcquirePaymentPlan> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AcquirePaymentPlan update(
		AcquirePaymentPlan acquirePaymentPlan) {

		return getPersistence().update(acquirePaymentPlan);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AcquirePaymentPlan update(
		AcquirePaymentPlan acquirePaymentPlan, ServiceContext serviceContext) {

		return getPersistence().update(acquirePaymentPlan, serviceContext);
	}

	/**
	 * Returns the acquire payment plan where acquireApplicationId = &#63; or throws a <code>NoSuchAcquirePaymentPlanException</code> if it could not be found.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire payment plan
	 * @throws NoSuchAcquirePaymentPlanException if a matching acquire payment plan could not be found
	 */
	public static AcquirePaymentPlan findBygetAcquireById(
			long acquireApplicationId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquirePaymentPlanException {

		return getPersistence().findBygetAcquireById(acquireApplicationId);
	}

	/**
	 * Returns the acquire payment plan where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire payment plan, or <code>null</code> if a matching acquire payment plan could not be found
	 */
	public static AcquirePaymentPlan fetchBygetAcquireById(
		long acquireApplicationId) {

		return getPersistence().fetchBygetAcquireById(acquireApplicationId);
	}

	/**
	 * Returns the acquire payment plan where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire payment plan, or <code>null</code> if a matching acquire payment plan could not be found
	 */
	public static AcquirePaymentPlan fetchBygetAcquireById(
		long acquireApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetAcquireById(
			acquireApplicationId, useFinderCache);
	}

	/**
	 * Removes the acquire payment plan where acquireApplicationId = &#63; from the database.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the acquire payment plan that was removed
	 */
	public static AcquirePaymentPlan removeBygetAcquireById(
			long acquireApplicationId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquirePaymentPlanException {

		return getPersistence().removeBygetAcquireById(acquireApplicationId);
	}

	/**
	 * Returns the number of acquire payment plans where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the number of matching acquire payment plans
	 */
	public static int countBygetAcquireById(long acquireApplicationId) {
		return getPersistence().countBygetAcquireById(acquireApplicationId);
	}

	/**
	 * Caches the acquire payment plan in the entity cache if it is enabled.
	 *
	 * @param acquirePaymentPlan the acquire payment plan
	 */
	public static void cacheResult(AcquirePaymentPlan acquirePaymentPlan) {
		getPersistence().cacheResult(acquirePaymentPlan);
	}

	/**
	 * Caches the acquire payment plans in the entity cache if it is enabled.
	 *
	 * @param acquirePaymentPlans the acquire payment plans
	 */
	public static void cacheResult(
		List<AcquirePaymentPlan> acquirePaymentPlans) {

		getPersistence().cacheResult(acquirePaymentPlans);
	}

	/**
	 * Creates a new acquire payment plan with the primary key. Does not add the acquire payment plan to the database.
	 *
	 * @param acquirePaymentPlanId the primary key for the new acquire payment plan
	 * @return the new acquire payment plan
	 */
	public static AcquirePaymentPlan create(long acquirePaymentPlanId) {
		return getPersistence().create(acquirePaymentPlanId);
	}

	/**
	 * Removes the acquire payment plan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquirePaymentPlanId the primary key of the acquire payment plan
	 * @return the acquire payment plan that was removed
	 * @throws NoSuchAcquirePaymentPlanException if a acquire payment plan with the primary key could not be found
	 */
	public static AcquirePaymentPlan remove(long acquirePaymentPlanId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquirePaymentPlanException {

		return getPersistence().remove(acquirePaymentPlanId);
	}

	public static AcquirePaymentPlan updateImpl(
		AcquirePaymentPlan acquirePaymentPlan) {

		return getPersistence().updateImpl(acquirePaymentPlan);
	}

	/**
	 * Returns the acquire payment plan with the primary key or throws a <code>NoSuchAcquirePaymentPlanException</code> if it could not be found.
	 *
	 * @param acquirePaymentPlanId the primary key of the acquire payment plan
	 * @return the acquire payment plan
	 * @throws NoSuchAcquirePaymentPlanException if a acquire payment plan with the primary key could not be found
	 */
	public static AcquirePaymentPlan findByPrimaryKey(long acquirePaymentPlanId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquirePaymentPlanException {

		return getPersistence().findByPrimaryKey(acquirePaymentPlanId);
	}

	/**
	 * Returns the acquire payment plan with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquirePaymentPlanId the primary key of the acquire payment plan
	 * @return the acquire payment plan, or <code>null</code> if a acquire payment plan with the primary key could not be found
	 */
	public static AcquirePaymentPlan fetchByPrimaryKey(
		long acquirePaymentPlanId) {

		return getPersistence().fetchByPrimaryKey(acquirePaymentPlanId);
	}

	/**
	 * Returns all the acquire payment plans.
	 *
	 * @return the acquire payment plans
	 */
	public static List<AcquirePaymentPlan> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acquire payment plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePaymentPlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire payment plans
	 * @param end the upper bound of the range of acquire payment plans (not inclusive)
	 * @return the range of acquire payment plans
	 */
	public static List<AcquirePaymentPlan> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acquire payment plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePaymentPlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire payment plans
	 * @param end the upper bound of the range of acquire payment plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire payment plans
	 */
	public static List<AcquirePaymentPlan> findAll(
		int start, int end,
		OrderByComparator<AcquirePaymentPlan> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acquire payment plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePaymentPlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire payment plans
	 * @param end the upper bound of the range of acquire payment plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire payment plans
	 */
	public static List<AcquirePaymentPlan> findAll(
		int start, int end,
		OrderByComparator<AcquirePaymentPlan> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acquire payment plans from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acquire payment plans.
	 *
	 * @return the number of acquire payment plans
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AcquirePaymentPlanPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AcquirePaymentPlanPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AcquirePaymentPlanPersistence _persistence;

}