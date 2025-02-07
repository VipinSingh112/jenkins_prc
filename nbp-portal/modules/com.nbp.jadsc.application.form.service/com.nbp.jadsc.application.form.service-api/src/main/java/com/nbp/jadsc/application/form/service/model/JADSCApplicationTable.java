/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_jadsc_application&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCApplication
 * @generated
 */
public class JADSCApplicationTable extends BaseTable<JADSCApplicationTable> {

	public static final JADSCApplicationTable INSTANCE =
		new JADSCApplicationTable();

	public final Column<JADSCApplicationTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCApplicationTable, Long> jadscApplicationId =
		createColumn(
			"jadscApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<JADSCApplicationTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JADSCApplicationTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JADSCApplicationTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JADSCApplicationTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCApplicationTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JADSCApplicationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JADSCApplicationTable, String> entityId = createColumn(
		"entityId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCApplicationTable, String> typeOfApplication =
		createColumn(
			"typeOfApplication", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCApplicationTable, String> typeOfComplaint =
		createColumn(
			"typeOfComplaint", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCApplicationTable, String> typeOfTransaction =
		createColumn(
			"typeOfTransaction", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCApplicationTable, String> transactionNumber =
		createColumn(
			"transactionNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCApplicationTable, String> typeOfApplicant =
		createColumn(
			"typeOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCApplicationTable, String> industriesImpacted =
		createColumn(
			"industriesImpacted", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCApplicationTable, String> breachOfConfidentiality =
		createColumn(
			"breachOfConfidentiality", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCApplicationTable, String>
		categoriesOfConfidentialInfo = createColumn(
			"categoriesOfConfidentialInfo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCApplicationTable, String>
		categoriesOfConfiOtherPlease = createColumn(
			"categoriesOfConfiOtherPlease", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCApplicationTable, String>
		reasonForConfidentialStatus = createColumn(
			"reasonForConfidentialStatus", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCApplicationTable, String> nonConfidentialSummary =
		createColumn(
			"nonConfidentialSummary", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCApplicationTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JADSCApplicationTable, Integer> status = createColumn(
		"status", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<JADSCApplicationTable, String> icmDocumentPath =
		createColumn(
			"icmDocumentPath", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCApplicationTable, String> applicationNumber =
		createColumn(
			"applicationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCApplicationTable, String> expiredLicenseAppNumber =
		createColumn(
			"expiredLicenseAppNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<JADSCApplicationTable, Long> pdfFileEntryId =
		createColumn(
			"pdfFileEntryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JADSCApplicationTable, String> appCurrentStageName =
		createColumn(
			"appCurrentStageName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private JADSCApplicationTable() {
		super("nbp_jadsc_application", JADSCApplicationTable::new);
	}

}