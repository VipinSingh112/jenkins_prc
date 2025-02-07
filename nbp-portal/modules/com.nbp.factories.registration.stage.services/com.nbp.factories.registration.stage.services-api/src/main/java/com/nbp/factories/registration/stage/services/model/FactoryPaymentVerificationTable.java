/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_factory_payment_confirm&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FactoryPaymentVerification
 * @generated
 */
public class FactoryPaymentVerificationTable
	extends BaseTable<FactoryPaymentVerificationTable> {

	public static final FactoryPaymentVerificationTable INSTANCE =
		new FactoryPaymentVerificationTable();

	public final Column<FactoryPaymentVerificationTable, Long>
		factoryPaymentVerificationId = createColumn(
			"factoryPaymentVerificationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FactoryPaymentVerificationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FactoryPaymentVerificationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FactoryPaymentVerificationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FactoryPaymentVerificationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FactoryPaymentVerificationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FactoryPaymentVerificationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FactoryPaymentVerificationTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FactoryPaymentVerificationTable, Date> dateReceived =
		createColumn(
			"dateReceived", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FactoryPaymentVerificationTable, String>
		amountReceived = createColumn(
			"amountReceived", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FactoryPaymentVerificationTable, String> amountDue =
		createColumn(
			"amountDue", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FactoryPaymentVerificationTable, String> receiptNumber =
		createColumn(
			"receiptNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FactoryPaymentVerificationTable, String> comment =
		createColumn(
			"comment_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FactoryPaymentVerificationTable, String>
		amountOutstanding = createColumn(
			"amountOutstanding", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoryPaymentVerificationTable, Date> dueDate =
		createColumn(
			"dueDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FactoryPaymentVerificationTable, String> status =
		createColumn(
			"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FactoryPaymentVerificationTable, Long> docFileEntry =
		createColumn(
			"docFileEntry", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private FactoryPaymentVerificationTable() {
		super(
			"nbp_factory_payment_confirm",
			FactoryPaymentVerificationTable::new);
	}

}