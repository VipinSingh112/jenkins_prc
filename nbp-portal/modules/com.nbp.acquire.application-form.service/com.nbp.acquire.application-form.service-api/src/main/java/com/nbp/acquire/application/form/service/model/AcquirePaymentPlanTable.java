/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_acquire_payment_plan&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AcquirePaymentPlan
 * @generated
 */
public class AcquirePaymentPlanTable
	extends BaseTable<AcquirePaymentPlanTable> {

	public static final AcquirePaymentPlanTable INSTANCE =
		new AcquirePaymentPlanTable();

	public final Column<AcquirePaymentPlanTable, Long> acquirePaymentPlanId =
		createColumn(
			"acquirePaymentPlanId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AcquirePaymentPlanTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquirePaymentPlanTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquirePaymentPlanTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquirePaymentPlanTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquirePaymentPlanTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquirePaymentPlanTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquirePaymentPlanTable, String> paymentMethod =
		createColumn(
			"paymentMethod", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquirePaymentPlanTable, String> amountPaid =
		createColumn(
			"amountPaid", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquirePaymentPlanTable, String>
		paymentCurrencySelected = createColumn(
			"paymentCurrencySelected", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquirePaymentPlanTable, String> paymentMethodOther =
		createColumn(
			"paymentMethodOther", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquirePaymentPlanTable, String> paymentDocId =
		createColumn(
			"paymentDocId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquirePaymentPlanTable, Long> acquireApplicationId =
		createColumn(
			"acquireApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AcquirePaymentPlanTable() {
		super("nbp_acquire_payment_plan", AcquirePaymentPlanTable::new);
	}

}