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
 * The table class for the &quot;nbp_osi_insolv_application&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvencyApplication
 * @generated
 */
public class OsiInsolvencyApplicationTable
	extends BaseTable<OsiInsolvencyApplicationTable> {

	public static final OsiInsolvencyApplicationTable INSTANCE =
		new OsiInsolvencyApplicationTable();

	public final Column<OsiInsolvencyApplicationTable, Long> osiInsolvencyId =
		createColumn(
			"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<OsiInsolvencyApplicationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyApplicationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyApplicationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyApplicationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyApplicationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyApplicationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyApplicationTable, String> entityId =
		createColumn(
			"entityId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyApplicationTable, String> applicantStatus =
		createColumn(
			"applicantStatus", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyApplicationTable, String> typeOfApplicant =
		createColumn(
			"typeOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyApplicationTable, String> subjectData =
		createColumn(
			"subjectData", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyApplicationTable, String>
		applicantIndividual = createColumn(
			"applicantIndividual", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyApplicationTable, String>
		applicantCompany = createColumn(
			"applicantCompany", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyApplicationTable, String> realEstateBoard =
		createColumn(
			"realEstateBoard", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyApplicationTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyApplicationTable, Integer> status =
		createColumn(
			"status", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyApplicationTable, String> icmDocumentPath =
		createColumn(
			"icmDocumentPath", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyApplicationTable, String>
		applicationNumber = createColumn(
			"applicationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyApplicationTable, Long> pdfFileEntryId =
		createColumn(
			"pdfFileEntryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyApplicationTable, String>
		appCurrentStageName = createColumn(
			"appCurrentStageName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private OsiInsolvencyApplicationTable() {
		super("nbp_osi_insolv_application", OsiInsolvencyApplicationTable::new);
	}

}