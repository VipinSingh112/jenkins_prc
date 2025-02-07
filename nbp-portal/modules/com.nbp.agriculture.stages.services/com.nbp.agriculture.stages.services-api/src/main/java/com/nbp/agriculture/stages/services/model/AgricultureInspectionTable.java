/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_agriculture_inspection&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureInspection
 * @generated
 */
public class AgricultureInspectionTable
	extends BaseTable<AgricultureInspectionTable> {

	public static final AgricultureInspectionTable INSTANCE =
		new AgricultureInspectionTable();

	public final Column<AgricultureInspectionTable, Long>
		agricultureInspectionId = createColumn(
			"agricultureInspectionId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AgricultureInspectionTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultureInspectionTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultureInspectionTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultureInspectionTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureInspectionTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgricultureInspectionTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgricultureInspectionTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureInspectionTable, Date> dateOfInspection =
		createColumn(
			"dateOfInspection", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureInspectionTable, String> insectionDateRange =
		createColumn(
			"insectionDateRange", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureInspectionTable, String> invities =
		createColumn(
			"invities", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureInspectionTable, String> location =
		createColumn(
			"location", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureInspectionTable, String> updatedBySource =
		createColumn(
			"updatedBySource", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureInspectionTable, String> status =
		createColumn(
			"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureInspectionTable, Long> agriApplicationId =
		createColumn(
			"agriApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultureInspectionTable, Long> slotBookedByUser =
		createColumn(
			"slotBookedByUser", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AgricultureInspectionTable() {
		super("nbp_agriculture_inspection", AgricultureInspectionTable::new);
	}

}