/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchMonthlyExpensesException;
import com.nbp.osi.insolvency.application.form.services.model.MonthlyExpenses;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the monthly expenses service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MonthlyExpensesUtil
 * @generated
 */
@ProviderType
public interface MonthlyExpensesPersistence
	extends BasePersistence<MonthlyExpenses> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MonthlyExpensesUtil} to access the monthly expenses persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the monthly expenseses where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching monthly expenseses
	 */
	public java.util.List<MonthlyExpenses> findBygetOsiById(
		long osiInsolvencyId);

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
	public java.util.List<MonthlyExpenses> findBygetOsiById(
		long osiInsolvencyId, int start, int end);

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
	public java.util.List<MonthlyExpenses> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MonthlyExpenses>
			orderByComparator);

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
	public java.util.List<MonthlyExpenses> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MonthlyExpenses>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first monthly expenses in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching monthly expenses
	 * @throws NoSuchMonthlyExpensesException if a matching monthly expenses could not be found
	 */
	public MonthlyExpenses findBygetOsiById_First(
			long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator<MonthlyExpenses>
				orderByComparator)
		throws NoSuchMonthlyExpensesException;

	/**
	 * Returns the first monthly expenses in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching monthly expenses, or <code>null</code> if a matching monthly expenses could not be found
	 */
	public MonthlyExpenses fetchBygetOsiById_First(
		long osiInsolvencyId,
		com.liferay.portal.kernel.util.OrderByComparator<MonthlyExpenses>
			orderByComparator);

	/**
	 * Returns the last monthly expenses in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching monthly expenses
	 * @throws NoSuchMonthlyExpensesException if a matching monthly expenses could not be found
	 */
	public MonthlyExpenses findBygetOsiById_Last(
			long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator<MonthlyExpenses>
				orderByComparator)
		throws NoSuchMonthlyExpensesException;

	/**
	 * Returns the last monthly expenses in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching monthly expenses, or <code>null</code> if a matching monthly expenses could not be found
	 */
	public MonthlyExpenses fetchBygetOsiById_Last(
		long osiInsolvencyId,
		com.liferay.portal.kernel.util.OrderByComparator<MonthlyExpenses>
			orderByComparator);

	/**
	 * Returns the monthly expenseses before and after the current monthly expenses in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param monthlyExpensesId the primary key of the current monthly expenses
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next monthly expenses
	 * @throws NoSuchMonthlyExpensesException if a monthly expenses with the primary key could not be found
	 */
	public MonthlyExpenses[] findBygetOsiById_PrevAndNext(
			long monthlyExpensesId, long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator<MonthlyExpenses>
				orderByComparator)
		throws NoSuchMonthlyExpensesException;

	/**
	 * Removes all the monthly expenseses where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	public void removeBygetOsiById(long osiInsolvencyId);

	/**
	 * Returns the number of monthly expenseses where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching monthly expenseses
	 */
	public int countBygetOsiById(long osiInsolvencyId);

	/**
	 * Caches the monthly expenses in the entity cache if it is enabled.
	 *
	 * @param monthlyExpenses the monthly expenses
	 */
	public void cacheResult(MonthlyExpenses monthlyExpenses);

	/**
	 * Caches the monthly expenseses in the entity cache if it is enabled.
	 *
	 * @param monthlyExpenseses the monthly expenseses
	 */
	public void cacheResult(java.util.List<MonthlyExpenses> monthlyExpenseses);

	/**
	 * Creates a new monthly expenses with the primary key. Does not add the monthly expenses to the database.
	 *
	 * @param monthlyExpensesId the primary key for the new monthly expenses
	 * @return the new monthly expenses
	 */
	public MonthlyExpenses create(long monthlyExpensesId);

	/**
	 * Removes the monthly expenses with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param monthlyExpensesId the primary key of the monthly expenses
	 * @return the monthly expenses that was removed
	 * @throws NoSuchMonthlyExpensesException if a monthly expenses with the primary key could not be found
	 */
	public MonthlyExpenses remove(long monthlyExpensesId)
		throws NoSuchMonthlyExpensesException;

	public MonthlyExpenses updateImpl(MonthlyExpenses monthlyExpenses);

	/**
	 * Returns the monthly expenses with the primary key or throws a <code>NoSuchMonthlyExpensesException</code> if it could not be found.
	 *
	 * @param monthlyExpensesId the primary key of the monthly expenses
	 * @return the monthly expenses
	 * @throws NoSuchMonthlyExpensesException if a monthly expenses with the primary key could not be found
	 */
	public MonthlyExpenses findByPrimaryKey(long monthlyExpensesId)
		throws NoSuchMonthlyExpensesException;

	/**
	 * Returns the monthly expenses with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param monthlyExpensesId the primary key of the monthly expenses
	 * @return the monthly expenses, or <code>null</code> if a monthly expenses with the primary key could not be found
	 */
	public MonthlyExpenses fetchByPrimaryKey(long monthlyExpensesId);

	/**
	 * Returns all the monthly expenseses.
	 *
	 * @return the monthly expenseses
	 */
	public java.util.List<MonthlyExpenses> findAll();

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
	public java.util.List<MonthlyExpenses> findAll(int start, int end);

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
	public java.util.List<MonthlyExpenses> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MonthlyExpenses>
			orderByComparator);

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
	public java.util.List<MonthlyExpenses> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MonthlyExpenses>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the monthly expenseses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of monthly expenseses.
	 *
	 * @return the number of monthly expenseses
	 */
	public int countAll();

}