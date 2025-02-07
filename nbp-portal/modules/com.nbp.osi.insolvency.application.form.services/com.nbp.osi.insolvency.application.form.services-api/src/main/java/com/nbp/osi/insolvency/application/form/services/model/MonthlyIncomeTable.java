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
 * The table class for the &quot;nbp_osi_monthly_income&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see MonthlyIncome
 * @generated
 */
public class MonthlyIncomeTable extends BaseTable<MonthlyIncomeTable> {

	public static final MonthlyIncomeTable INSTANCE = new MonthlyIncomeTable();

	public final Column<MonthlyIncomeTable, Long> monthlyIncomeId =
		createColumn(
			"monthlyIncomeId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<MonthlyIncomeTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MonthlyIncomeTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MonthlyIncomeTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MonthlyIncomeTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MonthlyIncomeTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MonthlyIncomeTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MonthlyIncomeTable, String> basicSalary = createColumn(
		"basicSalary", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MonthlyIncomeTable, String> grossSalary = createColumn(
		"grossSalary", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MonthlyIncomeTable, String> statutoryDeduction =
		createColumn(
			"statutoryDeduction", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MonthlyIncomeTable, String> otherDeductions =
		createColumn(
			"otherDeductions", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MonthlyIncomeTable, String> loanDeductions =
		createColumn(
			"loanDeductions", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MonthlyIncomeTable, String> totalDeductions =
		createColumn(
			"totalDeductions", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MonthlyIncomeTable, String> netSalary = createColumn(
		"netSalary", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MonthlyIncomeTable, String> otherIncome = createColumn(
		"otherIncome", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MonthlyIncomeTable, String> incomeToCover =
		createColumn(
			"incomeToCover", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MonthlyIncomeTable, Long> osiInsolvencyId =
		createColumn(
			"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private MonthlyIncomeTable() {
		super("nbp_osi_monthly_income", MonthlyIncomeTable::new);
	}

}