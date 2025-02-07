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
 * The table class for the &quot;nbp_manu_equipment_Add&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see ManuEquipmentAdd
 * @generated
 */
public class ManuEquipmentAddTable extends BaseTable<ManuEquipmentAddTable> {

	public static final ManuEquipmentAddTable INSTANCE =
		new ManuEquipmentAddTable();

	public final Column<ManuEquipmentAddTable, Long> manuEquipmentAddId =
		createColumn(
			"manuEquipmentAddId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<ManuEquipmentAddTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManuEquipmentAddTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManuEquipmentAddTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManuEquipmentAddTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuEquipmentAddTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ManuEquipmentAddTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ManuEquipmentAddTable, String> equipmentName =
		createColumn(
			"equipmentName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuEquipmentAddTable, String> jamaicanDollor =
		createColumn(
			"jamaicanDollor", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuEquipmentAddTable, String> counter = createColumn(
		"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuEquipmentAddTable, Long>
		manufacturingApplicationId = createColumn(
			"manufacturingApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<ManuEquipmentAddTable, Long> manuEquipmentId =
		createColumn(
			"manuEquipmentId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private ManuEquipmentAddTable() {
		super("nbp_manu_equipment_Add", ManuEquipmentAddTable::new);
	}

}