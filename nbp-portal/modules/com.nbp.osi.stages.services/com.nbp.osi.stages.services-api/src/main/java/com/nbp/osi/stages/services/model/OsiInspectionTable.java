/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;osi_application_inspec&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInspection
 * @generated
 */
public class OsiInspectionTable extends BaseTable<OsiInspectionTable> {

	public static final OsiInspectionTable INSTANCE = new OsiInspectionTable();

	public final Column<OsiInspectionTable, Long> osiInspectionId =
		createColumn(
			"osiInspectionId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<OsiInspectionTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiInspectionTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiInspectionTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiInspectionTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInspectionTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiInspectionTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiInspectionTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInspectionTable, Date> dateOfInspection =
		createColumn(
			"dateOfInspection", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<OsiInspectionTable, String> timeOfInspection =
		createColumn(
			"timeOfInspection", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiInspectionTable, String> location = createColumn(
		"location", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInspectionTable, String> status = createColumn(
		"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInspectionTable, Long> osiApplicationId =
		createColumn(
			"osiApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiInspectionTable, Long> slotBookedByUser =
		createColumn(
			"slotBookedByUser", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private OsiInspectionTable() {
		super("osi_application_inspec", OsiInspectionTable::new);
	}

}