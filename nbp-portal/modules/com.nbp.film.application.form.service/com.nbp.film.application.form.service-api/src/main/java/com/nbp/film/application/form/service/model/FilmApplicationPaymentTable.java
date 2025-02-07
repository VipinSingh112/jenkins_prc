/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_film_application_payment&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FilmApplicationPayment
 * @generated
 */
public class FilmApplicationPaymentTable
	extends BaseTable<FilmApplicationPaymentTable> {

	public static final FilmApplicationPaymentTable INSTANCE =
		new FilmApplicationPaymentTable();

	public final Column<FilmApplicationPaymentTable, Long>
		filmApplicationPaymentId = createColumn(
			"filmApplicationPaymentId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FilmApplicationPaymentTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationPaymentTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationPaymentTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationPaymentTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationPaymentTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationPaymentTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationPaymentTable, String> paymentMethod =
		createColumn(
			"paymentMethod", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationPaymentTable, String> paymentDocId =
		createColumn(
			"paymentDocId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationPaymentTable, String> paymentStatus =
		createColumn(
			"paymentStatus", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationPaymentTable, String> paymentFee =
		createColumn(
			"paymentFee", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationPaymentTable, String> amountPaid =
		createColumn(
			"amountPaid", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationPaymentTable, String> amountCurrency =
		createColumn(
			"amountCurrency", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FilmApplicationPaymentTable, String> transactionNumber =
		createColumn(
			"transactionNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FilmApplicationPaymentTable, Long> filmApplicationId =
		createColumn(
			"filmApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private FilmApplicationPaymentTable() {
		super("nbp_film_application_payment", FilmApplicationPaymentTable::new);
	}

}