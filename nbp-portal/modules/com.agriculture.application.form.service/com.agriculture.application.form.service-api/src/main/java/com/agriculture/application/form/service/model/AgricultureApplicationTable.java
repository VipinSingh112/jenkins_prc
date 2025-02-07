/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;agriculture_application&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureApplication
 * @generated
 */
public class AgricultureApplicationTable
	extends BaseTable<AgricultureApplicationTable> {

	public static final AgricultureApplicationTable INSTANCE =
		new AgricultureApplicationTable();

	public final Column<AgricultureApplicationTable, Long>
		agricultureApplicationId = createColumn(
			"agricultureApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AgricultureApplicationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultureApplicationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultureApplicationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultureApplicationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureApplicationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgricultureApplicationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AgricultureApplicationTable, String> entityId =
		createColumn(
			"entityId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureApplicationTable, String>
		registrationStatus = createColumn(
			"registrationStatus", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureApplicationTable, String> farmLicenseNumber =
		createColumn(
			"farmLicenseNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureApplicationTable, String> requestType =
		createColumn(
			"requestType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureApplicationTable, String> primaryProduct =
		createColumn(
			"primaryProduct", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureApplicationTable, Integer> status =
		createColumn(
			"status", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<AgricultureApplicationTable, String> applicationNumber =
		createColumn(
			"applicationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureApplicationTable, String>
		expiredLicenseAppNo = createColumn(
			"expiredLicenseAppNo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureApplicationTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AgricultureApplicationTable, String> icmDocumentsPath =
		createColumn(
			"icmDocumentsPath", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AgricultureApplicationTable, Long> pdfFileEntryId =
		createColumn(
			"pdfFileEntryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AgricultureApplicationTable, String>
		appCurrentStageName = createColumn(
			"appCurrentStageName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private AgricultureApplicationTable() {
		super("agriculture_application", AgricultureApplicationTable::new);
	}

}