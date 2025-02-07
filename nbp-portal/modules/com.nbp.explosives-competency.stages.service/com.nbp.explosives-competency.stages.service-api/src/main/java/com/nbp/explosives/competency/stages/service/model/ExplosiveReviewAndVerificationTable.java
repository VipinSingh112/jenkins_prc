/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_explosive_rev_ver&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveReviewAndVerification
 * @generated
 */
public class ExplosiveReviewAndVerificationTable
	extends BaseTable<ExplosiveReviewAndVerificationTable> {

	public static final ExplosiveReviewAndVerificationTable INSTANCE =
		new ExplosiveReviewAndVerificationTable();

	public final Column<ExplosiveReviewAndVerificationTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ExplosiveReviewAndVerificationTable, Long> issuanceId =
		createColumn(
			"issuanceId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<ExplosiveReviewAndVerificationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ExplosiveReviewAndVerificationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ExplosiveReviewAndVerificationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ExplosiveReviewAndVerificationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ExplosiveReviewAndVerificationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ExplosiveReviewAndVerificationTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ExplosiveReviewAndVerificationTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ExplosiveReviewAndVerificationTable, String> amountDue =
		createColumn(
			"amountDue", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ExplosiveReviewAndVerificationTable, Date>
		dateReceived = createColumn(
			"dateReceived", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ExplosiveReviewAndVerificationTable, String>
		amountreceived = createColumn(
			"amountreceived", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ExplosiveReviewAndVerificationTable, String>
		receivedNumber = createColumn(
			"receivedNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ExplosiveReviewAndVerificationTable, String> comments =
		createColumn(
			"comments", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ExplosiveReviewAndVerificationTable, String>
		amountOutstanding = createColumn(
			"amountOutstanding", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<ExplosiveReviewAndVerificationTable, Date> dueDate =
		createColumn(
			"dueDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ExplosiveReviewAndVerificationTable, String> status =
		createColumn(
			"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ExplosiveReviewAndVerificationTable, Long>
		paymentreceiptFileEntryId = createColumn(
			"paymentreceiptFileEntryId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private ExplosiveReviewAndVerificationTable() {
		super(
			"nbp_explosive_rev_ver", ExplosiveReviewAndVerificationTable::new);
	}

}