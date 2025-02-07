/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchOsiTotalMonthlyExpenseException;
import com.nbp.osi.insolvency.application.form.services.model.OsiTotalMonthlyExpense;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi total monthly expense service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiTotalMonthlyExpenseUtil
 * @generated
 */
@ProviderType
public interface OsiTotalMonthlyExpensePersistence
	extends BasePersistence<OsiTotalMonthlyExpense> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OsiTotalMonthlyExpenseUtil} to access the osi total monthly expense persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the osi total monthly expense where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiTotalMonthlyExpenseException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi total monthly expense
	 * @throws NoSuchOsiTotalMonthlyExpenseException if a matching osi total monthly expense could not be found
	 */
	public OsiTotalMonthlyExpense findBygetOsiById(long osiInsolvencyId)
		throws NoSuchOsiTotalMonthlyExpenseException;

	/**
	 * Returns the osi total monthly expense where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi total monthly expense, or <code>null</code> if a matching osi total monthly expense could not be found
	 */
	public OsiTotalMonthlyExpense fetchBygetOsiById(long osiInsolvencyId);

	/**
	 * Returns the osi total monthly expense where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi total monthly expense, or <code>null</code> if a matching osi total monthly expense could not be found
	 */
	public OsiTotalMonthlyExpense fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache);

	/**
	 * Removes the osi total monthly expense where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi total monthly expense that was removed
	 */
	public OsiTotalMonthlyExpense removeBygetOsiById(long osiInsolvencyId)
		throws NoSuchOsiTotalMonthlyExpenseException;

	/**
	 * Returns the number of osi total monthly expenses where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi total monthly expenses
	 */
	public int countBygetOsiById(long osiInsolvencyId);

	/**
	 * Caches the osi total monthly expense in the entity cache if it is enabled.
	 *
	 * @param osiTotalMonthlyExpense the osi total monthly expense
	 */
	public void cacheResult(OsiTotalMonthlyExpense osiTotalMonthlyExpense);

	/**
	 * Caches the osi total monthly expenses in the entity cache if it is enabled.
	 *
	 * @param osiTotalMonthlyExpenses the osi total monthly expenses
	 */
	public void cacheResult(
		java.util.List<OsiTotalMonthlyExpense> osiTotalMonthlyExpenses);

	/**
	 * Creates a new osi total monthly expense with the primary key. Does not add the osi total monthly expense to the database.
	 *
	 * @param osiTotalMonthlyExpenseId the primary key for the new osi total monthly expense
	 * @return the new osi total monthly expense
	 */
	public OsiTotalMonthlyExpense create(long osiTotalMonthlyExpenseId);

	/**
	 * Removes the osi total monthly expense with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiTotalMonthlyExpenseId the primary key of the osi total monthly expense
	 * @return the osi total monthly expense that was removed
	 * @throws NoSuchOsiTotalMonthlyExpenseException if a osi total monthly expense with the primary key could not be found
	 */
	public OsiTotalMonthlyExpense remove(long osiTotalMonthlyExpenseId)
		throws NoSuchOsiTotalMonthlyExpenseException;

	public OsiTotalMonthlyExpense updateImpl(
		OsiTotalMonthlyExpense osiTotalMonthlyExpense);

	/**
	 * Returns the osi total monthly expense with the primary key or throws a <code>NoSuchOsiTotalMonthlyExpenseException</code> if it could not be found.
	 *
	 * @param osiTotalMonthlyExpenseId the primary key of the osi total monthly expense
	 * @return the osi total monthly expense
	 * @throws NoSuchOsiTotalMonthlyExpenseException if a osi total monthly expense with the primary key could not be found
	 */
	public OsiTotalMonthlyExpense findByPrimaryKey(
			long osiTotalMonthlyExpenseId)
		throws NoSuchOsiTotalMonthlyExpenseException;

	/**
	 * Returns the osi total monthly expense with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiTotalMonthlyExpenseId the primary key of the osi total monthly expense
	 * @return the osi total monthly expense, or <code>null</code> if a osi total monthly expense with the primary key could not be found
	 */
	public OsiTotalMonthlyExpense fetchByPrimaryKey(
		long osiTotalMonthlyExpenseId);

	/**
	 * Returns all the osi total monthly expenses.
	 *
	 * @return the osi total monthly expenses
	 */
	public java.util.List<OsiTotalMonthlyExpense> findAll();

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
	public java.util.List<OsiTotalMonthlyExpense> findAll(int start, int end);

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
	public java.util.List<OsiTotalMonthlyExpense> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiTotalMonthlyExpense>
			orderByComparator);

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
	public java.util.List<OsiTotalMonthlyExpense> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiTotalMonthlyExpense>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi total monthly expenses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi total monthly expenses.
	 *
	 * @return the number of osi total monthly expenses
	 */
	public int countAll();

}