/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;agriculture_apiculture&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureApiculture
 * @generated
 */
public class AgricultureApicultureTable
	extends BaseTable<AgricultureApicultureTable> {

	public static final AgricultureApicultureTable INSTANCE =
		new AgricultureApicultureTable();

	public final Column<AgricultureApicultureTable, Long>
		agricultureApicultureId = createColumn(
			"agricultureApicultureId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AgricultureApicultureTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultureApicultureTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultureApicultureTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultureApicultureTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureApicultureTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgricultureApicultureTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgricultureApicultureTable, String> apicultureType =
		createColumn(
			"apicultureType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureApicultureTable, String> numberOfColonies =
		createColumn(
			"numberOfColonies", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureApicultureTable, String>
		averageAnnualProduction = createColumn(
			"averageAnnualProduction", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureApicultureTable, String> marketLocal =
		createColumn(
			"marketLocal", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureApicultureTable, String> marketForeign =
		createColumn(
			"marketForeign", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureApicultureTable, String> valueOfSale =
		createColumn(
			"valueOfSale", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureApicultureTable, String> apicultureCounter =
		createColumn(
			"apicultureCounter", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureApicultureTable, Long>
		agricultureApplicationId = createColumn(
			"agricultureApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AgricultureApicultureTable() {
		super("agriculture_apiculture", AgricultureApicultureTable::new);
	}

}