/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_ogt_applications&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OgtApplication
 * @generated
 */
public class OgtApplicationTable extends BaseTable<OgtApplicationTable> {

	public static final OgtApplicationTable INSTANCE =
		new OgtApplicationTable();

	public final Column<OgtApplicationTable, Long> ogtApplicationId =
		createColumn(
			"ogtApplicationId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<OgtApplicationTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OgtApplicationTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OgtApplicationTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OgtApplicationTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtApplicationTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OgtApplicationTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OgtApplicationTable, String> entityId = createColumn(
		"entityId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtApplicationTable, String> doYouWant = createColumn(
		"doYouWant", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtApplicationTable, String> typeOfApplicant =
		createColumn(
			"typeOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtApplicationTable, String> natureOfApplicant =
		createColumn(
			"natureOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtApplicationTable, String> typeOfMatter =
		createColumn(
			"typeOfMatter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtApplicationTable, String> typeOfDebt = createColumn(
		"typeOfDebt", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtApplicationTable, String> debtStatute = createColumn(
		"debtStatute", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtApplicationTable, Integer> status = createColumn(
		"status", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<OgtApplicationTable, String> applicationNumber =
		createColumn(
			"applicationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtApplicationTable, String> expiredLicenseAppNumber =
		createColumn(
			"expiredLicenseAppNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtApplicationTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OgtApplicationTable, String> icmDocumentsPath =
		createColumn(
			"icmDocumentsPath", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtApplicationTable, Long> pdfFileEntryId =
		createColumn(
			"pdfFileEntryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OgtApplicationTable, String> appCurrentStageName =
		createColumn(
			"appCurrentStageName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtApplicationTable, String> registeredManufacturer =
		createColumn(
			"registeredManufacturer", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtApplicationTable, String> prospectingRightsNum =
		createColumn(
			"prospectingRightsNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OgtApplicationTable, String> typeOfBankruptcy =
		createColumn(
			"typeOfBankruptcy", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private OgtApplicationTable() {
		super("nbp_ogt_applications", OgtApplicationTable::new);
	}

}