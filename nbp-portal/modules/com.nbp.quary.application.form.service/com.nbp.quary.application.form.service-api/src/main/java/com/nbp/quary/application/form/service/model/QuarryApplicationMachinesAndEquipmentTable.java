/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_quarry_machines_equip&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryApplicationMachinesAndEquipment
 * @generated
 */
public class QuarryApplicationMachinesAndEquipmentTable
	extends BaseTable<QuarryApplicationMachinesAndEquipmentTable> {

	public static final QuarryApplicationMachinesAndEquipmentTable INSTANCE =
		new QuarryApplicationMachinesAndEquipmentTable();

	public final Column<QuarryApplicationMachinesAndEquipmentTable, String>
		uuid = createColumn(
			"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationMachinesAndEquipmentTable, Long>
		quarryApplicationMachinId = createColumn(
			"quarryApplicationMachinId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<QuarryApplicationMachinesAndEquipmentTable, Long>
		groupId = createColumn(
			"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationMachinesAndEquipmentTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationMachinesAndEquipmentTable, Long>
		userId = createColumn(
			"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationMachinesAndEquipmentTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationMachinesAndEquipmentTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationMachinesAndEquipmentTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationMachinesAndEquipmentTable, String>
		manchineName = createColumn(
			"manchineName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationMachinesAndEquipmentTable, String>
		isManchineNameChecked = createColumn(
			"isManchineNameChecked", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationMachinesAndEquipmentTable, String>
		quantity = createColumn(
			"quantity", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationMachinesAndEquipmentTable, String>
		locationOfPermises = createColumn(
			"locationOfPermises", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationMachinesAndEquipmentTable, String>
		locatedOnLocation = createColumn(
			"locatedOnLocation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationMachinesAndEquipmentTable, String>
		otherValue = createColumn(
			"otherValue", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationMachinesAndEquipmentTable, String>
		quarryApplicationId = createColumn(
			"quarryApplicationId", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private QuarryApplicationMachinesAndEquipmentTable() {
		super(
			"nbp_quarry_machines_equip",
			QuarryApplicationMachinesAndEquipmentTable::new);
	}

}