/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.OsiTotalMonthlyExpense;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the osi total monthly expense service. This utility wraps <code>com.nbp.osi.insolvency.application.form.services.service.persistence.impl.OsiTotalMonthlyExpensePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiTotalMonthlyExpensePersistence
 * @generated
 */
public class OsiTotalMonthlyExpenseUtil {

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
		OsiTotalMonthlyExpense osiTotalMonthlyExpense) {

		getPersistence().clearCache(osiTotalMonthlyExpense);
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
	public static Map<Serializable, OsiTotalMonthlyExpense> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OsiTotalMonthlyExpense> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OsiTotalMonthlyExpense> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OsiTotalMonthlyExpense> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OsiTotalMonthlyExpense> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OsiTotalMonthlyExpense update(
		OsiTotalMonthlyExpense osiTotalMonthlyExpense) {

		return getPersistence().update(osiTotalMonthlyExpense);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OsiTotalMonthlyExpense update(
		OsiTotalMonthlyExpense osiTotalMonthlyExpense,
		ServiceContext serviceContext) {

		return getPersistence().update(osiTotalMonthlyExpense, serviceContext);
	}

	/**
	 * Returns the osi total monthly expense where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiTotalMonthlyExpenseException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi total monthly expense
	 * @throws NoSuchOsiTotalMonthlyExpenseException if a matching osi total monthly expense could not be found
	 */
	public static OsiTotalMonthlyExpense findBygetOsiById(long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiTotalMonthlyExpenseException {

		return getPersistence().findBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the osi total monthly expense where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi total monthly expense, or <code>null</code> if a matching osi total monthly expense could not be found
	 */
	public static OsiTotalMonthlyExpense fetchBygetOsiById(
		long osiInsolvencyId) {

		return getPersistence().fetchBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the osi total monthly expense where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi total monthly expense, or <code>null</code> if a matching osi total monthly expense could not be found
	 */
	public static OsiTotalMonthlyExpense fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiById(
			osiInsolvencyId, useFinderCache);
	}

	/**
	 * Removes the osi total monthly expense where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi total monthly expense that was removed
	 */
	public static OsiTotalMonthlyExpense removeBygetOsiById(
			long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiTotalMonthlyExpenseException {

		return getPersistence().removeBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the number of osi total monthly expenses where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi total monthly expenses
	 */
	public static int countBygetOsiById(long osiInsolvencyId) {
		return getPersistence().countBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Caches the osi total monthly expense in the entity cache if it is enabled.
	 *
	 * @param osiTotalMonthlyExpense the osi total monthly expense
	 */
	public static void cacheResult(
		OsiTotalMonthlyExpense osiTotalMonthlyExpense) {

		getPersistence().cacheResult(osiTotalMonthlyExpense);
	}

	/**
	 * Caches the osi total monthly expenses in the entity cache if it is enabled.
	 *
	 * @param osiTotalMonthlyExpenses the osi total monthly expenses
	 */
	public static void cacheResult(
		List<OsiTotalMonthlyExpense> osiTotalMonthlyExpenses) {

		getPersistence().cacheResult(osiTotalMonthlyExpenses);
	}

	/**
	 * Creates a new osi total monthly expense with the primary key. Does not add the osi total monthly expense to the database.
	 *
	 * @param osiTotalMonthlyExpenseId the primary key for the new osi total monthly expense
	 * @return the new osi total monthly expense
	 */
	public static OsiTotalMonthlyExpense create(long osiTotalMonthlyExpenseId) {
		return getPersistence().create(osiTotalMonthlyExpenseId);
	}

	/**
	 * Removes the osi total monthly expense with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiTotalMonthlyExpenseId the primary key of the osi total monthly expense
	 * @return the osi total monthly expense that was removed
	 * @throws NoSuchOsiTotalMonthlyExpenseException if a osi total monthly expense with the primary key could not be found
	 */
	public static OsiTotalMonthlyExpense remove(long osiTotalMonthlyExpenseId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiTotalMonthlyExpenseException {

		return getPersistence().remove(osiTotalMonthlyExpenseId);
	}

	public static OsiTotalMonthlyExpense updateImpl(
		OsiTotalMonthlyExpense osiTotalMonthlyExpense) {

		return getPersistence().updateImpl(osiTotalMonthlyExpense);
	}

	/**
	 * Returns the osi total monthly expense with the primary key or throws a <code>NoSuchOsiTotalMonthlyExpenseException</code> if it could not be found.
	 *
	 * @param osiTotalMonthlyExpenseId the primary key of the osi total monthly expense
	 * @return the osi total monthly expense
	 * @throws NoSuchOsiTotalMonthlyExpenseException if a osi total monthly expense with the primary key could not be found
	 */
	public static OsiTotalMonthlyExpense findByPrimaryKey(
			long osiTotalMonthlyExpenseId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiTotalMonthlyExpenseException {

		return getPersistence().findByPrimaryKey(osiTotalMonthlyExpenseId);
	}

	/**
	 * Returns the osi total monthly expense with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiTotalMonthlyExpenseId the primary key of the osi total monthly expense
	 * @return the osi total monthly expense, or <code>null</code> if a osi total monthly expense with the primary key could not be found
	 */
	public static OsiTotalMonthlyExpense fetchByPrimaryKey(
		long osiTotalMonthlyExpenseId) {

		return getPersistence().fetchByPrimaryKey(osiTotalMonthlyExpenseId);
	}

	/**
	 * Returns all the osi total monthly expenses.
	 *
	 * @return the osi total monthly expenses
	 */
	public static List<OsiTotalMonthlyExpense> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the osi total monthly expenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiTotalMonthlyExpenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi total monthly expenses
	 * @param end the upper bound of the range of osi total monthly expenses (not inclusive)
	 * @return the range of osi total monthly expenses
	 */
	public static List<OsiTotalMonthlyExpense> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the osi total monthly expenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiTotalMonthlyExpenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi total monthly expenses
	 * @param end the upper bound of the range of osi total monthly expenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi total monthly expenses
	 */
	public static List<OsiTotalMonthlyExpense> findAll(
		int start, int end,
		OrderByComparator<OsiTotalMonthlyExpense> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi total monthly expenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiTotalMonthlyExpenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi total monthly expenses
	 * @param end the upper bound of the range of osi total monthly expenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi total monthly expenses
	 */
	public static List<OsiTotalMonthlyExpense> findAll(
		int start, int end,
		OrderByComparator<OsiTotalMonthlyExpense> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the osi total monthly expenses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of osi total monthly expenses.
	 *
	 * @return the number of osi total monthly expenses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OsiTotalMonthlyExpensePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		OsiTotalMonthlyExpensePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile OsiTotalMonthlyExpensePersistence _persistence;

}