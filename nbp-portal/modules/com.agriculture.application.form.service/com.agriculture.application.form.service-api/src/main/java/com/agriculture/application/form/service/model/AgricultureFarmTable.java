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
 * The table class for the &quot;agriculture_farm&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureFarm
 * @generated
 */
public class AgricultureFarmTable extends BaseTable<AgricultureFarmTable> {

	public static final AgricultureFarmTable INSTANCE =
		new AgricultureFarmTable();

	public final Column<AgricultureFarmTable, Long> agricultureFarmId =
		createColumn(
			"agricultureFarmId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<AgricultureFarmTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultureFarmTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultureFarmTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultureFarmTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureFarmTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgricultureFarmTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgricultureFarmTable, String> locationOfFarm =
		createColumn(
			"locationOfFarm", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureFarmTable, String> landTenure = createColumn(
		"landTenure", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureFarmTable, String> numberOfHectares =
		createColumn(
			"numberOfHectares", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureFarmTable, String> numberOfYears =
		createColumn(
			"numberOfYears", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureFarmTable, String> numberOfParcels =
		createColumn(
			"numberOfParcels", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureFarmTable, String> sizeOfParcel =
		createColumn(
			"sizeOfParcel", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureFarmTable, String> topography = createColumn(
		"topography", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureFarmTable, String> numberOF = createColumn(
		"numberOF", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureFarmTable, String> farmCounter =
		createColumn(
			"farmCounter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureFarmTable, Long> agricultureApplicationId =
		createColumn(
			"agricultureApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AgricultureFarmTable() {
		super("agriculture_farm", AgricultureFarmTable::new);
	}

}