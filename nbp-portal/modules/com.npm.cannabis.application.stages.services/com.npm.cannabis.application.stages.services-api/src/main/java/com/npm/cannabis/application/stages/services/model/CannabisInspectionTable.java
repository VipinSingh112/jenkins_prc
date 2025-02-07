/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_cannabis_inspection&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisInspection
 * @generated
 */
public class CannabisInspectionTable
	extends BaseTable<CannabisInspectionTable> {

	public static final CannabisInspectionTable INSTANCE =
		new CannabisInspectionTable();

	public final Column<CannabisInspectionTable, Long> cannabisInspectionId =
		createColumn(
			"cannabisInspectionId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CannabisInspectionTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisInspectionTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisInspectionTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisInspectionTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisInspectionTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisInspectionTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisInspectionTable, Date> inspectionDate =
		createColumn(
			"inspectionDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisInspectionTable, String> insectionDateRange =
		createColumn(
			"insectionDateRange", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisInspectionTable, String> invities =
		createColumn(
			"invities", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisInspectionTable, String> location =
		createColumn(
			"location", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisInspectionTable, String> updatedBySource =
		createColumn(
			"updatedBySource", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisInspectionTable, String> status = createColumn(
		"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisInspectionTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisInspectionTable, Long> cannabisApplicationId =
		createColumn(
			"cannabisApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<CannabisInspectionTable, Long> slotBookedByUser =
		createColumn(
			"slotBookedByUser", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private CannabisInspectionTable() {
		super("nbp_cannabis_inspection", CannabisInspectionTable::new);
	}

}