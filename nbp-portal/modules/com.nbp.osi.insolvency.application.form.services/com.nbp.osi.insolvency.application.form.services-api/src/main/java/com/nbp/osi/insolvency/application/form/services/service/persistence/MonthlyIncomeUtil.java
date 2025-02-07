/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.MonthlyIncome;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the monthly income service. This utility wraps <code>com.nbp.osi.insolvency.application.form.services.service.persistence.impl.MonthlyIncomePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MonthlyIncomePersistence
 * @generated
 */
public class MonthlyIncomeUtil {

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
	public static void clearCache(MonthlyIncome monthlyIncome) {
		getPersistence().clearCache(monthlyIncome);
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
	public static Map<Serializable, MonthlyIncome> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MonthlyIncome> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MonthlyIncome> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MonthlyIncome> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MonthlyIncome> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MonthlyIncome update(MonthlyIncome monthlyIncome) {
		return getPersistence().update(monthlyIncome);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MonthlyIncome update(
		MonthlyIncome monthlyIncome, ServiceContext serviceContext) {

		return getPersistence().update(monthlyIncome, serviceContext);
	}

	/**
	 * Returns the monthly income where osiInsolvencyId = &#63; or throws a <code>NoSuchMonthlyIncomeException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching monthly income
	 * @throws NoSuchMonthlyIncomeException if a matching monthly income could not be found
	 */
	public static MonthlyIncome findBygetOsiById(long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchMonthlyIncomeException {

		return getPersistence().findBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the monthly income where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching monthly income, or <code>null</code> if a matching monthly income could not be found
	 */
	public static MonthlyIncome fetchBygetOsiById(long osiInsolvencyId) {
		return getPersistence().fetchBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the monthly income where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching monthly income, or <code>null</code> if a matching monthly income could not be found
	 */
	public static MonthlyIncome fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiById(
			osiInsolvencyId, useFinderCache);
	}

	/**
	 * Removes the monthly income where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the monthly income that was removed
	 */
	public static MonthlyIncome removeBygetOsiById(long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchMonthlyIncomeException {

		return getPersistence().removeBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the number of monthly incomes where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching monthly incomes
	 */
	public static int countBygetOsiById(long osiInsolvencyId) {
		return getPersistence().countBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Caches the monthly income in the entity cache if it is enabled.
	 *
	 * @param monthlyIncome the monthly income
	 */
	public static void cacheResult(MonthlyIncome monthlyIncome) {
		getPersistence().cacheResult(monthlyIncome);
	}

	/**
	 * Caches the monthly incomes in the entity cache if it is enabled.
	 *
	 * @param monthlyIncomes the monthly incomes
	 */
	public static void cacheResult(List<MonthlyIncome> monthlyIncomes) {
		getPersistence().cacheResult(monthlyIncomes);
	}

	/**
	 * Creates a new monthly income with the primary key. Does not add the monthly income to the database.
	 *
	 * @param monthlyIncomeId the primary key for the new monthly income
	 * @return the new monthly income
	 */
	public static MonthlyIncome create(long monthlyIncomeId) {
		return getPersistence().create(monthlyIncomeId);
	}

	/**
	 * Removes the monthly income with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param monthlyIncomeId the primary key of the monthly income
	 * @return the monthly income that was removed
	 * @throws NoSuchMonthlyIncomeException if a monthly income with the primary key could not be found
	 */
	public static MonthlyIncome remove(long monthlyIncomeId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchMonthlyIncomeException {

		return getPersistence().remove(monthlyIncomeId);
	}

	public static MonthlyIncome updateImpl(MonthlyIncome monthlyIncome) {
		return getPersistence().updateImpl(monthlyIncome);
	}

	/**
	 * Returns the monthly income with the primary key or throws a <code>NoSuchMonthlyIncomeException</code> if it could not be found.
	 *
	 * @param monthlyIncomeId the primary key of the monthly income
	 * @return the monthly income
	 * @throws NoSuchMonthlyIncomeException if a monthly income with the primary key could not be found
	 */
	public static MonthlyIncome findByPrimaryKey(long monthlyIncomeId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchMonthlyIncomeException {

		return getPersistence().findByPrimaryKey(monthlyIncomeId);
	}

	/**
	 * Returns the monthly income with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param monthlyIncomeId the primary key of the monthly income
	 * @return the monthly income, or <code>null</code> if a monthly income with the primary key could not be found
	 */
	public static MonthlyIncome fetchByPrimaryKey(long monthlyIncomeId) {
		return getPersistence().fetchByPrimaryKey(monthlyIncomeId);
	}

	/**
	 * Returns all the monthly incomes.
	 *
	 * @return the monthly incomes
	 */
	public static List<MonthlyIncome> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the monthly incomes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MonthlyIncomeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of monthly incomes
	 * @param end the upper bound of the range of monthly incomes (not inclusive)
	 * @return the range of monthly incomes
	 */
	public static List<MonthlyIncome> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the monthly incomes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MonthlyIncomeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of monthly incomes
	 * @param end the upper bound of the range of monthly incomes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of monthly incomes
	 */
	public static List<MonthlyIncome> findAll(
		int start, int end,
		OrderByComparator<MonthlyIncome> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the monthly incomes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MonthlyIncomeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of monthly incomes
	 * @param end the upper bound of the range of monthly incomes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of monthly incomes
	 */
	public static List<MonthlyIncome> findAll(
		int start, int end, OrderByComparator<MonthlyIncome> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the monthly incomes from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of monthly incomes.
	 *
	 * @return the number of monthly incomes
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MonthlyIncomePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(MonthlyIncomePersistence persistence) {
		_persistence = persistence;
	}

	private static volatile MonthlyIncomePersistence _persistence;

}