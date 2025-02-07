/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_wra_inspec&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see WraInspection
 * @generated
 */
public class WraInspectionTable extends BaseTable<WraInspectionTable> {

	public static final WraInspectionTable INSTANCE = new WraInspectionTable();

	public final Column<WraInspectionTable, Long> wraInspectionId =
		createColumn(
			"wraInspectionId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<WraInspectionTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<WraInspectionTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<WraInspectionTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<WraInspectionTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WraInspectionTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<WraInspectionTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<WraInspectionTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WraInspectionTable, Date> dateOfInspection =
		createColumn(
			"dateOfInspection", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<WraInspectionTable, String> timeOfInspection =
		createColumn(
			"timeOfInspection", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<WraInspectionTable, String> location = createColumn(
		"location", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WraInspectionTable, String> status = createColumn(
		"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WraInspectionTable, Long> wraApplicationId =
		createColumn(
			"wraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<WraInspectionTable, Long> slotBookedByUser =
		createColumn(
			"slotBookedByUser", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private WraInspectionTable() {
		super("nbp_wra_inspec", WraInspectionTable::new);
	}

}