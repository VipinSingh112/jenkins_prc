/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_hsra_payment_confirm&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see HSRAPaymentConfirmation
 * @generated
 */
public class HSRAPaymentConfirmationTable
	extends BaseTable<HSRAPaymentConfirmationTable> {

	public static final HSRAPaymentConfirmationTable INSTANCE =
		new HSRAPaymentConfirmationTable();

	public final Column<HSRAPaymentConfirmationTable, Long> hsraPaymentId =
		createColumn(
			"hsraPaymentId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<HSRAPaymentConfirmationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HSRAPaymentConfirmationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HSRAPaymentConfirmationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HSRAPaymentConfirmationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HSRAPaymentConfirmationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HSRAPaymentConfirmationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HSRAPaymentConfirmationTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HSRAPaymentConfirmationTable, String> amountDue =
		createColumn(
			"amountDue", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HSRAPaymentConfirmationTable, Date> dateReceived =
		createColumn(
			"dateReceived", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HSRAPaymentConfirmationTable, String> amountreceived =
		createColumn(
			"amountreceived", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HSRAPaymentConfirmationTable, String> receivedNumber =
		createColumn(
			"receivedNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HSRAPaymentConfirmationTable, String> comments =
		createColumn(
			"comments", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HSRAPaymentConfirmationTable, String>
		amountOutstanding = createColumn(
			"amountOutstanding", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<HSRAPaymentConfirmationTable, Date> dueDate =
		createColumn(
			"dueDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HSRAPaymentConfirmationTable, String> status =
		createColumn(
			"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HSRAPaymentConfirmationTable, Long>
		paymentreceiptFileEntryId = createColumn(
			"paymentreceiptFileEntryId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private HSRAPaymentConfirmationTable() {
		super("nbp_hsra_payment_confirm", HSRAPaymentConfirmationTable::new);
	}

}