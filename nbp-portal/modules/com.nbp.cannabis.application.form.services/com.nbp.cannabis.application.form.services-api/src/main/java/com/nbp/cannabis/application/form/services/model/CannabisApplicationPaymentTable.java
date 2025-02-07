/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_cannabis_app_payment&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationPayment
 * @generated
 */
public class CannabisApplicationPaymentTable
	extends BaseTable<CannabisApplicationPaymentTable> {

	public static final CannabisApplicationPaymentTable INSTANCE =
		new CannabisApplicationPaymentTable();

	public final Column<CannabisApplicationPaymentTable, Long>
		cannabisApplicationPaymentId = createColumn(
			"cannabisApplicationPaymentId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CannabisApplicationPaymentTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationPaymentTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationPaymentTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationPaymentTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationPaymentTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationPaymentTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationPaymentTable, String> paymentMethod =
		createColumn(
			"paymentMethod", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationPaymentTable, String> paymentDocId =
		createColumn(
			"paymentDocId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationPaymentTable, String> paymentStatus =
		createColumn(
			"paymentStatus", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationPaymentTable, String> paymentFee =
		createColumn(
			"paymentFee", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationPaymentTable, String>
		transactionNumber = createColumn(
			"transactionNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationPaymentTable, Long>
		cannabisApplicationId = createColumn(
			"cannabisApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationPaymentTable, String>
		paymentReceiptNumber = createColumn(
			"paymentReceiptNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationPaymentTable, Long>
		paymentReceiptDocId = createColumn(
			"paymentReceiptDocId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationPaymentTable, String> amountPaid =
		createColumn(
			"amountPaid", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationPaymentTable, String>
		amountCurrency = createColumn(
			"amountCurrency", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisApplicationPaymentTable, Date> dateReceived =
		createColumn(
			"dateReceived", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private CannabisApplicationPaymentTable() {
		super("nbp_cannabis_app_payment", CannabisApplicationPaymentTable::new);
	}

}