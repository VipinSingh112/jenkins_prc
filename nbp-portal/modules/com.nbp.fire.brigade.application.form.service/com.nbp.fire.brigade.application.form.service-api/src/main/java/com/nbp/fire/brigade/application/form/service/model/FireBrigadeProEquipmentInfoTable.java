/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_fire_pro_equipment_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeProEquipmentInfo
 * @generated
 */
public class FireBrigadeProEquipmentInfoTable
	extends BaseTable<FireBrigadeProEquipmentInfoTable> {

	public static final FireBrigadeProEquipmentInfoTable INSTANCE =
		new FireBrigadeProEquipmentInfoTable();

	public final Column<FireBrigadeProEquipmentInfoTable, Long>
		fireBrigadeProEquipmentInfoId = createColumn(
			"fireBrigadeProEquipmentInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FireBrigadeProEquipmentInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeProEquipmentInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeProEquipmentInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeProEquipmentInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeProEquipmentInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeProEquipmentInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeProEquipmentInfoTable, String>
		equipmentProtectionPre = createColumn(
			"equipmentProtectionPre", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FireBrigadeProEquipmentInfoTable, String>
		equipmentProtectionOne = createColumn(
			"equipmentProtectionOne", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FireBrigadeProEquipmentInfoTable, String>
		equipmentProtectionTwo = createColumn(
			"equipmentProtectionTwo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FireBrigadeProEquipmentInfoTable, String>
		equipmentProtectionThree = createColumn(
			"equipmentProtectionThree", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FireBrigadeProEquipmentInfoTable, String>
		equipmentProtectionFour = createColumn(
			"equipmentProtectionFour", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FireBrigadeProEquipmentInfoTable, String>
		equipmentProtectionFive = createColumn(
			"equipmentProtectionFive", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FireBrigadeProEquipmentInfoTable, String>
		equipmentProtectionSix = createColumn(
			"equipmentProtectionSix", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FireBrigadeProEquipmentInfoTable, String>
		otherEquipment = createColumn(
			"otherEquipment", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeProEquipmentInfoTable, Long>
		fireBrigadeApplicationId = createColumn(
			"fireBrigadeApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private FireBrigadeProEquipmentInfoTable() {
		super(
			"nbp_fire_pro_equipment_info",
			FireBrigadeProEquipmentInfoTable::new);
	}

}