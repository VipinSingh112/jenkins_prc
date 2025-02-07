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
 * The table class for the &quot;agriculture_forestry&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AgriultureForestry
 * @generated
 */
public class AgriultureForestryTable
	extends BaseTable<AgriultureForestryTable> {

	public static final AgriultureForestryTable INSTANCE =
		new AgriultureForestryTable();

	public final Column<AgriultureForestryTable, Long> agriultureForestryId =
		createColumn(
			"agriultureForestryId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AgriultureForestryTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgriultureForestryTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgriultureForestryTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgriultureForestryTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgriultureForestryTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgriultureForestryTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgriultureForestryTable, String> forestryType =
		createColumn(
			"forestryType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgriultureForestryTable, String> forestryHectare =
		createColumn(
			"forestryHectare", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgriultureForestryTable, String>
		averageAnnulaProduction = createColumn(
			"averageAnnulaProduction", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgriultureForestryTable, String> forestryMarketLocal =
		createColumn(
			"forestryMarketLocal", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgriultureForestryTable, String> forestryMarketForeign =
		createColumn(
			"forestryMarketForeign", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgriultureForestryTable, String> valueOfSale =
		createColumn(
			"valueOfSale", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgriultureForestryTable, String> forestryCounter =
		createColumn(
			"forestryCounter", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgriultureForestryTable, Long>
		agricultureApplicationId = createColumn(
			"agricultureApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AgriultureForestryTable() {
		super("agriculture_forestry", AgriultureForestryTable::new);
	}

}