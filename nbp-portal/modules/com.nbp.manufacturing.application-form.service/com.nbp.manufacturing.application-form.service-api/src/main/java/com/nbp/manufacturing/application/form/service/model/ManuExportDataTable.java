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
 * The table class for the &quot;nbp_manufacture_export_data&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see ManuExportData
 * @generated
 */
public class ManuExportDataTable extends BaseTable<ManuExportDataTable> {

	public static final ManuExportDataTable INSTANCE =
		new ManuExportDataTable();

	public final Column<ManuExportDataTable, Long> manuExportDataId =
		createColumn(
			"manuExportDataId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<ManuExportDataTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManuExportDataTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManuExportDataTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ManuExportDataTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuExportDataTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ManuExportDataTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ManuExportDataTable, String> companyInvolved =
		createColumn(
			"companyInvolved", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ManuExportDataTable, String> itemsName = createColumn(
		"itemsName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuExportDataTable, String> quantity = createColumn(
		"quantity", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuExportDataTable, String> monetary = createColumn(
		"monetary", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuExportDataTable, String> countryName = createColumn(
		"countryName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ManuExportDataTable, Long> manufacturingApplicationId =
		createColumn(
			"manufacturingApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private ManuExportDataTable() {
		super("nbp_manufacture_export_data", ManuExportDataTable::new);
	}

}