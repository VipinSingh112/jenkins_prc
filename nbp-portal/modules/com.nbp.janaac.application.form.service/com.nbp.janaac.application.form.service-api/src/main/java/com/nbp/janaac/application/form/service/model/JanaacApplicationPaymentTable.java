/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_janaac_appli_payment&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see JanaacApplicationPayment
 * @generated
 */
public class JanaacApplicationPaymentTable
	extends BaseTable<JanaacApplicationPaymentTable> {

	public static final JanaacApplicationPaymentTable INSTANCE =
		new JanaacApplicationPaymentTable();

	public final Column<JanaacApplicationPaymentTable, Long>
		janaacApplicationPaymentId = createColumn(
			"janaacApplicationPaymentId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<JanaacApplicationPaymentTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JanaacApplicationPaymentTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JanaacApplicationPaymentTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<JanaacApplicationPaymentTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JanaacApplicationPaymentTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JanaacApplicationPaymentTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<JanaacApplicationPaymentTable, String> paymentMethod =
		createColumn(
			"paymentMethod", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JanaacApplicationPaymentTable, String> paymentFee =
		createColumn(
			"paymentFee", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JanaacApplicationPaymentTable, String> amountPaid =
		createColumn(
			"amountPaid", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JanaacApplicationPaymentTable, String> amountCurrency =
		createColumn(
			"amountCurrency", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<JanaacApplicationPaymentTable, Long>
		janaacApplicationId = createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private JanaacApplicationPaymentTable() {
		super("nbp_janaac_appli_payment", JanaacApplicationPaymentTable::new);
	}

}