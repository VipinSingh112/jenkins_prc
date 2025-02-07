/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_fire_payment_confirmation&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadePaymentConfirmation
 * @generated
 */
public class FireBrigadePaymentConfirmationTable
	extends BaseTable<FireBrigadePaymentConfirmationTable> {

	public static final FireBrigadePaymentConfirmationTable INSTANCE =
		new FireBrigadePaymentConfirmationTable();

	public final Column<FireBrigadePaymentConfirmationTable, Long>
		fireBrigadePaymentConfirId = createColumn(
			"fireBrigadePaymentConfirId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FireBrigadePaymentConfirmationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FireBrigadePaymentConfirmationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FireBrigadePaymentConfirmationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FireBrigadePaymentConfirmationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadePaymentConfirmationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FireBrigadePaymentConfirmationTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FireBrigadePaymentConfirmationTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadePaymentConfirmationTable, Date>
		dateReceived = createColumn(
			"dateReceived", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FireBrigadePaymentConfirmationTable, String> amountDue =
		createColumn(
			"amountDue", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadePaymentConfirmationTable, String>
		amountReceived = createColumn(
			"amountReceived", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadePaymentConfirmationTable, String>
		receiptNumber = createColumn(
			"receiptNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadePaymentConfirmationTable, String> comment =
		createColumn(
			"comment_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadePaymentConfirmationTable, String>
		amountOutstanding = createColumn(
			"amountOutstanding", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FireBrigadePaymentConfirmationTable, Date> dueDate =
		createColumn(
			"dueDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FireBrigadePaymentConfirmationTable, String> status =
		createColumn(
			"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FireBrigadePaymentConfirmationTable, Long>
		docFileEntry = createColumn(
			"docFileEntry", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private FireBrigadePaymentConfirmationTable() {
		super(
			"nbp_fire_payment_confirmation",
			FireBrigadePaymentConfirmationTable::new);
	}

}