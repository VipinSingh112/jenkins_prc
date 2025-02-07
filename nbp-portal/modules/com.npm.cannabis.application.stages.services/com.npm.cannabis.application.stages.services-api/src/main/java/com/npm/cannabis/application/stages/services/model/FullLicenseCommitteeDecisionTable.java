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
 * The table class for the &quot;nbp_cannabis_comm_decision&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FullLicenseCommitteeDecision
 * @generated
 */
public class FullLicenseCommitteeDecisionTable
	extends BaseTable<FullLicenseCommitteeDecisionTable> {

	public static final FullLicenseCommitteeDecisionTable INSTANCE =
		new FullLicenseCommitteeDecisionTable();

	public final Column<FullLicenseCommitteeDecisionTable, Long>
		fullLicenseCommitteeDecisionId = createColumn(
			"fullLicenseCommitteeDecisionId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FullLicenseCommitteeDecisionTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FullLicenseCommitteeDecisionTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FullLicenseCommitteeDecisionTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FullLicenseCommitteeDecisionTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FullLicenseCommitteeDecisionTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FullLicenseCommitteeDecisionTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FullLicenseCommitteeDecisionTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FullLicenseCommitteeDecisionTable, String>
		licenseFeeDue = createColumn(
			"licenseFeeDue", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FullLicenseCommitteeDecisionTable, String> bondFeeDue =
		createColumn(
			"bondFeeDue", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FullLicenseCommitteeDecisionTable, String>
		committeeDecision = createColumn(
			"committeeDecision", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FullLicenseCommitteeDecisionTable, Long>
		totalAmountDue = createColumn(
			"totalAmountDue", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private FullLicenseCommitteeDecisionTable() {
		super(
			"nbp_cannabis_comm_decision",
			FullLicenseCommitteeDecisionTable::new);
	}

}