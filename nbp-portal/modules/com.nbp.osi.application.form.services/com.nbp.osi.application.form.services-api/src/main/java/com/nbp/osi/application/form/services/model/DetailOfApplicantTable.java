/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_applicant_details&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see DetailOfApplicant
 * @generated
 */
public class DetailOfApplicantTable extends BaseTable<DetailOfApplicantTable> {

	public static final DetailOfApplicantTable INSTANCE =
		new DetailOfApplicantTable();

	public final Column<DetailOfApplicantTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DetailOfApplicantTable, Long> detailOfApplicantId =
		createColumn(
			"detailOfApplicantId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<DetailOfApplicantTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DetailOfApplicantTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DetailOfApplicantTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DetailOfApplicantTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DetailOfApplicantTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DetailOfApplicantTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DetailOfApplicantTable, String> applicantName =
		createColumn(
			"applicantName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DetailOfApplicantTable, String> applicantMiddleName =
		createColumn(
			"applicantMiddleName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<DetailOfApplicantTable, String> applicantLastName =
		createColumn(
			"applicantLastName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<DetailOfApplicantTable, String> applicantAddress =
		createColumn(
			"applicantAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<DetailOfApplicantTable, String> applicantEmail =
		createColumn(
			"applicantEmail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DetailOfApplicantTable, String> applicantTeleNum =
		createColumn(
			"applicantTeleNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<DetailOfApplicantTable, String> applicantTrn =
		createColumn(
			"applicantTrn", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DetailOfApplicantTable, String> applicantIdNumber =
		createColumn(
			"applicantIdNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<DetailOfApplicantTable, Date> applicantDob =
		createColumn(
			"applicantDob", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DetailOfApplicantTable, String> applicantOccupation =
		createColumn(
			"applicantOccupation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<DetailOfApplicantTable, Long> osiApplicationId =
		createColumn(
			"osiApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private DetailOfApplicantTable() {
		super("nbp_osi_applicant_details", DetailOfApplicantTable::new);
	}

}