/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_sez_payment_confirm&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusPaymentConfirmation
 * @generated
 */
public class SezStatusPaymentConfirmationTable
	extends BaseTable<SezStatusPaymentConfirmationTable> {

	public static final SezStatusPaymentConfirmationTable INSTANCE =
		new SezStatusPaymentConfirmationTable();

	public final Column<SezStatusPaymentConfirmationTable, Long> sezPaymentId =
		createColumn(
			"sezPaymentId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<SezStatusPaymentConfirmationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusPaymentConfirmationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusPaymentConfirmationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezStatusPaymentConfirmationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusPaymentConfirmationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezStatusPaymentConfirmationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezStatusPaymentConfirmationTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusPaymentConfirmationTable, String> amountDue =
		createColumn(
			"amountDue", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusPaymentConfirmationTable, Date> dateReceived =
		createColumn(
			"dateReceived", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezStatusPaymentConfirmationTable, String>
		amountreceived = createColumn(
			"amountreceived", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusPaymentConfirmationTable, String>
		receivedNumber = createColumn(
			"receivedNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusPaymentConfirmationTable, String> comments =
		createColumn(
			"comments", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusPaymentConfirmationTable, String>
		amountOutstanding = createColumn(
			"amountOutstanding", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezStatusPaymentConfirmationTable, Date> dueDate =
		createColumn(
			"dueDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezStatusPaymentConfirmationTable, String> status =
		createColumn(
			"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezStatusPaymentConfirmationTable, Long>
		paymentreceiptFileEntryId = createColumn(
			"paymentreceiptFileEntryId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezStatusPaymentConfirmationTable() {
		super(
			"nbp_sez_payment_confirm", SezStatusPaymentConfirmationTable::new);
	}

}