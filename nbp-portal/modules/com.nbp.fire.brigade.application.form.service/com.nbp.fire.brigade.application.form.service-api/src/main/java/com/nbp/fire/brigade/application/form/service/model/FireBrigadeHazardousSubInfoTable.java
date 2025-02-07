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
 * The table class for the &quot;nbp_fire_hazar_sub_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeHazardousSubInfo
 * @generated
 */
public class FireBrigadeHazardousSubInfoTable
	extends BaseTable<FireBrigadeHazardousSubInfoTable> {

	public static final FireBrigadeHazardousSubInfoTable INSTANCE =
		new FireBrigadeHazardousSubInfoTable();

	public final Column<FireBrigadeHazardousSubInfoTable, Long>
		fireBrigadeHazardousSubInfoId = createColumn(
			"fireBrigadeHazardousSubInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FireBrigadeHazardousSubInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeHazardousSubInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeHazardousSubInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeHazardousSubInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeHazardousSubInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeHazardousSubInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeHazardousSubInfoTable, String> lpgCylinder =
		createColumn(
			"lpgCylinder", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeHazardousSubInfoTable, String>
		flammableGases = createColumn(
			"flammableGases", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeHazardousSubInfoTable, String>
		flammableCombustibleLiquid = createColumn(
			"flammableCombustibleLiquid", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FireBrigadeHazardousSubInfoTable, String>
		chemicalsLiquid = createColumn(
			"chemicalsLiquid", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FireBrigadeHazardousSubInfoTable, String>
		chemicalsPowder = createColumn(
			"chemicalsPowder", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FireBrigadeHazardousSubInfoTable, String> explosives =
		createColumn(
			"explosives", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadeHazardousSubInfoTable, String>
		otherHazardousSubstance = createColumn(
			"otherHazardousSubstance", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FireBrigadeHazardousSubInfoTable, Long>
		fireBrigadeApplicationId = createColumn(
			"fireBrigadeApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private FireBrigadeHazardousSubInfoTable() {
		super("nbp_fire_hazar_sub_info", FireBrigadeHazardousSubInfoTable::new);
	}

}