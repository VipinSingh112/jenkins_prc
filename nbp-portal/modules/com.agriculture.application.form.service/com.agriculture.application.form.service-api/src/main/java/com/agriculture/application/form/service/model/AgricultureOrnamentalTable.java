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
 * The table class for the &quot;agriculture_ornamental&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureOrnamental
 * @generated
 */
public class AgricultureOrnamentalTable
	extends BaseTable<AgricultureOrnamentalTable> {

	public static final AgricultureOrnamentalTable INSTANCE =
		new AgricultureOrnamentalTable();

	public final Column<AgricultureOrnamentalTable, Long>
		agricultureOrnamentalId = createColumn(
			"agricultureOrnamentalId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AgricultureOrnamentalTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultureOrnamentalTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultureOrnamentalTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultureOrnamentalTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureOrnamentalTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgricultureOrnamentalTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgricultureOrnamentalTable, String> ornamentalType =
		createColumn(
			"ornamentalType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureOrnamentalTable, String>
		ornamentalProduceArea = createColumn(
			"ornamentalProduceArea", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureOrnamentalTable, String>
		averageAnnualProduction = createColumn(
			"averageAnnualProduction", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureOrnamentalTable, String>
		ornamentalMarketLocal = createColumn(
			"ornamentalMarketLocal", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureOrnamentalTable, String>
		ornamentalMarketForeign = createColumn(
			"ornamentalMarketForeign", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureOrnamentalTable, String> valueOfSale =
		createColumn(
			"valueOfSale", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureOrnamentalTable, String> ornamentalCounter =
		createColumn(
			"ornamentalCounter", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureOrnamentalTable, Long>
		agricultureApplicationId = createColumn(
			"agricultureApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AgricultureOrnamentalTable() {
		super("agriculture_ornamental", AgricultureOrnamentalTable::new);
	}

}