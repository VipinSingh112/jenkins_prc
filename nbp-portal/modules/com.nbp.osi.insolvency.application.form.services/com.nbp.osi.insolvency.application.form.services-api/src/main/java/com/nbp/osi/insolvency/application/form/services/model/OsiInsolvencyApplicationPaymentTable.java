/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_insolvecy_app_payment&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvencyApplicationPayment
 * @generated
 */
public class OsiInsolvencyApplicationPaymentTable
	extends BaseTable<OsiInsolvencyApplicationPaymentTable> {

	public static final OsiInsolvencyApplicationPaymentTable INSTANCE =
		new OsiInsolvencyApplicationPaymentTable();

	public final Column<OsiInsolvencyApplicationPaymentTable, Long>
		osiInsolveApplicationPaymentId = createColumn(
			"osiInsolveApplicationPaymentId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<OsiInsolvencyApplicationPaymentTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyApplicationPaymentTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyApplicationPaymentTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyApplicationPaymentTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyApplicationPaymentTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyApplicationPaymentTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyApplicationPaymentTable, String>
		paymentMethod = createColumn(
			"paymentMethod", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyApplicationPaymentTable, String>
		paymentDocId = createColumn(
			"paymentDocId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyApplicationPaymentTable, String>
		paymentStatus = createColumn(
			"paymentStatus", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyApplicationPaymentTable, String>
		paymentFee = createColumn(
			"paymentFee", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyApplicationPaymentTable, String>
		amountPaid = createColumn(
			"amountPaid", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyApplicationPaymentTable, String>
		amountCurrency = createColumn(
			"amountCurrency", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyApplicationPaymentTable, String>
		transactionNumber = createColumn(
			"transactionNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiInsolvencyApplicationPaymentTable, Long>
		osiInsolvencyId = createColumn(
			"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private OsiInsolvencyApplicationPaymentTable() {
		super(
			"nbp_osi_insolvecy_app_payment",
			OsiInsolvencyApplicationPaymentTable::new);
	}

}