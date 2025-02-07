/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchMonthlyIncomeException;
import com.nbp.osi.insolvency.application.form.services.model.MonthlyIncome;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the monthly income service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MonthlyIncomeUtil
 * @generated
 */
@ProviderType
public interface MonthlyIncomePersistence
	extends BasePersistence<MonthlyIncome> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MonthlyIncomeUtil} to access the monthly income persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the monthly income where osiInsolvencyId = &#63; or throws a <code>NoSuchMonthlyIncomeException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching monthly income
	 * @throws NoSuchMonthlyIncomeException if a matching monthly income could not be found
	 */
	public MonthlyIncome findBygetOsiById(long osiInsolvencyId)
		throws NoSuchMonthlyIncomeException;

	/**
	 * Returns the monthly income where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching monthly income, or <code>null</code> if a matching monthly income could not be found
	 */
	public MonthlyIncome fetchBygetOsiById(long osiInsolvencyId);

	/**
	 * Returns the monthly income where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching monthly income, or <code>null</code> if a matching monthly income could not be found
	 */
	public MonthlyIncome fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache);

	/**
	 * Removes the monthly income where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the monthly income that was removed
	 */
	public MonthlyIncome removeBygetOsiById(long osiInsolvencyId)
		throws NoSuchMonthlyIncomeException;

	/**
	 * Returns the number of monthly incomes where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching monthly incomes
	 */
	public int countBygetOsiById(long osiInsolvencyId);

	/**
	 * Caches the monthly income in the entity cache if it is enabled.
	 *
	 * @param monthlyIncome the monthly income
	 */
	public void cacheResult(MonthlyIncome monthlyIncome);

	/**
	 * Caches the monthly incomes in the entity cache if it is enabled.
	 *
	 * @param monthlyIncomes the monthly incomes
	 */
	public void cacheResult(java.util.List<MonthlyIncome> monthlyIncomes);

	/**
	 * Creates a new monthly income with the primary key. Does not add the monthly income to the database.
	 *
	 * @param monthlyIncomeId the primary key for the new monthly income
	 * @return the new monthly income
	 */
	public MonthlyIncome create(long monthlyIncomeId);

	/**
	 * Removes the monthly income with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param monthlyIncomeId the primary key of the monthly income
	 * @return the monthly income that was removed
	 * @throws NoSuchMonthlyIncomeException if a monthly income with the primary key could not be found
	 */
	public MonthlyIncome remove(long monthlyIncomeId)
		throws NoSuchMonthlyIncomeException;

	public MonthlyIncome updateImpl(MonthlyIncome monthlyIncome);

	/**
	 * Returns the monthly income with the primary key or throws a <code>NoSuchMonthlyIncomeException</code> if it could not be found.
	 *
	 * @param monthlyIncomeId the primary key of the monthly income
	 * @return the monthly income
	 * @throws NoSuchMonthlyIncomeException if a monthly income with the primary key could not be found
	 */
	public MonthlyIncome findByPrimaryKey(long monthlyIncomeId)
		throws NoSuchMonthlyIncomeException;

	/**
	 * Returns the monthly income with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param monthlyIncomeId the primary key of the monthly income
	 * @return the monthly income, or <code>null</code> if a monthly income with the primary key could not be found
	 */
	public MonthlyIncome fetchByPrimaryKey(long monthlyIncomeId);

	/**
	 * Returns all the monthly incomes.
	 *
	 * @return the monthly incomes
	 */
	public java.util.List<MonthlyIncome> findAll();

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
	public java.util.List<MonthlyIncome> findAll(int start, int end);

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
	public java.util.List<MonthlyIncome> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MonthlyIncome>
			orderByComparator);

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
	public java.util.List<MonthlyIncome> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MonthlyIncome>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the monthly incomes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of monthly incomes.
	 *
	 * @return the number of monthly incomes
	 */
	public int countAll();

}