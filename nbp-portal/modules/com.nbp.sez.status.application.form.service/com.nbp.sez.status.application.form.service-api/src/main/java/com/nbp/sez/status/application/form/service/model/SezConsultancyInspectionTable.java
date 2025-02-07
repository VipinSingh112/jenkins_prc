/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_sez_consultancy_service&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezConsultancyInspection
 * @generated
 */
public class SezConsultancyInspectionTable
	extends BaseTable<SezConsultancyInspectionTable> {

	public static final SezConsultancyInspectionTable INSTANCE =
		new SezConsultancyInspectionTable();

	public final Column<SezConsultancyInspectionTable, Long>
		sezConsultancyInspectionId = createColumn(
			"sezConsultancyInspectionId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<SezConsultancyInspectionTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezConsultancyInspectionTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezConsultancyInspectionTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezConsultancyInspectionTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezConsultancyInspectionTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezConsultancyInspectionTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezConsultancyInspectionTable, String> doYouWant =
		createColumn(
			"doYouWant", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezConsultancyInspectionTable, String> consultancyName =
		createColumn(
			"consultancyName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezConsultancyInspectionTable, String>
		consultancyEmail = createColumn(
			"consultancyEmail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezConsultancyInspectionTable, String>
		consultancyPhoneNum = createColumn(
			"consultancyPhoneNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezConsultancyInspectionTable, Date>
		consultancyDateBirth = createColumn(
			"consultancyDateBirth", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<SezConsultancyInspectionTable, String>
		consultancyBirthCountry = createColumn(
			"consultancyBirthCountry", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezConsultancyInspectionTable, String>
		consultancyCountry = createColumn(
			"consultancyCountry", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezConsultancyInspectionTable, String>
		consultancySezStatus = createColumn(
			"consultancySezStatus", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezConsultancyInspectionTable, String> agendaName =
		createColumn(
			"agendaName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezConsultancyInspectionTable, Date> dateForInspection =
		createColumn(
			"dateForInspection", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<SezConsultancyInspectionTable, String> consultancyTime =
		createColumn(
			"consultancyTime", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private SezConsultancyInspectionTable() {
		super(
			"nbp_sez_consultancy_service", SezConsultancyInspectionTable::new);
	}

}