/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.OsiInsolvPaymentPlan;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the osi insolv payment plan service. This utility wraps <code>com.nbp.osi.insolvency.application.form.services.service.persistence.impl.OsiInsolvPaymentPlanPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvPaymentPlanPersistence
 * @generated
 */
public class OsiInsolvPaymentPlanUtil {

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
	public static void clearCache(OsiInsolvPaymentPlan osiInsolvPaymentPlan) {
		getPersistence().clearCache(osiInsolvPaymentPlan);
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
	public static Map<Serializable, OsiInsolvPaymentPlan> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OsiInsolvPaymentPlan> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OsiInsolvPaymentPlan> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OsiInsolvPaymentPlan> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OsiInsolvPaymentPlan> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OsiInsolvPaymentPlan update(
		OsiInsolvPaymentPlan osiInsolvPaymentPlan) {

		return getPersistence().update(osiInsolvPaymentPlan);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OsiInsolvPaymentPlan update(
		OsiInsolvPaymentPlan osiInsolvPaymentPlan,
		ServiceContext serviceContext) {

		return getPersistence().update(osiInsolvPaymentPlan, serviceContext);
	}

	/**
	 * Returns the osi insolv payment plan where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiInsolvPaymentPlanException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolv payment plan
	 * @throws NoSuchOsiInsolvPaymentPlanException if a matching osi insolv payment plan could not be found
	 */
	public static OsiInsolvPaymentPlan findBygetOsiInsolvPaymentById(
			long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiInsolvPaymentPlanException {

		return getPersistence().findBygetOsiInsolvPaymentById(osiInsolvencyId);
	}

	/**
	 * Returns the osi insolv payment plan where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolv payment plan, or <code>null</code> if a matching osi insolv payment plan could not be found
	 */
	public static OsiInsolvPaymentPlan fetchBygetOsiInsolvPaymentById(
		long osiInsolvencyId) {

		return getPersistence().fetchBygetOsiInsolvPaymentById(osiInsolvencyId);
	}

	/**
	 * Returns the osi insolv payment plan where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolv payment plan, or <code>null</code> if a matching osi insolv payment plan could not be found
	 */
	public static OsiInsolvPaymentPlan fetchBygetOsiInsolvPaymentById(
		long osiInsolvencyId, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiInsolvPaymentById(
			osiInsolvencyId, useFinderCache);
	}

	/**
	 * Removes the osi insolv payment plan where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi insolv payment plan that was removed
	 */
	public static OsiInsolvPaymentPlan removeBygetOsiInsolvPaymentById(
			long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiInsolvPaymentPlanException {

		return getPersistence().removeBygetOsiInsolvPaymentById(
			osiInsolvencyId);
	}

	/**
	 * Returns the number of osi insolv payment plans where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi insolv payment plans
	 */
	public static int countBygetOsiInsolvPaymentById(long osiInsolvencyId) {
		return getPersistence().countBygetOsiInsolvPaymentById(osiInsolvencyId);
	}

	/**
	 * Caches the osi insolv payment plan in the entity cache if it is enabled.
	 *
	 * @param osiInsolvPaymentPlan the osi insolv payment plan
	 */
	public static void cacheResult(OsiInsolvPaymentPlan osiInsolvPaymentPlan) {
		getPersistence().cacheResult(osiInsolvPaymentPlan);
	}

	/**
	 * Caches the osi insolv payment plans in the entity cache if it is enabled.
	 *
	 * @param osiInsolvPaymentPlans the osi insolv payment plans
	 */
	public static void cacheResult(
		List<OsiInsolvPaymentPlan> osiInsolvPaymentPlans) {

		getPersistence().cacheResult(osiInsolvPaymentPlans);
	}

	/**
	 * Creates a new osi insolv payment plan with the primary key. Does not add the osi insolv payment plan to the database.
	 *
	 * @param osiInsolvPaymentPlanId the primary key for the new osi insolv payment plan
	 * @return the new osi insolv payment plan
	 */
	public static OsiInsolvPaymentPlan create(long osiInsolvPaymentPlanId) {
		return getPersistence().create(osiInsolvPaymentPlanId);
	}

	/**
	 * Removes the osi insolv payment plan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiInsolvPaymentPlanId the primary key of the osi insolv payment plan
	 * @return the osi insolv payment plan that was removed
	 * @throws NoSuchOsiInsolvPaymentPlanException if a osi insolv payment plan with the primary key could not be found
	 */
	public static OsiInsolvPaymentPlan remove(long osiInsolvPaymentPlanId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiInsolvPaymentPlanException {

		return getPersistence().remove(osiInsolvPaymentPlanId);
	}

	public static OsiInsolvPaymentPlan updateImpl(
		OsiInsolvPaymentPlan osiInsolvPaymentPlan) {

		return getPersistence().updateImpl(osiInsolvPaymentPlan);
	}

	/**
	 * Returns the osi insolv payment plan with the primary key or throws a <code>NoSuchOsiInsolvPaymentPlanException</code> if it could not be found.
	 *
	 * @param osiInsolvPaymentPlanId the primary key of the osi insolv payment plan
	 * @return the osi insolv payment plan
	 * @throws NoSuchOsiInsolvPaymentPlanException if a osi insolv payment plan with the primary key could not be found
	 */
	public static OsiInsolvPaymentPlan findByPrimaryKey(
			long osiInsolvPaymentPlanId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiInsolvPaymentPlanException {

		return getPersistence().findByPrimaryKey(osiInsolvPaymentPlanId);
	}

	/**
	 * Returns the osi insolv payment plan with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiInsolvPaymentPlanId the primary key of the osi insolv payment plan
	 * @return the osi insolv payment plan, or <code>null</code> if a osi insolv payment plan with the primary key could not be found
	 */
	public static OsiInsolvPaymentPlan fetchByPrimaryKey(
		long osiInsolvPaymentPlanId) {

		return getPersistence().fetchByPrimaryKey(osiInsolvPaymentPlanId);
	}

	/**
	 * Returns all the osi insolv payment plans.
	 *
	 * @return the osi insolv payment plans
	 */
	public static List<OsiInsolvPaymentPlan> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the osi insolv payment plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvPaymentPlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolv payment plans
	 * @param end the upper bound of the range of osi insolv payment plans (not inclusive)
	 * @return the range of osi insolv payment plans
	 */
	public static List<OsiInsolvPaymentPlan> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the osi insolv payment plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvPaymentPlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolv payment plans
	 * @param end the upper bound of the range of osi insolv payment plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi insolv payment plans
	 */
	public static List<OsiInsolvPaymentPlan> findAll(
		int start, int end,
		OrderByComparator<OsiInsolvPaymentPlan> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi insolv payment plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvPaymentPlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolv payment plans
	 * @param end the upper bound of the range of osi insolv payment plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi insolv payment plans
	 */
	public static List<OsiInsolvPaymentPlan> findAll(
		int start, int end,
		OrderByComparator<OsiInsolvPaymentPlan> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the osi insolv payment plans from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of osi insolv payment plans.
	 *
	 * @return the number of osi insolv payment plans
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OsiInsolvPaymentPlanPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		OsiInsolvPaymentPlanPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile OsiInsolvPaymentPlanPersistence _persistence;

}