/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_explosive_payment&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveAppPayment
 * @generated
 */
public class ExplosiveAppPaymentTable
	extends BaseTable<ExplosiveAppPaymentTable> {

	public static final ExplosiveAppPaymentTable INSTANCE =
		new ExplosiveAppPaymentTable();

	public final Column<ExplosiveAppPaymentTable, Long> explosiveAppPaymentId =
		createColumn(
			"explosiveAppPaymentId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<ExplosiveAppPaymentTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ExplosiveAppPaymentTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ExplosiveAppPaymentTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ExplosiveAppPaymentTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ExplosiveAppPaymentTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ExplosiveAppPaymentTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ExplosiveAppPaymentTable, String> paymentMethod =
		createColumn(
			"paymentMethod", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ExplosiveAppPaymentTable, String> paymentDocId =
		createColumn(
			"paymentDocId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ExplosiveAppPaymentTable, String> paymentStatus =
		createColumn(
			"paymentStatus", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ExplosiveAppPaymentTable, String> paymentFee =
		createColumn(
			"paymentFee", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ExplosiveAppPaymentTable, String> amountPaid =
		createColumn(
			"amountPaid", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ExplosiveAppPaymentTable, String> amountCurrency =
		createColumn(
			"amountCurrency", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ExplosiveAppPaymentTable, String> transactionNumber =
		createColumn(
			"transactionNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ExplosiveAppPaymentTable, Long>
		explosivesApplicationId = createColumn(
			"explosivesApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private ExplosiveAppPaymentTable() {
		super("nbp_explosive_payment", ExplosiveAppPaymentTable::new);
	}

}