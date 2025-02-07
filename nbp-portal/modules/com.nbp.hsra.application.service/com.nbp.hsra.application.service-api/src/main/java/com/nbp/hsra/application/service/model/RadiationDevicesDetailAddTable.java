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
 * The table class for the &quot;nbp_hsra_radiation_device_add&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see RadiationDevicesDetailAdd
 * @generated
 */
public class RadiationDevicesDetailAddTable
	extends BaseTable<RadiationDevicesDetailAddTable> {

	public static final RadiationDevicesDetailAddTable INSTANCE =
		new RadiationDevicesDetailAddTable();

	public final Column<RadiationDevicesDetailAddTable, Long>
		radiationDevicesDetailAddId = createColumn(
			"radiationDevicesDetailAddId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<RadiationDevicesDetailAddTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RadiationDevicesDetailAddTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RadiationDevicesDetailAddTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RadiationDevicesDetailAddTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadiationDevicesDetailAddTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<RadiationDevicesDetailAddTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<RadiationDevicesDetailAddTable, String>
		radiationDevicesRadio = createColumn(
			"radiationDevicesRadio", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationDevicesDetailAddTable, String>
		radiationDevicesMaxActivity = createColumn(
			"radiationDevicesMaxActivity", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationDevicesDetailAddTable, String>
		radiationDevicesManufacturer = createColumn(
			"radiationDevicesManufacturer", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationDevicesDetailAddTable, String>
		radiationDevicesName = createColumn(
			"radiationDevicesName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationDevicesDetailAddTable, String>
		radiationDevicesModelNo = createColumn(
			"radiationDevicesModelNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationDevicesDetailAddTable, String>
		radiationDevicesNumber = createColumn(
			"radiationDevicesNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationDevicesDetailAddTable, String>
		radiationDevicesUse = createColumn(
			"radiationDevicesUse", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<RadiationDevicesDetailAddTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RadiationDevicesDetailAddTable, Long>
		hsraApplicationId = createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private RadiationDevicesDetailAddTable() {
		super(
			"nbp_hsra_radiation_device_add",
			RadiationDevicesDetailAddTable::new);
	}

}