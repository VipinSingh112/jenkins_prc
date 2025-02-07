/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_creative_inspection&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeInspection
 * @generated
 */
public class CreativeInspectionTable
	extends BaseTable<CreativeInspectionTable> {

	public static final CreativeInspectionTable INSTANCE =
		new CreativeInspectionTable();

	public final Column<CreativeInspectionTable, Long> creativeInspectionId =
		createColumn(
			"creativeInspectionId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CreativeInspectionTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeInspectionTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeInspectionTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CreativeInspectionTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeInspectionTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeInspectionTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CreativeInspectionTable, Date> dateOfInspection =
		createColumn(
			"dateOfInspection", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<CreativeInspectionTable, String> timeOfInspection =
		createColumn(
			"timeOfInspection", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeInspectionTable, String> location =
		createColumn(
			"location", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeInspectionTable, String> updatedBySource =
		createColumn(
			"updatedBySource", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CreativeInspectionTable, String> status = createColumn(
		"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeInspectionTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CreativeInspectionTable, Long> creativeApplicationId =
		createColumn(
			"creativeApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<CreativeInspectionTable, Long> slotBookedByUser =
		createColumn(
			"slotBookedByUser", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private CreativeInspectionTable() {
		super("nbp_creative_inspection", CreativeInspectionTable::new);
	}

}