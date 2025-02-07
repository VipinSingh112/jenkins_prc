/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_services_fee_payment&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesAppPayment
 * @generated
 */
public class OsiServicesAppPaymentTable
	extends BaseTable<OsiServicesAppPaymentTable> {

	public static final OsiServicesAppPaymentTable INSTANCE =
		new OsiServicesAppPaymentTable();

	public final Column<OsiServicesAppPaymentTable, Long>
		osiServicesAppPaymentId = createColumn(
			"osiServicesAppPaymentId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<OsiServicesAppPaymentTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiServicesAppPaymentTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiServicesAppPaymentTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiServicesAppPaymentTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesAppPaymentTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiServicesAppPaymentTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiServicesAppPaymentTable, String> paymentMethod =
		createColumn(
			"paymentMethod", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesAppPaymentTable, String> paymentFee =
		createColumn(
			"paymentFee", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesAppPaymentTable, String> amountPaid =
		createColumn(
			"amountPaid", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesAppPaymentTable, String> amountCurrency =
		createColumn(
			"amountCurrency", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesAppPaymentTable, Long>
		osiServicesApplicationId = createColumn(
			"osiServicesApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private OsiServicesAppPaymentTable() {
		super("nbp_osi_services_fee_payment", OsiServicesAppPaymentTable::new);
	}

}