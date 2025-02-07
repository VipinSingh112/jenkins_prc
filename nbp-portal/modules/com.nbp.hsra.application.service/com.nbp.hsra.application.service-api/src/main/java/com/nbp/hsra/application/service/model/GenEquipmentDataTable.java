/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_hsra_equipment_add&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see GenEquipmentData
 * @generated
 */
public class GenEquipmentDataTable extends BaseTable<GenEquipmentDataTable> {

	public static final GenEquipmentDataTable INSTANCE =
		new GenEquipmentDataTable();

	public final Column<GenEquipmentDataTable, Long> genEquipmentDataId =
		createColumn(
			"genEquipmentDataId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<GenEquipmentDataTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<GenEquipmentDataTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<GenEquipmentDataTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<GenEquipmentDataTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<GenEquipmentDataTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<GenEquipmentDataTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<GenEquipmentDataTable, String> manufacturerEquipment =
		createColumn(
			"manufacturerEquipment", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<GenEquipmentDataTable, String> equipmentModel =
		createColumn(
			"equipmentModel", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<GenEquipmentDataTable, String> equipmentSerial =
		createColumn(
			"equipmentSerial", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<GenEquipmentDataTable, String> operatingPotential =
		createColumn(
			"operatingPotential", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<GenEquipmentDataTable, String> natureEquipment =
		createColumn(
			"natureEquipment", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<GenEquipmentDataTable, String> radiationGeneratingLoc =
		createColumn(
			"radiationGeneratingLoc", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<GenEquipmentDataTable, String> equipmentModels =
		createColumn(
			"equipmentModels", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<GenEquipmentDataTable, String> equipmentStatusDetail =
		createColumn(
			"equipmentStatusDetail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<GenEquipmentDataTable, Date> equipmentDate =
		createColumn(
			"equipmentDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<GenEquipmentDataTable, String> counter = createColumn(
		"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<GenEquipmentDataTable, Long> hsraApplicationId =
		createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private GenEquipmentDataTable() {
		super("nbp_hsra_equipment_add", GenEquipmentDataTable::new);
	}

}