/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_cannabis_license_payment&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisLicensePayment
 * @generated
 */
public class CannabisLicensePaymentTable
	extends BaseTable<CannabisLicensePaymentTable> {

	public static final CannabisLicensePaymentTable INSTANCE =
		new CannabisLicensePaymentTable();

	public final Column<CannabisLicensePaymentTable, Long>
		cannabisLicensePaymentId = createColumn(
			"cannabisLicensePaymentId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CannabisLicensePaymentTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisLicensePaymentTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisLicensePaymentTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisLicensePaymentTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisLicensePaymentTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisLicensePaymentTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisLicensePaymentTable, String> bondAmtDue =
		createColumn(
			"bondAmtDue", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisLicensePaymentTable, String> licenseFeeDue =
		createColumn(
			"licenseFeeDue", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisLicensePaymentTable, String> feeIssuanceDue =
		createColumn(
			"feeIssuanceDue", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisLicensePaymentTable, String> feeOption =
		createColumn(
			"feeOption", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisLicensePaymentTable, String>
		deferredPaymentType = createColumn(
			"deferredPaymentType", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisLicensePaymentTable, Date> feePaymentdDate =
		createColumn(
			"feePaymentdDate", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<CannabisLicensePaymentTable, String> paymentOption =
		createColumn(
			"paymentOption", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisLicensePaymentTable, String>
		paymentAmtRecieved = createColumn(
			"paymentAmtRecieved", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisLicensePaymentTable, String> paymentStatus =
		createColumn(
			"paymentStatus", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisLicensePaymentTable, String> updatedBySource =
		createColumn(
			"updatedBySource", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<CannabisLicensePaymentTable, String> status =
		createColumn(
			"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisLicensePaymentTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisLicensePaymentTable, String> amountCurrency =
		createColumn(
			"amountCurrency", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisLicensePaymentTable, Long>
		cannabisApplicationId = createColumn(
			"cannabisApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private CannabisLicensePaymentTable() {
		super("nbp_cannabis_license_payment", CannabisLicensePaymentTable::new);
	}

}