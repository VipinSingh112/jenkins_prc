/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_monthly_expense&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see MonthlyExpenses
 * @generated
 */
public class MonthlyExpensesTable extends BaseTable<MonthlyExpensesTable> {

	public static final MonthlyExpensesTable INSTANCE =
		new MonthlyExpensesTable();

	public final Column<MonthlyExpensesTable, Long> monthlyExpensesId =
		createColumn(
			"monthlyExpensesId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<MonthlyExpensesTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MonthlyExpensesTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MonthlyExpensesTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MonthlyExpensesTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MonthlyExpensesTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MonthlyExpensesTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MonthlyExpensesTable, String> typeOfExpense =
		createColumn(
			"typeOfExpense", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MonthlyExpensesTable, String> lightExpense =
		createColumn(
			"lightExpense", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MonthlyExpensesTable, String> cableExpense =
		createColumn(
			"cableExpense", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MonthlyExpensesTable, String> waterExpense =
		createColumn(
			"waterExpense", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MonthlyExpensesTable, String> expenseCounter =
		createColumn(
			"expenseCounter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MonthlyExpensesTable, String> telephoneExpense =
		createColumn(
			"telephoneExpense", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MonthlyExpensesTable, Long> osiInsolvencyId =
		createColumn(
			"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private MonthlyExpensesTable() {
		super("nbp_osi_monthly_expense", MonthlyExpensesTable::new);
	}

}