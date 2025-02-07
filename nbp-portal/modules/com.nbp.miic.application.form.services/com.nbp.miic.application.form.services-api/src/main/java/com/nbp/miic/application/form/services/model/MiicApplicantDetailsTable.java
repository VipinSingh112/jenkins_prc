/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_miic_applicant_details&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see MiicApplicantDetails
 * @generated
 */
public class MiicApplicantDetailsTable
	extends BaseTable<MiicApplicantDetailsTable> {

	public static final MiicApplicantDetailsTable INSTANCE =
		new MiicApplicantDetailsTable();

	public final Column<MiicApplicantDetailsTable, Long>
		miicApplicantDetailsId = createColumn(
			"miicApplicantDetailsId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<MiicApplicantDetailsTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiicApplicantDetailsTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiicApplicantDetailsTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiicApplicantDetailsTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicApplicantDetailsTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiicApplicantDetailsTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MiicApplicantDetailsTable, String> natureOfApplicant =
		createColumn(
			"natureOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MiicApplicantDetailsTable, String> applicantName =
		createColumn(
			"applicantName ", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicApplicantDetailsTable, String> address =
		createColumn(
			"address", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicApplicantDetailsTable, String> email = createColumn(
		"email", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicApplicantDetailsTable, String> telephone =
		createColumn(
			"telephone", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicApplicantDetailsTable, Date> dateOfApplication =
		createColumn(
			"dateOfApplication", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<MiicApplicantDetailsTable, String> trnNumber =
		createColumn(
			"trnNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicApplicantDetailsTable, Long> miicApplicationId =
		createColumn(
			"miicApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MiicApplicantDetailsTable, String> nameOfProducer =
		createColumn(
			"nameOfProducer", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicApplicantDetailsTable, String> companyName =
		createColumn(
			"companyName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicApplicantDetailsTable, String> firstName =
		createColumn(
			"firstName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MiicApplicantDetailsTable, String> lastName =
		createColumn(
			"lastName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private MiicApplicantDetailsTable() {
		super("nbp_miic_applicant_details", MiicApplicantDetailsTable::new);
	}

}