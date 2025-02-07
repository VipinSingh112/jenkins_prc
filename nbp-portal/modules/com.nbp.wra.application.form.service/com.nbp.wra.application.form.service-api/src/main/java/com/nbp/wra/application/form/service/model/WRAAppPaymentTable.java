/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_wra_app_payment&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see WRAAppPayment
 * @generated
 */
public class WRAAppPaymentTable extends BaseTable<WRAAppPaymentTable> {

	public static final WRAAppPaymentTable INSTANCE = new WRAAppPaymentTable();

	public final Column<WRAAppPaymentTable, Long> wraAppPaymentId =
		createColumn(
			"wraAppPaymentId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<WRAAppPaymentTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<WRAAppPaymentTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<WRAAppPaymentTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<WRAAppPaymentTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WRAAppPaymentTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<WRAAppPaymentTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<WRAAppPaymentTable, String> paymentMethod =
		createColumn(
			"paymentMethod", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WRAAppPaymentTable, String> paymentDocId = createColumn(
		"paymentDocId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WRAAppPaymentTable, String> paymentStatus =
		createColumn(
			"paymentStatus", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WRAAppPaymentTable, String> paymentFee = createColumn(
		"paymentFee", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WRAAppPaymentTable, String> amountPaid = createColumn(
		"amountPaid", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WRAAppPaymentTable, String> amountCurrency =
		createColumn(
			"amountCurrency", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<WRAAppPaymentTable, String> transactionNumber =
		createColumn(
			"transactionNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<WRAAppPaymentTable, Long> wraApplicationId =
		createColumn(
			"wraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private WRAAppPaymentTable() {
		super("nbp_wra_app_payment", WRAAppPaymentTable::new);
	}

}