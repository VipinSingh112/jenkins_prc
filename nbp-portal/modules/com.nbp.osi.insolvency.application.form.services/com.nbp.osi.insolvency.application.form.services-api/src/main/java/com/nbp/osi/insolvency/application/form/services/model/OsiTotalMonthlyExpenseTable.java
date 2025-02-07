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
 * The table class for the &quot;nbp_osi_insolv_tot_expense&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OsiTotalMonthlyExpense
 * @generated
 */
public class OsiTotalMonthlyExpenseTable
	extends BaseTable<OsiTotalMonthlyExpenseTable> {

	public static final OsiTotalMonthlyExpenseTable INSTANCE =
		new OsiTotalMonthlyExpenseTable();

	public final Column<OsiTotalMonthlyExpenseTable, Long>
		osiTotalMonthlyExpenseId = createColumn(
			"osiTotalMonthlyExpenseId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<OsiTotalMonthlyExpenseTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiTotalMonthlyExpenseTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiTotalMonthlyExpenseTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiTotalMonthlyExpenseTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiTotalMonthlyExpenseTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiTotalMonthlyExpenseTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiTotalMonthlyExpenseTable, String> totalExpense =
		createColumn(
			"totalExpense", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiTotalMonthlyExpenseTable, Long> osiInsolvencyId =
		createColumn(
			"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private OsiTotalMonthlyExpenseTable() {
		super("nbp_osi_insolv_tot_expense", OsiTotalMonthlyExpenseTable::new);
	}

}