/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_healthcare_equipment_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareEquipmentInfo
 * @generated
 */
public class HealthCareEquipmentInfoTable
	extends BaseTable<HealthCareEquipmentInfoTable> {

	public static final HealthCareEquipmentInfoTable INSTANCE =
		new HealthCareEquipmentInfoTable();

	public final Column<HealthCareEquipmentInfoTable, Long>
		healthCareEquipmentInfoId = createColumn(
			"healthCareEquipmentInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<HealthCareEquipmentInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HealthCareEquipmentInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HealthCareEquipmentInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HealthCareEquipmentInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HealthCareEquipmentInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HealthCareEquipmentInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HealthCareEquipmentInfoTable, Long>
		healthCareApplicationId = createColumn(
			"healthCareApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<HealthCareEquipmentInfoTable, String> equipmentManu =
		createColumn(
			"equipmentManu", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HealthCareEquipmentInfoTable, String> equipmentModel =
		createColumn(
			"equipmentModel", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HealthCareEquipmentInfoTable, String> equipmentMake =
		createColumn(
			"equipmentMake", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HealthCareEquipmentInfoTable, String> yearOfEquipment =
		createColumn(
			"yearOfEquipment", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<HealthCareEquipmentInfoTable, String> serialNumber =
		createColumn(
			"serialNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HealthCareEquipmentInfoTable, String> quantity =
		createColumn(
			"quantity", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HealthCareEquipmentInfoTable, String> description =
		createColumn(
			"description", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HealthCareEquipmentInfoTable, String> hsHeading =
		createColumn(
			"hsHeading", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HealthCareEquipmentInfoTable, String> hsSubHeading =
		createColumn(
			"hsSubHeading", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HealthCareEquipmentInfoTable, String> counter =
		createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private HealthCareEquipmentInfoTable() {
		super(
			"nbp_healthcare_equipment_info", HealthCareEquipmentInfoTable::new);
	}

}