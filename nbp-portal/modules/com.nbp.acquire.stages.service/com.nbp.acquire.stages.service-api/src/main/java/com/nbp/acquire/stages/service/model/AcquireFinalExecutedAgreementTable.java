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
 * The table class for the &quot;nbp_acquire_executed_agree&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireFinalExecutedAgreement
 * @generated
 */
public class AcquireFinalExecutedAgreementTable
	extends BaseTable<AcquireFinalExecutedAgreementTable> {

	public static final AcquireFinalExecutedAgreementTable INSTANCE =
		new AcquireFinalExecutedAgreementTable();

	public final Column<AcquireFinalExecutedAgreementTable, Long>
		acquirefinalId = createColumn(
			"acquirefinalId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<AcquireFinalExecutedAgreementTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireFinalExecutedAgreementTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireFinalExecutedAgreementTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireFinalExecutedAgreementTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireFinalExecutedAgreementTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquireFinalExecutedAgreementTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquireFinalExecutedAgreementTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireFinalExecutedAgreementTable, Date>
		dateContractExecuted = createColumn(
			"dateContractExecuted", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AcquireFinalExecutedAgreementTable, Long>
		docFileEntryId = createColumn(
			"docFileEntryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private AcquireFinalExecutedAgreementTable() {
		super(
			"nbp_acquire_executed_agree",
			AcquireFinalExecutedAgreementTable::new);
	}

}