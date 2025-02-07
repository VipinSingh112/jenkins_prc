/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_ncbj_app_payment&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjAppPayment
 * @generated
 */
public class NcbjAppPaymentTable extends BaseTable<NcbjAppPaymentTable> {

	public static final NcbjAppPaymentTable INSTANCE =
		new NcbjAppPaymentTable();

	public final Column<NcbjAppPaymentTable, Long> ncbjAppPaymentId =
		createColumn(
			"ncbjAppPaymentId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<NcbjAppPaymentTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjAppPaymentTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjAppPaymentTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjAppPaymentTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjAppPaymentTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjAppPaymentTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjAppPaymentTable, String> paymentMethod =
		createColumn(
			"paymentMethod", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjAppPaymentTable, String> paymentDocId =
		createColumn(
			"paymentDocId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjAppPaymentTable, String> paymentStatus =
		createColumn(
			"paymentStatus", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjAppPaymentTable, String> paymentFee = createColumn(
		"paymentFee", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjAppPaymentTable, String> amountPaid = createColumn(
		"amountPaid", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjAppPaymentTable, String> amountCurrency =
		createColumn(
			"amountCurrency", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjAppPaymentTable, String> transactionNumber =
		createColumn(
			"transactionNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjAppPaymentTable, Long> ncbjApplicationId =
		createColumn(
			"ncbjApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private NcbjAppPaymentTable() {
		super("nbp_ncbj_app_payment", NcbjAppPaymentTable::new);
	}

}