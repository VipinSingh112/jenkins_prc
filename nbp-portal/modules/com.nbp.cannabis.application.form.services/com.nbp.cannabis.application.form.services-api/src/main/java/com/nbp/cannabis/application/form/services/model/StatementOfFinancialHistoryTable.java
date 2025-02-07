/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_cannabis_sofh&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see StatementOfFinancialHistory
 * @generated
 */
public class StatementOfFinancialHistoryTable
	extends BaseTable<StatementOfFinancialHistoryTable> {

	public static final StatementOfFinancialHistoryTable INSTANCE =
		new StatementOfFinancialHistoryTable();

	public final Column<StatementOfFinancialHistoryTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<StatementOfFinancialHistoryTable, Long>
		statementOfFinancialHistoryId = createColumn(
			"statementOfFinancialHistoryId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<StatementOfFinancialHistoryTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<StatementOfFinancialHistoryTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<StatementOfFinancialHistoryTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<StatementOfFinancialHistoryTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<StatementOfFinancialHistoryTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<StatementOfFinancialHistoryTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<StatementOfFinancialHistoryTable, String>
		statementOfHistoryQuestion = createColumn(
			"statementOfHistoryQuestion", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<StatementOfFinancialHistoryTable, String> answer =
		createColumn(
			"answer", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<StatementOfFinancialHistoryTable, Long>
		cannabisApplicationId = createColumn(
			"cannabisApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private StatementOfFinancialHistoryTable() {
		super("nbp_cannabis_sofh", StatementOfFinancialHistoryTable::new);
	}

}