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
 * The table class for the &quot;agriculture_poultry&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AgriculturePoultry
 * @generated
 */
public class AgriculturePoultryTable
	extends BaseTable<AgriculturePoultryTable> {

	public static final AgriculturePoultryTable INSTANCE =
		new AgriculturePoultryTable();

	public final Column<AgriculturePoultryTable, Long> agriculturePoultryId =
		createColumn(
			"agriculturePoultryId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AgriculturePoultryTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgriculturePoultryTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgriculturePoultryTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgriculturePoultryTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgriculturePoultryTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgriculturePoultryTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgriculturePoultryTable, String> poultryType =
		createColumn(
			"poultryType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgriculturePoultryTable, String>
		numberOFBirdsByCategory = createColumn(
			"numberOFBirdsByCategory", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgriculturePoultryTable, String>
		averageAnnualProduction = createColumn(
			"averageAnnualProduction", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgriculturePoultryTable, String> poultryMarketLocal =
		createColumn(
			"poultryMarketLocal", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgriculturePoultryTable, String> poultryMarketForeign =
		createColumn(
			"poultryMarketForeign", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgriculturePoultryTable, String> valueOfSale =
		createColumn(
			"valueOfSale", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgriculturePoultryTable, String> poultryCounter =
		createColumn(
			"poultryCounter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgriculturePoultryTable, Long>
		agricultureApplicationId = createColumn(
			"agricultureApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AgriculturePoultryTable() {
		super("agriculture_poultry", AgriculturePoultryTable::new);
	}

}