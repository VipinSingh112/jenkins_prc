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
 * The table class for the &quot;nbp_hsra_noti_gen_equip&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see GenerateEquipmentInfo
 * @generated
 */
public class GenerateEquipmentInfoTable
	extends BaseTable<GenerateEquipmentInfoTable> {

	public static final GenerateEquipmentInfoTable INSTANCE =
		new GenerateEquipmentInfoTable();

	public final Column<GenerateEquipmentInfoTable, Long>
		GenerateEquipmentInfoId = createColumn(
			"GenerateEquipmentInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<GenerateEquipmentInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<GenerateEquipmentInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<GenerateEquipmentInfoTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<GenerateEquipmentInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<GenerateEquipmentInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<GenerateEquipmentInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<GenerateEquipmentInfoTable, String>
		manufacturerEquipment = createColumn(
			"manufacturerEquipment", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<GenerateEquipmentInfoTable, String> equipmentModel =
		createColumn(
			"equipmentModel", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<GenerateEquipmentInfoTable, String> equipmentSerial =
		createColumn(
			"equipmentSerial", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<GenerateEquipmentInfoTable, String> operatingPotential =
		createColumn(
			"operatingPotential", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<GenerateEquipmentInfoTable, String> equipmentModels =
		createColumn(
			"equipmentModels", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<GenerateEquipmentInfoTable, String> natureEquipment =
		createColumn(
			"natureEquipment", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<GenerateEquipmentInfoTable, String>
		equipmentStatusDetail = createColumn(
			"equipmentStatusDetail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<GenerateEquipmentInfoTable, Date> equipmentDate =
		createColumn(
			"equipmentDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<GenerateEquipmentInfoTable, Long> hsraApplicationId =
		createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private GenerateEquipmentInfoTable() {
		super("nbp_hsra_noti_gen_equip", GenerateEquipmentInfoTable::new);
	}

}