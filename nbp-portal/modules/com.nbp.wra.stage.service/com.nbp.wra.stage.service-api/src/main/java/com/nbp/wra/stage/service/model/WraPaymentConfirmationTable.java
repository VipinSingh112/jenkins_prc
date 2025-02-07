/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_wra_payment_confirm&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see WraPaymentConfirmation
 * @generated
 */
public class WraPaymentConfirmationTable
	extends BaseTable<WraPaymentConfirmationTable> {

	public static final WraPaymentConfirmationTable INSTANCE =
		new WraPaymentConfirmationTable();

	public final Column<WraPaymentConfirmationTable, Long>
		wraPaymentConfirmationId = createColumn(
			"wraPaymentConfirmationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<WraPaymentConfirmationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<WraPaymentConfirmationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<WraPaymentConfirmationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<WraPaymentConfirmationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WraPaymentConfirmationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<WraPaymentConfirmationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<WraPaymentConfirmationTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WraPaymentConfirmationTable, Date> dateReceived =
		createColumn(
			"dateReceived", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<WraPaymentConfirmationTable, String> amountReceived =
		createColumn(
			"amountReceived", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WraPaymentConfirmationTable, String> amountDue =
		createColumn(
			"amountDue", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WraPaymentConfirmationTable, String> receiptNumber =
		createColumn(
			"receiptNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WraPaymentConfirmationTable, String> comment =
		createColumn(
			"comment_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WraPaymentConfirmationTable, String> amountOutstanding =
		createColumn(
			"amountOutstanding", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<WraPaymentConfirmationTable, Date> dueDate =
		createColumn(
			"dueDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<WraPaymentConfirmationTable, String> status =
		createColumn(
			"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WraPaymentConfirmationTable, Long> docFileEntry =
		createColumn(
			"docFileEntry", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private WraPaymentConfirmationTable() {
		super("nbp_wra_payment_confirm", WraPaymentConfirmationTable::new);
	}

}