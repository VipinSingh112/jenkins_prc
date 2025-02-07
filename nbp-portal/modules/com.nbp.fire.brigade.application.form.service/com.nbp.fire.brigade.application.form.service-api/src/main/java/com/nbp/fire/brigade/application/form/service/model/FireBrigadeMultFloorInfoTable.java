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
 * The table class for the &quot;nbp_fire_mul_floor_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeMultFloorInfo
 * @generated
 */
public class FireBrigadeMultFloorInfoTable
	extends BaseTable<FireBrigadeMultFloorInfoTable> {

	public static final FireBrigadeMultFloorInfoTable INSTANCE =
		new FireBrigadeMultFloorInfoTable();

	public final Column<FireBrigadeMultFloorInfoTable, Long>
		fireBrigadeMultFloorInfoId = createColumn(
			"fireBrigadeMultFloorInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FireBrigadeMultFloorInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeMultFloorInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeMultFloorInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeMultFloorInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeMultFloorInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeMultFloorInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeMultFloorInfoTable, String>
		floorAlternateExist = createColumn(
			"floorAlternateExist", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FireBrigadeMultFloorInfoTable, String>
		buildingRisingMain = createColumn(
			"buildingRisingMain", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FireBrigadeMultFloorInfoTable, String>
		equipmentConnection = createColumn(
			"equipmentConnection", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FireBrigadeMultFloorInfoTable, String>
		buildingParkingGarage = createColumn(
			"buildingParkingGarage", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FireBrigadeMultFloorInfoTable, Long>
		fireBrigadeApplicationId = createColumn(
			"fireBrigadeApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private FireBrigadeMultFloorInfoTable() {
		super("nbp_fire_mul_floor_info", FireBrigadeMultFloorInfoTable::new);
	}

}