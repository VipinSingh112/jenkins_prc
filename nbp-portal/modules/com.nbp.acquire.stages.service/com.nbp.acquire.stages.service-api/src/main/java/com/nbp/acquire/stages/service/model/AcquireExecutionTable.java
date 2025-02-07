/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_acquie_execution&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireExecution
 * @generated
 */
public class AcquireExecutionTable extends BaseTable<AcquireExecutionTable> {

	public static final AcquireExecutionTable INSTANCE =
		new AcquireExecutionTable();

	public final Column<AcquireExecutionTable, Long> acquireExecutionId =
		createColumn(
			"acquireExecutionId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AcquireExecutionTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireExecutionTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireExecutionTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireExecutionTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireExecutionTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquireExecutionTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquireExecutionTable, String> caseId = createColumn(
		"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireExecutionTable, String> paymentSection =
		createColumn(
			"paymentSection", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireExecutionTable, String> paymentAmountDue =
		createColumn(
			"paymentAmountDue", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireExecutionTable, String> contractSection =
		createColumn(
			"contractSection", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireExecutionTable, Date> dateContractExecuted =
		createColumn(
			"dateContractExecuted", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AcquireExecutionTable, Long> docFileEntryId =
		createColumn(
			"docFileEntryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AcquireExecutionTable() {
		super("nbp_acquie_execution", AcquireExecutionTable::new);
	}

}