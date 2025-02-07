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
 * The table class for the &quot;agriculture_building&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureBuilding
 * @generated
 */
public class AgricultureBuildingTable
	extends BaseTable<AgricultureBuildingTable> {

	public static final AgricultureBuildingTable INSTANCE =
		new AgricultureBuildingTable();

	public final Column<AgricultureBuildingTable, Long> agricultureBuildingId =
		createColumn(
			"agricultureBuildingId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AgricultureBuildingTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultureBuildingTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultureBuildingTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultureBuildingTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureBuildingTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgricultureBuildingTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgricultureBuildingTable, String> buildingPurpose =
		createColumn(
			"buildingPurpose", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureBuildingTable, String> buildingSize =
		createColumn(
			"buildingSize", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureBuildingTable, String> machineryDescription =
		createColumn(
			"machineryDescription", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureBuildingTable, Date> dateOfAcquisition =
		createColumn(
			"dateOfAcquisition", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureBuildingTable, String> buildingCost =
		createColumn(
			"buildingCost", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureBuildingTable, String> presentBookValue =
		createColumn(
			"presentBookValue", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureBuildingTable, String> buildingCounter =
		createColumn(
			"buildingCounter", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureBuildingTable, Long>
		agricultureApplicationId = createColumn(
			"agricultureApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AgricultureBuildingTable() {
		super("agriculture_building", AgricultureBuildingTable::new);
	}

}