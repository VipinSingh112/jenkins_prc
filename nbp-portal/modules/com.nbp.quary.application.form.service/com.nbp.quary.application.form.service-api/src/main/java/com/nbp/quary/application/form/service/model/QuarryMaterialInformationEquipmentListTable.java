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
 * The table class for the &quot;nbp_quarry_material_List_info&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryMaterialInformationEquipmentList
 * @generated
 */
public class QuarryMaterialInformationEquipmentListTable
	extends BaseTable<QuarryMaterialInformationEquipmentListTable> {

	public static final QuarryMaterialInformationEquipmentListTable INSTANCE =
		new QuarryMaterialInformationEquipmentListTable();

	public final Column<QuarryMaterialInformationEquipmentListTable, Long>
		materialInfoId = createColumn(
			"materialInfoId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<QuarryMaterialInformationEquipmentListTable, Long>
		groupId = createColumn(
			"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryMaterialInformationEquipmentListTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryMaterialInformationEquipmentListTable, Long>
		userId = createColumn(
			"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryMaterialInformationEquipmentListTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryMaterialInformationEquipmentListTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QuarryMaterialInformationEquipmentListTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QuarryMaterialInformationEquipmentListTable, String>
		machineName = createColumn(
			"machineName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryMaterialInformationEquipmentListTable, String>
		quantity = createColumn(
			"quantity", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryMaterialInformationEquipmentListTable, String>
		locatedOnPermises = createColumn(
			"locatedOnPermises", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryMaterialInformationEquipmentListTable, String>
		isManchineNameChecked = createColumn(
			"isManchineNameChecked", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryMaterialInformationEquipmentListTable, String>
		otherValue = createColumn(
			"otherValue", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryMaterialInformationEquipmentListTable, Long>
		quarryApplicationId = createColumn(
			"quarryApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private QuarryMaterialInformationEquipmentListTable() {
		super(
			"nbp_quarry_material_List_info",
			QuarryMaterialInformationEquipmentListTable::new);
	}

}