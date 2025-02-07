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
 * The table class for the &quot;agriculture_livestock&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureLivestock
 * @generated
 */
public class AgricultureLivestockTable
	extends BaseTable<AgricultureLivestockTable> {

	public static final AgricultureLivestockTable INSTANCE =
		new AgricultureLivestockTable();

	public final Column<AgricultureLivestockTable, Long>
		agricultureLivestockId = createColumn(
			"agricultureLivestockId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AgricultureLivestockTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultureLivestockTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultureLivestockTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultureLivestockTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureLivestockTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgricultureLivestockTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgricultureLivestockTable, String> livestockType =
		createColumn(
			"livestockType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureLivestockTable, String>
		numberOFAnimalsByCategory = createColumn(
			"numberOFAnimalsByCategory", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureLivestockTable, String>
		averageAnnualProduction = createColumn(
			"averageAnnualProduction", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureLivestockTable, String>
		livestockMarketlocal = createColumn(
			"livestockMarketlocal", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureLivestockTable, String>
		livestockMarketForeign = createColumn(
			"livestockMarketForeign", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureLivestockTable, String> valueOfSale =
		createColumn(
			"valueOfSale", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureLivestockTable, String> Livestockcounter =
		createColumn(
			"Livestockcounter", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureLivestockTable, Long>
		agricultureApplicationId = createColumn(
			"agricultureApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AgricultureLivestockTable() {
		super("agriculture_livestock", AgricultureLivestockTable::new);
	}

}