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
 * The table class for the &quot;agriculture_aqaculture&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureAquaculture
 * @generated
 */
public class AgricultureAquacultureTable
	extends BaseTable<AgricultureAquacultureTable> {

	public static final AgricultureAquacultureTable INSTANCE =
		new AgricultureAquacultureTable();

	public final Column<AgricultureAquacultureTable, Long>
		agricultureAquacultureId = createColumn(
			"agricultureAquacultureId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AgricultureAquacultureTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultureAquacultureTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultureAquacultureTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultureAquacultureTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureAquacultureTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgricultureAquacultureTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgricultureAquacultureTable, String> aquacultureType =
		createColumn(
			"aquacultureType", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureAquacultureTable, String> waterHectare =
		createColumn(
			"waterHectare", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureAquacultureTable, String>
		averageAnnualProduction = createColumn(
			"averageAnnualProduction", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureAquacultureTable, String> marketLocal =
		createColumn(
			"marketLocal", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureAquacultureTable, String> marketForeign =
		createColumn(
			"marketForeign", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureAquacultureTable, String> valueOfSale =
		createColumn(
			"valueOfSale", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureAquacultureTable, String>
		aquacultureCounter = createColumn(
			"aquacultureCounter", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureAquacultureTable, Long>
		agricultureApplicationId = createColumn(
			"agricultureApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AgricultureAquacultureTable() {
		super("agriculture_aqaculture", AgricultureAquacultureTable::new);
	}

}