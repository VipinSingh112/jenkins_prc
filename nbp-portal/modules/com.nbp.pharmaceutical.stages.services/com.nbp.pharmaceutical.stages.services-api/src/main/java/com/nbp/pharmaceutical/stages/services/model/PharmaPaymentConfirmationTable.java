/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_pharma_payment_confirm&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaPaymentConfirmation
 * @generated
 */
public class PharmaPaymentConfirmationTable
	extends BaseTable<PharmaPaymentConfirmationTable> {

	public static final PharmaPaymentConfirmationTable INSTANCE =
		new PharmaPaymentConfirmationTable();

	public final Column<PharmaPaymentConfirmationTable, Long> pharmaPaymentId =
		createColumn(
			"pharmaPaymentId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<PharmaPaymentConfirmationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaPaymentConfirmationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaPaymentConfirmationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaPaymentConfirmationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaPaymentConfirmationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PharmaPaymentConfirmationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PharmaPaymentConfirmationTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaPaymentConfirmationTable, String> amountDue =
		createColumn(
			"amountDue", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaPaymentConfirmationTable, Date> dateReceived =
		createColumn(
			"dateReceived", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PharmaPaymentConfirmationTable, String> amountreceived =
		createColumn(
			"amountreceived", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaPaymentConfirmationTable, String> receivedNumber =
		createColumn(
			"receivedNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaPaymentConfirmationTable, String> comments =
		createColumn(
			"comments", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaPaymentConfirmationTable, String>
		amountOutstanding = createColumn(
			"amountOutstanding", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaPaymentConfirmationTable, Date> dueDate =
		createColumn(
			"dueDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PharmaPaymentConfirmationTable, String> status =
		createColumn(
			"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaPaymentConfirmationTable, Long>
		paymentreceiptFileEntryId = createColumn(
			"paymentreceiptFileEntryId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private PharmaPaymentConfirmationTable() {
		super(
			"nbp_pharma_payment_confirm", PharmaPaymentConfirmationTable::new);
	}

}