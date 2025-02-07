/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_inso_payment_con&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvencyPaymentConfirmation
 * @generated
 */
public class OsiInsolvencyPaymentConfirmationTable
	extends BaseTable<OsiInsolvencyPaymentConfirmationTable> {

	public static final OsiInsolvencyPaymentConfirmationTable INSTANCE =
		new OsiInsolvencyPaymentConfirmationTable();

	public final Column<OsiInsolvencyPaymentConfirmationTable, Long>
		osiIRPaymentId = createColumn(
			"osiIRPaymentId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<OsiInsolvencyPaymentConfirmationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyPaymentConfirmationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyPaymentConfirmationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyPaymentConfirmationTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyPaymentConfirmationTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyPaymentConfirmationTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyPaymentConfirmationTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyPaymentConfirmationTable, Date>
		dateReceived = createColumn(
			"dateReceived", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyPaymentConfirmationTable, String>
		amountReceived = createColumn(
			"amountReceived", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyPaymentConfirmationTable, String>
		amountDue = createColumn(
			"amountDue", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyPaymentConfirmationTable, String>
		receiptNumber = createColumn(
			"receiptNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyPaymentConfirmationTable, String> comment =
		createColumn(
			"comment_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyPaymentConfirmationTable, String>
		amountOutstanding = createColumn(
			"amountOutstanding", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyPaymentConfirmationTable, Date> dueDate =
		createColumn(
			"dueDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyPaymentConfirmationTable, String> status =
		createColumn(
			"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyPaymentConfirmationTable, Long>
		docFileEntry = createColumn(
			"docFileEntry", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private OsiInsolvencyPaymentConfirmationTable() {
		super(
			"nbp_osi_inso_payment_con",
			OsiInsolvencyPaymentConfirmationTable::new);
	}

}