/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_pharma_comm_decision&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationCommitteeDecision
 * @generated
 */
public class PharmaApplicationCommitteeDecisionTable
	extends BaseTable<PharmaApplicationCommitteeDecisionTable> {

	public static final PharmaApplicationCommitteeDecisionTable INSTANCE =
		new PharmaApplicationCommitteeDecisionTable();

	public final Column<PharmaApplicationCommitteeDecisionTable, Long>
		pharmaCommitteeDecisionId = createColumn(
			"pharmaCommitteeDecisionId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<PharmaApplicationCommitteeDecisionTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationCommitteeDecisionTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationCommitteeDecisionTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationCommitteeDecisionTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationCommitteeDecisionTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationCommitteeDecisionTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationCommitteeDecisionTable, Date>
		dateOfCommitteeDecision = createColumn(
			"dateOfCommitteeDecision", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationCommitteeDecisionTable, String>
		committeeDecision = createColumn(
			"committeeDecision", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PharmaApplicationCommitteeDecisionTable, String>
		caseId = createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private PharmaApplicationCommitteeDecisionTable() {
		super(
			"nbp_pharma_comm_decision",
			PharmaApplicationCommitteeDecisionTable::new);
	}

}