/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_acquire_draft_agree&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireDraftAgreement
 * @generated
 */
public class AcquireDraftAgreementTable
	extends BaseTable<AcquireDraftAgreementTable> {

	public static final AcquireDraftAgreementTable INSTANCE =
		new AcquireDraftAgreementTable();

	public final Column<AcquireDraftAgreementTable, Long> acquireDraftId =
		createColumn(
			"acquireDraftId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<AcquireDraftAgreementTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireDraftAgreementTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireDraftAgreementTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireDraftAgreementTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireDraftAgreementTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquireDraftAgreementTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquireDraftAgreementTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireDraftAgreementTable, String> paymentAmountDue =
		createColumn(
			"paymentAmountDue", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireDraftAgreementTable, Long> docFileEntryId =
		createColumn(
			"docFileEntryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AcquireDraftAgreementTable() {
		super("nbp_acquire_draft_agree", AcquireDraftAgreementTable::new);
	}

}