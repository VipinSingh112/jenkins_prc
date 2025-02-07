/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_hsra_application&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see HsraApplication
 * @generated
 */
public class HsraApplicationTable extends BaseTable<HsraApplicationTable> {

	public static final HsraApplicationTable INSTANCE =
		new HsraApplicationTable();

	public final Column<HsraApplicationTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HsraApplicationTable, Long> hsraApplicationId =
		createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<HsraApplicationTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HsraApplicationTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HsraApplicationTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HsraApplicationTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HsraApplicationTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HsraApplicationTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HsraApplicationTable, String> typeOfApplicant =
		createColumn(
			"typeOfApplicant", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<HsraApplicationTable, String> typeOfActivities =
		createColumn(
			"typeOfActivities", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<HsraApplicationTable, String> categoryOfSources =
		createColumn(
			"categoryOfSources", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<HsraApplicationTable, String> highOne = createColumn(
		"highOne", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HsraApplicationTable, String> highTwo = createColumn(
		"highTwo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HsraApplicationTable, String> medium = createColumn(
		"medium", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HsraApplicationTable, String> lowOne = createColumn(
		"lowOne", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HsraApplicationTable, String> lowTwo = createColumn(
		"lowTwo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HsraApplicationTable, String> typeOfTransaction =
		createColumn(
			"typeOfTransaction", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<HsraApplicationTable, String> riskLevel = createColumn(
		"riskLevel", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HsraApplicationTable, String> typeOfApplication =
		createColumn(
			"typeOfApplication", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<HsraApplicationTable, String> brokerTransactionType =
		createColumn(
			"brokerTransactionType", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<HsraApplicationTable, String> specificApplicable =
		createColumn(
			"specificApplicable", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<HsraApplicationTable, Integer> status = createColumn(
		"status", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<HsraApplicationTable, String> applicationNumber =
		createColumn(
			"applicationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<HsraApplicationTable, String> expiredLicenseAppNumber =
		createColumn(
			"expiredLicenseAppNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<HsraApplicationTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HsraApplicationTable, String> icmDocumentsPath =
		createColumn(
			"icmDocumentsPath", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<HsraApplicationTable, String> entityId = createColumn(
		"entityId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HsraApplicationTable, Long> pdfFileEntryId =
		createColumn(
			"pdfFileEntryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HsraApplicationTable, String> appCurrentStageName =
		createColumn(
			"appCurrentStageName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<HsraApplicationTable, String> qualifiedArea =
		createColumn(
			"qualifiedArea", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HsraApplicationTable, Date> expiredDate = createColumn(
		"expiredDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private HsraApplicationTable() {
		super("nbp_hsra_application", HsraApplicationTable::new);
	}

}