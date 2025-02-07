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
 * The table class for the &quot;nbp_hsra_radiation_dev&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see RadiationDevicesAdd
 * @generated
 */
public class RadiationDevicesAddTable
	extends BaseTable<RadiationDevicesAddTable> {

	public static final RadiationDevicesAddTable INSTANCE =
		new RadiationDevicesAddTable();

	public final Column<RadiationDevicesAddTable, Long> radiationDevicesAddId =
		createColumn(
			"radiationDevicesAddId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<RadiationDevicesAddTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RadiationDevicesAddTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RadiationDevicesAddTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RadiationDevicesAddTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadiationDevicesAddTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<RadiationDevicesAddTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<RadiationDevicesAddTable, String>
		radiationDevicesRadio = createColumn(
			"radiationDevicesRadio", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationDevicesAddTable, String>
		radiationDevicesMaxActivity = createColumn(
			"radiationDevicesMaxActivity", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationDevicesAddTable, String>
		radiationDevicesManufacturer = createColumn(
			"radiationDevicesManufacturer", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationDevicesAddTable, String> radiationDevicesName =
		createColumn(
			"radiationDevicesName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationDevicesAddTable, String>
		radiationDevicesModelNo = createColumn(
			"radiationDevicesModelNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationDevicesAddTable, String>
		radiationDevicesNumber = createColumn(
			"radiationDevicesNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationDevicesAddTable, String> radiationDevicesUse =
		createColumn(
			"radiationDevicesUse", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationDevicesAddTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadiationDevicesAddTable, Long> hsraApplicationId =
		createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private RadiationDevicesAddTable() {
		super("nbp_hsra_radiation_dev", RadiationDevicesAddTable::new);
	}

}