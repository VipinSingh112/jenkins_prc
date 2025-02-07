/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_manufacture_equipment&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see ManuEquipment
 * @generated
 */
public class ManuEquipmentTable extends BaseTable<ManuEquipmentTable> {

	public static final ManuEquipmentTable INSTANCE = new ManuEquipmentTable();

	public final Column<ManuEquipmentTable, Long> manuEquipmentId =
		createColumn(
			"manuEquipmentId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<ManuEquipmentTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManuEquipmentTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManuEquipmentTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManuEquipmentTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuEquipmentTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ManuEquipmentTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ManuEquipmentTable, String> equipmentImported =
		createColumn(
			"equipmentImported", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ManuEquipmentTable, String> land = createColumn(
		"land", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuEquipmentTable, String> equipment = createColumn(
		"equipment", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuEquipmentTable, String> building = createColumn(
		"building", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuEquipmentTable, String> Other = createColumn(
		"Other", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuEquipmentTable, String> equipmentName =
		createColumn(
			"equipmentName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuEquipmentTable, String> jamaicanDollor =
		createColumn(
			"jamaicanDollor", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuEquipmentTable, String> capitalExpenditure =
		createColumn(
			"capitalExpenditure", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ManuEquipmentTable, String> nameOFPurpose =
		createColumn(
			"nameOFPurpose", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuEquipmentTable, String> equipmentMaintained =
		createColumn(
			"equipmentMaintained", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ManuEquipmentTable, String> equipmentCreated =
		createColumn(
			"equipmentCreated", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ManuEquipmentTable, String> skilledEmp = createColumn(
		"skilledEmp", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuEquipmentTable, String> clericalEmp = createColumn(
		"clericalEmp", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuEquipmentTable, String> otherEmp = createColumn(
		"otherEmp", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuEquipmentTable, String> totalEmp = createColumn(
		"totalEmp", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuEquipmentTable, Long> manufacturingApplicationId =
		createColumn(
			"manufacturingApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private ManuEquipmentTable() {
		super("nbp_manufacture_equipment", ManuEquipmentTable::new);
	}

}