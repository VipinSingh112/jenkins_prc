/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_tourism_app_payment&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TourismApplicationPayment
 * @generated
 */
public class TourismApplicationPaymentTable
	extends BaseTable<TourismApplicationPaymentTable> {

	public static final TourismApplicationPaymentTable INSTANCE =
		new TourismApplicationPaymentTable();

	public final Column<TourismApplicationPaymentTable, Long>
		TourismApplicationPaymentId = createColumn(
			"TourismApplicationPaymentId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<TourismApplicationPaymentTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationPaymentTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationPaymentTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationPaymentTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationPaymentTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationPaymentTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationPaymentTable, String> paymentMethod =
		createColumn(
			"paymentMethod", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationPaymentTable, String> paymentDocId =
		createColumn(
			"paymentDocId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationPaymentTable, String> paymentStatus =
		createColumn(
			"paymentStatus", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationPaymentTable, String> paymentFee =
		createColumn(
			"paymentFee", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationPaymentTable, String> amountPaid =
		createColumn(
			"amountPaid", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationPaymentTable, String> amountCurrency =
		createColumn(
			"amountCurrency", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<TourismApplicationPaymentTable, String>
		transactionNumber = createColumn(
			"transactionNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TourismApplicationPaymentTable, Long>
		tourismApplicationId = createColumn(
			"tourismApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private TourismApplicationPaymentTable() {
		super("nbp_tourism_app_payment", TourismApplicationPaymentTable::new);
	}

}