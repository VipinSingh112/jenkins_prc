/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_quarry_application&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryApplication
 * @generated
 */
public class QuarryApplicationTable extends BaseTable<QuarryApplicationTable> {

	public static final QuarryApplicationTable INSTANCE =
		new QuarryApplicationTable();

	public final Column<QuarryApplicationTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationTable, Long> quarryApplicationId =
		createColumn(
			"quarryApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<QuarryApplicationTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationTable, Long> entityId = createColumn(
		"entityId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationTable, String> natureOfApplicant =
		createColumn(
			"natureOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationTable, String> typeOfTransaction =
		createColumn(
			"typeOfTransaction", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationTable, String> renewLicenceNumber =
		createColumn(
			"renewLicenceNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationTable, String> typeOfMaterialQuarried =
		createColumn(
			"typeOfMaterialQuarried", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationTable, Integer> status = createColumn(
		"status", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationTable, String> icmDocumentPath =
		createColumn(
			"icmDocumentPath", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationTable, String> applicationNumber =
		createColumn(
			"applicationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationTable, String>
		expiredLicenseAppNumber = createColumn(
			"expiredLicenseAppNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationTable, Long> pdfFileEntryId =
		createColumn(
			"pdfFileEntryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryApplicationTable, String> appCurrentStageName =
		createColumn(
			"appCurrentStageName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private QuarryApplicationTable() {
		super("nbp_quarry_application", QuarryApplicationTable::new);
	}

}