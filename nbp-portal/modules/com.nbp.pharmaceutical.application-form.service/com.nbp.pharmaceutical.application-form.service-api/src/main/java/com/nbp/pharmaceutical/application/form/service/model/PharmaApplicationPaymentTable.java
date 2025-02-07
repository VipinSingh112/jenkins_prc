/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_pharma_app_payment&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationPayment
 * @generated
 */
public class PharmaApplicationPaymentTable
	extends BaseTable<PharmaApplicationPaymentTable> {

	public static final PharmaApplicationPaymentTable INSTANCE =
		new PharmaApplicationPaymentTable();

	public final Column<PharmaApplicationPaymentTable, Long>
		pharmaApplicationPaymentId = createColumn(
			"pharmaApplicationPaymentId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<PharmaApplicationPaymentTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationPaymentTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationPaymentTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationPaymentTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationPaymentTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationPaymentTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationPaymentTable, String> paymentMethod =
		createColumn(
			"paymentMethod", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationPaymentTable, String> paymentDocId =
		createColumn(
			"paymentDocId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationPaymentTable, String> paymentStatus =
		createColumn(
			"paymentStatus", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationPaymentTable, String> paymentFee =
		createColumn(
			"paymentFee", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationPaymentTable, String> amountPaid =
		createColumn(
			"amountPaid", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationPaymentTable, String> amountCurrency =
		createColumn(
			"amountCurrency", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationPaymentTable, String>
		transactionNumber = createColumn(
			"transactionNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationPaymentTable, Long>
		pharmaApplicationId = createColumn(
			"pharmaApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private PharmaApplicationPaymentTable() {
		super("nbp_pharma_app_payment", PharmaApplicationPaymentTable::new);
	}

}