/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_quarry_comm_decision&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryAppCommitteeDecision
 * @generated
 */
public class QuarryAppCommitteeDecisionTable
	extends BaseTable<QuarryAppCommitteeDecisionTable> {

	public static final QuarryAppCommitteeDecisionTable INSTANCE =
		new QuarryAppCommitteeDecisionTable();

	public final Column<QuarryAppCommitteeDecisionTable, Long>
		quarryAppCommitteeDecisionId = createColumn(
			"quarryAppCommitteeDecisionId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<QuarryAppCommitteeDecisionTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryAppCommitteeDecisionTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryAppCommitteeDecisionTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<QuarryAppCommitteeDecisionTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<QuarryAppCommitteeDecisionTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QuarryAppCommitteeDecisionTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<QuarryAppCommitteeDecisionTable, Date>
		dateOfCommitteeDecision = createColumn(
			"dateOfCommitteeDecision", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<QuarryAppCommitteeDecisionTable, String>
		committeeDecision = createColumn(
			"committeeDecision", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<QuarryAppCommitteeDecisionTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private QuarryAppCommitteeDecisionTable() {
		super("nbp_quarry_comm_decision", QuarryAppCommitteeDecisionTable::new);
	}

}