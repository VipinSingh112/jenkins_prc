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
 * The table class for the &quot;nbp_osi_application&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OsiApplication
 * @generated
 */
public class OsiApplicationTable extends BaseTable<OsiApplicationTable> {

	public static final OsiApplicationTable INSTANCE =
		new OsiApplicationTable();

	public final Column<OsiApplicationTable, Long> osiApplicationId =
		createColumn(
			"osiApplicationId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<OsiApplicationTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiApplicationTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiApplicationTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiApplicationTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiApplicationTable, String> entityId = createColumn(
		"entityId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiApplicationTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiApplicationTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiApplicationTable, String> applicationType =
		createColumn(
			"applicationType", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiApplicationTable, Integer> applicationStatus =
		createColumn(
			"applicationStatus", Integer.class, Types.INTEGER,
			Column.FLAG_DEFAULT);
	public final Column<OsiApplicationTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiApplicationTable, Integer> status = createColumn(
		"status", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<OsiApplicationTable, String> icmDocumentPath =
		createColumn(
			"icmDocumentPath", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiApplicationTable, String> applicationNumber =
		createColumn(
			"applicationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiApplicationTable, String> expiredLicenseAppNumber =
		createColumn(
			"expiredLicenseAppNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiApplicationTable, Long> pdfFileEntryId =
		createColumn(
			"pdfFileEntryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiApplicationTable, String> appCurrentStageName =
		createColumn(
			"appCurrentStageName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private OsiApplicationTable() {
		super("nbp_osi_application", OsiApplicationTable::new);
	}

}