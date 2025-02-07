/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.MonthlyExpenses;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the monthly expenses service. This utility wraps <code>com.nbp.osi.insolvency.application.form.services.service.persistence.impl.MonthlyExpensesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MonthlyExpensesPersistence
 * @generated
 */
public class MonthlyExpensesUtil {

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
	public static void clearCache(MonthlyExpenses monthlyExpenses) {
		getPersistence().clearCache(monthlyExpenses);
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
	public static Map<Serializable, MonthlyExpenses> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MonthlyExpenses> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MonthlyExpenses> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MonthlyExpenses> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MonthlyExpenses> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MonthlyExpenses update(MonthlyExpenses monthlyExpenses) {
		return getPersistence().update(monthlyExpenses);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MonthlyExpenses update(
		MonthlyExpenses monthlyExpenses, ServiceContext serviceContext) {

		return getPersistence().update(monthlyExpenses, serviceContext);
	}

	/**
	 * Returns all the monthly expenseses where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching monthly expenseses
	 */
	public static List<MonthlyExpenses> findBygetOsiById(long osiInsolvencyId) {
		return getPersistence().findBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns a range of all the monthly expenseses where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MonthlyExpensesModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of monthly expenseses
	 * @param end the upper bound of the range of monthly expenseses (not inclusive)
	 * @return the range of matching monthly expenseses
	 */
	public static List<MonthlyExpenses> findBygetOsiById(
		long osiInsolvencyId, int start, int end) {

		return getPersistence().findBygetOsiById(osiInsolvencyId, start, end);
	}

	/**
	 * Returns an ordered range of all the monthly expenseses where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MonthlyExpensesModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of monthly expenseses
	 * @param end the upper bound of the range of monthly expenseses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching monthly expenseses
	 */
	public static List<MonthlyExpenses> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<MonthlyExpenses> orderByComparator) {

		return getPersistence().findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the monthly expenseses where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MonthlyExpensesModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of monthly expenseses
	 * @param end the upper bound of the range of monthly expenseses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching monthly expenseses
	 */
	public static List<MonthlyExpenses> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<MonthlyExpenses> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first monthly expenses in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching monthly expenses
	 * @throws NoSuchMonthlyExpensesException if a matching monthly expenses could not be found
	 */
	public static MonthlyExpenses findBygetOsiById_First(
			long osiInsolvencyId,
			OrderByComparator<MonthlyExpenses> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchMonthlyExpensesException {

		return getPersistence().findBygetOsiById_First(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the first monthly expenses in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching monthly expenses, or <code>null</code> if a matching monthly expenses could not be found
	 */
	public static MonthlyExpenses fetchBygetOsiById_First(
		long osiInsolvencyId,
		OrderByComparator<MonthlyExpenses> orderByComparator) {

		return getPersistence().fetchBygetOsiById_First(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the last monthly expenses in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching monthly expenses
	 * @throws NoSuchMonthlyExpensesException if a matching monthly expenses could not be found
	 */
	public static MonthlyExpenses findBygetOsiById_Last(
			long osiInsolvencyId,
			OrderByComparator<MonthlyExpenses> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchMonthlyExpensesException {

		return getPersistence().findBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the last monthly expenses in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching monthly expenses, or <code>null</code> if a matching monthly expenses could not be found
	 */
	public static MonthlyExpenses fetchBygetOsiById_Last(
		long osiInsolvencyId,
		OrderByComparator<MonthlyExpenses> orderByComparator) {

		return getPersistence().fetchBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the monthly expenseses before and after the current monthly expenses in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param monthlyExpensesId the primary key of the current monthly expenses
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next monthly expenses
	 * @throws NoSuchMonthlyExpensesException if a monthly expenses with the primary key could not be found
	 */
	public static MonthlyExpenses[] findBygetOsiById_PrevAndNext(
			long monthlyExpensesId, long osiInsolvencyId,
			OrderByComparator<MonthlyExpenses> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchMonthlyExpensesException {

		return getPersistence().findBygetOsiById_PrevAndNext(
			monthlyExpensesId, osiInsolvencyId, orderByComparator);
	}

	/**
	 * Removes all the monthly expenseses where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	public static void removeBygetOsiById(long osiInsolvencyId) {
		getPersistence().removeBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the number of monthly expenseses where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching monthly expenseses
	 */
	public static int countBygetOsiById(long osiInsolvencyId) {
		return getPersistence().countBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Caches the monthly expenses in the entity cache if it is enabled.
	 *
	 * @param monthlyExpenses the monthly expenses
	 */
	public static void cacheResult(MonthlyExpenses monthlyExpenses) {
		getPersistence().cacheResult(monthlyExpenses);
	}

	/**
	 * Caches the monthly expenseses in the entity cache if it is enabled.
	 *
	 * @param monthlyExpenseses the monthly expenseses
	 */
	public static void cacheResult(List<MonthlyExpenses> monthlyExpenseses) {
		getPersistence().cacheResult(monthlyExpenseses);
	}

	/**
	 * Creates a new monthly expenses with the primary key. Does not add the monthly expenses to the database.
	 *
	 * @param monthlyExpensesId the primary key for the new monthly expenses
	 * @return the new monthly expenses
	 */
	public static MonthlyExpenses create(long monthlyExpensesId) {
		return getPersistence().create(monthlyExpensesId);
	}

	/**
	 * Removes the monthly expenses with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param monthlyExpensesId the primary key of the monthly expenses
	 * @return the monthly expenses that was removed
	 * @throws NoSuchMonthlyExpensesException if a monthly expenses with the primary key could not be found
	 */
	public static MonthlyExpenses remove(long monthlyExpensesId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchMonthlyExpensesException {

		return getPersistence().remove(monthlyExpensesId);
	}

	public static MonthlyExpenses updateImpl(MonthlyExpenses monthlyExpenses) {
		return getPersistence().updateImpl(monthlyExpenses);
	}

	/**
	 * Returns the monthly expenses with the primary key or throws a <code>NoSuchMonthlyExpensesException</code> if it could not be found.
	 *
	 * @param monthlyExpensesId the primary key of the monthly expenses
	 * @return the monthly expenses
	 * @throws NoSuchMonthlyExpensesException if a monthly expenses with the primary key could not be found
	 */
	public static MonthlyExpenses findByPrimaryKey(long monthlyExpensesId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchMonthlyExpensesException {

		return getPersistence().findByPrimaryKey(monthlyExpensesId);
	}

	/**
	 * Returns the monthly expenses with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param monthlyExpensesId the primary key of the monthly expenses
	 * @return the monthly expenses, or <code>null</code> if a monthly expenses with the primary key could not be found
	 */
	public static MonthlyExpenses fetchByPrimaryKey(long monthlyExpensesId) {
		return getPersistence().fetchByPrimaryKey(monthlyExpensesId);
	}

	/**
	 * Returns all the monthly expenseses.
	 *
	 * @return the monthly expenseses
	 */
	public static List<MonthlyExpenses> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the monthly expenseses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MonthlyExpensesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of monthly expenseses
	 * @param end the upper bound of the range of monthly expenseses (not inclusive)
	 * @return the range of monthly expenseses
	 */
	public static List<MonthlyExpenses> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the monthly expenseses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MonthlyExpensesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of monthly expenseses
	 * @param end the upper bound of the range of monthly expenseses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of monthly expenseses
	 */
	public static List<MonthlyExpenses> findAll(
		int start, int end,
		OrderByComparator<MonthlyExpenses> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the monthly expenseses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MonthlyExpensesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of monthly expenseses
	 * @param end the upper bound of the range of monthly expenseses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of monthly expenseses
	 */
	public static List<MonthlyExpenses> findAll(
		int start, int end,
		OrderByComparator<MonthlyExpenses> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the monthly expenseses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of monthly expenseses.
	 *
	 * @return the number of monthly expenseses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MonthlyExpensesPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(MonthlyExpensesPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile MonthlyExpensesPersistence _persistence;

}