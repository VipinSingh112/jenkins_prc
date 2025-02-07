/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.stages.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_ncra_inspection&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NcraInspection
 * @generated
 */
public class NcraInspectionTable extends BaseTable<NcraInspectionTable> {

	public static final NcraInspectionTable INSTANCE =
		new NcraInspectionTable();

	public final Column<NcraInspectionTable, Long> ncraInspectionId =
		createColumn(
			"ncraInspectionId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<NcraInspectionTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcraInspectionTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcraInspectionTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcraInspectionTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcraInspectionTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcraInspectionTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcraInspectionTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcraInspectionTable, Date> dateOfInspection =
		createColumn(
			"dateOfInspection", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<NcraInspectionTable, String> timeOfInspection =
		createColumn(
			"timeOfInspection", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcraInspectionTable, String> location = createColumn(
		"location", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcraInspectionTable, String> status = createColumn(
		"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcraInspectionTable, Long> ncraApplicationId =
		createColumn(
			"ncraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcraInspectionTable, Long> slotBookedByUser =
		createColumn(
			"slotBookedByUser", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private NcraInspectionTable() {
		super("nbp_ncra_inspection", NcraInspectionTable::new);
	}

}