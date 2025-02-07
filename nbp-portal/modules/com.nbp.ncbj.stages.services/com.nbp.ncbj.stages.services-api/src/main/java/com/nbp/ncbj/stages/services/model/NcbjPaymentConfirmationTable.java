/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_ncbj_payment_confirm&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjPaymentConfirmation
 * @generated
 */
public class NcbjPaymentConfirmationTable
	extends BaseTable<NcbjPaymentConfirmationTable> {

	public static final NcbjPaymentConfirmationTable INSTANCE =
		new NcbjPaymentConfirmationTable();

	public final Column<NcbjPaymentConfirmationTable, Long>
		ncbjPaymentConfirmationId = createColumn(
			"ncbjPaymentConfirmationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<NcbjPaymentConfirmationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjPaymentConfirmationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjPaymentConfirmationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjPaymentConfirmationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjPaymentConfirmationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjPaymentConfirmationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjPaymentConfirmationTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjPaymentConfirmationTable, Date> dateReceived =
		createColumn(
			"dateReceived", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjPaymentConfirmationTable, String> amountReceived =
		createColumn(
			"amountReceived", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjPaymentConfirmationTable, String> amountDue =
		createColumn(
			"amountDue", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjPaymentConfirmationTable, String> receiptNumber =
		createColumn(
			"receiptNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjPaymentConfirmationTable, String> comment =
		createColumn(
			"comment_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjPaymentConfirmationTable, String>
		amountOutstanding = createColumn(
			"amountOutstanding", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjPaymentConfirmationTable, Date> dueDate =
		createColumn(
			"dueDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjPaymentConfirmationTable, String> status =
		createColumn(
			"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjPaymentConfirmationTable, Long> docFileEntry =
		createColumn(
			"docFileEntry", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private NcbjPaymentConfirmationTable() {
		super("nbp_ncbj_payment_confirm", NcbjPaymentConfirmationTable::new);
	}

}