/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_acquire_application&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireApplication
 * @generated
 */
public class AcquireApplicationTable
	extends BaseTable<AcquireApplicationTable> {

	public static final AcquireApplicationTable INSTANCE =
		new AcquireApplicationTable();

	public final Column<AcquireApplicationTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireApplicationTable, Long> acquireApplicationId =
		createColumn(
			"acquireApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AcquireApplicationTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireApplicationTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireApplicationTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireApplicationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireApplicationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquireApplicationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquireApplicationTable, String> entityId =
		createColumn(
			"entityId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireApplicationTable, Integer> status = createColumn(
		"status", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<AcquireApplicationTable, String> applicationNumber =
		createColumn(
			"applicationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireApplicationTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireApplicationTable, String> icmDocumentPath =
		createColumn(
			"icmDocumentPath", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireApplicationTable, String> divestmentOptions =
		createColumn(
			"divestmentOptions", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireApplicationTable, String> tenureType =
		createColumn(
			"tenureType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireApplicationTable, String> currentUse =
		createColumn(
			"currentUse", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireApplicationTable, Long> pdfFileEntryId =
		createColumn(
			"pdfFileEntryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireApplicationTable, String> appCurrentStageName =
		createColumn(
			"appCurrentStageName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private AcquireApplicationTable() {
		super("nbp_acquire_application", AcquireApplicationTable::new);
	}

}