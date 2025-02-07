/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_quarry_payment_confirm&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryPaymentConfirmation
 * @generated
 */
public class QuarryPaymentConfirmationTable
	extends BaseTable<QuarryPaymentConfirmationTable> {

	public static final QuarryPaymentConfirmationTable INSTANCE =
		new QuarryPaymentConfirmationTable();

	public final Column<QuarryPaymentConfirmationTable, Long>
		quarryPaymentConfirmationId = createColumn(
			"quarryPaymentConfirmationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<QuarryPaymentConfirmationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryPaymentConfirmationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryPaymentConfirmationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryPaymentConfirmationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryPaymentConfirmationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QuarryPaymentConfirmationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QuarryPaymentConfirmationTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryPaymentConfirmationTable, Date> dateReceived =
		createColumn(
			"dateReceived", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QuarryPaymentConfirmationTable, String> amountReceived =
		createColumn(
			"amountReceived", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryPaymentConfirmationTable, String> amountDue =
		createColumn(
			"amountDue", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryPaymentConfirmationTable, String> receiptNumber =
		createColumn(
			"receiptNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryPaymentConfirmationTable, String> comment =
		createColumn(
			"comment_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryPaymentConfirmationTable, String>
		amountOutstanding = createColumn(
			"amountOutstanding", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryPaymentConfirmationTable, Date> dueDate =
		createColumn(
			"dueDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QuarryPaymentConfirmationTable, String> status =
		createColumn(
			"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryPaymentConfirmationTable, Long> docFileEntry =
		createColumn(
			"docFileEntry", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private QuarryPaymentConfirmationTable() {
		super(
			"nbp_quarry_payment_confirm", QuarryPaymentConfirmationTable::new);
	}

}