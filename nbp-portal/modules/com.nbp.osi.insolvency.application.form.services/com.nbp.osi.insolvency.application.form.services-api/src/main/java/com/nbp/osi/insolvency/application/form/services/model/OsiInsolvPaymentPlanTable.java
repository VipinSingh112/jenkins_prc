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
 * The table class for the &quot;nbp_osi_insolv_payment&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvPaymentPlan
 * @generated
 */
public class OsiInsolvPaymentPlanTable
	extends BaseTable<OsiInsolvPaymentPlanTable> {

	public static final OsiInsolvPaymentPlanTable INSTANCE =
		new OsiInsolvPaymentPlanTable();

	public final Column<OsiInsolvPaymentPlanTable, Long>
		osiInsolvPaymentPlanId = createColumn(
			"osiInsolvPaymentPlanId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<OsiInsolvPaymentPlanTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvPaymentPlanTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvPaymentPlanTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvPaymentPlanTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvPaymentPlanTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvPaymentPlanTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvPaymentPlanTable, String> paymentMethod =
		createColumn(
			"paymentMethod", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvPaymentPlanTable, String> amountPaid =
		createColumn(
			"amountPaid", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvPaymentPlanTable, String>
		paymentCurrencySelected = createColumn(
			"paymentCurrencySelected", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiInsolvPaymentPlanTable, String> paymentMethodOther =
		createColumn(
			"paymentMethodOther", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiInsolvPaymentPlanTable, String> paymentDocId =
		createColumn(
			"paymentDocId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiInsolvPaymentPlanTable, Long> osiInsolvencyId =
		createColumn(
			"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private OsiInsolvPaymentPlanTable() {
		super("nbp_osi_insolv_payment", OsiInsolvPaymentPlanTable::new);
	}

}