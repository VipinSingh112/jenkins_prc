/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_subject_data&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SubjectData
 * @generated
 */
public class SubjectDataTable extends BaseTable<SubjectDataTable> {

	public static final SubjectDataTable INSTANCE = new SubjectDataTable();

	public final Column<SubjectDataTable, Long> subjectDataId = createColumn(
		"subjectDataId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<SubjectDataTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SubjectDataTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SubjectDataTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SubjectDataTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SubjectDataTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SubjectDataTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SubjectDataTable, String> verSubjectNameTitle =
		createColumn(
			"verSubjectNameTitle", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SubjectDataTable, String> verSubjectFirstName =
		createColumn(
			"verSubjectFirstName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SubjectDataTable, String> verSubjectMiddleName =
		createColumn(
			"verSubjectMiddleName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SubjectDataTable, String> verSubjectSurname =
		createColumn(
			"verSubjectSurname", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SubjectDataTable, Date> verSubjectDob = createColumn(
		"verSubjectDob", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SubjectDataTable, String> verPresentAddress =
		createColumn(
			"verPresentAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SubjectDataTable, String> verPlaceOfBirth =
		createColumn(
			"verPlaceOfBirth", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SubjectDataTable, String> verSubjectTrn = createColumn(
		"verSubjectTrn", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SubjectDataTable, String> verSubjectTelNum =
		createColumn(
			"verSubjectTelNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SubjectDataTable, String> verSubjectEmail =
		createColumn(
			"verSubjectEmail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SubjectDataTable, Long> osiInsolvencyId = createColumn(
		"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private SubjectDataTable() {
		super("nbp_osi_subject_data", SubjectDataTable::new);
	}

}