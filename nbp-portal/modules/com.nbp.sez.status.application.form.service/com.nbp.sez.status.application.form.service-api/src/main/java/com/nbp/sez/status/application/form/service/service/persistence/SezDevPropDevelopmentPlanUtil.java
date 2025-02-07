/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezDevPropDevelopmentPlan;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez dev prop development plan service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezDevPropDevelopmentPlanPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevPropDevelopmentPlanPersistence
 * @generated
 */
public class SezDevPropDevelopmentPlanUtil {

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
		SezDevPropDevelopmentPlan sezDevPropDevelopmentPlan) {

		getPersistence().clearCache(sezDevPropDevelopmentPlan);
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
	public static Map<Serializable, SezDevPropDevelopmentPlan>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezDevPropDevelopmentPlan> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezDevPropDevelopmentPlan> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezDevPropDevelopmentPlan> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezDevPropDevelopmentPlan> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezDevPropDevelopmentPlan update(
		SezDevPropDevelopmentPlan sezDevPropDevelopmentPlan) {

		return getPersistence().update(sezDevPropDevelopmentPlan);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezDevPropDevelopmentPlan update(
		SezDevPropDevelopmentPlan sezDevPropDevelopmentPlan,
		ServiceContext serviceContext) {

		return getPersistence().update(
			sezDevPropDevelopmentPlan, serviceContext);
	}

	/**
	 * Returns the sez dev prop development plan where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezDevPropDevelopmentPlanException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev prop development plan
	 * @throws NoSuchSezDevPropDevelopmentPlanException if a matching sez dev prop development plan could not be found
	 */
	public static SezDevPropDevelopmentPlan findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevPropDevelopmentPlanException {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez dev prop development plan where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev prop development plan, or <code>null</code> if a matching sez dev prop development plan could not be found
	 */
	public static SezDevPropDevelopmentPlan fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez dev prop development plan where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez dev prop development plan, or <code>null</code> if a matching sez dev prop development plan could not be found
	 */
	public static SezDevPropDevelopmentPlan fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId, useFinderCache);
	}

	/**
	 * Removes the sez dev prop development plan where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez dev prop development plan that was removed
	 */
	public static SezDevPropDevelopmentPlan removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevPropDevelopmentPlanException {

		return getPersistence().removeBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez dev prop development plans where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev prop development plans
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez dev prop development plan in the entity cache if it is enabled.
	 *
	 * @param sezDevPropDevelopmentPlan the sez dev prop development plan
	 */
	public static void cacheResult(
		SezDevPropDevelopmentPlan sezDevPropDevelopmentPlan) {

		getPersistence().cacheResult(sezDevPropDevelopmentPlan);
	}

	/**
	 * Caches the sez dev prop development plans in the entity cache if it is enabled.
	 *
	 * @param sezDevPropDevelopmentPlans the sez dev prop development plans
	 */
	public static void cacheResult(
		List<SezDevPropDevelopmentPlan> sezDevPropDevelopmentPlans) {

		getPersistence().cacheResult(sezDevPropDevelopmentPlans);
	}

	/**
	 * Creates a new sez dev prop development plan with the primary key. Does not add the sez dev prop development plan to the database.
	 *
	 * @param sezDevPropDevelopmentPlanId the primary key for the new sez dev prop development plan
	 * @return the new sez dev prop development plan
	 */
	public static SezDevPropDevelopmentPlan create(
		long sezDevPropDevelopmentPlanId) {

		return getPersistence().create(sezDevPropDevelopmentPlanId);
	}

	/**
	 * Removes the sez dev prop development plan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevPropDevelopmentPlanId the primary key of the sez dev prop development plan
	 * @return the sez dev prop development plan that was removed
	 * @throws NoSuchSezDevPropDevelopmentPlanException if a sez dev prop development plan with the primary key could not be found
	 */
	public static SezDevPropDevelopmentPlan remove(
			long sezDevPropDevelopmentPlanId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevPropDevelopmentPlanException {

		return getPersistence().remove(sezDevPropDevelopmentPlanId);
	}

	public static SezDevPropDevelopmentPlan updateImpl(
		SezDevPropDevelopmentPlan sezDevPropDevelopmentPlan) {

		return getPersistence().updateImpl(sezDevPropDevelopmentPlan);
	}

	/**
	 * Returns the sez dev prop development plan with the primary key or throws a <code>NoSuchSezDevPropDevelopmentPlanException</code> if it could not be found.
	 *
	 * @param sezDevPropDevelopmentPlanId the primary key of the sez dev prop development plan
	 * @return the sez dev prop development plan
	 * @throws NoSuchSezDevPropDevelopmentPlanException if a sez dev prop development plan with the primary key could not be found
	 */
	public static SezDevPropDevelopmentPlan findByPrimaryKey(
			long sezDevPropDevelopmentPlanId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevPropDevelopmentPlanException {

		return getPersistence().findByPrimaryKey(sezDevPropDevelopmentPlanId);
	}

	/**
	 * Returns the sez dev prop development plan with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevPropDevelopmentPlanId the primary key of the sez dev prop development plan
	 * @return the sez dev prop development plan, or <code>null</code> if a sez dev prop development plan with the primary key could not be found
	 */
	public static SezDevPropDevelopmentPlan fetchByPrimaryKey(
		long sezDevPropDevelopmentPlanId) {

		return getPersistence().fetchByPrimaryKey(sezDevPropDevelopmentPlanId);
	}

	/**
	 * Returns all the sez dev prop development plans.
	 *
	 * @return the sez dev prop development plans
	 */
	public static List<SezDevPropDevelopmentPlan> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez dev prop development plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevPropDevelopmentPlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev prop development plans
	 * @param end the upper bound of the range of sez dev prop development plans (not inclusive)
	 * @return the range of sez dev prop development plans
	 */
	public static List<SezDevPropDevelopmentPlan> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez dev prop development plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevPropDevelopmentPlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev prop development plans
	 * @param end the upper bound of the range of sez dev prop development plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev prop development plans
	 */
	public static List<SezDevPropDevelopmentPlan> findAll(
		int start, int end,
		OrderByComparator<SezDevPropDevelopmentPlan> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez dev prop development plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevPropDevelopmentPlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev prop development plans
	 * @param end the upper bound of the range of sez dev prop development plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev prop development plans
	 */
	public static List<SezDevPropDevelopmentPlan> findAll(
		int start, int end,
		OrderByComparator<SezDevPropDevelopmentPlan> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez dev prop development plans from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez dev prop development plans.
	 *
	 * @return the number of sez dev prop development plans
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezDevPropDevelopmentPlanPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezDevPropDevelopmentPlanPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezDevPropDevelopmentPlanPersistence _persistence;

}