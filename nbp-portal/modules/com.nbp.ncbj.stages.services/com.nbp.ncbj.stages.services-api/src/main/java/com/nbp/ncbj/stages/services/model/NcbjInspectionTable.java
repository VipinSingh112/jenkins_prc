/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_ncbj_inspection&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjInspection
 * @generated
 */
public class NcbjInspectionTable extends BaseTable<NcbjInspectionTable> {

	public static final NcbjInspectionTable INSTANCE =
		new NcbjInspectionTable();

	public final Column<NcbjInspectionTable, Long> ncbjInspectionId =
		createColumn(
			"ncbjInspectionId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<NcbjInspectionTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjInspectionTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjInspectionTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjInspectionTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjInspectionTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjInspectionTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjInspectionTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjInspectionTable, Date> dateOfInspection =
		createColumn(
			"dateOfInspection", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<NcbjInspectionTable, String> timeOfInspection =
		createColumn(
			"timeOfInspection", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjInspectionTable, String> location = createColumn(
		"location", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjInspectionTable, String> status = createColumn(
		"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjInspectionTable, Long> ncbjApplicationId =
		createColumn(
			"ncbjApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjInspectionTable, Long> slotBookedByUser =
		createColumn(
			"slotBookedByUser", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private NcbjInspectionTable() {
		super("nbp_ncbj_inspection", NcbjInspectionTable::new);
	}

}